package co.com.devopsmicroservice.application.usecases;

import co.com.devopsmicroservice.domain.models.Message;
import co.com.devopsmicroservice.domain.ports.input.CreateMessageUseCase;
import co.com.devopsmicroservice.domain.ports.output.MessageRepositoryPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateMessageUseCaseImpl implements CreateMessageUseCase {

    public final MessageRepositoryPort messageRepositoryPort;

    @Override
    public Message createMessage(Message message) {
        return messageRepositoryPort.saveMessage(message);
    }
}
