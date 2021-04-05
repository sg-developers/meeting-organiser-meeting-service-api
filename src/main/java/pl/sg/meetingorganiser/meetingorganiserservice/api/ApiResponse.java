package pl.sg.meetingorganiser.meetingorganiserservice.api;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class ApiResponse<T> implements Serializable {
    private T response;
    private ErrorDetailsResponse error;

    public static <T> ApiResponse<T> success(T response) {
        return new ApiResponse<>(response, null);
    }

    public static <T> ApiResponse<T> error(ErrorDetailsResponse error) {
        return new ApiResponse<>(null, error);
    }

    public static <T> ApiResponse<T> error(String code, String message) {
        return new ApiResponse<>(null, new ErrorDetailsResponse(code, message));
    }
}
