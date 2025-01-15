package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    private EmpRepository repository;

    public String addEmployee(String empid, String name, String phone) {
        // Check if employee with the given empid already exists
        if (repository.existsByEmpid(empid)) {
            return "Employee with this ID already exists !";
        }

        emp employee = new emp();
        employee.setEmpid(empid);
        employee.setName(name);
        employee.setPhone(phone);

        repository.save(employee); // Save the new employee

        return "Employee added successfully !";
    }

    public String deleteEmployee(String empid) {
        if (!repository.existsByEmpid(empid)) {
            return "Employee not found !";
        }
        emp employee = repository.findByEmpid(empid); 
        repository.delete(employee); 
        return "Employee Deleted Successfully !";

    }

}
