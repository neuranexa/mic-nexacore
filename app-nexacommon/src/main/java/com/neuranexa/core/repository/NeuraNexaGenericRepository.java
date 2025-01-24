package com.neuranexa.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface NeuraNexaGenericRepository <T, ID> extends JpaRepository<T, ID> {
}
