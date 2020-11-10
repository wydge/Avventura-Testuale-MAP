/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Players;

import Objects.ListaOggetti;
import Objects.Oggetto;
import java.io.Serializable;



/**
 *
 * @author Leonardo
 */
public class Player implements Serializable{
    
    private String nickname;
    private ListaOggetti inventario = new ListaOggetti();
    private int stanzaCorrente = 0;
    private int passi = 0;
    public Player(String nickname){
        this.nickname= nickname;
    }
    public Player(){
        
    }
   
    
    public void setstanzaCorrente(int a){
       stanzaCorrente = a;
    }
    
    public String getNickname(){
        return nickname;
    }
  
    public int getStanzaCorrente(){
        return stanzaCorrente;
    }
  
    public void setInventario(ListaOggetti inventory) {
        inventario=inventory;
    }
    
   
    public ListaOggetti getInventario() {
        return inventario;
    }
    
  

    public void addInventario(Oggetto o) {
        inventario.addOggetto(o);
    }
    

    
    public void addPassi(){
        this.passi++;
    }
    
    public int getPassi(){
        return passi;
    }
    

}
