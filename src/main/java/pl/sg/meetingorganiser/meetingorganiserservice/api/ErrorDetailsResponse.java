package pl.sg.meetingorganiser.meetingorganiserservice.api;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class ErrorDetailsResponse implements Serializable {
    private String code;
    private String message;
}
