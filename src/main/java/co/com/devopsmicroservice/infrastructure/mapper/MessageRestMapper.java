package co.com.devopsmicroservice.infrastructure.mapper;

import co.com.devopsmicroservice.domain.models.Message;
import co.com.devopsmicroservice.infrastructure.data.request.MessageCreateRequest;
import co.com.devopsmicroservice.infrastructure.data.response.MessageCreateResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface MessageRestMapper {

    @Mappings({
            @Mapping(target = "id",ignore = true),
            @Mapping(source = "message", target = "message"),
            @Mapping(source = "to", target = "sender"),
            @Mapping(source = "from", target = "receiver"),
            @Mapping(source = "timeToLifeSec", target = "timeToLifeSec"),
    })
    Message toMessage(MessageCreateRequest messageCreateRequest);

    @Mappings({
            @Mapping(source = "message", target = "message"),
    })
    MessageCreateResponse toMessageCreateResponse(Message message);

}
