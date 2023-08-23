/**
 * Aplicacao para testar primitivos graficos.
 * 
 * @author Julio Arakaki 
 * @version 20220815
 */

// DELEETEME

import java.io.*;
import java.util.*;

public class App extends Thread{
    public void run(){
        while(2 == 2){
            //System.out.println("THREAD RODANDO");
        }
    }
    
    public static void main(String args[]) {
        // Cria e define dimensao da janela (em pixels)
        new Gui(850, 600); 
        
        App sla = new App();
        sla.start();
    }
}