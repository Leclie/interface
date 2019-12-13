package com.ifmo.leclie.repos;

import com.ifmo.leclie.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepo extends CrudRepository<Task, Long> {
}
