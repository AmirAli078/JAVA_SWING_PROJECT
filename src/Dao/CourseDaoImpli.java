/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DbConnection.DbConnection;
import Home.CourseFrame;
import Model.Course;
import java.sql.Connection;
//import Model.Department;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aa014
 */
public class CourseDaoImpli implements CourseDao{
    private final String INSERT_QUERY = "INSERT INTO course(c_id,c_name) VALUES ( ?,?)";
	public final String SELECT_BY_ID_QUERY = "SELECT c_id,c_name FROM course WHERE c_id= ?";
	private final String UPDATE_QUERY = "UPDATE course SET c_name=?  WHERE c_id=?";
	private final String DELETE_QUERY = "DELETE FROM course WHERE c_id=?";
	private final String SELECT_QUERY = "SELECT * FROM course";
    
    @Override
    public boolean addCourse(Course course) {
         Connection con = DbConnection.getConnection();
        boolean success = false;
        try {
            PreparedStatement ps = con.prepareStatement(INSERT_QUERY);
//			ps.setInt(1, department.getId())
            ps.setInt(1, course.getId());
            ps.setString(2, course.getName());

            ps.execute();
            success = true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            success = false;
            e.printStackTrace();

        }
        return success;
        
    }

    @Override
    public Course getCourseById(Integer id) {
        Connection con = DbConnection.getConnection();
		Course c = new Course();
		try {
			PreparedStatement ps = con.prepareStatement(SELECT_BY_ID_QUERY);
			ps.setInt(1, id);
			ResultSet rst = ps.executeQuery();
			while (rst.next()) {
				c.setId(rst.getInt("c_id"));
				c.setName(rst.getString("c_name"));
                                c.setCode(rst.getString("c_code"));
			}
			return c;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

    @Override
    public boolean updateCourse(Course course) {
         Connection con = DbConnection.getConnection();
        boolean success;
        try {
            PreparedStatement ps = con.prepareStatement(UPDATE_QUERY);
            ps.setInt(2, course.getId());
            ps.setString(1, course.getName());
            ps.execute();
            success = true;
        } catch (SQLException e) {
            success = false;
            e.printStackTrace();
        }
        return success;
    }

    @Override
    public boolean deleteCourse(Course id) {
    Connection con = DbConnection.getConnection();
        boolean success;
        try {
            PreparedStatement ps = con.prepareStatement(DELETE_QUERY);
            ps.setInt(1, id.getId());
            ps.execute();
            success = true;
        } catch (SQLException e) {
            success = false;
            e.printStackTrace();
        }
        return success;
    }

    @Override
    public List<Course> getAllCourses() {
         java.sql.Connection con = (java.sql.Connection) DbConnection.getConnection();
        List<Course> courseList = new ArrayList<>();
        try {
            PreparedStatement ps;
            ps = con.prepareStatement(SELECT_QUERY);
            ResultSet rst = ps.executeQuery();

            
            
            while (rst.next()) {
                Course course = new Course();
                course.setId(rst.getInt("c_id"));
                course.setName(rst.getString("c_name"));
                courseList.add(course);
            }
           
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

         return courseList;
    }

    @Override
    public Course getCourseIDByName(String name) {
       
         Connection con = DbConnection.getConnection();
        Course course = new Course();
        try {
            PreparedStatement ps = con.prepareStatement("select c_id from course where c_name=?");

            ps.setString(1, name);
            ResultSet rst = ps.executeQuery();
            while (rst.next()) {
                course.setId(rst.getInt("c_id"));

            }
         return course;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

       return null;
    }

       }
