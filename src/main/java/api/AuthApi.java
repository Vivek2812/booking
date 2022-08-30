package api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static api.payload.AuthRequest.createAuthTokenPayload;
import static util.ApiEndPoints.AUTH_ENDPOINT;
import static util.ApiEndPoints.BASE_URL;


public class AuthApi {

    public static String END_POINT = BASE_URL + AUTH_ENDPOINT;


    public static Response createAuthToken() {
        return given()
                .contentType(ContentType.JSON)
                .body(createAuthTokenPayload())
                .when()
                .post(END_POINT);
    }

}
