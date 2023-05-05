package co.com.devopsmicroservice.infrastructure.repositories;

import co.com.devopsmicroservice.domain.models.Message;
import co.com.devopsmicroservice.domain.ports.output.MessageRepositoryPort;
import co.com.devopsmicroservice.infrastructure.entities.MessageEntity;
import co.com.devopsmicroservice.infrastructure.mapper.MessagePersistenceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
public class MessageJpaRepositoryAdapter implements MessageRepositoryPort {

    private final MessageJpaRepository messageJpaRepository;

    private final MessagePersistenceMapper messagePersistenceMapper;

    @Override
    public Message saveMessage(Message message) {
        MessageEntity messageEntity = messagePersistenceMapper.toMessageEntity(message);
        MessageEntity save = messageJpaRepository.save(messageEntity);
        return messagePersistenceMapper.toMessage(save);
    }
}
