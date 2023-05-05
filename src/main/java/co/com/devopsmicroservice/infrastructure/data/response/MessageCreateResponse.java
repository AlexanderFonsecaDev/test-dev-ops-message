package co.com.devopsmicroservice.infrastructure.data.response;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessageCreateResponse {
    private String message;
}
