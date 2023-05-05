package co.com.devopsmicroservice.domain.models;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private Long id;
    private String message;
    private String sender;
    private String receiver;
    private int timeToLifeSec;

}
