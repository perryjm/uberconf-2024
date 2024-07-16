package org.example.com.nfjs;

import java.util.List;

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
}