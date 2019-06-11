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
import Model.MemoryOp;

/**
 *
 * @author Sunny
 */
public class EnlazadorCargador {
    MemoryOp MemoryZ80 = new MemoryOp();
    public int address = 0;
    public void readAssembler(ArrayList<String> lineaslist){
        RelocatorHexMemory RHM = new RelocatorHexMemory();
        String codeLine;
        int y = 10;
        RHM.setVisible(true);
        String opcode;
        for(int i=0;lineaslist.size() > i;i++){  
            codeLine = lineaslist.get(i);
            codeLine = codeLine.replaceAll(",", ""); 
            codeLine = codeLine.trim();
            opcode = relativeDirections(codeLine);
            codeLine = opcode + " " + codeLine;
            RHM.addNewField(y, codeLine);
            y += 12;
        }
        for(int i=0;MemoryZ80.readMemory().length > i;i++){
            System.out.println(MemoryZ80.readByte(i));
        }
    }
    
    public String relativeDirections(String instruction){
        
        String[] opcode = instruction.split(" ");
        switch(opcode[0]){
            case "LD":
                switch(opcode[1]){
                    case "A":
                        if (opcode[2].equals("B")){
                            MemoryZ80.writeByte(address,0x78);
                            address += 1;
                            return Integer.toString(0x78);
                        }
                        if (opcode[2].equals("C")){
                            return Integer.toString(0x79);
                        }
                        if (Integer.parseInt(opcode[2]) < 255){
                            return Integer.toString(0x3E);
                        }
                    case "B":
                        if (opcode[2].equals("A")){
                            return Integer.toString(0x47);
                        }
                        if (Integer.parseInt(opcode[2]) < 255){
                            byte word = (byte) 0x06;
                            byte value = (byte) Integer.parseInt(opcode[2]);
                            MemoryZ80.writeByte(address,word);
                            address += 1;
                            MemoryZ80.writeByte(address,value);
                            address += 1;
                            return Integer.toString(0x06);
                        }
                        break;
                    case "C":
                        if (opcode[2].equals("A")){
                            return Integer.toString(0x4F);
                        }
                        if (Integer.parseInt(opcode[2]) < 255){
                            MemoryZ80.writeByte(address,0x0E);
                            address += 1;
                            MemoryZ80.writeByte(address,Integer.parseInt(opcode[2]));
                            address += 1;
                            return Integer.toString(0x0E);
                        }
                        break;
                }
                break;
                
                default:
                    return "";
            case "CP":
                switch(opcode[1]){
                    case "C":
                        MemoryZ80.writeByte(address,0xB9);
                        address += 1;
                        return Integer.toString(0xB9);  
                }
            case "JP":
                switch(opcode[1]){
                    case "Z":
                        byte word = (byte) 0xCA;
                        MemoryZ80.writeByte(address,word);
                        address += 1;
                        return Integer.toString(0xCA);  
                    case "M":
                        return Integer.toString(0xFA);  
                }
            case "SUB":
                switch(opcode[1]){
                    case "C":
                        return Integer.toString(0x91);  
                    case "B":
                        return Integer.toString(0x90);  
                }
            case "HALT":
                return Integer.toString(0x76);
        }
        return "0";
    }
    
}


