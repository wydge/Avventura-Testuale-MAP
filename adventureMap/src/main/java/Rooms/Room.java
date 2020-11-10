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
public class Room {
    private int idRoom;
    private String nome;
    private String descrizione;
    private int idStanzaNord;
    private int idStanzaSud;
    private int idStanzaEst;
    private int idStanzaOvest;
    
    
     
    public int getidRoom() {return idRoom;}
    
    /**
     * setta id della stanza
     * @param idRoom  id stanza
     */
    public void setidRoom(int idRoom) {this.idRoom = idRoom;}
    
    /**
     * ritorna il nome della stanza
     * @return nome
     */
    public String getNome() {return nome;}

    /**
     * setta il nome della stanza
     * @param nome nome stanza
     */
    public void setNome(String nome) {this.nome = nome;}
    
    /**
     * ritorna la descrizione della stanza
     * @return descrizione
     */
    public String getDescrizione() {return descrizione;}
    
    /**
     * setta la descrizione della stanza
     * @param descrizione descrizione
     */
    public void setDescrizione(String descrizione) {this.descrizione = descrizione;}
    
    /**
     * ritorna l'id della stanza Nord
     * @return idStanzaNord
     */
    public Integer getIdStanzaNord() {return idStanzaNord;}
    
    /**
     * setta l'id della stanza a nord
     * @param idStanzaNord id stanza nord
     */
    public void setIdStanzaNord(Integer idStanzaNord) {this.idStanzaNord = idStanzaNord;}

    /**
     * ritorna l'id della stanza Sud
     * @return idStanzaSud
     */
    
    public Integer getIdStanzaSud() {return idStanzaSud;}

    /**
     * setta l'id della stanza a sud
     * @param idStanzaSud id stanza sud
     */
    public void setIdStanzaSud(Integer idStanzaSud) {this.idStanzaSud = idStanzaSud;}

    /**
     * ritorna l'id della stanza Est
     * @return idStanzaEst 
     */
    
    public Integer getIdStanzaEst() {return idStanzaEst;}

    /**
     * setta l'id della stanza a Est
     * @param idStanzaEst id stanza est
     */
    public void setIdStanzaEst(Integer idStanzaEst) {this.idStanzaEst = idStanzaEst;}
    
    /**
     * ritorna l'id della stanza a ovest
     * @return idStanzaOvest
     */
    public Integer getIdStanzaOvest() {return idStanzaOvest;}

    /**
     * setta l'id della stanza Ovest
     * @param idStanzaOvest id stanza ovest
     */
    
    public void setIdStanzaOvest(Integer idStanzaOvest) {this.idStanzaOvest = idStanzaOvest;}
    
    
}
