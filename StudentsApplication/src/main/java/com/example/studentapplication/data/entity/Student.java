package com.example.studentapplication.data.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity( name = "Students" )
public class Student
{

    @Id
    @GeneratedValue
    @Column( name = "idStudents" )
    private int id;

    private String name;

    private String email;

    private String address;
    
    @JsonFormat(pattern = "dd-MM-yyyy")
    @Column( name = "birth_date" )
    private Date birthDate;


    public Student()
    {
    }

    public Student( String name, String email, Date birthDate )
    {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
     
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
    public String toString()
    {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\''
            + ", address='" + address + '\'' + ", birthDate=" + birthDate + '}';
    }
}