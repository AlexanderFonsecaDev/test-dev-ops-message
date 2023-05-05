package co.com.devopsmicroservice.infrastructure.controllers;

import co.com.devopsmicroservice.application.services.MessageService;
import co.com.devopsmicroservice.domain.models.Message;
import co.com.devopsmicroservice.infrastructure.data.request.MessageCreateRequest;
import co.com.devopsmicroservice.infrastructure.data.response.MessageCreateResponse;
import co.com.devopsmicroservice.infrastructure.mapper.MessageRestMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/message")
@AllArgsConstructor
public class MessageController {

    private final MessageService messageService;

    private final MessageRestMapper messageRestMapper;

    @PostMapping
    public ResponseEntity<MessageCreateResponse> sendMessage(@RequestBody @Valid MessageCreateRequest messageCreateRequest){
        Message message = messageRestMapper.toMessage(messageCreateRequest);
        message = messageService.createMessage(message);
        return new ResponseEntity<>(messageRestMapper.toMessageCreateResponse(message), HttpStatus.CREATED);
    }

}
