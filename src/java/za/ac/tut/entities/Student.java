/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author doctor
 */
@Entity
@Table(name="ClassList")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long studentNo;
    private String name;
    private String surname;
    private String email;
    private String number;
    private Character gender;

    public Student() {
    }

    public Student(Long studentNo, String name, String surname, String email, String number, Character gender) {
        this.studentNo = studentNo;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.number = number;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }
    
    public Long getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Long studentNo) {
        this.studentNo = studentNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentNo != null ? studentNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.studentNo == null && other.studentNo != null) || (this.studentNo != null && !this.studentNo.equals(other.studentNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" + "studentNo=" + studentNo + ", name=" + name + 
                ", surname=" + surname + ", email=" + email + ", number=" + 
                number + ", gender=" + gender + '}';
    }
    
}
