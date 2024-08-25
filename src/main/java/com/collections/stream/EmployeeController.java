package com.collections.stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/add")
    public String addEmployee(@RequestParam("fio") String fio, @RequestParam("dep") int dep, @RequestParam("salary") int salary) {
        return employeeService.addEmployee(fio, dep, salary);
    }

    @GetMapping(path = "/find")
    public String addEmployee(@RequestParam("fio") String fio) {
        return employeeService.findEmployee(fio);
    }

    @GetMapping(path = "/del")
    public String deleteEmployee(@RequestParam("fio") String fio) {
        return employeeService.deleteEmployee(fio);
    }

    @GetMapping(path = "/max-salary")
    public Employee maxSalary(@RequestParam("departmentId") int departmentId) {
        return employeeService.maxSalary(departmentId);
    }

    @GetMapping(path = "/min-salary")
    public Employee minSalary(@RequestParam("departmentId") Integer departmentId) {
        return employeeService.minSalary(departmentId);
    }

    @GetMapping(path = "/all")
    public List<Employee> allEmployeesOfDepartment(@RequestParam("departmentId") int departmentId) {
        return employeeService.getAllEmployeesOfDepartment(departmentId);
    }

    @GetMapping(path = "/allEmployees")
    public Map<Integer, List<Employee>> allEmployees() {
        return employeeService.allEmployees();
    }
}
