/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservationssystems;

import java.awt.Color;

 
public class RegistrationFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationFrame
     */
    public RegistrationFrame() {
        initComponents();
        pass2.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
           passCONKeyReleased(evt);
        }
    });
             pass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
            passSTRKeyReleased(evt);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passSTR = new javax.swing.JLabel();
        passCON = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        btn_register = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pass1 = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 675));
        getContentPane().setLayout(null);

        passSTR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passSTRKeyReleased(evt);
            }
        });
        getContentPane().add(passSTR);
        passSTR.setBounds(110, 420, 380, 24);

        passCON.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passCONKeyReleased(evt);
            }
        });
        getContentPane().add(passCON);
        passCON.setBounds(120, 490, 380, 24);

        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.setBorder(null);
        txt1.setOpaque(false);
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1KeyReleased(evt);
            }
        });
        getContentPane().add(txt1);
        txt1.setBounds(115, 230, 440, 30);

        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2.setBorder(null);
        txt2.setOpaque(false);
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        getContentPane().add(txt2);
        txt2.setBounds(115, 310, 440, 25);

        btn_register.setBackground(new java.awt.Color(0, 153, 153));
        btn_register.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_register.setText("Register");
        btn_register.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_register);
        btn_register.setBounds(110, 510, 70, 30);

        btn_clear.setBackground(new java.awt.Color(0, 102, 102));
        btn_clear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear);
        btn_clear.setBounds(190, 510, 70, 30);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(990, 110, 150, 50);

        pass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass1.setBorder(null);
        pass1.setOpaque(false);
        pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass1ActionPerformed(evt);
            }
        });
        getContentPane().add(pass1);
        pass1.setBounds(115, 390, 440, 25);

        pass2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass2.setToolTipText("");
        pass2.setBorder(null);
        pass2.setOpaque(false);
        pass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass2ActionPerformed(evt);
            }
        });
        getContentPane().add(pass2);
        pass2.setBounds(115, 465, 440, 25);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 400, 117, 20);

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("EXIT");
        getContentPane().add(jButton3);
        jButton3.setBounds(500, 510, 60, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SYSTEM DESIGN.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1200, 670);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(524, 460, 160, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyReleased
        // TODO add your handling code here:
        String name = txt1.getText();
        StringBuilder capitalized = new StringBuilder();
        boolean capitalizeNext = true;
        for (char c : name.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
                capitalized.append(c);
            } else if (capitalizeNext) {
                capitalized.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                capitalized.append(Character.toLowerCase(c));
            }
        }
        txt1.setText(capitalized.toString());
    }//GEN-LAST:event_txt1KeyReleased

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        // TODO add your handling code here:
        String name = txt1.getText();
        String email = txt2.getText();
        String orgpass = new String(pass1.getPassword());
        String confpass = new String(pass2.getPassword());

        boolean isValid = true;
        StringBuilder errorMessage = new StringBuilder();

        if (name.isEmpty() || email.isEmpty() || orgpass.isEmpty() || confpass.isEmpty()) {
            jLabel1.setForeground(new Color(255, 204, 204));
            jLabel1.setText("Please fill in all fields. Thank you.");
            return;
        }

        if (name.matches(".*\\d.*")) {
            errorMessage.append("Name cannot contain numbers.\n");
            isValid = false;
        }
        if (!name.contains(" ")) {
            errorMessage.append("Name must contain at least two words separated by a space.\n");
            isValid = false;
        }
        if (!name.matches("[a-zA-Z ]+")) {
            errorMessage.append("Name can only contain letters and spaces.\n");
            isValid = false;
        }

        if (!email.contains("@gmail.com") && !email.contains("@yahoo.com")) {
            errorMessage.append("Invalid email format. Use Gmail or Yahoo.\n");
            isValid = false;
        }

        if (!orgpass.equals(confpass)) {
            errorMessage.append("Passwords do not match.\n");
            isValid = false;
        }
        if (!orgpass.matches("[a-zA-Z0-9]+")) {
            errorMessage.append("Password cannot contain special characters.\n");
            isValid = false;
        }

        if (!isValid) {
            jLabel1.setForeground(Color.RED);
            jLabel1.setText(errorMessage.toString());
            return;
        }
        ReservationFrame f2= new ReservationFrame();
        f2.show();
        dispose();
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        txt1.setText(null);
        txt2.setText(null);
        pass1.setText(null);
        pass2.setText(null);
        jLabel1.setText(null);
    }//GEN-LAST:event_btn_clearActionPerformed

    private void pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass1ActionPerformed

    private void pass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass2ActionPerformed

    private void passSTRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passSTRKeyReleased
        // TODO add your handling code here:
        String password = new String(pass1.getPassword());
        int passwordLength = password.length();
        String strength;
        Color color;

        if (passwordLength >= 12) {
            strength = "Strong";
            color =new Color(0, 100, 0);
        } else if (passwordLength >= 8) {
            strength = "Good";
            color = Color.YELLOW;
        } else {
            strength = "Weak";
            color = Color.RED;
        }
        passSTR.setText("Password Strength: " + strength);
        passSTR.setForeground(color);
    }//GEN-LAST:event_passSTRKeyReleased

    private void passCONKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passCONKeyReleased
        String passSTR1 = new String(pass1.getPassword());
        String passCON1 = new String(pass2.getPassword());

    if (passSTR1.equals(passCON1)) {
        passCON.setText("Passwords Match");
        passCON.setForeground(Color.GREEN);
    } else {
        passCON.setText("Passwords Do Not Match");
        passCON.setForeground(Color.RED);
    }
    }//GEN-LAST:event_passCONKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LogFrame rf = new LogFrame();
        rf.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_register;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JLabel passCON;
    private javax.swing.JLabel passSTR;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables
}
