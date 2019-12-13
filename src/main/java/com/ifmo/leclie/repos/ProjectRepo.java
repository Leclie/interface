package com.ifmo.leclie.repos;

import com.ifmo.leclie.domain.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepo extends CrudRepository<Project, Long> {
}
