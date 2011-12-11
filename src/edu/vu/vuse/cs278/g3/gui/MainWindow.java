/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainWindow.java
 *
 * Created on Nov 29, 2011, 1:13:19 AM
 */
package edu.vu.vuse.cs278.g3.gui;
import java.awt.AWTEvent;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.nlogo.lite.InterfaceComponent;
import org.nlogo.api.CompilerException;

import edu.vu.vuse.cs278.g3.engine.PhysicsCompleteHandler;
import edu.vu.vuse.cs278.g3.engine.PhysicsEngine;
import edu.vu.vuse.cs278.g3.model.ObjectManager;

/**
 * This class handles the main window of the program where the NetLogo is embedded.
 * @author Amber Maria
 */
public class MainWindow extends javax.swing.JFrame implements PhysicsCompleteHandler {
/**
 * The single instance of the Main Window
 */
	private static MainWindow instance = null;
	
	/**
	 * Gets the single instance of the Main Window
	 * @return instance of Main Window
	 */
	public static MainWindow getInstance(){
		if (instance == null)
			instance = new MainWindow();
		return instance;
	}
	
	/**
	 * Constructor for the class. Calls initComponents to set up all the buttons on the window
	 */
    private MainWindow() {
        initComponents();
        
        // edit object and all simulation buttons are disabled until we add an object
        editObject.setEnabled(false);
        runSimulation.setEnabled(false);
        stopSimulation.setEnabled(false);
        pauseSimulation.setEnabled(false);
        this.threadExec.start();
    }
    
   
    /** Sends arg to embedded NetLogo  
     * @param arg
     */
    public void command(String arg){
    	this.threadExec.addCommand(arg);
    }
    
    private ThreadExecutor threadExec = new ThreadExecutor();
    private class ThreadExecutor extends Thread {
    	
