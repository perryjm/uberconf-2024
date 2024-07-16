package org.example.com.nfjs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BlogPostService {
  public static final String BASE_URL = "https://jsonplaceholder.typicode.com/";

  public String getBlogPosts() {
    try (HttpClient client = HttpClient.newHttpClient()) {
      HttpRequest request = HttpRequest.newBuilder()
          .uri(URI.create(BASE_URL + "/posts"))
          .build();
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
      return response.body();
    }
    catch (IOException | InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
