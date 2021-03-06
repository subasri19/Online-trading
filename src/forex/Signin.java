
package forex;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Subasri
 */
public class Signin extends javax.swing.JFrame {

    /**
     * Creates new form for sign-in in to the software and gain access
     */
    public Signin() {
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

        ltitle = new javax.swing.JLabel();
        lsignin = new javax.swing.JLabel();
        luname = new javax.swing.JLabel();
        lpw = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        lalternate = new javax.swing.JLabel();
        signup = new javax.swing.JButton();
        proceed = new javax.swing.JButton();
        pw = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 0));
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);

        ltitle.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        ltitle.setText("ONLINE FOREIGN TRADING SYSTEM");
        getContentPane().add(ltitle);
        ltitle.setBounds(200, 20, 740, 70);

        lsignin.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        lsignin.setText("Sign in");
        getContentPane().add(lsignin);
        lsignin.setBounds(490, 120, 100, 34);

        luname.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        luname.setText("Username");
        getContentPane().add(luname);
        luname.setBounds(340, 200, 160, 34);

        lpw.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        lpw.setText("Password");
        getContentPane().add(lpw);
        lpw.setBounds(337, 260, 120, 34);

        uname.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        getContentPane().add(uname);
        uname.setBounds(580, 200, 230, 40);

        lalternate.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        lalternate.setText("Don't have an account?");
        getContentPane().add(lalternate);
        lalternate.setBounds(410, 480, 270, 34);

        signup.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        signup.setText("Sign-up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        getContentPane().add(signup);
        signup.setBounds(470, 540, 123, 50);

        proceed.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        proceed.setText("Proceed");
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });
        getContentPane().add(proceed);
        proceed.setBounds(470, 340, 150, 43);

        pw.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(pw);
        pw.setBounds(580, 260, 230, 40);

        jLabel7.setBackground(new java.awt.Color(255, 255, 204));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-9, 0, 1130, 1120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
        String UName = uname.getText();
        String PW = pw.getText();
        
        try{
            ResultSet rs;   
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/forex","root", "");
            Statement stmt = (Statement) con.createStatement();
            String query = "select * from accountDetails where userName='"+UName+"' and pw='"+PW+"';";
            rs = stmt.executeQuery(query);
            if(rs.next()){
                    JOptionPane.showMessageDialog(null,"Succeffully logged in","Login Success",1);
                    if(rs.getString("role").equals("s"))
                        new sellerOption(UName).setVisible(true);
                    else
                        new BOptionPage(UName).setVisible(true);
                     this.setVisible(false);
                }
            else
                JOptionPane.showMessageDialog(null, "Please enter a valid username and password", "Error message",1);
            }
            
         
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_proceedActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        new Signup().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signupActionPerformed

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
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lalternate;
    private javax.swing.JLabel lpw;
    private javax.swing.JLabel lsignin;
    private javax.swing.JLabel ltitle;
    private javax.swing.JLabel luname;
    private javax.swing.JButton proceed;
    private javax.swing.JPasswordField pw;
    private javax.swing.JButton signup;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
