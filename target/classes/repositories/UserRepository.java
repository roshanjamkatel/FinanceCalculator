package com.rjamkatl.FinanceCalculator.resources.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rjamkatel.FinanceCalculator.models.User;

@Repository
public interface EmployeeRepository extends JpaRepository<User, Long> {
    
}