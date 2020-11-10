/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputGame;

/**
 *
 * @author Leonardo
 */


public class takeThread {
    private String Sviluppatore = "Leonardo Paparella";
    
    public takeThread(){
        Thread t = new ThreadOutput(Sviluppatore);
            t.start();
    }
}
