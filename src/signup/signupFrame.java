
package signup;

import DbConnection.DbConnection;
import login.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class signupFrame extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement ps = null;
    public signupFrame() {
         con = (Connection) DbConnection.getConnection();
        initComponents();
        this.setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnsignup = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        nameField1 = new javax.swing.JTextField();
        emailField1 = new javax.swing.JTextField();
        passwordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setText("Logo");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel2.setText("CRUD APPLICATION");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 220, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 80));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 430, 80));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 189, 105), 2, true), "SIGNUP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 18), new java.awt.Color(254, 189, 105))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(55, 71, 90));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setText("Password:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel5.setText("Email: ");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 100, -1));

        btnsignup.setBackground(new java.awt.Color(255, 153, 0));
        btnsignup.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnsignup.setText("Signup");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        jPanel4.add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 100, -1));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel7.setText("Full Name:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        nameField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(nameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 180, 30));

        emailField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(emailField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 180, 30));

        passwordField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(passwordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 180, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 420, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        LoginFrame loginObj=new LoginFrame();
        loginObj.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        String name = nameField1.getText();
        String email = emailField1.getText();
        String password = passwordField1.getText();
         try{
             String insert_query = ("""
                                    insert into  signup (FullName,Eamil, Password)
                                    \tvalues(?,?,?);""");
             ps = con.prepareStatement(insert_query);
             ps.setString(1, name);
             ps.setString(2, email);
             ps.setString(3, password);
             ps.executeUpdate();
            
             
             JOptionPane.showMessageDialog(rootPane, """
                                                     Your Account Created Successfully!! 
                                                      + Login Now!! """);
             
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(rootPane, e);
            
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnsignupActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signupFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsignup;
    private javax.swing.JTextField emailField1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nameField1;
    private javax.swing.JPasswordField passwordField1;
    // End of variables declaration//GEN-END:variables

    public void setIconImage(String oric_logopng) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
