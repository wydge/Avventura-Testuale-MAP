/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rooms;




import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Leonardo
 */
public class ListaRooms {
    private final List<Room> stanze = new ArrayList<>();

   
  
    public void addStanza(Room s){this.stanze.add(s);}
    
    public List<Room> getRooms(){return this.stanze;}
    
    

}
