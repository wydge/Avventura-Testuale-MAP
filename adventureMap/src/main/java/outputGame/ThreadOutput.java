/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputGame;

import initGame.SwingMain;

/**
 *
 * @author Leonardo
 */
public class ThreadOutput extends Thread{
    public ThreadOutput(String Sviluppator) {
        super(Sviluppator);

    }

    @Override
    public void run() {
       SwingMain.Sviluppatore.setText(this.getName());
    }
    
}
