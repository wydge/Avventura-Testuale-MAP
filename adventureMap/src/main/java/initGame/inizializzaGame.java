/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initGame;


import Rooms.ListaRooms;
import java.io.FileNotFoundException;
import static outputGame.testoGame.leggiRoom;

/**
 *
 * @author Leonardo
 */
public class inizializzaGame {
    
    /**
     *
     * @param mapGame
     * @throws FileNotFoundException
     * CaricaMappa serve per caricare da file tutte le stanze del gioco
     */
    public static void CaricaStanze( ListaRooms mapGame) throws FileNotFoundException{
              int n=0;
              while(n<=5){
         
                leggiRoom(mapGame,n);
            
                  n++; 
                  
              }
             
    }
        
}
