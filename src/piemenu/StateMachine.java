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
public class StateMachine {
    private States state;
    private ITransformable transformable;
    
    public StateMachine() {
        state = States.INIT;
    }

    public States getState() {
        return state;
    }

    public void setState(States state) {
        this.state = state;
    }
       
    public void handleClickLeft() {
        switch (state) {
            case INIT: {
                //interdit
                break;
            }
            case AFFICHER: {
                //A2
                transformable.enleverPie();
                state = state.INIT;
                break;
            }
            case SUIVANT: {
                //A2
                transformable.enleverPie();
                state = state.INIT;
                break;
            }
            case MODIFIER: {
                //A2
                transformable.enleverPie();
                state = state.INIT;
                break;
            }
            case PRECEDENT: {
                //A2
                transformable.enleverPie();
                state = state.INIT;
                break;
            }
            case SUPPRIMER: {
                //A2
                transformable.enleverPie();
                state = state.INIT;
                break;
            }
        }
    }
    
    public void handleClickRight (){
        switch (state) {
            case INIT: {
                //A1
                state = state.AFFICHER;
                break;
            }
            case AFFICHER: {
                state = state.AFFICHER;
                break;
            }
            case SUIVANT: {
                state = state.SUIVANT;
                break;
            }
            case MODIFIER: {
                state = state.MODIFIER;
                break;
            }
            case PRECEDENT: {
                state = state.PRECEDENT;
                break;
            }
            case SUPPRIMER: {
                state = state.SUPPRIMER;
                break;
            }
        }
    }
    
    
    public void handleMove() {
        switch (state) {
            case INIT: {
                //interdit
                break;
            }
            case AFFICHER: {
                if (transformable.inSuiv()){
                    //A3
                    transformable.hilightSuivant();
                    state = state.SUIVANT;
                }
                else if (transformable.inPrec()){
                    //A4
                    transformable.hilightPrecedent();
                    state = state.PRECEDENT;
                }
                else if (transformable.inModif()){
                    //A5
                    transformable.hilightModifier();
                    state = state.MODIFIER;
                }
                else if (transformable.inSuppr()){
                    //A6
                    transformable.hilightSupprimer();
                    state = state.SUPPRIMER;
                }
                break;
            }
            case SUIVANT: {
                if (transformable.inSuiv()){
                    state = state.SUIVANT;
                }
                else if (transformable.inPrec()){
                    //A4
                    transformable.hilightPrecedent();
                    state = state.PRECEDENT;
                }
                else if (transformable.inSuppr()){
                    //A6
                    transformable.hilightSupprimer();
                    state = state.SUPPRIMER;
                }
                else if (transformable.inAfficher()){
                    //A8
                    transformable.setAllReset();
                    state = state.AFFICHER;
                }
                break;
            }
            case MODIFIER: {
                if (transformable.inModif()){
                    state = state.MODIFIER;
                }
                else if (transformable.inPrec()){
                    //A4
                    transformable.hilightPrecedent();
                    state = state.PRECEDENT;
                }
                else if (transformable.inSuppr()){
                    //A6
                    transformable.hilightSupprimer();
                    state = state.SUPPRIMER;
                }
                else if (transformable.inAfficher()){
                    //A8
                    transformable.setAllReset();
                    state = state.AFFICHER;
                }
                break;
            }
            case PRECEDENT: {
                if (transformable.inModif()){
                    //A5
                    transformable.hilightModifier();
                    state = state.MODIFIER;
                }
                else if (transformable.inPrec()){
                    state = state.PRECEDENT;
                }
                else if (transformable.inSuiv()){
                    //A3
                    transformable.hilightSuivant();
                    state = state.SUIVANT;
                }
                else if (transformable.inAfficher()){
                    //A8
                    transformable.setAllReset();
                    state = state.AFFICHER;
                }
                break;
            }
            case SUPPRIMER: {
                if (transformable.inModif()){
                    //A5
                    transformable.hilightModifier();
                    state = state.MODIFIER;
                }
                else if (transformable.inSuiv()){
                    //A3
                    transformable.hilightSuivant();
                    state = state.SUIVANT;
                }
                else if (transformable.inSuppr()){
                    state = state.SUPPRIMER;
                }
                else if (transformable.inAfficher()){
                    //A8
                    transformable.setAllReset();
                    state = state.AFFICHER;
                }
                break;
            }
        }
    }
    
}
