package api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static api.payload.BookingRequest.createBookingRequestPayload;
import static api.payload.BookingRequest.updateBookingRequestPayload;
import static io.restassured.RestAssured.given;
import static util.ApiEndPoints.BASE_URL;
import static util.ApiEndPoints.BOOKING_ENDPOINT;


public class BookingApi {

    public static String END_POINT = BASE_URL + BOOKING_ENDPOINT;


    public static Response createBooking() {
        return given()
                .contentType(ContentType.JSON)
                .body(createBookingRequestPayload())
                .when()
                .post(END_POINT);
    }

    public static Response getBooking(int bookingid){
        return given()
                .accept(ContentType.JSON)
                .accept("application/json")
                .when()
                .get(END_POINT + bookingid);
    }

    public static Response updateBooking(int bookingid, String token){
        return given()
                .contentType(ContentType.JSON)
                .accept("application/json")
                .header("Cookie","token=" + token)
                .body(updateBookingRequestPayload())
                .when()
                .put(END_POINT + bookingid);
    }
}
