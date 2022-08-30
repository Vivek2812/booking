package api.payload;

import com.fasterxml.jackson.annotation.JsonProperty;


public class BookingResponse {
  @JsonProperty("bookingid")
  private int bookingId;

  @JsonProperty("booking")
  private BookingRequest bookingRequest;
}
