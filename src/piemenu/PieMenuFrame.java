/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piemenu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author bouzekel
 */
public class PieMenuFrame extends javax.swing.JFrame {
    
    double x, y;
    private PieMenuPanel piemenu_panel;

    /**
     * Creates new form PieMenuFrame
     */
    public PieMenuFrame() {
        this.setTitle("Ma première fenêtre Java");
        this.setSize(500, 500);
        initComponents();
        piemenu_panel = new PieMenuPanel(getHeight(), getWidth(), x, y, 150);
        this.setContentPane(piemenu_panel);
        piemenu_panel.setVisible(false);
        /*
        this.setLocationRelativeTo(null);               
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
 /*
        x = getWidth()/2;
        y = getHeight()/2;
        piemenu_panel = new PieMenuPanel(x, y); //Instanciation d'un objet JPanel
        
        PieMenuPanel pan = new PieMenuPanel();
        this.setContentPane(pan);               
        this.setVisible(true);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        System.out.println("Click fenetre");
        if (evt.getButton() == MouseEvent.BUTTON3) {
            /*x = getWidth()/2;
        y = getHeight()/2;*/
            System.out.println("evt : " + evt.getX() + " " + evt.getY());
            x = evt.getX();
            y = evt.getY();
            //this.setContentPane(new PieMenuPanel(x,y,150));
            piemenu_panel.setXpie(x);
            piemenu_panel.setYpie(y);
            
            this.setVisible(true);
            piemenu_panel.setVisible(true);
            piemenu_panel.getStatemachine().handleClickRight();
        } else {
            piemenu_panel.setVisible(false);
        }
    }//GEN-LAST:event_formMouseClicked

    /*public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
	g2.setColor(Color.yellow);
	g2.fillArc((int)x-150, (int)y, 150, 150, 90, 90);
	// Tracer un cercle
	g2.setColor(Color.BLUE);
	g2.fillArc((int)x-150, (int)y, 150, 150, 0, 90);	
        g2.setColor(Color.GREEN);
	g2.fillArc((int)x-150, (int)y, 150, 150, 180, 90);
        g2.setColor(Color.yellow);
	g2.fillArc((int)x-150, (int)y, 150, 150, 270, 90);
        
        g2.setColor(Color.white);
        g2.fillOval((int)x-30, (int)y, 30, 30);
    }*/
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
            java.util.logging.Logger.getLogger(PieMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PieMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PieMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PieMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PieMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
