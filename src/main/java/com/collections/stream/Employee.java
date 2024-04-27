package com.collections.stream;

import java.util.Objects;

public class Employee {
    private String fio;
    private int dep;
    private int salary;
    private int id = 0;
    private static int idGenerator = 0;

    public Employee(String fio, int dep, int salary) {
        this.fio = fio;
        this.dep = dep;
        this.salary = salary;
        idGenerator++;
        id = idGenerator;
    }

    public String getFio() {
        return this.fio;
    }

    public int getDep() {
        return this.dep;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setDep(int dep) {
        this.dep = dep;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", dep=" + dep +
                ", salary=" + salary +
                '}';
    }
}
