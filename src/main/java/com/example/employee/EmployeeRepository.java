// Write your code here
package com.example.employee;

import java.util.*;
import com.example.employee.Employee;

public interface EmployeeRepository {
    ArrayList<Employee> getEmployees();

    Employee getEmployeeById(int employeeId);

    Employee addEmployee(Employee employee);

    Employee updateEmployee(int employeeId, Employee employee);

    void deleteEmployee(int employeeId);
}