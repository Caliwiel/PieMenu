/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piemenu;

/**
 *
 * @author bouzekel on 21/11/2016.
 * Interface transformable décrit le comportement d'un composant pouvant être transformé.
 */
public interface ITransformable {
        
    public boolean inModif(double x, double y);
    public boolean inPrec(double x, double y);
    public boolean inSuiv(double x, double y);
    public boolean inSuppr(double x, double y);
    public boolean inAfficher(double x, double y);
    public boolean inLimits(double x, double y);
    
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
    
    //A9
    public void selectSuivant();
    //A10
    public void selectPrecedent();
    //A11
    public void selectModifier();
    //A12
    public void selectSupprimer();
    //A13
    public void changeInLimits();
}
