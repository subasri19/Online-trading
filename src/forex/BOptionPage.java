package forex;

/**
 *
 * @author Subasri
 */
public class BOptionPage extends javax.swing.JFrame {

    /**
     * Creates new form BDisplayPage displaying the options for the buyers
     */
    public BOptionPage() {
        initComponents();
    }

    public String uname;
    
    BOptionPage(String UName) {
        this.uname = UName;
        initComponents();
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewAcc = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        viewItems = new javax.swing.JButton();
        yourCart = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1120, 1120));
        getContentPane().setLayout(null);

        viewAcc.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        viewAcc.setText("VIEW ACCOUNT");
        viewAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAccActionPerformed(evt);
            }
        });
        getContentPane().add(viewAcc);
        viewAcc.setBounds(420, 397, 327, 43);

        logout.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        logout.setText("LOG OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(420, 526, 327, 43);

        viewItems.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        viewItems.setText("VIEW ITEMS FOR SALE");
        viewItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewItemsActionPerformed(evt);
            }
        });
        getContentPane().add(viewItems);
        viewItems.setBounds(420, 149, 327, 43);

        yourCart.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        yourCart.setText("SEE YOUR CART");
        yourCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yourCartActionPerformed(evt);
            }
        });
        getContentPane().add(yourCart);
        yourCart.setBounds(420, 271, 327, 43);

        bg.setBackground(new java.awt.Color(255, 255, 204));
        bg.setOpaque(true);
        getContentPane().add(bg);
        bg.setBounds(-5, 3, 1120, 1120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAccActionPerformed
        this.setVisible(false);
        new ViewAccount(uname).setVisible(true);
    }//GEN-LAST:event_viewAccActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       this.setVisible(false);
       new Logout().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void viewItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewItemsActionPerformed
        this.setVisible(false);
        new BItemDisplayPage(uname).setVisible(true);
    }//GEN-LAST:event_viewItemsActionPerformed

    private void yourCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yourCartActionPerformed
        this.setVisible(false);
        new ItemsInCart(uname).setVisible(true);
    }//GEN-LAST:event_yourCartActionPerformed

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
            java.util.logging.Logger.getLogger(BOptionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BOptionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BOptionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BOptionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BOptionPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton logout;
    private javax.swing.JButton viewAcc;
    private javax.swing.JButton viewItems;
    private javax.swing.JButton yourCart;
    // End of variables declaration//GEN-END:variables
}
