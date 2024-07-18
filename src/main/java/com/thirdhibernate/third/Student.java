package com.thirdhibernate.third;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name="studentID")
    private int id;
    @Column(name="StudentName" , nullable=true)
    private String name;
    @Column(name="studentCity")
    private String city;
    @Column(name="studentSalary")
    private int salary;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
