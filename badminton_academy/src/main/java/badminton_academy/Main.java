/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badminton_academy;

import java.awt.Font;
import java.awt.FontFormatException;

/**
 *
 * @author sabar
 */

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form login_page
     */
    public Main() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        login_title = new javax.swing.JLabel();
        name_header = new javax.swing.JLabel();
        username_slot = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passcode_header = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        username_password = new javax.swing.JPasswordField();
        login_button = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(16, 22, 28));
        jPanel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(36, 42, 48));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("DyeLine", 1, 46)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Badminton Academy");
        jPanel2.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 600, 70));

        login_title.setFont(new java.awt.Font("DyeLine", 1, 32)); // NOI18N
        login_title.setForeground(new java.awt.Color(57, 113, 177));
        login_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_title.setText("Login Page");
        jPanel2.add(login_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 600, -1));

        name_header.setFont(new java.awt.Font("DyeLine", 1, 18)); // NOI18N
        name_header.setForeground(new java.awt.Color(255, 255, 255));
        name_header.setText("Username");
        jPanel2.add(name_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 165, -1, -1));

        username_slot.setBackground(new java.awt.Color(36, 42, 48));
        username_slot.setFont(new java.awt.Font("DyeLine", 1, 16)); // NOI18N
        username_slot.setForeground(new java.awt.Color(250, 250, 250));
        username_slot.setBorder(null);
        username_slot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_slotActionPerformed(evt);
            }
        });
        jPanel2.add(username_slot, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 195, 190, 30));

        jSeparator1.setBackground(new java.awt.Color(57, 113, 177));
        jSeparator1.setForeground(new java.awt.Color(57, 113, 177));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 190, -1));

        passcode_header.setFont(new java.awt.Font("DyeLine", 1, 18)); // NOI18N
        passcode_header.setForeground(new java.awt.Color(255, 255, 255));
        passcode_header.setText("Password");
        jPanel2.add(passcode_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 265, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(57, 113, 177));
        jSeparator2.setForeground(new java.awt.Color(57, 113, 177));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 190, -1));

        username_password.setBackground(new java.awt.Color(36, 42, 48));
        username_password.setFont(new java.awt.Font("DyeLine", 1, 16)); // NOI18N
        username_password.setForeground(new java.awt.Color(250, 250, 250));
        username_password.setBorder(null);
        jPanel2.add(username_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 190, 30));

        login_button.setBackground(new java.awt.Color(126, 87, 194));
        login_button.setFont(new java.awt.Font("DyeLine", 1, 20)); // NOI18N
        login_button.setForeground(new java.awt.Color(255, 255, 255));
        login_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_button.setText("Log in");
        login_button.setAlignmentX(0.5F);
        login_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        login_button.setOpaque(true);
        login_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_buttonMouseExited(evt);
            }
        });
        jPanel2.add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 380, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_slotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_slotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_slotActionPerformed

    private void login_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_buttonMouseEntered
        // TODO add your handling code here:   
        login_button.setBackground(new java.awt.Color(141, 102, 209));
    }//GEN-LAST:event_login_buttonMouseEntered

    private void login_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_buttonMouseClicked
        // TODO add your handling code here:
        
        this.dispose();
        new main_page().setVisible(true);
    }//GEN-LAST:event_login_buttonMouseClicked

    private void login_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_buttonMouseExited
        // TODO add your handling code here:
        
        login_button.setBackground(new java.awt.Color(136, 87, 194));
    }//GEN-LAST:event_login_buttonMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FontFormatException {
       
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
                java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>
            
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Main().setVisible(true);
                }
            });
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel login_button;
    private javax.swing.JLabel login_title;
    private javax.swing.JLabel name_header;
    private javax.swing.JLabel passcode_header;
    private javax.swing.JLabel title;
    private javax.swing.JPasswordField username_password;
    private javax.swing.JTextField username_slot;
    // End of variables declaration//GEN-END:variables
}
