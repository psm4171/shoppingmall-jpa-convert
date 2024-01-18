package com.nhnacademy.springjpa.config;

import com.nhnacademy.springjpa.repository.RepositoryBase;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.support.Repositories;

@EnableJpaRepositories(basePackageClasses = RepositoryBase.class)

public class JpaConfig {
}
