package org.example.com.nfjs;

import java.time.Month;
import java.time.Year;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;

class BlogPostServiceTest {
  BlogPostService fixture = new BlogPostService();

  @Test
  void testGetBlogPosts() {
    List<BlogPostService.Post> list = fixture.getBlogPosts();
    System.out.println(list);
  }

  @Test
  void getBlogPost() {
    BlogPostService.Post blogPost = fixture.getBlogPost(1);
    System.out.println(blogPost);
    assertEquals(1, blogPost.userId());
  }

  @Test
  void addBlogPost() {
    BlogPostService.Post post = new BlogPostService.Post(1, 0, "title", "body");
    BlogPostService.Post newPost = fixture.addBlogPost(post);
    System.out.println(newPost);
    assertEquals(post.userId(), newPost.userId());
  }

  @Test
  void SetOfStrings() {
    assertThrows(Exception.class, () -> Set.of("this", "is", "a", "list", "of", "strings", "this"));
    assertThrowsExactly(IllegalArgumentException.class, () -> Set.of("this", "is", "a", "list", "of", "strings", "this"));

    Stream.of(1, 2, 3, 4, 5, 6)
      .filter(i -> i % 2 == 0) // print evens
      .forEach(it -> {
        System.out.println(it);
      });
//      .toSet();
  }

  @Test
  void mapOfStringsToIntegers() {
    var map = Map.ofEntries(
      Map.entry("one", 1),
      Map.entry("two", 2),
      Map.entry("three", 3));
//    assertThat(map.size()).isEqualTo(3);

  }

  @Test
  void testGetBlogPostAsync() {
    BlogPostService.Post blogPost = fixture.getBlogPostAsync(1);
    System.out.println(blogPost);
    assertEquals(1, blogPost.userId());
  }

  @Test
  void modByThree() {
    for (int i= 0; i < 10; i++) {
      String result = switch (i % 3) {
        case 0 -> "%d mod 3 == 0".formatted(i);
        case 1 -> "%d mod 3 == 1".formatted(i);
        case 2 -> "%d mod 3 == 2".formatted(i);
        default -> "should never happen";
      };
      System.out.println(result);
    }
  }

  @ParameterizedTest(name = "Test {index}: {0} has {1} days")
  @EnumSource(Month.class)
  void testMonths(Month month) {
    int days = switch (month) {
      case FEBRUARY -> {
        System.out.println("Checking February" + Year.now().getValue());
        yield Year.isLeap(Year.now().getValue()) ? 29 : 28;
      }
      case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
      default -> 31;
    };
    System.out.println(month + " has " + days + " days");
  }

  @Test
  void textBlock() {
    String json = """
      {
        "userId": 1,
        "id": 1,
        "title": "title",
        "body": "body"
      }
      """;
    System.out.println(fixture.addBlogPost(json));
    String anotherJson = """
      {
        "userId": %d,
        "id": %d,
        "title": %s,
        "body": %s \s
      }
      """.formatted(1, 0, "title", "body"); // for text blocks, the closing """ shows how much white space indentatino to include in your text block.
    System.out.println(fixture.addBlogPost(anotherJson));
  }

  @Test
  void testPostRecordCompactConstructor() {
    BlogPostService.Post post = new BlogPostService.Post(1, 0, "title", "body");
    assertEquals(1, post.userId());

    String message = assertThrows(Exception.class, () -> new BlogPostService.Post(1, 0, null, "body")).getMessage();
    assertEquals("Title cannot be null or blank", message);
  }

}