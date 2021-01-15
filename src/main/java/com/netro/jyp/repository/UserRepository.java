package com.netro.jyp.repository;

import com.netro.jyp.model.Board;
import com.netro.jyp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
