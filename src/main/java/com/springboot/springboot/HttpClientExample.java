package com.springboot.springboot;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClientExample {

    public static void main(String[] args) {
        // Create CloseableHttpClient instance
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

            // Define an HttpGet request (or HttpPost, HttpDelete, etc. depending on your needs)
            HttpGet getRequest = new HttpGet("http://localhost:8080/UserMockService");

            // Set the desired header
            getRequest.addHeader("Accept", "application/xml");

            // Execute the request and get the response
            try (CloseableHttpResponse response = httpClient.execute(getRequest)) {

                // Check the response status and print it
                int statusCode = response.getStatusLine().getStatusCode();
                System.out.println("Response Code: " + statusCode);

                // Retrieve the response body as a string
                if (statusCode == 200) { // 200 OK
                    String responseBody = EntityUtils.toString(response.getEntity());
                    System.out.println("Response Body: " + responseBody);
                } else {
                    System.out.println("Request failed: " + statusCode);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

