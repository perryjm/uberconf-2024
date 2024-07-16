package org.example.com.nfjs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlogPostServiceTest {
  BlogPostService fixture = new BlogPostService();

  @Test
  void testGetBlogPosts() {
    System.out.println(fixture.getBlogPosts());
  }

}