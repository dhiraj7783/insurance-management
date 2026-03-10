package com.dhiraj.insurance_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dhiraj.insurance_management.model.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {

}