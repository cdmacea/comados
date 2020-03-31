/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comados;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Compiler.command;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Macea
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Ventana ventana = new Ventana();
            //ventana.setVisible(true);
     //   int x=Integer.parseInt(JOptionPane.showInputDialog("ingresa N"));
     try {
            // TODO code application logic here
           
         //String c='"'+"STATUS  eq running"+'"';
          //  Process process=Runtime.getRuntime().exec("CMD /C TASKLIST /V /FI "+c);
             Process process=Runtime.getRuntime().exec("CMD /C TASKLIST /V /FO CSV>%USERPROFILE%/DESKTOP/LISTA.CSV");
            BufferedReader br=new BufferedReader(new InputStreamReader(process.getInputStream()));
            String resultOfejecuction=null;
            
            while ((resultOfejecuction=br.readLine())!=null) {                
                System.out.println(resultOfejecuction);
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
    
}
