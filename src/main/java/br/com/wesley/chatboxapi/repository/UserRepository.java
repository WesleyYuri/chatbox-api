package br.com.wesley.chatboxapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wesley.chatboxapi.models.UsersModel;

public interface UserRepository extends JpaRepository<UsersModel, Integer>{
    
    Optional<UsersModel> findByUsername(String username);

}
