/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DbConnection.DbConnection;
import Model.Department;
import Model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class StudentDaoImpli implements StudentDao {
      

    private final String INSERT_QUERY = "INSERT INTO students (st_name,st_age,st_email,d_id,roll_no) VALUES (?,?,?,?,?)";
   //  private final String INSERT_QUERY2 = "INSERT INTO college_db.department (d_id,d_name) VALUES (?,?)";
      private final String UPDATE_QUERY = "UPDATE students  SET  st_name = ? , st_age = ?, st_email=?,d_id=?,roll_no=? "
            + "WHERE st_id=?";
          private final String DELETE_QUERY = "DELETE FROM students WHERE st_id=?";

          private final String SELECT_QUERY = """
                                              SELECT s.st_id,s.st_name, s.st_age, s.st_email,s.roll_no,d.d_id,s.d_name\r
                                              FROM students s inner join department d on s.d_id=d.d_id where s.stId=?""";
           private final String SELECT_QUERY_WITH_JOIN_FOR_SINGLE_RECORD = "SELECT s.st_id,s.st_name, s.st_age, s.st_email,s.roll_no,s.d_id,d.d_name"
            + " FROM students s inner join department d on s.d_id=d.d_id where s.st_id=?";
          
           private final String SELECT_QUERY_WITH_JOIN = """
                                                         SELECT s.st_id,s.st_name, s.st_age, s.st_email,s.roll_no,d.d_name,s.d_id\r
                                                         FROM students s inner join department d on s.d_id=d.d_id;""";
       

    @Override
    public boolean addStudent(Student student) {
    Connection con = DbConnection.getConnection();
        boolean success = false;
        try {
            PreparedStatement ps = con.prepareStatement(INSERT_QUERY);
             //PreparedStatement ps2 = con.prepareStatement(INSERT_QUERY2);
//	 ps.setInt(1, department.getId())
          //  ps.setInt(1, student.getId());
            ps.setString(1, student.getName());
            ps.setString(3,student.getEmail());
            ps.setInt(2,student.getAge());
            ps.setString(5,student.getRollno());
           ps.setInt(4,student.getDepartment().getId());
          //ps2.setString(2,student.getDepartment().getName());
          //ps2.setInt(1,student.getDepartment().getId());

            ps.execute();
            //ps2.execute();
            success = true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            success = false;
            e.printStackTrace();

        }
        return success;
    }

    @Override
    public Student getStudentById(Integer id) {
                Connection con = DbConnection.getConnection();
        Student s = new Student();
        try {
            PreparedStatement ps = con.prepareStatement(SELECT_QUERY_WITH_JOIN_FOR_SINGLE_RECORD);

            ps.setInt(1, id);
            ResultSet rst = ps.executeQuery();
            while (rst.next()) {
                s.setId(id);
                s.setName(rst.getString("st_name"));
                s.setAge(rst.getInt("st_age"));
                s.setEmail(rst.getString("st_email"));
                s.setRollno(rst.getString("roll_no"));
                Department d = new Department();
                d.setId(rst.getInt("d_id"));
                d.setName(rst.getString("d_name"));
                s.setDepartment(d);

            }
            return s;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public boolean updateStudent(Student student) {
          Connection con = DbConnection.getConnection();
        boolean success;
        try {
            PreparedStatement ps = con.prepareStatement(UPDATE_QUERY);
            ps.setString(1, student.getName());
            ps.setInt(2,student.getAge());
             ps.setString(3,student.getEmail());
             ps.setInt(4, student.getDepartment().getId());
              ps.setString(5,student.getRollno());
            ps.setInt(6, student.getId());
            ps.execute();
            success = true;
        } catch (SQLException e) {
            success = false;
            e.printStackTrace();
        }
        return success;
    }

    @Override
    public boolean deleteStudent(Student id) {
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
    public Student getStudentIDByName(String name) {
        Connection con = DbConnection.getConnection();
        Student s = new Student();
        try {
            PreparedStatement ps = con.prepareStatement("select st_id from students where st_name=?");

            ps.setString(1, name);
            ResultSet rst = ps.executeQuery();
            while (rst.next()) {
                s.setId(rst.getInt("st_id"));

            }
            return s;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Student getAllStudent(Student student) {
     Connection con = DbConnection.getConnection();

        List<Student> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(SELECT_QUERY_WITH_JOIN);

            ResultSet rst = ps.executeQuery();
//                        while(rst.next()){
//                            System.out.println(rst.getInt("st_id"));
//                            System.out.println(rst.getString("st_name"));
//                           
//                        }

            while (rst.next()) {
                Student st = new Student();
               st.setId(rst.getInt("st_id"));
                st.setName(rst.getString("st_name"));
                st.setAge(rst.getInt("st_age"));
                st.setEmail(rst.getString("st_email"));
                st.setRollno(rst.getString("roll_no"));
                Department d = new Department();
                d.setId(rst.getInt("d_id"));
                d.setName(rst.getString("d_name"));
                st.setDepartment(d);
                list.add(st);
            }

            return (Student) list;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;  
}

    @Override
    public List<Student> getAllStudents() {
         Connection con = DbConnection.getConnection();

        List<Student> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(SELECT_QUERY_WITH_JOIN);

            ResultSet rst = ps.executeQuery();
//                        while(rst.next()){
//                            System.out.println(rst.getInt("st_id"));
//                            System.out.println(rst.getString("st_name"));
//                           
//                        }

            while (rst.next()) {
                Student st = new Student();
                st.setId(rst.getInt("st_id"));
                st.setName(rst.getString("st_name"));
                st.setAge(rst.getInt("st_age"));
                st.setEmail(rst.getString("st_email"));
                st.setRollno(rst.getString("roll_no"));
                Department d = new Department();
                d.setId(rst.getInt("d_id"));
                d.setName(rst.getString("d_name"));
                st.setDepartment(d);
                list.add(st);
            }

            return list;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;  
    }
    
    @Override
    public boolean deleteStudents(Student student) {
        Connection con = DbConnection.getConnection();
        boolean success = false;
        try {
            PreparedStatement ps = con.prepareStatement(DELETE_QUERY);
            ps.setInt(1, student.getId());
            ps.execute();
            success = true;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return success;
    }

}
