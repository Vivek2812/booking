package api.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
public class AuthRequest {

    @JsonProperty("username")
    public String username;

    @JsonProperty("password")
    public String password;

    public static AuthRequest createAuthTokenPayload(){
        return AuthRequest.builder()
                .username("admin")
                .password("password123")
                .build();
    }

}
