package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    // Handle adding employee details via POST request
    @PostMapping("/emp/add")
    public String addEmployee(@RequestParam String empid, @RequestParam String name, @RequestParam String phone) {
        // Call service to add employee details
        return empService.addEmployee(empid, name, phone);
    }
    @GetMapping("/emp/delete")
    public String deleteEmployee(@RequestParam String empid){
        return empService.deleteEmployee(empid);
    }
}
