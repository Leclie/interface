package com.ifmo.leclie.repos;

import com.ifmo.leclie.domain.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepo extends CrudRepository<Department, Long> {
}
