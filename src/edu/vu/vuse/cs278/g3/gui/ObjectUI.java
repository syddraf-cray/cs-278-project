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
import edu.vu.vuse.cs278.g3.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Class that handles the Add Object dialog
 * @author Amber
 */
public class ObjectUI extends javax.swing.JFrame {
	
    /**
     * Constructor. Calls initComponents to declare and initialize all fields of the dialog and
     * sets the sliders to a neutral value.
     */
    public ObjectUI() {
        initComponents();
        weightValue.setValue(2);
        heightValue.setValue(2);
        widthValue.setValue(2);
        radiusValue.setValue(2);
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
        jLabel2 = new javax.swing.JLabel();
        weightValue = new javax.swing.JSlider();
        radiusValue = new javax.swing.JSlider();
        heightValue = new javax.swing.JSlider();
        widthValue = new javax.swing.JSlider();
        weightLabelValue = new javax.swing.JLabel();
        radiusLabelValue = new javax.swing.JLabel();
        heightLabelValue = new javax.swing.JLabel();
        widthLabelValue = new javax.swing.JLabel();
        inFrontButton = new javax.swing.JRadioButton();

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

        jLabel2.setText("Object Attributes");

        weightValue.setMaximum(3);
        weightValue.setSnapToTicks(true);
        weightValue.setValue(1);
        weightValue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                weightValueStateChanged(evt);
            }
        });

        radiusValue.setMaximum(3);
        radiusValue.setSnapToTicks(true);
        radiusValue.setValue(1);
        radiusValue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radiusValueStateChanged(evt);
            }
        });

        heightValue.setMaximum(3);
        heightValue.setSnapToTicks(true);
        heightValue.setValue(1);
        heightValue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                heightValueStateChanged(evt);
            }
        });

        widthValue.setMaximum(3);
        widthValue.setSnapToTicks(true);
        widthValue.setValue(1);
        widthValue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                widthValueStateChanged(evt);
            }
        });

        weightLabelValue.setText("medium");

        radiusLabelValue.setText("medium");

        heightLabelValue.setText("medium");

        widthLabelValue.setText("medium");

        Relationship_Group.add(inFrontButton);
        inFrontButton.setText("In Front of");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Object_Label)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Width_Label)
                                    .addComponent(Height_Label)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ballButton)
                                            .addComponent(boxButton))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Weight_Label)
                                            .addComponent(Radius_Label))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(widthValue, 0, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(heightValue, 0, 0, Short.MAX_VALUE)
                                        .addComponent(radiusValue, 0, 0, Short.MAX_VALUE)
                                        .addComponent(weightValue, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(widthLabelValue)
                            .addComponent(radiusLabelValue)
                            .addComponent(weightLabelValue)
                            .addComponent(heightLabelValue))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Relationship)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insideRButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelButton))
                            .addComponent(topButton)
                            .addComponent(insideUButton)
                            .addComponent(behindButton)
                            .addComponent(inFrontButton))))
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Relationship))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Object_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ballButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Weight_Label)
                            .addComponent(weightValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Radius_Label)
                            .addComponent(radiusValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heightLabelValue)
                            .addComponent(heightValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Height_Label)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insideRButton)
                            .addComponent(weightLabelValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radiusLabelValue)
                            .addComponent(insideUButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(behindButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inFrontButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Width_Label)
                        .addComponent(widthLabelValue)
                        .addComponent(widthValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(clearButton)
                    .addComponent(cancelButton))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void topButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_topButtonActionPerformed

private void insideRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insideRButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_insideRButtonActionPerformed

/**
 * The action that happens when the Add Button is pressed.  We save all the values and create a
 * new object, giving it those values. The object is then passed to NetLogo for displaying.
 * @param evt
 */
private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
    System.out.println("add object");
	double weight = weightValue.getValue();
    double radius = radiusValue.getValue();
    double height = heightValue.getValue();
    double width = widthValue.getValue();
    int x = 0, y = 0;
    
    // get the bus object
    PhysicsObject bus = ObjectManager.getInstance().getObject("bus");
    double busX = bus.getXCoord();
    double busY = bus.getYCoord();
    
    // determines the type of object and creates it with the given information
    ButtonModel object = Object_Group.getSelection();
    if (object==null)
    {
    	JOptionPane.showMessageDialog(null,  "Please select either a ball or a box.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    ButtonModel relationship = Relationship_Group.getSelection();
    if (relationship==null)
    {
    	JOptionPane.showMessageDialog(null,  "Please select a relationship for the object.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    if (object.toString().equals("Box"))
    {
    	System.out.println("making box");
    	if (relationship == topButton) {
        	x = (int)busX;
        	y = (int)(busY + radius);
    	}
    	else if (relationship == insideRButton) {
            x = (int)busX;
            y = (int)(busY - (3*radius));
    	}
    	else if (relationship == insideUButton) {
    		x = (int)busX;
            y = (int)(busY - (3*radius));
    	}
    	else if (relationship == behindButton) {
    		x = (int)(busX - (0.5*busX));
            y = 0;
    	}
    	else if (relationship == inFrontButton) {
        	x = (int)(busX + (0.5*busX));
        	y = 0;
    	}
        	
        PhysicsObject boxOb = ObjectManager.getInstance().createSquare(x, y, width, height, weight);
        ObjectManager.getInstance().addObject("leObj", boxOb);
        System.out.println(object.toString());
        System.out.println("width = " + ((SquareObject)boxOb).getWidth());
        System.out.println("height = " + ((SquareObject)boxOb).getHeight());
        System.out.println("weight = " + boxOb.getMass());
    }
    else
    {
    	System.out.println("making ball");
    	if (relationship == topButton) {
        	x = (int)busX;
        	y = (int)(busY + radius);
    	}
    	else if (relationship == insideRButton) {
            x = (int)busX;
            y = (int)(busY - (3*radius));
    	}
    	else if (relationship == insideUButton) {
    		x = (int)busX;
            y = (int)(busY - (3*radius));
    	}
    	else if (relationship == behindButton) {
    		x = (int)(busX - (0.5*busX));
            y = 0;
    	}
    	else if (relationship == inFrontButton) {
        	x = (int)(busX + (0.5*busX));
        	y = 0;
    	}
        PhysicsObject ballOb = ObjectManager.getInstance().createCircle(x, y, radius, weight);
        ObjectManager.getInstance().addObject("leObj", ballOb);
        System.out.println("weight = " + ballOb.getMass());
        System.out.println("radius = " + ((RoundObject)ballOb).getRadius());
    }  

    
    this.dispose();
}//GEN-LAST:event_addButtonActionPerformed

/**
 * Action that happens when the cancel button is pressed. This closes the dialog without saving
 * any of that data.
 * @param evt
 */
private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
	this.dispose();
}//GEN-LAST:event_cancelButtonActionPerformed

/**
 * The action that happens when the Clear Button is pressed.  All fields go to 0, empty of neutral
 * and re-enables things as needed.
 * @param evt
 */
private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
    weightValue.setValue(0);
    radiusValue.setValue(0);
    heightValue.setValue(0);
    widthValue.setValue(0);
    Object_Group.clearSelection();
    Relationship_Group.clearSelection();
    
    // re-enable everything
    weightValue.setEnabled(true);
    radiusValue.setEnabled(true);
    heightValue.setEnabled(true);
    widthValue.setEnabled(true);
}//GEN-LAST:event_clearButtonActionPerformed

/**
 * If the user selects Ball as object type, we disable the fields for height and weight because
 * they do not apply.
 * @param evt
 */
private void ballButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ballButtonActionPerformed
// TODO add your handling code here:
    widthValue.setEnabled(false);
    heightValue.setEnabled(false);
    radiusValue.setEnabled(true);
}//GEN-LAST:event_ballButtonActionPerformed

/**
 * If the user selects Box as object type, we disable the field for radius because it does not apply.
 * @param evt
 */
private void boxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxButtonActionPerformed
// TODO add your handling code here:
    radiusValue.setEnabled(false);
    heightValue.setEnabled(true);
    widthValue.setEnabled(true);
}//GEN-LAST:event_boxButtonActionPerformed

