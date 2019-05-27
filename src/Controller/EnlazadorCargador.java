/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import View.RelocatorHexMemory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Sunny
 */
public class EnlazadorCargador {
    public static void readAssembler(ArrayList<String> lineaslist){
        RelocatorHexMemory RHM = new RelocatorHexMemory();
        String codeLine;
        int y = 10;
        RHM.setVisible(true);
        String opcode;
        for(int i=0;lineaslist.size() >= i;i++){  
            codeLine = lineaslist.get(i);
            codeLine = codeLine.replaceAll(",", ""); 
            codeLine = codeLine.trim();
            opcode = relativeDirections(codeLine);
            codeLine = opcode + " " + codeLine;
            RHM.addNewField(y, opcode);
            y += 12;
        }
    
    }
    
    public static String relativeDirections(String instruction){
        
        String[] opcode = instruction.split(" ");
        
        switch(opcode[0]){
            case "LD":
                switch(opcode[1]){
                    case "B":
                        Pattern pat = Pattern.compile("^([1-9])$");
                        Matcher mat = pat.matcher(opcode[2]);
                        if (Integer.parseInt(opcode[2]) < 255){
                            return Integer.toString(0x06);
                        }
                        break;
                }
                break;
                
                default:
                    return "";
        }
        return "0";
    }
    
}
