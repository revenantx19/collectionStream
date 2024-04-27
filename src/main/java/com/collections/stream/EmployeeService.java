package com.collections.stream;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    String addEmployee(String fio, int dep, int salary);
    String findEmployee(String fio);
    String deleteEmployee(String fio);
    Employee maxSalary(int departmentId);
    Employee minSalary(Integer departmentId);
    List<Employee> getAllEmployeesOfDepartment(int departmentId);
    Map<Integer, List<Employee>> allEmployees();

}
