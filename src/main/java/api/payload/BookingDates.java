package api.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
public class BookingDates {

    @JsonProperty("checkin")
    public String checkin;

    @JsonProperty("checkout")
    public String checkout;
}
