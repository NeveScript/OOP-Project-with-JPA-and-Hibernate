package com.github.nekoyasha7.oopregistrationproject.view;

//--+ Imports +--//
import com.github.nekoyasha7.oopregistrationproject.service.StudentService;
import com.github.nekoyasha7.oopregistrationproject.model.StudentsTableModel;
import com.github.nekoyasha7.oopregistrationproject.model.Student;

import java.util.Collections;
import java.util.List;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
//--+ END Imports +--//
/**
 *
 * @author GiovaneNeves
 */
public class Students_GUI extends javax.swing.JFrame {

    StudentsTableModel tableModel = new StudentsTableModel();
    
    public Students_GUI() {

        initComponents();
        loadData();

        this.tblStudents.setModel(tableModel);
        tblStudents.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

    }

    /**
     * Takes the data from the database and adds it to the table model.
     */
    private void loadData(){

        StudentService studentService = new StudentService();
        List<Student> students = studentService.listAllStudents();

        Collections.sort(students, (student1, student2) -> student1.getName().compareTo(student2.getName()));

        if(!tableModel.getStudentList().isEmpty())
            tableModel.getStudentList().clear();

        tableModel.getStudentList().addAll(students);

        tableModel.fireTableDataChanged();

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
        jPnlBackgroundOptionsMenu = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        lblOptions = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        jBtnAddNewEntry = new javax.swing.JButton();
        jBtnClose = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        jPnlBackground.setLayout(null);

        jPnlBackgroundTopMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPnlBackgroundTopMenu.setLayout(null);

        jBtnMinimize.setBackground(new java.awt.Color(255, 139, 73));
        jBtnMinimize.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBtnMinimize.setForeground(new java.awt.Color(255, 255, 255));
        jBtnMinimize.setText("-");
        jBtnMinimize.setBorderPainted(false);
        jBtnMinimize.setFocusPainted(false);
        jBtnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMinimizeActionPerformed(evt);
            }
        });
        jPnlBackgroundTopMenu.add(jBtnMinimize);
        jBtnMinimize.setBounds(530, 10, 80, 20);

        jPnlBackground.add(jPnlBackgroundTopMenu);
        jPnlBackgroundTopMenu.setBounds(10, 0, 620, 40);

        jPnlBackgroundOptionsMenu.setBackground(new java.awt.Color(255, 139, 73));
        jPnlBackgroundOptionsMenu.setLayout(null);

        txtSearch.setText("Search");
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });
        jPnlBackgroundOptionsMenu.add(txtSearch);
        txtSearch.setBounds(91, 9, 530, 30);

        lblOptions.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblOptions.setForeground(new java.awt.Color(255, 255, 255));
        lblOptions.setText("Options");
        jPnlBackgroundOptionsMenu.add(lblOptions);
        lblOptions.setBounds(10, 10, 70, 17);

        jPnlBackground.add(jPnlBackgroundOptionsMenu);
        jPnlBackgroundOptionsMenu.setBounds(10, 40, 620, 40);

        tblStudents.setBackground(new java.awt.Color(255, 139, 73));
        tblStudents.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblStudents.setForeground(new java.awt.Color(255, 255, 255));
        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblStudents);

        jPnlBackground.add(jScrollPane1);
        jScrollPane1.setBounds(100, 90, 530, 270);

        btnRefresh.setBackground(new java.awt.Color(255, 139, 73));
        btnRefresh.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi6kvAMRmc2EoLE1bUda176Uzu45p4gMcy3YRy7jA48x8uq8pl4JKKE_DiETCYS80RiIr-MiR4nogvHoCddZiEBmFEU3120C5BwTD9f3zboGt379Bjfp7KmmDBRpyqqE03o5HDqCP15jJ4UKOcn5YExBXrmBqn5wByhguQB1UI-jhs-Nnvgr5ihhCn4GQ/s16/refresh.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPnlBackground.add(btnRefresh);
        btnRefresh.setBounds(10, 270, 60, 40);

        jBtnAddNewEntry.setBackground(new java.awt.Color(255, 139, 73));
        jBtnAddNewEntry.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jBtnAddNewEntry.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAddNewEntry.setText("+");
        jBtnAddNewEntry.setFocusPainted(false);
        jBtnAddNewEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddNewEntryActionPerformed(evt);
            }
        });
        jPnlBackground.add(jBtnAddNewEntry);
        jBtnAddNewEntry.setBounds(10, 90, 60, 40);

        jBtnClose.setBackground(new java.awt.Color(255, 139, 73));
        jBtnClose.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBtnClose.setForeground(new java.awt.Color(255, 255, 255));
        jBtnClose.setText("X");
        jBtnClose.setBorderPainted(false);
        jBtnClose.setFocusPainted(false);
        jBtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCloseActionPerformed(evt);
            }
        });
        jPnlBackground.add(jBtnClose);
        jBtnClose.setBounds(10, 320, 60, 40);

        btnDelete.setBackground(new java.awt.Color(255, 139, 73));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEihC3843m67SQgMVXIJLcaDpi02CJswtTbS5ZD7X4afobE9-Gvj0a1vPkjH9Az428tTG2188FRIIYp99a4T3hfl8yiQVJZ7w-dRrJVOMo1pnkVDvLVYORuTnBAAfkNuXn5tLQ8RTGhWjDTV2TsxJlMdsnHRPUJd2Yd3ZmNZoQlf4TuAQK4d7XTaNDLQyQ/s16/trash-can.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnDelete.setBorderPainted(false);
        btnDelete.setFocusPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPnlBackground.add(btnDelete);
        btnDelete.setBounds(10, 190, 60, 40);

        btnEdit.setBackground(new java.awt.Color(255, 139, 73));
        btnEdit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhXFz84przDGqKoWKRMedu52xJTYnIHdvb3akNIRegHE8NiXK5B_1TZGkKFIO9JCfy8mJPNChY3s-CMflRGBieiZFDGgMAFuaQnMNeZ66jcujm7eZ7i40Fy1os6o5IzaO1JwDRBNuC5xwE3NN9IY8gFC2e_mcaqxNVMExuOdzqMJgGsOBlIjy2I54ld9A/s16/edit.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnEdit.setBorderPainted(false);
        btnEdit.setFocusPainted(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPnlBackground.add(btnEdit);
        btnEdit.setBounds(10, 140, 60, 40);

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
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close the program?", "Close Warning",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
        
    }//GEN-LAST:event_jBtnCloseActionPerformed

    private void jBtnAddNewEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddNewEntryActionPerformed
        
        new AddStudent_GUI().setVisible(true);
    }//GEN-LAST:event_jBtnAddNewEntryActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed

    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        
        new Students_GUI().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int id;

        if(tblStudents.getSelectedRow() == -1)
            id = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the student ID", "Delete", JOptionPane.INFORMATION_MESSAGE));
        else
            id = tableModel.getStudentList().get(tblStudents.getSelectedRow()).getId();

        removeStudent(id);

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
        Student student;

        if(tblStudents.getSelectedRow() == -1){

            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the student ID", "Edit", JOptionPane.INFORMATION_MESSAGE));
            StudentService studentService = new StudentService();
            student = studentService.findStudentById(id);

        }
        else
            student = tableModel.getStudentList().get(tblStudents.getSelectedRow());
        
        if(student != null){
            
            dispose();
            new EditStudent_GUI(student).setVisible(true);
            
        } else
            JOptionPane.showMessageDialog(null, "Invalid student ID!", "Edit", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        
        searchByTypedText();
        
    }//GEN-LAST:event_txtSearchKeyTyped

    /**
     * Searches students based on text typed into the search bar.
     */
    public void searchByTypedText(){
        
        StudentsTableModel newTableModel = new StudentsTableModel();
        StudentService studentService = new StudentService();
        
        List<Student> students = studentService.listAllStudents();
                
        //--+ Loads all data if the search field is empty +--//
        if(txtSearch.getText().isEmpty()){
            loadData();
            this.tblStudents.setModel(tableModel);
            return;
        }
        
        for(Student student : students){
            
            if(student.getName().contains(txtSearch.getText())){

                newTableModel.getStudentList().add(student);
                
            }
        }
        
        this.tblStudents.setModel(newTableModel);
        
        
    }
    
    /**
     * Removes the selected row and delete the student in the row.
     * @param id of the student to be deleted.
     */
    public void removeStudent(int id){

        StudentService studentService = new StudentService();

        if(studentService.removeStudent(id)){

            ///--+ Checks if the row is selected +--//
            if(tblStudents.getSelectedRow() != -1){

                tableModel.removeRow(tblStudents.getSelectedRow());

            } else{

                int rowToRemove = -1;

                //--+ Searches for the line number to be removed +--//
                for(int i = 0; i < tblStudents.getRowCount(); i++){
                    if(tableModel.getStudentList().get(i).getId() == id){
                        rowToRemove = i;
                    }
                }

                if(rowToRemove != -1){

                    tableModel.removeRow(rowToRemove);

                }
            }
        } else
            JOptionPane.showMessageDialog(null, "Invalid student ID!", "Delete", JOptionPane.ERROR_MESSAGE);

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
            java.util.logging.Logger.getLogger(Students_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Students_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Students_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Students_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Students_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton jBtnAddNewEntry;
    private javax.swing.JButton jBtnClose;
    private javax.swing.JButton jBtnMinimize;
    private javax.swing.JPanel jPnlBackground;
    private javax.swing.JPanel jPnlBackgroundOptionsMenu;
    private javax.swing.JPanel jPnlBackgroundTopMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOptions;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
