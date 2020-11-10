/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputGame;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Leonardo
 */
public class Answers {
    public static String noRoom(){
         ArrayList<String> risposte = new ArrayList<>();
        
         risposte.add("Hey, dove vuoi andare? Da questa parte non c'e' nessuna stanza.");
         risposte.add("Questa direzione non porta a nulla");
         risposte.add("Non c'e' nessuna stanza qui...");
         risposte.add("Questa direzione porta al nulla, meglio scegliere un'altra direzione ");
         risposte.add("Non mi sembra una buona idea proseguire verso questa direzione");
         risposte.add("A quanto pare e' un vicolo cieco... scegliero' un'altra strada");
         
         Answers t = new Answers();
         
         return t.getAnswerACaso(risposte);     
        
    }
    public static String Help(){
        ArrayList<String> aiuti = new ArrayList<>();
        aiuti.add("Leggi bene la descrizione di ogni stanza!");
        aiuti.add("L'oggetto fondamentale si trova in una stanza dove ti sembra di volare");
        Answers t = new Answers();
         
        return t.getAnswerACaso(aiuti);
    }

   
    
      private String getAnswerACaso(ArrayList list) {
        int index = ThreadLocalRandom.current().nextInt(list.size());
        return (String) list.get(index);
    }
}
