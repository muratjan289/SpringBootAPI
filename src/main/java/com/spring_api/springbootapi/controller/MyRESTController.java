package com.spring_api.springbootapi.controller;


import com.spring_api.springbootapi.entity.Employee;
import com.spring_api.springbootapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEployees = employeeService.getAllEmployees();
        return allEployees;
    }
//    @GetMapping("/sort")
//    public String main(
//            @RequestParam(required = false, defaultValue = " ") String filter,
//            Model model,
//            @PageableDefault(sort = {"salary"}, direction = Sort.Direction.DESC) Pageable pageable
//            ){
//        Page<Employee> page;
//        if (filter != null && !filter.isEmpty()){
//            page = employeeService.getEmployee(filter, pageable);
//        }else {
//            page = employeeService.getAllEmployees();
//        }
//    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);



        return employee;

}
@PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee){

        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id){

        Employee employee =employeeService.getEmployee(id);



        employeeService.deleteEmployee(id);
        return "Employee with ID = " + id + " was deleted";
    }
}
