package com.client.ws.wscurseplus.repository;

import com.client.ws.wscurseplus.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
