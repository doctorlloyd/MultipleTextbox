/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb;

import javax.ejb.Local;
import za.ac.tut.entities.Student;

/**
 *
 * @author doctor
 */
@Local
public interface StudentFacadeLocal {

    void addStudent(Student student);

    /*void edit(Student student);

    void remove(Student student);

    Student find(Object id);

    List<Student> findAll();

    List<Student> findRange(int[] range);

    int count();*/
    
}
