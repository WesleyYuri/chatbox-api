package br.com.wesley.chatboxapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cb_users")
public class UsersModel {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String username;
    private String password;
}
