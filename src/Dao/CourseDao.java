/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import Home.CourseFrame;
import Model.Course;
import java.util.List;

/**
 *
 * @author aa014
 */
public interface CourseDao {
     public boolean addCourse(Course course);
	public Course getCourseById(Integer id);
	public boolean updateCourse(Course course);
	public boolean deleteCourse(Course id);
	public List<Course> getAllCourses();
      //  public CourseFrame getCourseIDByName(String name);
        public Course getCourseIDByName(String name);
}
