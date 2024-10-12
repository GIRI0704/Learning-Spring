package com.spring.Learn_Spring.Service;

import com.spring.Learn_Spring.Entity.Department;

import java.util.List;

public interface DepartmentService {
    Department save(Department department);

    List<Department> getAll();

    Department getById(Long leadId);

    String deleteDept(Long leadId);

    String updateDept(Long leadId);
}
