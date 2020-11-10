/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputGame;

import Objects.ListaOggetti;
import Objects.Oggetto;
import Rooms.FinalRoom;
import Rooms.Room;
import Rooms.ListaRooms;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class testoGame {
    
    //myReader.hasNextLine()
    
       
    public static void leggiRoom(ListaRooms mappa, int n) throws FileNotFoundException {
       int i; 
      String[] elem= new String[7];
      
       File myObj = new File("room" +n+ ".txt");
    if (myObj.exists()) { 
        Scanner myReader = new Scanner(myObj);
     
        while( myReader.hasNextLine()){
             
             Room stanza=new Room(); 
             for(i=0;i<7;i++){
              elem[i] = myReader.nextLine();
              if(i==0){
                  int a = Integer.parseInt(elem[i]);
               stanza.setidRoom(a);
              }
              if(i==1){
                 stanza.setNome(elem[i]);
              }
              if(i==2){
                 stanza.setDescrizione(elem[i]);
              }
              if(i==3){
                   int a = Integer.parseInt(elem[i]);
               stanza.setIdStanzaNord(a);
              }
                 
              
              if(i==4){
                 int a = Integer.parseInt(elem[i]);
               stanza.setIdStanzaSud(a);
              }
              if(i==5){
                 int a = Integer.parseInt(elem[i]);
               stanza.setIdStanzaEst(a);
              }
              if(i==6){
                 int a = Integer.parseInt(elem[i]);
               stanza.setIdStanzaOvest(a);
              }
             
              
             
              
             }
             
        mappa.addStanza(stanza);
        }
     
    }else {
      System.out.println("Il file delle stanze del gioco non c'e'");
    }
    }
   
   
  public static int  leggiRegole(String regole[]) throws FileNotFoundException{
  int n=0;

File myObj = new File("regole.txt");
    if (myObj.exists()) {
      
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        regole[n] = myReader.nextLine();
        n++;
        
     }

    }else {
      System.out.println("Il file delle regole di gioco non esiste");
    }
   return n;
}
   
      
  
  
   public static ListaOggetti leggiOggetti() throws FileNotFoundException {
       File myObj = new File("Oggetti.txt"); 
       int i;
       ListaOggetti n_oggetti= new ListaOggetti();
       
       String[] elem= new String[7];
       Scanner myReader = new Scanner(myObj);
       if(myObj.exists()){
          while( myReader.hasNextLine()){
             Oggetto oggetto= new Oggetto();
             for(i=0;i<7;i++){
              elem[i] = myReader.nextLine();
              if(i==0){
                  int a = Integer.parseInt(elem[i]);
               oggetto.setId(a);
              }
              if(i==1){
                 oggetto.setName(elem[i]);
              }
              if(i==2){
                 oggetto.setDescription(elem[i]);
              }
              if(i==3){
                   boolean bool = Boolean.parseBoolean(elem[i]);
               oggetto.setPrendibile(bool);
              }
                 
              
              if(i==4){
                boolean bool = Boolean.parseBoolean(elem[i]);
               oggetto.setUsabile(bool);
              }
              if(i==5){
                 
               oggetto.setDescrUso(elem[i]);
              }
              if(i==6){
                 int a = Integer.parseInt(elem[i]);
               oggetto.setStanza(a);
              }
             
             }
             
             n_oggetti.addOggetto(oggetto);
            
          }
        }else{
           System.out.println("Il file per gli oggetti non esiste");
       }
      
       return n_oggetti;
   }
   public static FinalRoom leggiFinalRoom() throws FileNotFoundException{
       File myObj = new File("finalroom.txt");
       FinalRoom finalr= new FinalRoom();
       int i;
       String[] elem= new String[5];
       Scanner myReader = new Scanner(myObj);
       if(myObj.exists()){
          while( myReader.hasNextLine()){
            for(i=0;i<5;i++){
             elem[i] = myReader.nextLine();
             if(i==0){
              finalr.setNomeFinalRoom(elem[i]);
             }
             if(i==1){
               int a= Integer.parseInt(elem[i]);
               finalr.setIdOggChiave(a);
             }
             if(i==2){
               finalr.setDescrizione(elem[i]);
              
             }
             if(i==3){
               finalr.setIndovinello(elem[i]);
             }
             if(i==4){
               finalr.setSoluzione(elem[i]);
            }
            }
       
      
         }
       }else{
           System.out.println("Il file per gli oggetti non esiste");
       }   
   
   
      return finalr;
  }
}

           
   
		
		
			
		
		

