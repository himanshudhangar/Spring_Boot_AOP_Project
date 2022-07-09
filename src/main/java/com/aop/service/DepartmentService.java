package com.aop.service;

import com.aop.annotation.CustomAnnotation;
import com.aop.model.Department;
import com.aop.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {


    @Autowired
    private DepartmentRepository departmentRepository;

    public Department save(Department department ){
        return departmentRepository.save(department);
    }

    @CustomAnnotation
    public Department findById(Integer id ){
        return departmentRepository.findById(id).orElse(null);

    }
}