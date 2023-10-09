/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DbConnection.DbConnection;
import Model.Course;
//import java.lang.System.Logger;
//import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author aa014
 */
public class StudentCourseDaoImpli implements StudentCourseDao {

    @Override
    public void addStudentCourse(Integer sID, Integer cID) {
         try {
            System.out.println("Course ID: " + cID);
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into students_course values(?,?)");
            ps.setInt(1, sID);
            ps.setInt(2, cID);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StudentCourseDaoImpli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public  List<Course> getCourses(Integer id) {
     List<Course> list = new ArrayList<>();

        try {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select c.c_name from course c inner join students_course sc on c.c_id=sc.c_id where sc.st_id=? ");
            ps.setInt(1, id);
            ResultSet rst = ps.executeQuery();

            while (rst.next()) {
                Course course = new Course();

                course.setName(rst.getString("c.c_name"));

                list.add(course);

            }

            return list;
        } catch (SQLException ex) {
            Logger.getLogger(StudentCourseDaoImpli.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    }
