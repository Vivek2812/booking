import api.AuthApi;
import api.BookingApi;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class updateBookingStepDefination {

    private Scenario scenario;
    public static Response updateResponse;


    @Then("User updates the booking details")
    public void userUpdatesTheBookingDetails() {
        int bookingid =bookingStepDefinations.bookingid;

        Response AuthResponse = AuthApi.createAuthToken();
        String token = (new JsonPath(AuthResponse.asString()).getString("token"));
        System.out.println(token);
        System.out.println(AuthResponse.asString());

        updateResponse = BookingApi.updateBooking(bookingid, token);
        System.out.println(updateResponse.asString());

    }

    @Then("User deletes the booking details")
    public void userDeletesTheBookingDetails() {


    }
}
