package co.com.devopsmicroservice.infrastructure.config;

import co.com.devopsmicroservice.application.services.MessageService;
import co.com.devopsmicroservice.application.usecases.CreateMessageUseCaseImpl;
import co.com.devopsmicroservice.domain.ports.output.MessageRepositoryPort;
import co.com.devopsmicroservice.infrastructure.mapper.MessagePersistenceMapper;
import co.com.devopsmicroservice.infrastructure.repositories.MessageJpaRepository;
import co.com.devopsmicroservice.infrastructure.repositories.MessageJpaRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public MessageJpaRepositoryAdapter messageJpaRepositoryAdapter(MessageJpaRepository messageJpaRepository,MessagePersistenceMapper messagePersistenceMapper){
        return new MessageJpaRepositoryAdapter(messageJpaRepository, messagePersistenceMapper);
    }

    @Bean
    public MessageService messageService(MessageRepositoryPort messageRepositoryPort){
        return new MessageService(new CreateMessageUseCaseImpl(messageRepositoryPort));
    }

    @Bean
    public MessageRepositoryPort messageRepositoryPort(MessageJpaRepositoryAdapter messageJpaRepositoryAdapter){
        return messageJpaRepositoryAdapter;
    }

}
