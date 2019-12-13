package com.ifmo.leclie.repos;

import com.ifmo.leclie.domain.Organization;
import org.springframework.data.repository.CrudRepository;

public interface OrganizationRepo extends CrudRepository<Organization, Long> {
}
