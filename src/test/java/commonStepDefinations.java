import io.cucumber.java.en.Then;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class commonStepDefinations {

    @Then("User validates the response code")
    public void userValidatesTheResponseCode() {
        assertThat(bookingStepDefinations.response.statusCode(), equalTo(200));

    }
}
