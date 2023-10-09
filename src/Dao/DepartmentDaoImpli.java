/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DbConnection.DbConnection;
import Model.Department;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aa014
 */
public class DepartmentDaoImpli implements DepartmentDao {

    private final String SELECT_QUERY = "SELECT * FROM department;";
    private final String INSERT_QUERY = "INSERT INTO department( d_id,d_name) VALUES ( ?,?)";
    private final String DELETE_QUERY = "DELETE FROM department WHERE d_id=?";
    private final String UPDATE_QUERY = "UPDATE department SET d_name=? WHERE d_id=?";
   private final String SELECT_BY_ID_QUERY = "SELECT d_id,d_name FROM department WHERE d_id= ?";

    @Override
    public List<Department> getAllDept() {
        Connection con = (Connection) DbConnection.getConnection();
        List<Department> deptList = new ArrayList<>();
        try {
            PreparedStatement ps;
            ps = con.prepareStatement(SELECT_QUERY);
            ResultSet rst = ps.executeQuery();

            
            
            while (rst.next()) {
                Department dept = new Department();
                dept.setId(rst.getInt("d_id"));
                dept.setName(rst.getString("d_name"));
                deptList.add(dept);
            }
           
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

         return deptList;
    }

    @Override
    public boolean addDepartment(Department dept) {
        Connection con = DbConnection.getConnection();
        boolean success = false;
        try {
            PreparedStatement ps = con.prepareStatement(INSERT_QUERY);
//			ps.setInt(1, department.getId())
            ps.setInt(1, dept.getId());
            ps.setString(2, dept.getName());

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
    public boolean deleteDepartment(Department id) {
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
    public boolean updateDepartment(Department update) {
        Connection con = DbConnection.getConnection();
        boolean success;
        try {
            PreparedStatement ps = con.prepareStatement(UPDATE_QUERY);
            ps.setInt(2, update.getId());
            ps.setString(1, update.getName());
            ps.execute();
            success = true;
        } catch (SQLException e) {
            success = false;
            e.printStackTrace();
        }
        return success;
    }

    @Override
    public Department getDepartmentByName(String departmentName) {
        Connection con = DbConnection.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from department where d_name= ?");
            ps.setString(1, departmentName);
            ResultSet rst = ps.executeQuery();
            // do not call a query in a loop
            while (rst.next()) {
                Department d = new Department();
                d.setId(rst.getInt("d_id"));
                d.setName(rst.getString("d_name"));
               
                return d;
            }
            // con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Department getDepartmentById(Integer id) {
        Connection con = DbConnection.getConnection();
		Department d = new Department();
		try {
			PreparedStatement ps = con.prepareStatement(SELECT_BY_ID_QUERY);
			ps.setInt(1, id);
			ResultSet rst = ps.executeQuery();
			while (rst.next()) {
				d.setId(rst.getInt("d_id"));
				d.setName(rst.getString("d_name"));
                    
			}
			return d;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

}
