package reassured_reqress_project.reassured_reqress_project;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TC_GET_reqress_LIST_USERS {
    @Test
	public void test_GET_ListUsers()
	{
		given()
		
        .when()
		    .get("https://reqres.in/api/users?page=2")
		.then()
		    .statusCode(200);
	}
    
}
