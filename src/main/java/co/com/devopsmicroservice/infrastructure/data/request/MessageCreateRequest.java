package co.com.devopsmicroservice.infrastructure.data.request;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessageCreateRequest {

    @NotEmpty(message = "Message may not be empty")
    private String message;
    @NotEmpty(message = "Sender may not be empty")
    private String to;
    @NotEmpty(message = "Receiver may not be empty")
    private String From;
    @NotNull
    @Min(value=1, message="timeToLifeSec: positive number, min 1 is required")
    private int timeToLifeSec;

}
