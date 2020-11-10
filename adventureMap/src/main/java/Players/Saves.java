/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Players;

import initGame.SwingMain;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Leonardo
 */
public class Saves {
       
    

       
       public static Boolean salvaGiocatore(Player p) {
        Boolean riuscita = true;
        ObjectOutputStream oss;
        int i=1;
        int f=0;
        
        while(f==0){
            f = preparaFile("SalvaGiocatore"+i+".txt",i);
            i ++;
        }
        
        if (f !=200) {
            try {
                oss = new ObjectOutputStream(new FileOutputStream("SalvaGiocatore"+f+".txt"));
                oss.writeObject(p);
                oss.close();
            } catch (IOException e) {
                System.out.println("ERRORE");
                riuscita = false;
            }
        }
        return riuscita;
    
    
       }
        private static int preparaFile(String nomeFile,int i){
        String path = nomeFile;
        
       
        try {
            File file = new File(path);
            if (file.exists()) {
                
                
            } else if (file.createNewFile()) {
                 int f=i;
                 return f;
            }
        } catch (IOException e) {
            System.out.println("Il file " + path + " ha avuto problemi");
            
        }
           
        return 0;
        }
        
      
       
       
       public static void Salvataggi() throws FileNotFoundException, IOException, ClassNotFoundException{
        
         Player p= new Player();
        ObjectInputStream ois;
        int i=1,f=0;
        try {
            while(f==0){
                 File file = new File("SalvaGiocatore"+i+".txt");
                 
              if(file.exists()){
                  ois = new ObjectInputStream(new FileInputStream("SalvaGiocatore"+i+".txt"));
          
                 p = (Player) ois.readObject();
              
                SwingMain.SavesTextArea.append(i+"."+p.getNickname()+"   n.stanze visitate "+p.getPassi()+"\n");
                i++;
              }else{
                  f=1;
              }
            
            }
           
        } catch (IOException | ClassNotFoundException e) {
           SwingMain.SavesTextArea.append("Non ci sono salvataggi...");
        }
        
      
           
       }
       public static boolean PreparaSalvataggio(int i){
        
           File file = new File("SalvaGiocatore"+i+".txt");
              if(file.exists()){
                 
                return true;
              }else{
                 SwingMain.SavesTextArea.append("Inserire un numero del salvataggio valido...\n");
                 return false; 
              }
            
       }
       public static Player CaricaSalvataggio(int i) throws FileNotFoundException, IOException, ClassNotFoundException{
          Player p= new Player();;
        ObjectInputStream ois;
        int f=0;
       
            
                 File file = new File("SalvaGiocatore"+i+".txt");
              
                  ois = new ObjectInputStream(new FileInputStream("SalvaGiocatore"+i+".txt"));
          
                 p = (Player) ois.readObject();
                SwingMain.SavesTextArea.append(i+"."+p.getNickname()+"   n.stanze visitate "+p.getPassi()+"\n");
                i++;
                return p;      
           
       
       
       }
}