/**
 * Action that happens when the Weight Slider is changed. We update the label beside it so the user
 * can see the weight of the object.
 * @param evt
 */
private void weightValueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_weightValueStateChanged
// TODO add your handling code here:
    int tmp = weightValue.getValue();
    String tmpWeight = Integer.toString(tmp);
    weightLabelValue.setText(tmpWeight);
}//GEN-LAST:event_weightValueStateChanged

/**
 * Action that happens when the Radius Slider is changed. We update the label beside it so the user
 * can see the radius of the object.
 * @param evt
 */
private void radiusValueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radiusValueStateChanged
// TODO add your handling code here:
    int tmp = radiusValue.getValue();
    String tmpRadius = Integer.toString(tmp);
    radiusLabelValue.setText(tmpRadius);
}//GEN-LAST:event_radiusValueStateChanged

/**
 * Action that happens when the Height Slider is changed. We update the label beside it so the user
 * can see the height of the object.
 * @param evt
 */
private void heightValueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_heightValueStateChanged
// TODO add your handling code here:
    int tmp = heightValue.getValue();
    String tmpHeight = Integer.toString(tmp);
    heightLabelValue.setText(tmpHeight);
}//GEN-LAST:event_heightValueStateChanged

/**
 * Action that happens when the width Slider is changed. We update the label beside it so the user
 * can see the width of the object.
 * @param evt
 */
private void widthValueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_widthValueStateChanged
// TODO add your handling code here:
    int tmp = widthValue.getValue();
    String tmpWidth = Integer.toString(tmp);
    widthLabelValue.setText(tmpWidth);
}//GEN-LAST:event_widthValueStateChanged

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
    private javax.swing.JLabel heightLabelValue;
    private javax.swing.JSlider heightValue;
    private javax.swing.JRadioButton inFrontButton;
    private javax.swing.JRadioButton insideRButton;
    private javax.swing.JRadioButton insideUButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel radiusLabelValue;
    private javax.swing.JSlider radiusValue;
    private javax.swing.JRadioButton topButton;
    private javax.swing.JLabel weightLabelValue;
    private javax.swing.JSlider weightValue;
    private javax.swing.JLabel widthLabelValue;
    private javax.swing.JSlider widthValue;
    // End of variables declaration//GEN-END:variables
}
