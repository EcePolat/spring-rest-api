package com.ecepolat.config;

import com.ecepolat.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1", "Ece", "Polat"));
        employeeList.add(new Employee("2", "Begum", "Utuk"));
        employeeList.add(new Employee("3", "Elif", "Isık"));
        employeeList.add(new Employee("4", "Selin", "Cinar"));
        employeeList.add(new Employee("5", "Sevval", "Saribas"));

        return employeeList;
    }
}
