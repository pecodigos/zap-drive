package com.pecodigos.web_file_storage.users.repositories;

import com.pecodigos.web_file_storage.users.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}