/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ecommerce;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.time.LocalDate;
import java.util.UUID;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Customer;
import model.CustomerDirectory;
import util.DatabaseConnector;

/**
 *
 * @author shakt
 */
public class createCustomerPanel extends javax.swing.JPanel {

    /**
     * Creates new form createCustomerPanel
     */
    JPanel bottomPanel;
    CustomerDirectory users;
    Customer tempuser;
    public createCustomerPanel( JPanel bottomPanel, CustomerDirectory users) {
        initComponents();
        this.bottomPanel=bottomPanel;
        this.users=users;
       // tempuser = new User();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        headingLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        telephonenoLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        telephoneField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        femaleRadioBtn = new javax.swing.JRadioButton();
        preferNotRadioBtn = new javax.swing.JRadioButton();
        maleRadioBtn = new javax.swing.JRadioButton();

        headingLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        headingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLabel.setText("Enter Customer Details");

        nameLabel.setText(" Name");

        ageLabel.setText(" Age");

        genderLabel.setText("Gender");

        passwordLabel.setText("Password");

        telephonenoLabel.setText("Telephone No");

        emailLabel.setText("Email Address");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        telephoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telephoneFieldActionPerformed(evt);
            }
        });

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(femaleRadioBtn);
        femaleRadioBtn.setText("Female");

        buttonGroup1.add(preferNotRadioBtn);
        preferNotRadioBtn.setText("Prefer not to say");
        preferNotRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preferNotRadioBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(maleRadioBtn);
        maleRadioBtn.setText("Male");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telephonenoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(saveButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(preferNotRadioBtn)
                                    .addComponent(maleRadioBtn, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(femaleRadioBtn, javax.swing.GroupLayout.Alignment.LEADING)))))
                    .addComponent(headingLabel))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(femaleRadioBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maleRadioBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preferNotRadioBtn)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephonenoLabel)
                    .addComponent(telephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(82, 82, 82))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void telephoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telephoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telephoneFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        Customer newUser = new Customer();
        users.addUser(newUser);
        
        String name = nameField.getText().trim();
        String ageText = ageField.getText().trim();
        String gender = getSelectedGender();
        String password = passwordField.getText();
        String telephone = telephoneField.getText().trim();
        String email = emailField.getText().trim();
        
     if (name.isEmpty() || ageText.isEmpty() || gender == null || password.isEmpty() || telephone.isEmpty() || email.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields must be filled out.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        try {
            int age = Integer.parseInt(ageText);
            if (age <= 0 || age > 150) { 
                JOptionPane.showMessageDialog(this, "Invalid age. Please enter a valid number between 1 and 150.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
        }} catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Age must be a valid number.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (password.length() < 6) {
            JOptionPane.showMessageDialog(this, "Password must be at least 6 characters long.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!telephone.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Invalid telephone number. Please enter only digits.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")) {
            JOptionPane.showMessageDialog(this, "Invalid email address.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (gender == null) {
            JOptionPane.showMessageDialog(this, "Please select a gender.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
            
        try{
        newUser.setName(name);
        newUser.setAge(Integer.parseInt(ageText));
        newUser.setGender(gender);
        newUser.setPassword(password);
        newUser.setTeleNo(Integer.parseInt(telephone));
        newUser.setEmail(email);
        newUser.setCustomerID(UUID.randomUUID().toString());
        DatabaseConnector.addUser(newUser);
        } catch (Exception ex)  {
              JOptionPane.showMessageDialog(this, "Please enter correct details", "Error", HEIGHT);
        }
           
        System.out.println(users);
        JOptionPane.showMessageDialog(this, "Employee Details Saved", "Success", HEIGHT);
    }//GEN-LAST:event_saveButtonActionPerformed

     private String getSelectedGender() {
        if (maleRadioBtn.isSelected()) {
            return "Male";
        } else if (femaleRadioBtn.isSelected()) {
            return "Female";
        } else if (preferNotRadioBtn.isSelected()) {
            return "Prefer not to say";
        } else {
            return null;
        }
    }
     
    private void preferNotRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preferNotRadioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preferNotRadioBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JRadioButton preferNotRadioBtn;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField telephoneField;
    private javax.swing.JLabel telephonenoLabel;
    // End of variables declaration//GEN-END:variables
}
