/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piemenu;

/**
 *
 * @author bouzekel on 21/11/2016.
 * Machine à états du Pie Menu décrit dans le document fourni.
 */
public class StateMachine {

    private States state;
    private ITransformable transformable;

    public StateMachine(ITransformable trans) {
        state = States.INIT;
        this.transformable = trans;
    }

    public States getState() {
        return state;
    }

    public void setState(States state) {
        this.state = state;
    }

    public void cPressedLeft() {
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
                //A3
                transformable.highlightSuivant();
                //A9
                transformable.selectSuivant();
                state = state.SELECTSUIVANT;
                break;
            }
            case MODIFIER: {
                //A5
                transformable.highlightModifier();
                //A11
                transformable.selectModifier();
                state = state.SELECTMODIFIER;
                break;
            }
            case PRECEDENT: {
                //A4
                transformable.highlightPrecedent();
                //A10
                transformable.selectPrecedent();
                state = state.SELECTPRECEDENT;
                break;
            }
            case SUPPRIMER: {
                //A6
                transformable.highlightSupprimer();
                //A12
                transformable.selectSupprimer();
                state = state.SELECTSUPPRIMER;
                break;
            }
            case SELECTMODIFIER: {
                //interdit
                break;
            }
            case SELECTPRECEDENT: {
                //interdit
                break;
            }
            case SELECTSUIVANT: {
                //interdit
                break;
            }
            case SELECTSUPPRIMER: {
                //interdit
                break;
            }
        }
    }

    public void cClickRight(double x, double y) {
        switch (state) {
            case INIT: {
                if (transformable.inLimits(x, y)) {
                    //A1
                    transformable.afficherPie();
                    state = state.AFFICHER;
                } else {
                    //A13
                    transformable.changeInLimits();
                    //A1
                    transformable.afficherPie();
                    state=state.AFFICHER;
                }
                break;
            }
            case AFFICHER: {
                //A2
                transformable.enleverPie();
                //A1
                transformable.afficherPie();
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
            case SELECTMODIFIER: {
                //interdit
                break;
            }
            case SELECTPRECEDENT: {
                //interdit
                break;
            }
            case SELECTSUIVANT: {
                //interdit
                break;
            }
            case SELECTSUPPRIMER: {
                //interdit
                break;
            }
        }
    }
    
    public void cMove(double x, double y) {
        switch (state) {
            case INIT: {
                state = state.INIT;
                break;
            }
            case AFFICHER: {
                if (transformable.inSuiv(x, y)) {
                    //A3
                    transformable.highlightSuivant();
                    state = state.SUIVANT;
                } else if (transformable.inPrec(x, y)) {
                    //A4
                    transformable.highlightPrecedent();
                    state = state.PRECEDENT;
                } else if (transformable.inModif(x, y)) {
                    //A5
                    transformable.highlightModifier();
                    state = state.MODIFIER;
                } else if (transformable.inSuppr(x, y)) {
                    //A6
                    transformable.highlightSupprimer();
                    state = state.SUPPRIMER;
                }
                break;
            }
            case SUIVANT: {
                if (transformable.inSuiv(x, y)) {
                    state = state.SUIVANT;
                } else if (transformable.inPrec(x, y)) {
                    //A4
                    transformable.highlightPrecedent();
                    state = state.PRECEDENT;
                } else if (transformable.inSuppr(x, y)) {
                    //A6
                    transformable.highlightSupprimer();
                    state = state.SUPPRIMER;
                } else if (transformable.inAfficher(x, y)) {
                    //A8
                    transformable.setAllReset();
                    state = state.AFFICHER;
                }
                break;
            }
            case MODIFIER: {
                if (transformable.inModif(x, y)) {
                    state = state.MODIFIER;
                } else if (transformable.inPrec(x, y)) {
                    //A4
                    transformable.highlightPrecedent();
                    state = state.PRECEDENT;
                } else if (transformable.inSuppr(x, y)) {
                    //A6
                    transformable.highlightSupprimer();
                    state = state.SUPPRIMER;
                } else if (transformable.inAfficher(x, y)) {
                    //A8
                    transformable.setAllReset();
                    state = state.AFFICHER;
                }
                break;
            }
            case PRECEDENT: {
                if (transformable.inModif(x, y)) {
                    //A5
                    transformable.highlightModifier();
                    state = state.MODIFIER;
                } else if (transformable.inPrec(x, y)) {
                    state = state.PRECEDENT;
                } else if (transformable.inSuiv(x, y)) {
                    //A3
                    transformable.highlightSuivant();
                    state = state.SUIVANT;
                } else if (transformable.inAfficher(x, y)) {
                    //A8
                    transformable.setAllReset();
                    state = state.AFFICHER;
                }
                break;
            }
            case SUPPRIMER: {
                if (transformable.inModif(x, y)) {
                    //A5
                    transformable.highlightModifier();
                    state = state.MODIFIER;
                } else if (transformable.inSuiv(x, y)) {
                    //A3
                    transformable.highlightSuivant();
                    state = state.SUIVANT;
                } else if (transformable.inSuppr(x, y)) {
                    state = state.SUPPRIMER;
                } else if (transformable.inAfficher(x, y)) {
                    //A8
                    transformable.setAllReset();
                    state = state.AFFICHER;
                }
                break;
            }
            case SELECTMODIFIER: {
                state = state.SELECTMODIFIER;
                break;
            }
            case SELECTPRECEDENT: {
                state = state.SELECTPRECEDENT;
                break;
            }
            case SELECTSUIVANT: {
                state = state.SELECTSUIVANT;
                break;
            }
            case SELECTSUPPRIMER: {
                state = state.SELECTSUPPRIMER;
                break;
            }
        }
    }

    public void cReleased() {
        switch (state) {
            case INIT: {
                //interdit
                break;
            }
            case AFFICHER: {
                //interdit
                break;
            }
            case SUIVANT: {
                //interdit
                break;
            }
            case MODIFIER: {
                //interdit
                break;
            }
            case PRECEDENT: {
                //interdit
                break;
            }
            case SUPPRIMER: {
                //interdit
                break;
            }
            case SELECTMODIFIER: {
                //A2
                transformable.enleverPie();
                state=state.INIT;
                break;
            }
            case SELECTPRECEDENT: {
                //A2
                transformable.enleverPie();
                state=state.INIT;
                break;
            }
            case SELECTSUIVANT: {
                //A2
                transformable.enleverPie();
                state=state.INIT;
                break;
            }
            case SELECTSUPPRIMER: {
                //A2
                transformable.enleverPie();
                state=state.INIT;
                break;
            }
        }
    }
}
