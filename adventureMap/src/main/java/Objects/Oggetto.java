/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.io.Serializable;




/**
 *
 * @author Leonardo
 */
public class Oggetto implements Serializable{

    private  int idOggetto;

    private String nome;

    private String descrizione;
  
    private boolean prendibile = true;

    private boolean usabile = false;
    
    private String descrizione_uso;
    
    private int stanza;
   

    public Oggetto() {
    }

   
    
   

    public String getName() {
        return nome;
    }

   
    
    public void setName(String name) {
        this.nome = name;
    }
    
    
    
    public String getDescrUso() {
        return descrizione_uso;
    }
    
    

    public void setDescrUso(String descrizioneuso) {
        this.descrizione_uso = descrizioneuso;
    }
    
   
    
    public Integer getStanza() {
        return stanza;
    }
    
    

    public void setStanza(int stanza) {
        this.stanza = stanza;
    }
    
    
    

    public String getDescription() {
        return descrizione;
    }
    
    

    public void setDescription(String description) {
        this.descrizione = description;
    }
  

    public boolean isPrendibile() {
        return prendibile;
    }
    


    public void setPrendibile(boolean prendibile) {
        this.prendibile = prendibile;
    }
    
  

    public boolean isUsabile() {
        return usabile;
    }
    
 

    public void setUsabile(boolean usabile) {
        this.usabile = usabile;
    } 
    
    
    
    public void setId(int id){
      this.idOggetto= id;
    }
   
     
    public int getIdOggetto() {
        return idOggetto;
    }
    public void deleteOgg(){
        this.stanza=-1;
        this.prendibile=false;
    } 
}
