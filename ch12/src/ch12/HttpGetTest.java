package ch12;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpGetTest {
	public static void main(String[] args) {
		
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("http://habit.co.kr"))
				.GET()
				.build();
		
		try {
			HttpResponse<String> reponse = client.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println("상태코드: " +reponse.statusCode());
			System.out.println("응답내용: " +reponse.body());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
