package org.example.com.nfjs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import com.google.gson.Gson;

public class BlogPostService {
  public static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
  private final Gson gson = new Gson();

  public List<Post> getBlogPosts() {
    try (var client = HttpClient.newHttpClient()) {
      HttpRequest request = HttpRequest.newBuilder()
          .uri(URI.create(BASE_URL + "/posts"))
          .build();
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
      return gson.fromJson(response.body(), List.class);
    }
    catch (IOException | InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  public Post getBlogPost(int id) {
    try (var client = HttpClient.newHttpClient()) {
      HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("%s/posts/%d".formatted(BASE_URL, id)))
        .build();
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
      return gson.fromJson(response.body(), Post.class);
    }
    catch (IOException | InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  public Post getBlogPostAsync(int id) {
    try (var client = HttpClient.newHttpClient()) {
      HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("%s/posts/%d".formatted(BASE_URL, id)))
        .build();
      return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
        .thenApply(HttpResponse::body)
        .thenApply(body -> gson.fromJson(body, Post.class))
        .join();
    }
  }

  public Post addBlogPost(Post post) {
    try (var client = HttpClient.newHttpClient()) {
      HttpRequest request = HttpRequest.newBuilder()
        .header("Content-Type", "application/json")
        .header("Accept", "application/json")
        .uri(URI.create("%s/posts".formatted(BASE_URL)))
        .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(post)))
        .build();
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
      return gson.fromJson(response.body(), Post.class);
    }
    catch (IOException | InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  public record Post(
    int userId,
    int id,
    String title,
    String body
  ) {
  }

  public record PostList(
    List<Post> posts
  ) {
  }

}