    	BlockingQueue<String> queue = new LinkedBlockingQueue<String>();
    	public void run() {
    		while(true) {
    			try {
					MainWindow.getInstance().comp.command(this.queue.take());
				} catch (CompilerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    	}
    	
    	public void addCommand(String s) {
    		this.queue.add(s);
    	}
    }
    //private final Object commandMonitor = new Object();
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addObject = new javax.swing.JButton();
        editObject = new javax.swing.JButton();
        runSimulation = new javax.swing.JButton();
        stopSimulation = new javax.swing.JButton();
        pauseSimulation = new javax.swing.JButton();
        busAcceleration = new javax.swing.JSlider();
        busDeceleration = new javax.swing.JSlider();
        busAccelerationLabel = new javax.swing.JLabel();
        busDecelerationLabel = new javax.swing.JLabel();
        sillyNetLogo = new javax.swing.JInternalFrame();
        busAccelerationLabelValue = new javax.swing.JLabel();
        busDecelerationLabelValue = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addObject.setText("Add Object");
        addObject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addObjectActionPerformed(evt);
            }
        });

        editObject.setText("Edit Object");
        editObject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editObjectActionPerformed(evt);
            }
        });

        runSimulation.setText("Run Simulation");
        runSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runSimulationActionPerformed(evt);
            }
        });

        stopSimulation.setText("Stop Simulation");
        stopSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopSimulationActionPerformed(evt);
            }
        });

        pauseSimulation.setText("Pause Simulation");
        pauseSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseSimulationActionPerformed(evt);
            }
        });

        busAcceleration.setMaximum(4);
        busAcceleration.setMinimum(1);
        busAcceleration.setSnapToTicks(true);
        busAcceleration.setToolTipText("");
        busAcceleration.setValue(2);
        busAcceleration.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                busAccelerationStateChanged(evt);
            }
        });

        busDeceleration.setMaximum(4);
        busDeceleration.setMinimum(1);
        busDeceleration.setSnapToTicks(true);
        busDeceleration.setValue(2);
        busDeceleration.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                busDecelerationStateChanged(evt);
            }
        });

        busAccelerationLabel.setText("Bus Acceleration");

        busDecelerationLabel.setText("Bus Deceleration");
        
        comp = new InterfaceComponent(this);
        
        sillyNetLogo.setVisible(true);
        sillyNetLogo.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                //sillyNetLogoInternalFrameActivated(evt);		//this was showing an error, so I commented it out. No idea what it does, but seems to work now.
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        javax.swing.GroupLayout sillyNetLogoLayout = new javax.swing.GroupLayout(sillyNetLogo.getContentPane());
        sillyNetLogo.getContentPane().setLayout(sillyNetLogoLayout);
        sillyNetLogoLayout.setHorizontalGroup(
            sillyNetLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(comp)
        );
        sillyNetLogoLayout.setVerticalGroup(
            sillyNetLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(comp)
        );
        try {
            comp.open("./CS278.nlogo");
          }
          catch(Exception ex) {
            ex.printStackTrace();
          }
        busAccelerationLabelValue.setText("medium");

        busDecelerationLabelValue.setText("medium");

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenu3.setText("New");
        jMenu1.add(jMenu3);

        jMenu4.setText("Open");
        jMenu1.add(jMenu4);

        jMenu5.setText("Save");
        jMenu1.add(jMenu5);

        jMenu6.setText("Exit");
        jMenu1.add(jMenu6);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(busAccelerationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busAccelerationLabelValue))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(busDeceleration, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                        .addComponent(addObject, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editObject, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(runSimulation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stopSimulation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pauseSimulation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(busAcceleration, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(busDecelerationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busDecelerationLabelValue)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(sillyNetLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(addObject)
                .addGap(18, 18, 18)
                .addComponent(editObject)
                .addGap(18, 18, 18)
                .addComponent(runSimulation)
                .addGap(18, 18, 18)
                .addComponent(stopSimulation)
                .addGap(18, 18, 18)
                .addComponent(pauseSimulation)
                .addGap(18, 18, 18)
                .addComponent(busAcceleration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busAccelerationLabel)
                    .addComponent(busAccelerationLabelValue))
                .addGap(13, 13, 13)
                .addComponent(busDeceleration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busDecelerationLabel)
                    .addComponent(busDecelerationLabelValue))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(sillyNetLogo)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * The action that happens with the Add Object button is pressed. The Add Object dialog comes up and we allow
 * the user to now edit that object from the main window.
 * @param evt
 */
private void addObjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addObjectActionPerformed
    new ObjectUI().setVisible(true);
    
    editObject.setEnabled(true);
    addObject.setEnabled(false);
    runSimulation.setEnabled(true);
}//GEN-LAST:event_addObjectActionPerformed

/**
 * The action that happens when the Edit Object button is pressed. The Edit Object dialog comes up.
 * @param evt
 */
private void editObjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editObjectActionPerformed
    new EditObjectUI().setVisible(true);
}//GEN-LAST:event_editObjectActionPerformed

/**
 * 
 * @param evt
 */
private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
    System.exit(0);
}//GEN-LAST:event_jMenu1ActionPerformed

/**
 * This holds the NetLogo display for displaying the simulation.
 * @param evt
 */
private void jInternalFrame1InternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
	//GEN-FIRST:event_jInternalFrame1InternalFrameActivated

}
//GEN-LAST:event_jInternalFrame1InternalFrameActivated

/**
 * The action that happens when the Run Simulation button is pressed.  We get the values of the bus 
 * acceleration and deceleration to pass to the physics engine and disable all buttons, so the user 
 * can't do anything while the simulation is running.
 * @param evt
 */
private void runSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runSimulationActionPerformed
    // if no object has been created, this button is not even available.
	int busAccel = busAcceleration.getValue();
    int busDecel = busDeceleration.getValue();
    editObject.setEnabled(false);
    addObject.setEnabled(false);
    busAcceleration.setEnabled(false);
    busDeceleration.setEnabled(false);
    // these should only be set WHILE the simulation is running
    stopSimulation.setEnabled(true);
    pauseSimulation.setEnabled(true);
    runSimulation.setEnabled(false);
    
    PhysicsEngine.getInstance().enable(this);
    
    //Insert way to check if simulation is done running
    if (PhysicsEngine.getInstance().getState() == PhysicsEngine.STOPPED_PHASE)
    {
	    // after the simulation is done running, these should be set
	    stopSimulation.setEnabled(false);
	    pauseSimulation.setEnabled(false);
	    runSimulation.setEnabled(true);
	    editObject.setEnabled(true);
    }
}//GEN-LAST:event_runSimulationActionPerformed

