package com.spring_api.springbootapi.dao;




import com.spring_api.springbootapi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

   public void saveEmployee(Employee employee);

   public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
