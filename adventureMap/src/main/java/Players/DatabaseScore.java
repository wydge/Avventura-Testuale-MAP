/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Players;

import initGame.SwingMain;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Leonardo
 */
public class DatabaseScore {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS scores (nickname VARCHAR(30), score int(3))";
    public static void InsertScore (String nick, int score) throws SQLException{
        try {
         Connection conn = DriverManager.getConnection("jdbc:h2:./resources/db/score");
     

            Statement stm = conn.createStatement();
            stm.executeUpdate(CREATE_TABLE);
            stm.close();
            
          
            stm = conn.createStatement();
            stm.executeUpdate("INSERT INTO scores VALUES ('"+nick+"',"+score+")");
            stm.close();
            conn.close();
          
    }catch (SQLException ex) {
            System.err.println(ex.getSQLState() + ": " + ex.getMessage());
        }
    }
    public static void GetScores(){
        try {
         Connection conn = DriverManager.getConnection("jdbc:h2:./resources/db/score");
     

            Statement stm = conn.createStatement();
            stm.executeUpdate(CREATE_TABLE);
            stm.close();
           
            stm = conn.createStatement();
           
            ResultSet rs = stm.executeQuery("SELECT nickname,score FROM scores ORDER BY score DESC");
            SwingMain.ScoreTextArea.append("   SCORES \n");
             while (rs.next()) {
            SwingMain.ScoreTextArea.append(rs.getString(1)+"    "+rs.getInt(2)+"\n");
             }
            rs.close();
            stm.close(); 
            conn.close();
        }catch(SQLException ex){
           
        }
    }

    
    
}
