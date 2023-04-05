package br.com.wesley.chatboxapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.wesley.chatboxapi.models.UsersModel;

@Repository
public interface UserRepository extends JpaRepository<UsersModel, Integer>{
    
}
