package Login;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fhrz
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        user = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        Tf_pass = new javax.swing.JTextField();
        btnregister = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        Tf_user = new javax.swing.JTextField();
        Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        user.setText("USERNAME");

        pass.setText("PASSWORD");

        Tf_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_passActionPerformed(evt);
            }
        });

        btnregister.setText("REGISTER");

        btnlogin.setText("LOGIN");

        Tf_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_userActionPerformed(evt);
            }
        });

        Label.setBackground(new java.awt.Color(0, 0, 0));
        Label.setFont(new java.awt.Font("Showcard Gothic", 0, 13)); // NOI18N
        Label.setText("Pertanian Berkah");
        Label.setToolTipText("");
        Label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Label.setMaximumSize(new java.awt.Dimension(195, 31));
        Label.setMinimumSize(new java.awt.Dimension(195, 31));
        Label.setPreferredSize(new java.awt.Dimension(195, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user)
                            .addComponent(pass))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnregister)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnlogin))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass)
                    .addComponent(Tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnregister)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tf_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_passActionPerformed

    private void Tf_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_userActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label;
    private javax.swing.JTextField Tf_pass;
    private javax.swing.JTextField Tf_user;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnregister;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables

    public JLabel getLabel() {
        return Label;
    }

    public void setLabel(JLabel Label) {
        this.Label = Label;
    }

    public JTextField getTf_pass() {
        return Tf_pass;
    }

    public void setTf_pass(JTextField Tf_pass) {
        this.Tf_pass = Tf_pass;
    }

    public JTextField getTf_user() {
        return Tf_user;
    }

    public void setTf_user(JTextField Tf_user) {
        this.Tf_user = Tf_user;
    }

    public JButton getBtnlogin() {
        return btnlogin;
    }

    public void setBtnlogin(JButton btnlogin) {
        this.btnlogin = btnlogin;
    }

    public JButton getBtnregister() {
        return btnregister;
    }

    public void setBtnregister(JButton btnregister) {
        this.btnregister = btnregister;
    }

    public JLabel getPass() {
        return pass;
    }

    public void setPass(JLabel pass) {
        this.pass = pass;
    }

    public JLabel getUser() {
        return user;
    }

    public void setUser(JLabel user) {
        this.user = user;
    }
}