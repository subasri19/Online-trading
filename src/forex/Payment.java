
package forex;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Subasri
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
    }

    public String uname;
    public int cost;
    
    Payment(String UName , int amt) {
        this.uname = UName;
        this.cost = amt;
        initComponents();
        TamtPaid.setText(Integer.toString(this.cost));
        //TamtPaid.setText(this.cost);
        TamtPaid.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalAmt = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        Tccv = new javax.swing.JTextField();
        payAmt = new javax.swing.JButton();
        cardNo = new javax.swing.JLabel();
        cardHolder = new javax.swing.JLabel();
        ccv = new javax.swing.JLabel();
        TamtPaid = new javax.swing.JTextField();
        TcardNo = new javax.swing.JTextField();
        TcardHolder = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1120, 1120));
        getContentPane().setLayout(null);

        totalAmt.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        totalAmt.setText("Total amount to be paid");
        getContentPane().add(totalAmt);
        totalAmt.setBounds(128, 177, 324, 34);

        title.setFont(new java.awt.Font("Segoe Print", 3, 36)); // NOI18N
        title.setText("PAYMENT PAGE");
        getContentPane().add(title);
        title.setBounds(401, 60, 324, 65);

        Tccv.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        Tccv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TccvActionPerformed(evt);
            }
        });
        getContentPane().add(Tccv);
        Tccv.setBounds(639, 364, 246, 40);

        payAmt.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        payAmt.setText("PAY THE AMOUNT");
        payAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payAmtActionPerformed(evt);
            }
        });
        getContentPane().add(payAmt);
        payAmt.setBounds(401, 476, 261, 43);

        cardNo.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        cardNo.setText("Enter your credit/debit card number");
        getContentPane().add(cardNo);
        cardNo.setBounds(128, 243, 415, 34);

        cardHolder.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        cardHolder.setText("Card holder name");
        getContentPane().add(cardHolder);
        cardHolder.setBounds(128, 312, 324, 34);

        ccv.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        ccv.setText("CCV");
        getContentPane().add(ccv);
        ccv.setBounds(128, 374, 324, 34);

        TamtPaid.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        TamtPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TamtPaidActionPerformed(evt);
            }
        });
        getContentPane().add(TamtPaid);
        TamtPaid.setBounds(639, 174, 246, 40);

        TcardNo.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        TcardNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TcardNoActionPerformed(evt);
            }
        });
        getContentPane().add(TcardNo);
        TcardNo.setBounds(639, 240, 246, 40);

        TcardHolder.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        TcardHolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TcardHolderActionPerformed(evt);
            }
        });
        getContentPane().add(TcardHolder);
        TcardHolder.setBounds(639, 298, 246, 40);

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-2, 2, 1150, 1150);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TccvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TccvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TccvActionPerformed

    private void payAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payAmtActionPerformed
        JOptionPane.showMessageDialog(null,"The product will be delivered to you shortly! Thank you for using our service");
        this.setVisible(false);
        new BItemDisplayPage(uname).setVisible(true);
        try{
            ResultSet rs;
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/forex","root", "");
            Statement stmt = (Statement) con.createStatement();
            String query = "delete from itemsInCart where uname = '" +uname+"';";
            stmt.executeUpdate(query);
       }
       catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
       
    }//GEN-LAST:event_payAmtActionPerformed

    private void TamtPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TamtPaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TamtPaidActionPerformed

    private void TcardNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TcardNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TcardNoActionPerformed

    private void TcardHolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TcardHolderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TcardHolderActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TamtPaid;
    private javax.swing.JTextField TcardHolder;
    private javax.swing.JTextField TcardNo;
    private javax.swing.JTextField Tccv;
    private javax.swing.JLabel cardHolder;
    private javax.swing.JLabel cardNo;
    private javax.swing.JLabel ccv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton payAmt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel totalAmt;
    // End of variables declaration//GEN-END:variables
}
