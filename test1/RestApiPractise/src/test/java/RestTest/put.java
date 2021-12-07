package RestTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class put {
	
	@Test
	public void test1() {
	
	RequestSpecification request = RestAssured.given();
	request.header("Content-Type","application/json");
	
	JSONObject json = new JSONObject();
	json.put("id", "29");
	json.put("title", "Race");
	//json.put("author", "Abbas-Mastan-");
	json.put("author", "saleem javed");
	request.body(json.toJSONString());
	
	Response response = request.put("http://localhost:3000/posts/29");
	
	
	int code = response.getStatusCode();
	System.out.println("response code"+code);
	
	
	Assert.assertEquals(code, 200); //200 means success
	}
}
