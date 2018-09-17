package forex;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Subasri
 */
public class BItemDisplayPage extends javax.swing.JFrame {

    /**
     * Creates new form BItemDisplayPage for displaying the items for sale to the buyers
     */
    public BItemDisplayPage() {
        initComponents();
    }
    
    public String uname;

    BItemDisplayPage(String UName) {
        this.uname = UName;
        initComponents();
        display();
        TitemName.setEditable(false);
        Tdesc.setEditable(false);
        TitemCost.setEditable(false);
        Tcategory.setEditable(false);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addToCart = new javax.swing.JButton();
        category = new javax.swing.JLabel();
        itemName = new javax.swing.JLabel();
        itemDesc = new javax.swing.JLabel();
        cost = new javax.swing.JLabel();
        Tcategory = new javax.swing.JTextField();
        TitemName = new javax.swing.JTextField();
        TitemDesc = new javax.swing.JScrollPane();
        Tdesc = new javax.swing.JTextArea();
        TitemCost = new javax.swing.JTextField();
        previousRecord = new javax.swing.JButton();
        seeYourCart = new javax.swing.JButton();
        viewAcc = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        nextRecord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addToCart.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        addToCart.setText("ADD TO CART");
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        category.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        category.setText("Category");

        itemName.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        itemName.setText("Item name");

        itemDesc.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        itemDesc.setText("Item description");

        cost.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        cost.setText("Cost");

        Tcategory.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N

        TitemName.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N

        Tdesc.setColumns(20);
        Tdesc.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        Tdesc.setRows(5);
        TitemDesc.setViewportView(Tdesc);

        TitemCost.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N

        previousRecord.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        previousRecord.setText("MOVE TO PREVIOUS RECORD ");
        previousRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousRecordActionPerformed(evt);
            }
        });

        seeYourCart.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        seeYourCart.setText("SEE YOUR CART");
        seeYourCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeYourCartActionPerformed(evt);
            }
        });

        viewAcc.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        viewAcc.setText("VIEW ACCOUNT");
        viewAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAccActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        logout.setText("LOG OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        title.setText("ITEMS FOR SALE");

        nextRecord.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        nextRecord.setText("MOVE TO NEXT RECORD ");
        nextRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(seeYourCart)
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addToCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewAcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(96, 96, 96)
                        .addComponent(logout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nextRecord)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(itemName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(category, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(itemDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(cost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TitemDesc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TitemCost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TitemName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tcategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(previousRecord)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitemName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(itemDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(TitemDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitemCost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(previousRecord)
                        .addGap(87, 87, 87)
                        .addComponent(logout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(nextRecord)
                        .addGap(18, 18, 18)
                        .addComponent(addToCart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seeYourCart)
                            .addComponent(viewAcc))))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.dispose();
        new Logout().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void previousRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousRecordActionPerformed
        try{
            ResultSet rs;
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/forex","root", "");
            Statement stmt = (Statement) con.createStatement();
            String query = "select * from itemDetails;";
            rs = stmt.executeQuery(query);
            
            while(!rs.isFirst() && !rs.isLast()){
                rs.previous();
                TitemName.setText(rs.getString("name"));
                Tdesc.setText(rs.getString("descr"));
                Tcategory.setText(rs.getString("category"));
                TitemCost.setText(rs.getString("cost"));
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }  
    }//GEN-LAST:event_previousRecordActionPerformed

    private void viewAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAccActionPerformed
        this.dispose();
        new ViewAccount(uname).setVisible(true);
    }//GEN-LAST:event_viewAccActionPerformed

    private void seeYourCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeYourCartActionPerformed
        this.dispose();
        new ItemsInCart(uname).setVisible(true);
    }//GEN-LAST:event_seeYourCartActionPerformed

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        try{
                    Class.forName("java.sql.DriverManager");
                    Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/forex","root", "");
                    Statement stmt = (Statement) con.createStatement();
                    String query = "insert into itemsInCart values('"+uname+"','"+TitemName.getText()+"','"+Tdesc.getText()+"','"+TitemCost.getText()+"','"+Tcategory.getText()+"');";
                    stmt.execute(query);
                 }
                catch(Exception e){
                    JOptionPane.showMessageDialog(this,e.getMessage());
                }
            JOptionPane.showMessageDialog(null, "Your item has been successfully added to cart","Confirmation Box",1); 
    }//GEN-LAST:event_addToCartActionPerformed

    private void nextRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextRecordActionPerformed
        try{
            ResultSet rs;
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/forex","root", "");
            Statement stmt = (Statement) con.createStatement();
            String query = "select * from itemDetails;";
            rs = stmt.executeQuery(query);
            
            while(!rs.isLast()){
                rs.next();
                TitemName.setText(rs.getString("name"));
                Tdesc.setText(rs.getString("descr"));
                Tcategory.setText(rs.getString("category"));
                TitemCost.setText(rs.getString("cost"));
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }  

    }//GEN-LAST:event_nextRecordActionPerformed

    public void display(){
        try{
            ResultSet rs;
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/forex","root", "");
            Statement stmt = (Statement) con.createStatement();
            String query = "select * from itemDetails;";
            rs = stmt.executeQuery(query);
            
            rs.first();
                TitemName.setText(rs.getString("name"));
                Tdesc.setText(rs.getString("descr"));
                Tcategory.setText(rs.getString("category"));
                TitemCost.setText(rs.getString("cost"));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }  
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
            java.util.logging.Logger.getLogger(BItemDisplayPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BItemDisplayPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BItemDisplayPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BItemDisplayPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BItemDisplayPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tcategory;
    private javax.swing.JTextArea Tdesc;
    private javax.swing.JTextField TitemCost;
    private javax.swing.JScrollPane TitemDesc;
    private javax.swing.JTextField TitemName;
    private javax.swing.JButton addToCart;
    private javax.swing.JLabel category;
    private javax.swing.JLabel cost;
    private javax.swing.JLabel itemDesc;
    private javax.swing.JLabel itemName;
    private javax.swing.JButton logout;
    private javax.swing.JButton nextRecord;
    private javax.swing.JButton previousRecord;
    private javax.swing.JButton seeYourCart;
    private javax.swing.JLabel title;
    private javax.swing.JButton viewAcc;
    // End of variables declaration//GEN-END:variables
}
