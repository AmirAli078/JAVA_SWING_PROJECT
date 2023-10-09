package login;
import DbConnection.DbConnection;
import Home.HomeFrame;
import signup.signupFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class LoginFrame extends javax.swing.JFrame {
   Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    public LoginFrame() {
        initComponents();
        this.setResizable(false);
        con = (Connection) DbConnection.getConnection();
            }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnsignup = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();

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

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel7.setText("Logo");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel8.setText("Logo");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 80));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 430, 80));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 189, 105), 2, true), "LOGIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 18), new java.awt.Color(254, 189, 105))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(55, 71, 90));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setText("Password:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        btnsignup.setBackground(new java.awt.Color(255, 153, 0));
        btnsignup.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnsignup.setText("Signup");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        jPanel4.add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 100, -1));

        btnlogin.setBackground(new java.awt.Color(255, 153, 0));
        btnlogin.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel4.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 100, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel6.setText("Email");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 153, 0));
        email.setActionCommand("<Not Set>");
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel4.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 42, 190, 30));

        PasswordField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(255, 153, 0));
        PasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        jPanel4.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 180, 30));

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

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        this.hide();
        signupFrame obj = new signupFrame();
        obj.show();
    }//GEN-LAST:event_btnsignupActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
      
        
        try{
            String login_query = "SELECT * FROM  signup WHERE Eamil=? AND Password=?;";
            ps = con.prepareStatement(login_query);
            String Email=email.getText();
            String Password =PasswordField.getText();
            ps.setString(1,Email);
            ps.setString(2, Password);
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                JOptionPane.showMessageDialog(rootPane, "Welcome");
                new HomeFrame().setVisible(true);
                this.setVisible(false);
                
            }
            else
            {
               JOptionPane.showMessageDialog(rootPane, "Incorrect email and password!");
            }
            
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    public void setIconImage(String oric_logopng) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
