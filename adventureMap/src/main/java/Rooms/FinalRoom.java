/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rooms;

/**
 *
 * @author Leonardo
 */
public class FinalRoom {
    private String NomeFinalRoom;
    private int id_ogg_chiave;
    private String Descrizione;
    private String Indovinello;
    private String Soluzione;
    
    public FinalRoom(){
        
    }
    
    public String getNomeFinalRoom() {return NomeFinalRoom;}
    
    public void setNomeFinalRoom(String Final) {this.NomeFinalRoom = Final;}
    
    public int getIdOggChiave() {  return id_ogg_chiave;}
   
    public void setIdOggChiave(int key){ this.id_ogg_chiave=key; }
    
    public  String getDescrizione(){return Descrizione;}
    
    public void setDescrizione(String descr){ this.Descrizione=descr;}
    
    public  String getIndovinello(){return Indovinello;}
    
    public void setIndovinello(String indov){ this.Indovinello=indov;}
    
    public  String getSoluzione(){return Soluzione;}
    
    public void setSoluzione(String sol){ this.Soluzione=sol;}
            
   
    
    
}
