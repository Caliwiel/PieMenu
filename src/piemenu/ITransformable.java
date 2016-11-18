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
    public void highlightSuivant();
    //A4
    public void highlightPrecedent();
    //A5
    public void highlightModifier();
    //A6
    public void highlightSupprimer();
    //A7.1
    public double getXevent();
    //A7.2
    public double getYevent();
    //A8
    public void setAllReset();
}
