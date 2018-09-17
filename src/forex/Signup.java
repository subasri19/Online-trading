package forex;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import javax.swing.JOptionPane;

/**
 *
 * @author Subasri
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form for creating a new account in the software
     */
    public Signup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        activityName = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        luname = new javax.swing.JLabel();
        lphno = new javax.swing.JLabel();
        lmail = new javax.swing.JLabel();
        lpw = new javax.swing.JLabel();
        lpw1 = new javax.swing.JLabel();
        buyer = new javax.swing.JRadioButton();
        seller = new javax.swing.JRadioButton();
        lrole = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        phno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        signin = new javax.swing.JButton();
        pw = new javax.swing.JPasswordField();
        pw1 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        title.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        title.setText("ONLINE FOREIGN TRADING SYSTEM");
        getContentPane().add(title);
        title.setBounds(210, 0, 685, 65);

        activityName.setFont(new java.awt.Font("Candara", 3, 30)); // NOI18N
        activityName.setText("Sign - up");
        getContentPane().add(activityName);
        activityName.setBounds(450, 80, 114, 37);

        lname.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        lname.setText("Name");
        getContentPane().add(lname);
        lname.setBounds(220, 150, 203, 34);

        luname.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        luname.setText("Email-id");
        getContentPane().add(luname);
        luname.setBounds(220, 260, 229, 34);

        lphno.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        lphno.setText("Phone number");
        getContentPane().add(lphno);
        lphno.setBounds(220, 310, 229, 34);

        lmail.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        lmail.setText("Username");
        getContentPane().add(lmail);
        lmail.setBounds(220, 200, 229, 34);

        lpw.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        lpw.setText("Password");
        getContentPane().add(lpw);
        lpw.setBounds(220, 370, 229, 34);

        lpw1.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        lpw1.setText("Confirm password");
        getContentPane().add(lpw1);
        lpw1.setBounds(220, 420, 229, 34);

        buyer.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        buyer.setText("Buyer");
        buyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyerActionPerformed(evt);
            }
        });
        getContentPane().add(buyer);
        buyer.setBounds(500, 490, 110, 43);

        seller.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        seller.setText("Seller");
        getContentPane().add(seller);
        seller.setBounds(640, 490, 120, 43);

        lrole.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        lrole.setText("Role");
        getContentPane().add(lrole);
        lrole.setBounds(220, 470, 229, 34);

        submit.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(440, 570, 200, 45);

        name.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        name.setToolTipText("Enter pass");
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name);
        name.setBounds(490, 150, 267, 43);

        uname.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        getContentPane().add(uname);
        uname.setBounds(490, 210, 267, 34);

        mail.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        getContentPane().add(mail);
        mail.setBounds(490, 260, 267, 34);

        phno.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        phno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phnoActionPerformed(evt);
            }
        });
        getContentPane().add(phno);
        phno.setBounds(490, 310, 267, 34);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel10.setText("Have an account already?");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(809, 253, 282, 34);

        signin.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        signin.setText("Sign in");
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        getContentPane().add(signin);
        signin.setBounds(884, 305, 113, 43);

        pw.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwActionPerformed(evt);
            }
        });
        getContentPane().add(pw);
        pw.setBounds(490, 366, 270, 40);

        pw1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        getContentPane().add(pw1);
        pw1.setBounds(490, 430, 270, 39);

        jLabel11.setBackground(new java.awt.Color(255, 153, 255));
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1150, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyerActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailActionPerformed

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
        new Signin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signinActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if(name.getText().equals("") || uname.getText().equals("") ||
                phno.getText().equals("") || pw.getPassword().equals("") ||
                mail.getText().equals("") || pw1.getPassword().equals("")){
            JOptionPane.showMessageDialog(null, "Please don't leave any column blank. Fill all the blanks","Warning Box",1);
        }
        else{
              
            boolean flag = false;
            String PW = pw.getText();
            String PW1 = pw1.getText();
            
            if(!PW.equals(PW1)){
                JOptionPane.showMessageDialog(null, "Passwords not matching"); 
                flag=true;
            }
                                
            if(flag == false){
                
                String Name, UName, Pw, Pw1, Phno, Mail;
                char role = 'b';
                
                Name = name.getText();
                UName = uname.getText();
                Phno = phno.getText();
                Mail = mail.getText();
                
                if(!Mail.matches("^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$")){
                      JOptionPane.showMessageDialog(null, "Invalid mail Id");
                      return;
                }
                
                if(!Phno.matches("^[0-9]{10}$")){
                    JOptionPane.showMessageDialog(null,"Enter a valid phone number","Warning Box",1);
                    return;
                }
                
                if(!PW.matches("(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,16}")){
                    JOptionPane.showMessageDialog(null, "Password must contain a special character and it is alphanumerical");
                    return;
                }
                        
                if(buyer.isSelected()){
                    role = 'b';
                    new BOptionPage(UName).setVisible(true);
                    this.setVisible(false);
                }
                if(seller.isSelected()){
                    role = 's';
                    new sellerOption(UName).setVisible(true);
                    this.setVisible(false);
                }
            
                try{
                    Class.forName("java.sql.DriverManager");
                    Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/forex","root", "");
                    Statement stmt = (Statement) con.createStatement();
                    String query = "insert into accountDetails values('"+Name+"','"+UName+"','"+Mail+"','"+Phno+"','"+PW+"','"+role+"');";
                    stmt.execute(query);
                 }
                catch(Exception e){
                    JOptionPane.showMessageDialog(this,e.getMessage());
                }
            JOptionPane.showMessageDialog(null, "You have been successfully registred in the site","Confirmation Box",1);   
        
          }
        }
            
    }//GEN-LAST:event_submitActionPerformed

    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwActionPerformed

    private void phnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phnoActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activityName;
    private javax.swing.JRadioButton buyer;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel lmail;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel lphno;
    private javax.swing.JLabel lpw;
    private javax.swing.JLabel lpw1;
    private javax.swing.JLabel lrole;
    private javax.swing.JLabel luname;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phno;
    private javax.swing.JPasswordField pw;
    private javax.swing.JPasswordField pw1;
    private javax.swing.JRadioButton seller;
    private javax.swing.JButton signin;
    private javax.swing.JButton submit;
    private javax.swing.JLabel title;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
