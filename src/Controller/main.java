/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrey
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instructions.Intructions ins = new Instructions.Intructions(1000);
        try {
            ins.FDEprocess(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
