package com.practice.springboot;

import com.practice.springboot.entity.Employee;
import com.practice.springboot.repository.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void should_return_all_employee() {
        List<Employee> employees = employeeRepository.findAll();
        assertEquals(5, employees.size());
    }


}
