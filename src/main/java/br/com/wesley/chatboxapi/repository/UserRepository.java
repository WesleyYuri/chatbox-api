package br.com.wesley.chatboxapi.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wesley.chatboxapi.models.UsersModel;

public interface UserRepository extends JpaRepository<UsersModel, UUID>{
    
    Optional<UsersModel> findByUsername(String username);

}
