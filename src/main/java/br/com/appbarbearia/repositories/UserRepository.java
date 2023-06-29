package br.com.appbarbearia.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.appbarbearia.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, UUID>{

}
