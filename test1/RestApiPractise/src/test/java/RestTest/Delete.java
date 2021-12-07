package RestTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Delete {

	
	@Test
	public void test1() {
	
	RequestSpecification request = RestAssured.given();
	
	Response response = request.delete("http://localhost:3000/posts/321"); //delete for user id
	
	int code = response.getStatusCode();
	Assert.assertEquals(code, 200);  //200 means success
	}
	
	
}
