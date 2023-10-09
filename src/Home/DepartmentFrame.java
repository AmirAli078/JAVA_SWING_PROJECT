/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Home;

import Dao.DepartmentDao;
import Dao.DepartmentDaoImpli;
import Model.Department;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author aa014
 */
public class DepartmentFrame extends javax.swing.JFrame {

    /**
     * Creates new form department
     */
    DepartmentDao departmentDAO = new DepartmentDaoImpli();
    Integer deptId;
    String[] column = {"ID","Name"};
    DefaultTableModel defaultTableModel = null;
    public DepartmentFrame() {
      initComponents();
      this.setResizable(false);
      setLocationRelativeTo(null);
       fillDepartmentTable();
     //   this.pack();
        
    }
    
     private void fillDepartmentTable() {
        defaultTableModel = new DefaultTableModel(column,0);
        List<Department> department  = departmentDAO.getAllDept();
        
        for(Department d:department ){
            Object[] row = {d.getId(),d.getName()};
            defaultTableModel.addRow(row);
            deptTable.setModel(defaultTableModel);
        }
         deptTable.getColumnModel().getColumn(0).setWidth(0);
        deptTable.getColumnModel().getColumn(0).setMinWidth(0);
    }
     
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        bntupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        deptTable = new javax.swing.JTable();
        btnadd = new javax.swing.JButton();
        deptback = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), null)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Department");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 190, -1));

        jPanel2.setBackground(new java.awt.Color(35, 47, 62));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 153, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Name: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtname.setForeground(new java.awt.Color(255, 153, 0));
        txtname.setToolTipText("");
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel2.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 110, 30));

        jLabel3.setBackground(new java.awt.Color(255, 153, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        txtid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtid.setForeground(new java.awt.Color(255, 153, 0));
        txtid.setToolTipText("Department Name");
        jPanel2.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 110, 30));

        btnclear.setBackground(new java.awt.Color(20, 110, 180));
        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 153, 0));
        btnclear.setText("CLEAR");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel2.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        bntupdate.setBackground(new java.awt.Color(20, 110, 180));
        bntupdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bntupdate.setForeground(new java.awt.Color(255, 153, 0));
        bntupdate.setText("UPDATE");
        bntupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntupdateActionPerformed(evt);
            }
        });
        jPanel2.add(bntupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        btndelete.setBackground(new java.awt.Color(20, 110, 180));
        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 153, 0));
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        deptTable.setBackground(new java.awt.Color(20, 110, 180));
        deptTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deptTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Code"
            }
        ));
        deptTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deptTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(deptTable);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 390, 130));

        btnadd.setBackground(new java.awt.Color(20, 110, 180));
        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 153, 0));
        btnadd.setText("ADD");
        btnadd.setToolTipText("");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel2.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 550, 250));

        deptback.setBackground(new java.awt.Color(20, 110, 180));
        deptback.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deptback.setForeground(new java.awt.Color(255, 153, 0));
        deptback.setText("BACK");
        deptback.setToolTipText("");
        deptback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptbackActionPerformed(evt);
            }
        });
        jPanel1.add(deptback, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deptbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptbackActionPerformed
  this.hide();
HomeFrame homObj=new HomeFrame();
   homObj.show();
 
    }//GEN-LAST:event_deptbackActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
int id=Integer.parseInt(txtid.getText());
   Department deptObj=new Department();
  deptObj.setId(id);
  departmentDAO.deleteDepartment(deptObj);
  fillDepartmentTable();


        // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void bntupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntupdateActionPerformed
  int id=Integer.parseInt(txtid.getText());
  String name=txtname.getText();
   Department deptObj=new Department();
  deptObj.setId(id);
  deptObj.setName(name);
  departmentDAO.updateDepartment(deptObj);
  fillDepartmentTable();


        // TODO add your handling code here:
    }//GEN-LAST:event_bntupdateActionPerformed

    private void deptTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deptTableMouseClicked
        // TODO add your handling code here:
        int index=deptTable.getSelectedRow();
        TableModel model=deptTable.getModel();
        String id=model.getValueAt(index, 0).toString();
        String name=model.getValueAt(index, 1).toString();
        txtid.setText(id);
        txtname.setText(name);
    }//GEN-LAST:event_deptTableMouseClicked

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
clearFields();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       
         int id=Integer.parseInt(txtid.getText());
  String name=txtname.getText();
  Department deptObj=new Department();
  deptObj.setId(id);
  deptObj.setName(name);
  departmentDAO.addDepartment(deptObj);
  fillDepartmentTable();
  clearFields();

// TODO add your handling code here:
    }//GEN-LAST:event_btnaddActionPerformed
    private void clearFields(){
        txtid.setText("");
        txtname.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DepartmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepartmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepartmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepartmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DepartmentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntupdate;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JTable deptTable;
    private javax.swing.JButton deptback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables

    public void setId(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }       
}