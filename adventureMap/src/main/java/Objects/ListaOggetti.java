/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class ListaOggetti implements Serializable {
    private final List<Oggetto> oggetti = new ArrayList<>();

   
  
    public void addOggetto(Oggetto s){this.oggetti.add(s);}
    
    public List<Oggetto> getOggetti(){return this.oggetti;}
    
    
}
