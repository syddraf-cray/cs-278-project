/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ObjectUI.java
 *
 * Created on Nov 28, 2011, 3:06:41 AM
 */
package edu.vu.vuse.cs278.g3.gui;
import javax.swing.*;

/**
 *
 * @author Brandon
 */
public class ObjectUI extends javax.swing.JFrame {

    /** Creates new form ObjectUI */
    public ObjectUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Object_Group = new javax.swing.ButtonGroup();
        Relationship_Group = new javax.swing.ButtonGroup();
        Object_Label = new javax.swing.JLabel();
        ballButton = new javax.swing.JRadioButton();
        boxButton = new javax.swing.JRadioButton();
        Weight_Label = new javax.swing.JLabel();
        weightText = new javax.swing.JTextField();
        radiusText = new javax.swing.JTextField();
        heightText = new javax.swing.JTextField();
        widthText = new javax.swing.JTextField();
        Radius_Label = new javax.swing.JLabel();
        Height_Label = new javax.swing.JLabel();
        Width_Label = new javax.swing.JLabel();
        Relationship = new javax.swing.JLabel();
        insideRButton = new javax.swing.JRadioButton();
        insideUButton = new javax.swing.JRadioButton();
        topButton = new javax.swing.JRadioButton();
        behindButton = new javax.swing.JRadioButton();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Object_Label.setText("Object");

        Object_Group.add(ballButton);
        ballButton.setText("Ball");
        ballButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ballButtonActionPerformed(evt);
            }
        });

        Object_Group.add(boxButton);
        boxButton.setText("Box");
        boxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxButtonActionPerformed(evt);
            }
        });

        Weight_Label.setText("Weight");

        weightText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTextActionPerformed(evt);
            }
        });

        heightText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTextActionPerformed(evt);
            }
        });

        Radius_Label.setText("Radius");

        Height_Label.setText("Height");

        Width_Label.setText("Width");

        Relationship.setText("Relationship to Bus");

        Relationship_Group.add(insideRButton);
        insideRButton.setText("On Top");
        insideRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insideRButtonActionPerformed(evt);
            }
        });

        Relationship_Group.add(insideUButton);
        insideUButton.setText("Inside (with a seatbelt)");

        Relationship_Group.add(topButton);
        topButton.setText("Inside (without a seatbelt)");
        topButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topButtonActionPerformed(evt);
            }
        });

        Relationship_Group.add(behindButton);
        behindButton.setText("Behind (Dragged)");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("grams");

        jLabel2.setText("Object Attributes");

        jLabel3.setText("cm");

        jLabel4.setText("cm");

        jLabel5.setText("cm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ballButton)
                    .addComponent(boxButton)
                    .addComponent(Object_Label))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Width_Label)
                            .addComponent(Weight_Label)
                            .addComponent(Radius_Label)
                            .addComponent(Height_Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(widthText)
                            .addComponent(heightText)
                            .addComponent(radiusText)
                            .addComponent(weightText, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Relationship)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topButton)
                            .addComponent(insideUButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(behindButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(insideRButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Weight_Label)
                            .addComponent(weightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radiusText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Radius_Label)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(heightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Height_Label)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(widthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Width_Label)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Object_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ballButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxButton))
                            .addComponent(Relationship)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(insideRButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(insideUButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(topButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(behindButton)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelButton)
                            .addComponent(clearButton)
                            .addComponent(addButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void weightTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTextActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_weightTextActionPerformed

private void heightTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTextActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_heightTextActionPerformed

private void topButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_topButtonActionPerformed

private void insideRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insideRButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_insideRButtonActionPerformed

private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
// TODO add your handling code here:
    String weight = weightText.getText();
    String radius = radiusText.getText();
    String height = heightText.getText();
    String width = widthText.getText();
    ButtonModel object = Object_Group.getSelection();
    ButtonModel relationship = Relationship_Group.getSelection();
    // return {weight, radius, height, width, object, relationship};
    this.dispose();
}//GEN-LAST:event_addButtonActionPerformed

private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
	this.dispose();
}//GEN-LAST:event_cancelButtonActionPerformed

private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
    weightText.setText("");
    radiusText.setText("");
    heightText.setText("");
    widthText.setText("");
    Object_Group.clearSelection();
    Relationship_Group.clearSelection();
}//GEN-LAST:event_clearButtonActionPerformed

private void ballButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ballButtonActionPerformed
// TODO add your handling code here:
    widthText.setEnabled(false);
    heightText.setEnabled(false);
    radiusText.setEnabled(true);
}//GEN-LAST:event_ballButtonActionPerformed

private void boxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxButtonActionPerformed
// TODO add your handling code here:
    radiusText.setEnabled(false);
    heightText.setEnabled(true);
    widthText.setEnabled(true);
}//GEN-LAST:event_boxButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ObjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObjectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ObjectUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Height_Label;
    private javax.swing.ButtonGroup Object_Group;
    private javax.swing.JLabel Object_Label;
    private javax.swing.JLabel Radius_Label;
    private javax.swing.JLabel Relationship;
    private javax.swing.ButtonGroup Relationship_Group;
    private javax.swing.JLabel Weight_Label;
    private javax.swing.JLabel Width_Label;
    private javax.swing.JButton addButton;
    private javax.swing.JRadioButton ballButton;
    private javax.swing.JRadioButton behindButton;
    private javax.swing.JRadioButton boxButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField heightText;
    private javax.swing.JRadioButton insideRButton;
    private javax.swing.JRadioButton insideUButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField radiusText;
    private javax.swing.JRadioButton topButton;
    private javax.swing.JTextField weightText;
    private javax.swing.JTextField widthText;
    // End of variables declaration//GEN-END:variables
}
