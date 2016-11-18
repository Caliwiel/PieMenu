/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piemenu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author bouzekel
 */
public class PieMenuPanel extends javax.swing.JPanel {

    double x,y;
    int withPie;
    int xDep, yDep;
    private double posClicX;
    private double posClickY; 
    private StateMachine statemachine;
    
    /**
     * Creates new form NewJPanel
     */
    public PieMenuPanel(){
        initComponents();
    }
    public PieMenuPanel(int h, int w, double x, double y, int width) {
        initComponents();
        setBackground(Color.red);
        
        this.setPreferredSize(new Dimension(w, h));
        this.x = x;
        this.y = y;
        this.withPie = width;
        
    }

    private Buttuns getButtun(double x, double y) {
        Buttuns buttuns = Buttuns.SUIVANT;
        return buttuns;
    }
    
    public double getXpie() {
        return xDep;
    }

    public void setXpie(double x) {
        this.xDep = (int)( x - withPie/2) ;
        repaint();
    }

    public double getYpie() {
        return yDep;
    }

    public void setYpie(double y) {
        this.yDep = (int) (y - withPie/2 ) - 30;
        repaint();
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 102, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1)
                .addContainerGap(203, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       /* x = evt.getX();
        y = evt.getY();
        paint(getGraphics());*/
       // paintComponent(getGraphics());
      // repaint();
    }//GEN-LAST:event_formMouseClicked

    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D)g;
	g2.setColor(Color.yellow);
	
	g2.fillArc(xDep, yDep, withPie, withPie, 90, 90);
	// Tracer un cercle        
	g2.setColor(Color.BLUE);
	g2.fillArc(xDep, yDep, withPie, withPie, 0, 90);	
        g2.setColor(Color.GREEN);
	g2.fillArc(xDep, yDep, withPie, withPie, 180, 90);
        g2.setColor(Color.yellow);
	g2.fillArc(xDep, yDep, withPie, withPie, 270, 90);
        
        g2.setColor(Color.white);
        g2.fillOval(xDep, yDep, 30, 30);
        
        System.out.println("Paint component 2"); 
        //this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        Graphics2D g2 = (Graphics2D)g;
	g2.setColor(Color.yellow);
	g2.fillArc(xDep, yDep, withPie, withPie, 90, 90);
	// Tracer un cercle        
	g2.setColor(Color.BLUE);
	g2.fillArc(xDep, yDep, withPie, withPie, 0, 90);	
        g2.setColor(Color.GREEN);
	g2.fillArc(xDep, yDep, withPie, withPie, 180, 90);
        g2.setColor(Color.yellow);
	g2.fillArc(xDep, yDep, withPie, withPie, 270, 90);
        
        g2.setColor(Color.white);
        g2.fillOval(xDep, yDep, 30, 30);
    }
    
    /*
    @Override
    public void paint(Graphics g) {
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
    }
    
    @Override
    public Dimension getPreferredSize () {
        Dimension dim = new Dimension(200, 200);
        return dim;
    }
*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
