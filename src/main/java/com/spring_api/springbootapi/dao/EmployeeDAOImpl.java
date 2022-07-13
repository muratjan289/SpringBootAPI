package com.spring_api.springbootapi.dao;


import com.spring_api.springbootapi.entity.Employee;
import org.hibernate.Session;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {


    @Autowired
    private EntityManager entityManager;


    @Override

    
     Query<Employee> query = session.createQuery("from Employee", Employee.class);
//    List<Employee> allEmployees = query.getResultList();
        List<Employee> allEmployees = query.getResultList();
        return allEmployees.isEmpty()
                ? Collections.emptyList() : allEmployees.stream()
                .sorted((t1, t2) -> String.CASE_INSENSITIVE_ORDER.compare(t1.getName(),t2.getName()))
                .collect(Collectors.toList());




//        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Session session = entityManager.unwrap(Session.class);
        Employee employee = session.get(Employee.class, id);
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        Session session = entityManager.unwrap(Session.class);

        Query<Employee> query = session.createQuery("delete from Employee " + "where id =:employeeId");

        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}
