package com.example.employee;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpRepository extends JpaRepository<emp, Long> {
    
    boolean existsByEmpid(String empid);
    emp findByEmpid(String empid);
    
}
