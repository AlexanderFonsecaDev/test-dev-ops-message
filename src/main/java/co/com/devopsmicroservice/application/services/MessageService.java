package co.com.devopsmicroservice.application.services;

import co.com.devopsmicroservice.domain.models.Message;
import co.com.devopsmicroservice.domain.ports.input.CreateMessageUseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MessageService implements CreateMessageUseCase {

    private final CreateMessageUseCase createMessageUseCase;

    @Override
    public Message createMessage(Message message) {
        message.setMessage("Hello " + message.getSender() + " your message will be send");
        return createMessageUseCase.createMessage(message);
    }
}
