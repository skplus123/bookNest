package com.springboot.springboot;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final HttpClient httpClient;

    public UserService() {
        this.httpClient = HttpClient.newHttpClient();
    }

    public String getUserData() {
        String url = "http://localhost:8080/UserMockService";

        // Create a GET HttpRequest
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        try {
            // Send the request and get the response
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            // Check for successful response code (200 OK)
            if (response.statusCode() == 200) {
                return response.body();
            } else {
                throw new RuntimeException("Failed to fetch data: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error making HTTP request", e);
        }
    }
}
