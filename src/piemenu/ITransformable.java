/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piemenu;

/**
 *
 * @author bouzekel
 */
public interface ITransformable {
    
    public void highlight(double x, double y);
    
    public boolean inModif();
    public boolean inPrec();
    public boolean inSuiv();
    public boolean inSuppr();
    public boolean inAfficher();
    
    
    //A1
    public void afficherPie();
    //A2
    public void enleverPie();
    //A3
    public void hilightSuivant();
    //A4
    public void hilightPrecedent();
    //A5
    public void hilightModifier();
    //A6
    public void hilightSupprimer();
    //A7.1
    public double getX();
    //A7.2
    public double getY();
    //A8
    public void setAllReset();
}
