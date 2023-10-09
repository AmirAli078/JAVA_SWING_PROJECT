/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import Model.Student;
import java.util.List;

/**
 *
 * @author aa014
 */
public interface StudentDao {
     public boolean addStudent(Student student);
	public Student getStudentById(Integer id);
	public boolean updateStudent(Student student);
	public boolean deleteStudent(Student id);
        public Student getAllStudent(Student student);
	//public List<Student> getAllCourses();
        public Student getStudentIDByName(String name);
        public boolean deleteStudents(Student student);

  //  public List<Student> getAllStudents();

    public List<Student> getAllStudents();
}
