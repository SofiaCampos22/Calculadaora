/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author alumno
 */
public class NewJFrame extends javax.swing.JFrame {
   
    double num1, num2, resultado;
    String operacion;
    
    public NewJFrame() {
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

        bn4 = new javax.swing.JButton();
        bn5 = new javax.swing.JButton();
        Pantalla = new javax.swing.JTextField();
        bn6 = new javax.swing.JButton();
        bn1 = new javax.swing.JButton();
        bn2 = new javax.swing.JButton();
        bn3 = new javax.swing.JButton();
        bn7 = new javax.swing.JButton();
        bn8 = new javax.swing.JButton();
        bn9 = new javax.swing.JButton();
        bnResta = new javax.swing.JButton();
        bnSuma = new javax.swing.JButton();
        bnMult = new javax.swing.JButton();
        bnDiv = new javax.swing.JButton();
        bnPunto = new javax.swing.JButton();
        bn0 = new javax.swing.JButton();
        bnEqual = new javax.swing.JButton();
        BNc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bn4.setText("4");
        bn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn4ActionPerformed(evt);
            }
        });

        bn5.setText("5");
        bn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn5ActionPerformed(evt);
            }
        });

        Pantalla.setName("Pantalla"); // NOI18N

        bn6.setText("6");
        bn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn6ActionPerformed(evt);
            }
        });

        bn1.setText("1");
        bn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn1ActionPerformed(evt);
            }
        });

        bn2.setText("2");
        bn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn2ActionPerformed(evt);
            }
        });

        bn3.setText("3");
        bn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn3ActionPerformed(evt);
            }
        });

        bn7.setText("7");
        bn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn7ActionPerformed(evt);
            }
        });

        bn8.setText("8");
        bn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn8ActionPerformed(evt);
            }
        });

        bn9.setText("9");
        bn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn9ActionPerformed(evt);
            }
        });

        bnResta.setText("-");
        bnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnRestaActionPerformed(evt);
            }
        });

        bnSuma.setText("+");
        bnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSumaActionPerformed(evt);
            }
        });

        bnMult.setText("*");
        bnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnMultActionPerformed(evt);
            }
        });

        bnDiv.setText("/");
        bnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnDivActionPerformed(evt);
            }
        });

        bnPunto.setText(".");
        bnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnPuntoActionPerformed(evt);
            }
        });

        bn0.setText("0");
        bn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn0ActionPerformed(evt);
            }
        });

        bnEqual.setText("=");
        bnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnEqualActionPerformed(evt);
            }
        });

        BNc.setText("C");
        BNc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Pantalla)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bn4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bn5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bn6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bn7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bn8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bn9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bn0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(bn1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bn2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bn3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bnSuma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(BNc, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BNc)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bn4)
                            .addComponent(bn5)
                            .addComponent(bn6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bn7)
                            .addComponent(bn8)
                            .addComponent(bn9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bnPunto)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bn0)
                                .addComponent(bnEqual))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(bnResta))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bnSuma)
                                .addComponent(bn1)
                                .addComponent(bn2)
                                .addComponent(bn3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bnMult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnDiv)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn5ActionPerformed
        String IngreseNumero = Pantalla.getText() + bn5.getText();
        Pantalla.setText(IngreseNumero);
    }//GEN-LAST:event_bn5ActionPerformed

    private void BNcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNcActionPerformed
        Pantalla.setText("");
    }//GEN-LAST:event_BNcActionPerformed

    private void bn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn1ActionPerformed
        String IngreseNumero = Pantalla.getText() + bn1.getText();
        Pantalla.setText(IngreseNumero);
    }//GEN-LAST:event_bn1ActionPerformed

    private void bn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn2ActionPerformed
        String IngreseNumero = Pantalla.getText() + bn2.getText();
        Pantalla.setText(IngreseNumero);
    }//GEN-LAST:event_bn2ActionPerformed

    private void bn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn3ActionPerformed
        String IngreseNumero = Pantalla.getText() + bn3.getText();
        Pantalla.setText(IngreseNumero);
    }//GEN-LAST:event_bn3ActionPerformed

    private void bn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn4ActionPerformed
        String IngreseNumero = Pantalla.getText() + bn4.getText();
        Pantalla.setText(IngreseNumero);
    }//GEN-LAST:event_bn4ActionPerformed

    private void bn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn6ActionPerformed
         String IngreseNumero = Pantalla.getText() + bn6.getText();
        Pantalla.setText(IngreseNumero);
    }//GEN-LAST:event_bn6ActionPerformed

    private void bn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn7ActionPerformed
        String IngreseNumero = Pantalla.getText() + bn7.getText();
        Pantalla.setText(IngreseNumero);
    }//GEN-LAST:event_bn7ActionPerformed

    private void bn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn8ActionPerformed
        String IngreseNumero = Pantalla.getText() + bn8.getText();
        Pantalla.setText(IngreseNumero);
    }//GEN-LAST:event_bn8ActionPerformed

    private void bn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn9ActionPerformed
        String IngreseNumero = Pantalla.getText() + bn9.getText();
        Pantalla.setText(IngreseNumero);
    }//GEN-LAST:event_bn9ActionPerformed

    private void bn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn0ActionPerformed
        String IngreseNumero = Pantalla.getText() + bn0.getText();
        Pantalla.setText(IngreseNumero);
    }//GEN-LAST:event_bn0ActionPerformed

    private void bnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnPuntoActionPerformed
        String IngreseNumero = Pantalla.getText() + bnPunto.getText();
        Pantalla.setText(IngreseNumero);
    }//GEN-LAST:event_bnPuntoActionPerformed

    private void bnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSumaActionPerformed
       num1 = Double.parseDouble(Pantalla.getText());
       Pantalla.setText("");
       operacion = "+";
    }//GEN-LAST:event_bnSumaActionPerformed

    private void bnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnRestaActionPerformed
        num1 = Double.parseDouble(Pantalla.getText());
       Pantalla.setText("");
       operacion = "-";
    }//GEN-LAST:event_bnRestaActionPerformed

    private void bnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnMultActionPerformed
       num1 = Double.parseDouble(Pantalla.getText());
       Pantalla.setText("");
       operacion = "*";
    }//GEN-LAST:event_bnMultActionPerformed

    private void bnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnDivActionPerformed
       num1 = Double.parseDouble(Pantalla.getText());
       Pantalla.setText("");
       operacion = "/";
    }//GEN-LAST:event_bnDivActionPerformed

    private void bnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnEqualActionPerformed
       String selec;
       num2 = Double.parseDouble(Pantalla.getText());
       
       if(operacion == "+"){
           resultado = num1+num2;
           selec = String.format("%.2f", resultado);
           Pantalla.setText(selec);
       }else if(operacion == "-"){
           resultado = num1-num2;
           selec = String.format("%.2f", resultado);
           Pantalla.setText(selec);
       }else if(operacion == "*"){
           resultado = num1*num2;
           selec = String.format("%.2f", resultado);
           Pantalla.setText(selec);
       }else if(operacion == "/"){
           resultado = num1/num2;
           selec = String.format("%.2f", resultado);
           Pantalla.setText(selec);
       }
        
    }//GEN-LAST:event_bnEqualActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNc;
    private javax.swing.JTextField Pantalla;
    private javax.swing.JButton bn0;
    private javax.swing.JButton bn1;
    private javax.swing.JButton bn2;
    private javax.swing.JButton bn3;
    private javax.swing.JButton bn4;
    private javax.swing.JButton bn5;
    private javax.swing.JButton bn6;
    private javax.swing.JButton bn7;
    private javax.swing.JButton bn8;
    private javax.swing.JButton bn9;
    private javax.swing.JButton bnDiv;
    private javax.swing.JButton bnEqual;
    private javax.swing.JButton bnMult;
    private javax.swing.JButton bnPunto;
    private javax.swing.JButton bnResta;
    private javax.swing.JButton bnSuma;
    // End of variables declaration//GEN-END:variables
}
