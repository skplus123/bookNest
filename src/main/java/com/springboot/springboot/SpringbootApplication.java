package com.springboot.springboot;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) throws IOException {

		System.out.println("Hi There");

//		CloseableHttpClient httpClient = HttpClients.createDefault();
//		HttpGet httpGet = new HttpGet("http://192.168.137.1:8080/book");
//
//		CloseableHttpResponse response = httpClient.execute(httpGet);
//		int statusCode = response.getStatusLine().getStatusCode();
//		System.out.println("Status Code: " + statusCode);
//
//		String responseBody = EntityUtils.toString(response.getEntity());
//		System.out.println("Response Body: " + responseBody);
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
