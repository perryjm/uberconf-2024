package org.example.com.nfjs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class BlogPostService {
  public static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
  private final Gson gson = new Gson();

  public String getBlogPosts() {
    try (HttpClient client = HttpClient.newHttpClient()) {
      HttpRequest request = HttpRequest.newBuilder()
          .uri(URI.create(BASE_URL + "/posts"))
          .build();
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
      System.out.println("Status code: " + response.statusCode());
      System.out.println("Headers: " + response.headers());
      return response.body();
    }
    catch (IOException | InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  public Post getBlogPost(int id) {
    try (HttpClient client = HttpClient.newHttpClient()) {
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

  public record Post(
    int userId,
    int id,
    String title,
    String body
  ) {
    // see, you can add a constructor here, this one is weird. and now id is no longer modifiable. but yeah.
    public Post(int userId, String title, String body) {
      this(userId, 0, title, body);
    }
  }
}
