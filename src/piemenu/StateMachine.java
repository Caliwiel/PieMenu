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
    
    public StateMachine() {
        state = States.INIT;
    }

    public States getState() {
        return state;
    }

    public void setState(States state) {
        this.state = state;
    }
    
    
}
