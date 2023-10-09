/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import Model.Course;
import java.util.List;

/**
 *
 * @author aa014
 */
public interface StudentCourseDao {
     public void addStudentCourse(Integer sID, Integer cID);
    public List<Course> getCourses(Integer id);
}
