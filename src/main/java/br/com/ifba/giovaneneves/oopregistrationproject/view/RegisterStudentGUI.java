package br.com.ifba.giovaneneves.oopregistrationproject.view;

//--+ Imports +--//
import br.com.ifba.giovaneneves.oopregistrationproject.controller.FacadeInstance;
import br.com.ifba.giovaneneves.oopregistrationproject.exceptions.student.ExistingRegistrationNumberException;
import br.com.ifba.giovaneneves.oopregistrationproject.exceptions.student.InvalidAgeException;
import br.com.ifba.giovaneneves.oopregistrationproject.exceptions.student.InvalidRegistrationNumberException;
import br.com.ifba.giovaneneves.oopregistrationproject.model.Student;
import br.com.ifba.giovaneneves.oopregistrationproject.util.DataFormatValidator;

import java.time.LocalDate;

import javax.swing.JOptionPane;
//--+ END Imports +--//

/**
 *
 * @author GiovaneNeves
 */
public class RegisterStudentGUI extends javax.swing.JFrame {

    /**
     * Creates new form RegisterStudentGUI
     */
    public RegisterStudentGUI() {
        
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtRegistrationNumber = new javax.swing.JTextField();
        txtAcademicYear = new javax.swing.JTextField();
        txtBirthDate = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        txtGrade1 = new javax.swing.JTextField();
        txtGrade2 = new javax.swing.JTextField();
        txtGrade3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPnlBackground.setLayout(null);

        jPnlBackgroundTopMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPnlBackgroundTopMenu.setLayout(null);

        jBtnMinimize.setBackground(new java.awt.Color(0, 153, 51));
        jBtnMinimize.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBtnMinimize.setForeground(new java.awt.Color(255, 255, 255));
        jBtnMinimize.setText("-");
        jBtnMinimize.setFocusPainted(false);
        jBtnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMinimizeActionPerformed(evt);
            }
        });
        jPnlBackgroundTopMenu.add(jBtnMinimize);
        jBtnMinimize.setBounds(510, 10, 40, 23);

        jBtnClose.setBackground(new java.awt.Color(255, 0, 0));
        jBtnClose.setForeground(new java.awt.Color(255, 255, 255));
        jBtnClose.setText("X");
        jBtnClose.setFocusPainted(false);
        jBtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCloseActionPerformed(evt);
            }
        });
        jPnlBackgroundTopMenu.add(jBtnClose);
        jBtnClose.setBounds(560, 10, 50, 22);

        jPnlBackground.add(jPnlBackgroundTopMenu);
        jPnlBackgroundTopMenu.setBounds(10, 0, 620, 40);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        txtName.setText("Name");
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel2.add(txtName);
        txtName.setBounds(50, 20, 230, 30);

        txtRegistrationNumber.setText("Registration Number");
        txtRegistrationNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistrationNumberActionPerformed(evt);
            }
        });
        jPanel2.add(txtRegistrationNumber);
        txtRegistrationNumber.setBounds(50, 60, 230, 40);

        txtAcademicYear.setText("Academic Year");
        jPanel2.add(txtAcademicYear);
        txtAcademicYear.setBounds(50, 110, 230, 30);

        txtBirthDate.setText("Birth Date");
        txtBirthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthDateActionPerformed(evt);
            }
        });
        jPanel2.add(txtBirthDate);
        txtBirthDate.setBounds(50, 150, 230, 40);

        btnRegister.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 153, 51));
        btnRegister.setText("Register");
        btnRegister.setFocusPainted(false);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister);
        btnRegister.setBounds(80, 240, 140, 40);

        txtGrade1.setText("Grade 01");
        jPanel2.add(txtGrade1);
        txtGrade1.setBounds(50, 200, 64, 30);

        txtGrade2.setText("Grade 02");
        txtGrade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrade2ActionPerformed(evt);
            }
        });
        jPanel2.add(txtGrade2);
        txtGrade2.setBounds(130, 200, 70, 30);

        txtGrade3.setText("Grade 03");
        jPanel2.add(txtGrade3);
        txtGrade3.setBounds(210, 200, 70, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(150, 20, 310, 290);

        jPnlBackground.add(jPanel1);
        jPanel1.setBounds(10, 40, 620, 320);

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

    private void txtRegistrationNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistrationNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistrationNumberActionPerformed

    /**
     * Collects the contents of the text fields and attempts to register a new student into the database.
     */
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        
        String[] textFieldContents = {txtName.getText(), txtRegistrationNumber.getText(), txtGrade1.getText(), txtGrade2.getText(), txtGrade3.getText()};
                                                   
        //--+ Checks if text fields are valid +--//
        if(!DataFormatValidator.isNull(textFieldContents)){
            
            LocalDate birthDate = DataFormatValidator.convertToLocalDate(txtBirthDate.getText());
                    
            //--+ Checks if 'birthDate' are valid. +--//
            if(birthDate != null){
                
                int academicYear = DataFormatValidator.convertToInt(txtAcademicYear.getText());
                
                //--+ Checks if 'academicYear' are valid +--//
                if(academicYear != -1){
                    
                    String[] stringGrades = {txtGrade1.getText(), txtGrade2.getText(), txtGrade3.getText()};
                    float[] convertedGrades = new float[stringGrades.length];

                    //--+ Converts the note strings to float +--//
                    for(int i = 0; i < stringGrades.length; i++){

                        convertedGrades[i] = DataFormatValidator.convertToFloat(stringGrades[i]);
                        if(convertedGrades[i] == -1) return;

                    }

                    //--+ Sets the student's grade point average +--//
                    float  sum = sumUpGrades(convertedGrades);
                    float average = (sum != 0) ? (sum / convertedGrades.length) : 0;

                    Student newStudent = new Student();

                    newStudent.setName(txtName.getText());
                    newStudent.setRegistrationNumber(txtRegistrationNumber.getText());
                    newStudent.setBirthDate(birthDate);
                    newStudent.setAcademicYear(academicYear);
                    newStudent.setGrades(convertedGrades);
                    newStudent.setAverageGrades(average);

                    //--+ Registers the new student in the database +--//
                    try{

                        FacadeInstance.getInstance().saveStudent(newStudent);
                        JOptionPane.showMessageDialog(null, "Student successfully registered", "Registration", JOptionPane.INFORMATION_MESSAGE);

                    } catch(ExistingRegistrationNumberException ex){

                        JOptionPane.showMessageDialog(null,  ex.getMessage(), "Registration", JOptionPane.ERROR_MESSAGE);
                        ex.printStackTrace();

                    } catch (InvalidRegistrationNumberException ex){

                        JOptionPane.showMessageDialog(null, ex.getMessage(), "Registration", JOptionPane.ERROR_MESSAGE);
                        ex.printStackTrace();

                    } catch(InvalidAgeException ex){

                        JOptionPane.showMessageDialog(null, ex.getMessage(), "Registration", JOptionPane.ERROR_MESSAGE);
                        ex.printStackTrace();
                    }
                }
                
            }
                
            
        }
        
        
        
        
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    /**
     * 
     * @param grades to be that will be added up.
     * @return of all as grades.
     */
    private float sumUpGrades(float[] grades){
        
        float sum = 0;
        
        for(float grade : grades){
            sum += grade;
        }
        
        return sum;
    }
    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtBirthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirthDateActionPerformed

    private void txtGrade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrade2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrade2ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterStudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterStudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterStudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterStudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterStudentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton jBtnClose;
    private javax.swing.JButton jBtnMinimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPnlBackground;
    private javax.swing.JPanel jPnlBackgroundTopMenu;
    private javax.swing.JTextField txtAcademicYear;
    private javax.swing.JTextField txtBirthDate;
    private javax.swing.JTextField txtGrade1;
    private javax.swing.JTextField txtGrade2;
    private javax.swing.JTextField txtGrade3;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRegistrationNumber;
    // End of variables declaration//GEN-END:variables
}
