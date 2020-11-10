/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Players;



/**
 *
 * @author Leonardo
 */
public class Score {
    private int score;
    
    public Score(int passi,int n){
      
        
            score = (n/passi)*1000;
            
       
        
    }
    public  int getScore(){ return this.score;}
    
}
