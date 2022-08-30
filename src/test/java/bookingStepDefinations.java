import api.BookingApi;
import api.payload.BookingRequest;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;

import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class bookingStepDefinations {

    private Scenario scenario;
    public static Response response;
    public static int bookingid;
    public static String booking;

    @Before
    public void before() {
        this.scenario = scenario;
    }

    @Given("User creates a booking request")
    public void userCreatesABookingRequest() {
//
//        response = BookingApi.createBooking();
//        System.out.println(response.asString());
//        bookingid = (new JsonPath(response.asString()).getInt("bookingid"));
//        System.out.println(bookingid);
    }

    @Then("User validates the booking details")
    public void userValidatesTheBookingDetails() {

        response = BookingApi.createBooking();
        System.out.println(response.asString());
        bookingid = (new JsonPath(response.asString()).getInt("bookingid"));
        booking = (new JsonPath(response.asString()).getString("booking"));
        System.out.println(bookingid);
        System.out.println(booking);

        Response getResponse = BookingApi.getBooking(5012);
        System.out.println(getResponse.asString());
//        bookingid = (new JsonPath(getResponse.asString()).getInt("bookingid"));
//        System.out.println(bookingid);

        assertThat(booking,equalTo(getResponse.asString()));

    }
}