/**
 * The action that happens when the Pause Simulation button is pressed. We pause the action in the NetLogo
 * window and re-enable the components of the main window to allow for changes to be made.
 * @param evt
 */
private void pauseSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseSimulationActionPerformed
    editObject.setEnabled(true);
    addObject.setEnabled(false);
    busAcceleration.setEnabled(true);
    busDeceleration.setEnabled(true);
    if (pauseSimulation.getText() == "Pause Simulation")
    {
    	PhysicsEngine.getInstance().pause(this);
    	pauseSimulation.setText("Resume Simulation");    
    }
    else
    {
    	PhysicsEngine.getInstance().resume(this);
    	pauseSimulation.setText("Pause Simulation");
    }
}//GEN-LAST:event_pauseSimulationActionPerformed

/**
 * The action that happens when the Bus Acceleration bar is moved.  We update the label below it 
 * for the student to see the value.
 * @param evt
 */
private void busAccelerationStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_busAccelerationStateChanged
    int tmp = busAcceleration.getValue();
    String tmpBusAccel = "";
    switch (tmp)
    {
        case 1: tmpBusAccel = "small";  break;
        case 2: tmpBusAccel = "medium"; break;
        case 3: tmpBusAccel = "large";  break;
        case 4: tmpBusAccel = "xlarge"; break;
    }
    busAccelerationLabelValue.setText(tmpBusAccel);
}//GEN-LAST:event_busAccelerationStateChanged

/**
 * The action that happens when the Bus Deceleration bar is moved.  We update the label beow it
 * for the user to see its value.
 * @param evt
 */
private void busDecelerationStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_busDecelerationStateChanged
    int tmp = busDeceleration.getValue();
    String tmpBusDecel = "";
    switch (tmp)
    {
        case 1: tmpBusDecel = "small";  break;
        case 2: tmpBusDecel = "medium"; break;
        case 3: tmpBusDecel = "large";  break;
        case 4: tmpBusDecel = "xlarge"; break;
    }
    busDecelerationLabelValue.setText(tmpBusDecel);
    busDecelerationLabelValue.setEnabled(true);                   
}//GEN-LAST:event_busDecelerationStateChanged

/**
 * The action that happens when the Stop Simulation button is pressed. We kill the action in the 
 * NetLogo window and re-enable everything in the main window.
 * @param evt
 */
private void stopSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopSimulationActionPerformed
    PhysicsEngine.getInstance().disable(this);
	editObject.setEnabled(true);
    addObject.setEnabled(false);
    busAcceleration.setEnabled(true);
    busDeceleration.setEnabled(true);
    stopSimulation.setEnabled(false);
    pauseSimulation.setEnabled(false);
    runSimulation.setEnabled(true);
}//GEN-LAST:event_stopSimulationActionPerformed
/*
    /**
     * @param args the command line arguments
     
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        try{
	        java.awt.EventQueue.invokeAndWait(new Runnable() {
	            public void run() {
	        		MainWindow.getInstance().setVisible(true);
	             }            
	        });
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        //create the bus, 250cm, 10000kg
        ObjectManager.getInstance().addObject("bus",ObjectManager.getInstance().createBus(0, 0, 250, 10000));
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
	// amber - I declared the addObject button as public static so that we can access it in the ObjectUI
    public javax.swing.JButton addObject;
    private javax.swing.JSlider busAcceleration;
    private javax.swing.JLabel busAccelerationLabel;
    private javax.swing.JLabel busAccelerationLabelValue;
    private javax.swing.JSlider busDeceleration;
    private javax.swing.JLabel busDecelerationLabel;
    private javax.swing.JLabel busDecelerationLabelValue;
 // amber - I declared the editObject button as public static so that we can access it in the ObjectUI
    public javax.swing.JButton editObject;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton pauseSimulation;
    public javax.swing.JButton runSimulation;
    private javax.swing.JInternalFrame sillyNetLogo;
    private javax.swing.JButton stopSimulation;
    private InterfaceComponent comp;
    // End of variables declaration//GEN-END:variables

	@Override
	public void handleEngineComplete() {
		// TODO Auto-generated method stub
		
	}
}
