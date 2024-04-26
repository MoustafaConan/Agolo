import io.restassured.RestAssured;
import org.example.LoginSignUpTask.User;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class userTest {

    User user;
    private static String email = "agololo@gmail.com";
    private static String password = "myPassword";

    private static final String BASE_URL = "https://api.demoblaze.com/";

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = BASE_URL;
    }

    @Test(priority = -1)
    public void signUP() {
        // Replace with actual data for your POST request
        user = new User();
        user.setUsername(email); // Replace with desired ID
        user.setPassword(password);

        RestAssured.given()
                .contentType("application/json") // Set content type for POST
                .body(user)
                .when()
                .post("/signup")
                .then()
                .statusCode(200)
                .log().body();
    }

    @Test(priority = 0)
    public void login() {
        // Replace with actual data for your POST request
        user = new User();
        user.setUsername(email); // Replace with desired ID
        user.setPassword(password);

        RestAssured.given()
                .contentType("application/json") // Set content type for POST
                .body(user)
                .when()
                .post("/login")
                .then()
                .statusCode(200)
                .log().body();
    }
}
