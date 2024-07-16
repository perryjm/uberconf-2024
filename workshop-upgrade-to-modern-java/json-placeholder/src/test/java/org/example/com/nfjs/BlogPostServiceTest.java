package org.example.com.nfjs;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}