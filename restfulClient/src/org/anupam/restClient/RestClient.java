package org.anupam.restClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.ws.rs.core.MediaType;

import org.anupam.pojo.UserInfoClient;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class RestClient {
	
	public static void main(String a[]){
		  try {
			  
			  Client client = Client.create();
			  WebResource resource = client.resource("http://localhost:8080/restfulWebservice/rest/userService");
			  String jsonResponse = resource.accept(MediaType.APPLICATION_JSON).get(String.class);
			  
			  String switchToken = "jackson";
			  
				  switch(switchToken){
				  	case "jackson":System.out.println("test succesful");
				  					break;
				  	case "javaNetUrl":accessRestUsingNetApi();
				  }
				  
				  ObjectMapper objectMapper = new ObjectMapper();
				  UserInfoClient userInfo = objectMapper.readValue(jsonResponse, UserInfoClient.class);
				  System.out.println(userInfo.getName() + "----" + userInfo.getAge());
		 
			  } catch (Exception e) {
		 
				e.printStackTrace();
		 
			  } 
		 
			}
	
	
	private static void accessRestUsingNetApi() throws Exception{
		URL url = new URL("http://localhost:8080/restfulWebservice/rest/userService");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
 
		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}
 
		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));
 
		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}
 
		conn.disconnect();
	}

}
