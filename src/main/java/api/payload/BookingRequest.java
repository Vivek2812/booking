package api.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
public class BookingRequest {

    @JsonProperty("firstname")
    public String firstmane;

    @JsonProperty("lastname")
    public String lastname;

    @JsonProperty("totalprice")
    public int totalprice;

    @JsonProperty("depositpaid")
    public Boolean depositpaid;

    @JsonProperty("bookingdates")
    public BookingDates bookingdates;

    @JsonProperty("additionalneeds")
    public String additionalneeds;

    public static BookingRequest createBookingRequestPayload(){
        return BookingRequest.builder()
                .firstmane("raj")
                .lastname("bhat")
                .totalprice(100)
                .depositpaid(true)
                .bookingdates(BookingDates.builder().checkin("2018-01-01").checkout("2018-01-01").build())
                .additionalneeds("None")
                .build();
    }

    public static BookingRequest updateBookingRequestPayload(){
        return BookingRequest.builder()
                .firstmane("raj")
                .lastname("bhat")
                .totalprice(1000)
                .depositpaid(true)
                .bookingdates(BookingDates.builder().checkin("2018-01-01").checkout("2018-01-01").build())
                .additionalneeds("None")
                .build();
    }
}
