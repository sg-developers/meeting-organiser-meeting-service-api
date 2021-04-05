package pl.sg.meetingorganiser.meetingorganiserservice.api;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class AuthResponse implements Serializable {
    private String accessToken;
    private String tokenType = "Bearer";
}
