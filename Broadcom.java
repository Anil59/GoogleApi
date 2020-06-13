package CustName.ProjectName;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class Broadcom {

	@Test
		
	public void test()
	{
	
	RestAssured.baseURI = "https://www.googleapis.com/customsearch/v1";
	
	Response res = given().header("Content-Type", "application/json").queryParam("key","AIzaSyCzo4o_cc_w5IzYzEIOreHUpx0zWcITuqQ").and().queryParam("cx","017576662512468239146:omuauf_lfve").and().queryParam("q","lectures").get().then().statusCode(200).extract().response();
				
	JsonPath jsonPathValidator = res.jsonPath();
	
	for(int i=0;i<=2;i++)
	{
	
		String  Links = jsonPathValidator.get("items["+i+"].displayLink");
	
		System.out.println(Links);	
	
	}	
	
	}
		

	}


