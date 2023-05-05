package co.com.devopsmicroservice.infrastructure.mapper;

import co.com.devopsmicroservice.domain.models.Message;
import co.com.devopsmicroservice.infrastructure.entities.MessageEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessagePersistenceMapper {

    MessageEntity toMessageEntity(Message message);

    Message toMessage(MessageEntity messageEntity);



}
