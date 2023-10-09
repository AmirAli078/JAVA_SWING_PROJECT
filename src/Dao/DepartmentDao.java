/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import Home.DepartmentFrame;
import Model.Department;
import java.util.List;

/**
 *
 * @author aa014
 */
public interface DepartmentDao {
    public List<Department> getAllDept();
    public boolean addDepartment(Department dept);
    public boolean deleteDepartment(Department id);
    public boolean updateDepartment(Department update);

    public Department getDepartmentByName(String departmentName);

    public Department getDepartmentById(Integer id);
    
}
