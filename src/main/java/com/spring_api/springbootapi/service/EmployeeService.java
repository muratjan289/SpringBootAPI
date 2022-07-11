package com.spring_api.springbootapi.service;


import com.spring_api.springbootapi.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee (Employee employee);

    public Employee getEmployee(int id);

    public  void deleteEmployee(int id);



}
