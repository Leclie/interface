package com.ifmo.leclie.repos;

import com.ifmo.leclie.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}
