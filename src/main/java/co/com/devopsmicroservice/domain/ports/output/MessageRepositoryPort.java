package co.com.devopsmicroservice.domain.ports.output;

import co.com.devopsmicroservice.domain.models.Message;

public interface
MessageRepositoryPort {

    Message saveMessage(Message message);

}
