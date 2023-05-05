package co.com.devopsmicroservice.infrastructure.repositories;

import co.com.devopsmicroservice.infrastructure.entities.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageJpaRepository extends JpaRepository<MessageEntity,Long> {}
