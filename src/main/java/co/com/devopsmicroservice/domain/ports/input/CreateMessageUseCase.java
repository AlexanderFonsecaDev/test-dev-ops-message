package co.com.devopsmicroservice.domain.ports.input;

import co.com.devopsmicroservice.domain.models.Message;

public interface CreateMessageUseCase {

    Message createMessage(Message message);

}
