package API;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class SalesForce {
	
	static String accessToken;
	static String id="";

	@Test(priority=0)
	 public void auth() {
		RestAssured.baseURI = "https://testleaf30-dev-ed.develop.my.salesforce.com";
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("grant_type", "password");
		hm.put("client_id", "3MVG9pRzvMkjMb6lZlt3YjDQwe0hk0f5ZPyWD38tfPYQ75KXUzZBGzM_c7I0o3yc6ua1IUk6lEQIy4U2sByrg");
		hm.put("client_secret", "79FFF874D54193B377A60354C71CBBE83120AD28A5D6BC536D2F68C94645DE98");
		hm.put("username", "ranjini.r@testleaf.com");
		hm.put("password", "Testleaf$321");
		
		Response response=RestAssured.given().contentType("application/x-www-form-urlencoded").formParams(hm)
		.when().post("/services/oauth2/token").then().statusCode(200).extract().response();
		
		response.prettyPrint();
		
		JsonPath js=response.jsonPath();
		accessToken=js.getString("access_token");
		System.out.println(accessToken);
	}
	
	 @Test(priority=1)
	 public void createLead() {
		
		RestAssured.baseURI = "https://testleaf30-dev-ed.develop.my.salesforce.com";
			  
		/*
		 * String requestBody="{\n" + "    \"FirstName\": \"Shilviya\",\n" +
		 * "    \"LastName\": \"Jayaraj\",\n" + "    \"Company\": \"TestLeaf\"\n" + "}";
		 */
		
		
		String token="Bearer "+accessToken;
		Response CLresponse=RestAssured.given().log().all()
				            .header("Authorization",token).body(LeadCreateAndGet.lead())
				            .contentType("application/json")
				            .when().post("/services/data/v58.0/sobjects/Lead/")
				            .then()
				            .statusCode(201)
				            .extract().response();
		CLresponse.prettyPrint();
		JsonPath jp=CLresponse.jsonPath();
		id=jp.getString("id");
		
		
	}
	
	 @Test
	 public void getLead() {
		String token="Bearer "+accessToken;
		RestAssured.baseURI = "https://testleaf30-dev-ed.develop.my.salesforce.com";
		Response getLResponse=RestAssured.given().log().all().header("Authorization",token)
		                      .when()
		                      .get("/services/data/v58.0/sobjects/Lead/"+id+"")
		                      .then()
		                      .statusCode(200)
		                      .extract().response();
		                  
		getLResponse.prettyPrint();
	}
	

}
