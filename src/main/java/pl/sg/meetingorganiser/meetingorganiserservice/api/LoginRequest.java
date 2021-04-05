package pl.sg.meetingorganiser.meetingorganiserservice.api;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class LoginRequest implements Serializable {

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
