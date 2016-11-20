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

    public void handleClickRight() {
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

    public void handlePressed() {
        switch (state) {
            case INIT: {
                //interdit
                break;
            }
            case AFFICHER: {
                transformable.setAllReset();
                state = state.AFFICHER;
                break;
            }
            case SUIVANT: {
                transformable.selectSuivant();
                state = state.SUIVANT;
                break;
            }
            case MODIFIER: {
                transformable.selectModifier();
                state = state.MODIFIER;
                break;
            }
            case PRECEDENT: {
                transformable.selectPrecedent();
                state = state.PRECEDENT;
                break;
            }
            case SUPPRIMER: {
                transformable.selectSupprimer();
                state = state.SUPPRIMER;
                break;
            }
        }
    }

    public void handleMove(double x, double y) {
        switch (state) {
            case INIT: {
                //interdit
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
        }
    }

}
