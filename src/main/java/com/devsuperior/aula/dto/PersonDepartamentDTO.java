package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDepartamentDTO {
    private Long id;
    private String name;
    private Double salary;

    private DepartmentDTO department;

    public PersonDepartamentDTO(Long id, String name, Double salary, DepartmentDTO department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public PersonDepartamentDTO(Person person) {
        id = person.getId();
        name = person.getName();
        salary = person.getSalary();
        department = new DepartmentDTO(person.getDepartment());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }

}
