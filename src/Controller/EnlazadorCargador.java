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
import java.util.Hashtable;
import javax.swing.RowFilter.Entry;

/**
 *
 * @author Sunny
 */
public class EnlazadorCargador {
    MemoryOp MemoryZ80 = new MemoryOp();
    public int address = 0;
    private boolean flag = true;
    Hashtable<String, Integer> labels = new Hashtable<String, Integer>();
    public void readAssembler(ArrayList<String> lineaslist){
        RelocatorHexMemory RHM = new RelocatorHexMemory();
        String codeLine;
        int y = 10;
        
        RelocatorTable frame = new RelocatorTable();
        frame.pack();
        frame.setVisible(true);
        //RHM.setVisible(true);
        String opcode;
        for(int i=0;lineaslist.size() > i;i++){  
            codeLine = lineaslist.get(i);
            codeLine = codeLine.replaceAll(",", "");            
            codeLine = codeLine.replaceAll(":", "");
            codeLine = codeLine.trim();
            opcode = relativeDirections(codeLine);
            codeLine = opcode + " " + codeLine;
            //RHM.addNewField(y, codeLine);
            y += 12;
        }
        
        flag = false;
        MemoryZ80.resetMemory();   
        address = 0x00;
        //labels.forEach((k,v) -> System.out.println("Key " + k + " Value " + v));
        for(int i=0;lineaslist.size() > i;i++){  
            codeLine = lineaslist.get(i);
            codeLine = codeLine.replaceAll(",", "");          
            codeLine = codeLine.replaceAll(":", ""); 
            codeLine = codeLine.trim();
            opcode = relativeDirections(codeLine);
            codeLine = opcode + " " + codeLine;
            //RHM.addNewField(y, codeLine);
            y += 14;
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
                            return "(0x78)";
                        }
                        if (opcode[2].equals("C")){
                            MemoryZ80.writeByte(address,0x79);
                            address += 1;
                            return "(0x79)";
                        }
                        if (Integer.parseInt(opcode[2]) < 255){
                            return "(0x3E)";
                        }
                    case "B":
                        if (opcode[2].equals("A")){
                            MemoryZ80.writeByte(address,0x47);
                            address += 1;
                            return "(0x47)";
                        }
                        if (Integer.parseInt(opcode[2]) < 255){
                            MemoryZ80.writeByte(address,0x06);
                            address += 1;
                            MemoryZ80.writeByte(address,Integer.parseInt(opcode[2]));
                            address += 1;
                            return "(0x06)";
                        }
                        break;
                    case "C":
                        if (opcode[2].equals("A")){
                            MemoryZ80.writeByte(address,0x4F);
                            address += 1;
                            return "(0x4F)";
                        }
                        if (Integer.parseInt(opcode[2]) < 255){
                            MemoryZ80.writeByte(address,0x0E);
                            address += 1;
                            MemoryZ80.writeByte(address,Integer.parseInt(opcode[2]));
                            address += 1;
                            return "(0x0E)";
                        }
                        break;
                    default:
                        if (opcode[1].contains("(")){
                            MemoryZ80.writeByte(address,0x32);
                            address += 1;
                            String memoryValue=opcode[1].replace("(", "");
                            memoryValue=memoryValue.replace(")", "");
                            memoryValue=memoryValue.replace("H", "");
                            String[] memoryValueList = memoryValue.split("");
                            MemoryZ80.writeByte(address,Integer.parseInt(memoryValueList[2]+memoryValueList[3]));
                            address += 1;
                            MemoryZ80.writeByte(address,Integer.parseInt(memoryValueList[0]+memoryValueList[1]));
                            address += 1;
                            return "(0x32)";
                        }
                }
                break;    
            case "CP":
                switch(opcode[1]){
                    case "C":
                        MemoryZ80.writeByte(address,0xB9);
                        address += 1;
                        return "(0xB9)";  
                }
            case "JP":
                switch(opcode[1]){
                    case "Z":
                        MemoryZ80.writeByte(address,0xCA);
                        address += 1;
                        if(labels.get(opcode[2]) != null){                          
                            MemoryZ80.writeByte(address,labels.get(opcode[2]));
                            address += 1;                           
                        }else{                          
                            MemoryZ80.writeByte(address,0);
                            address += 1;     
                        }
                        return "(0xCA)";
                        
                    case "M":
                        MemoryZ80.writeByte(address,0xFA);
                        address += 1;
                        if(labels.get(opcode[2]) != null){                          
                            MemoryZ80.writeByte(address,labels.get(opcode[2]));
                            address += 1;                           
                        }else{                          
                            MemoryZ80.writeByte(address,0);
                            address += 1;     
                        }
                        return "(0xFA)"; 
                    default:
                        MemoryZ80.writeByte(address,0xC3);
                        address += 1;
                        if(labels.get(opcode[1]) != null){                          
                            MemoryZ80.writeByte(address,labels.get(opcode[1]));
                            address += 1;                           
                        }else{                          
                            MemoryZ80.writeByte(address,0);
                            address += 1;     
                        }
                        
                }
            case "SUB":
                switch(opcode[1]){
                    case "C":
                        MemoryZ80.writeByte(address,0x91);
                        address += 1;
                        return Integer.toString(0x91);  
                    case "B":
                        MemoryZ80.writeByte(address,0x90);
                        address += 1;
                        return "(0x90)";  
                }
            case "HALT":
                MemoryZ80.writeByte(address,0x76);
                address += 1;
                return "(0x76)";
            default:
                if(flag){
                    if (opcode[0].equals("MAIN")){
                        labels.put(opcode[0], 0);  
                    }else{
                        labels.put(opcode[0], address + 1);       
                    } 
                }

        }
        return "0";
    }
    
}


