package restapi;

import org.asynchttpclient.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class testAPI {
@Test
 public void test1() {
	RequestSpecification request = RestAssured.given();
	
	request.header("content-Type","application/json");
	JSONObject json = new JSONObject();
	
	json.put("id","25");
	json.put("title","ApiTest");
	json.put("author","fazil");
	
	request.body(json.toJSONString());
	
   Response response = request.post("http://localhost:3000/posts");
	int code = response.getStatusCode();
	
	Assert.assertEquals(code,201);
	
	
	
}
}
