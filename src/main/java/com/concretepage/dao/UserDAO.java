package com.concretepage.dao;

import com.concretepage.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<User,Long> {
    User findByUsername(String username);
}
