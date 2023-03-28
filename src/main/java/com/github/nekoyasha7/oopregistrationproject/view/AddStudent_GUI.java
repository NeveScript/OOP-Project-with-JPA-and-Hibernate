package com.github.nekoyasha7.oopregistrationproject.view;

//--+ Imports +--//
import javax.swing.JOptionPane;
//--+ END Imports +--//

/**
 *
 * @author GiovaneNeves
 */
public class AddStudent_GUI extends javax.swing.JFrame {

    /**
     * Creates new form AddStudent_GUI
     */
    public AddStudent_GUI() {
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

        jPnlBackground = new javax.swing.JPanel();
        jPnlBackgroundTopMenu = new javax.swing.JPanel();
        jBtnMinimize = new javax.swing.JButton();
        jBtnClose = new javax.swing.JButton();
        txtGrade3 = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtRegistrationNumber = new javax.swing.JTextField();
        txtGrade1 = new javax.swing.JTextField();
        txtGrade2 = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPnlBackground.setLayout(null);

        jPnlBackgroundTopMenu.setBackground(new java.awt.Color(204, 204, 204));
        jPnlBackgroundTopMenu.setLayout(null);

        jBtnMinimize.setText("-");
        jBtnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMinimizeActionPerformed(evt);
            }
        });
        jPnlBackgroundTopMenu.add(jBtnMinimize);
        jBtnMinimize.setBounds(510, 10, 40, 22);

        jBtnClose.setText("X");
        jBtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCloseActionPerformed(evt);
            }
        });
        jPnlBackgroundTopMenu.add(jBtnClose);
        jBtnClose.setBounds(560, 10, 50, 22);

        jPnlBackground.add(jPnlBackgroundTopMenu);
        jPnlBackgroundTopMenu.setBounds(10, 0, 620, 40);

        txtGrade3.setText("Grade 03");
        jPnlBackground.add(txtGrade3);
        txtGrade3.setBounds(50, 260, 140, 30);

        txtName.setText("Name");
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPnlBackground.add(txtName);
        txtName.setBounds(50, 120, 230, 40);

        txtRegistrationNumber.setText("Registration Number");
        jPnlBackground.add(txtRegistrationNumber);
        txtRegistrationNumber.setBounds(290, 120, 230, 40);

        txtGrade1.setText("Grade 01");
        jPnlBackground.add(txtGrade1);
        txtGrade1.setBounds(50, 180, 140, 30);

        txtGrade2.setText("Grade 02");
        jPnlBackground.add(txtGrade2);
        txtGrade2.setBounds(50, 220, 140, 30);

        btnRegister.setText("Register");
        jPnlBackground.add(btnRegister);
        btnRegister.setBounds(210, 310, 140, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(639, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMinimizeActionPerformed

        //--+ Minimizes the window +--//
        setState(javax.swing.JFrame.ICONIFIED);

    }//GEN-LAST:event_jBtnMinimizeActionPerformed

    private void jBtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCloseActionPerformed

        //--+ Closes the program +--//
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this window?", "Close Warning",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        dispose();

    }//GEN-LAST:event_jBtnCloseActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton jBtnClose;
    private javax.swing.JButton jBtnMinimize;
    private javax.swing.JPanel jPnlBackground;
    private javax.swing.JPanel jPnlBackgroundTopMenu;
    private javax.swing.JTextField txtGrade1;
    private javax.swing.JTextField txtGrade2;
    private javax.swing.JTextField txtGrade3;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRegistrationNumber;
    // End of variables declaration//GEN-END:variables
}
