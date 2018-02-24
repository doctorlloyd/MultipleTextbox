/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.StudentFacadeLocal;
import za.ac.tut.entities.Student;

/**
 *
 * @author doctor
 */
public class AddStudentServlet extends HttpServlet {

    @EJB
    private StudentFacadeLocal studentFacade;

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long studentNo = Long.parseLong(request.getParameter("studno"));
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String email = request.getParameter("email");
        String number = request.getParameter("contact");
        Character gender = request.getParameter("gender").charAt(0);

        Student student = createStudent(studentNo, name, surname, email, number, gender);
        System.out.println("=========================");
        System.out.println(student.toString());
        System.out.println("=========================");

        studentFacade.addStudent(student);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/student_addition_outcome.jsp");
        dispatcher.forward(request, response);

    }

    public Student createStudent(Long studentNo, String name, String surname, String email, String number, Character gender) {
        Student student = new Student();
        student.setStudentNo(studentNo);
        student.setEmail(email);
        student.setGender(gender);
        student.setName(name);
        student.setNumber(number);
        student.setSurname(surname);

        //JOptionPane.showMessageDialog(null, student.toString());
        return student;
    }
}
