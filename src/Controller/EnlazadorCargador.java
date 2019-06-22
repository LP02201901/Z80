/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Model.MemoryOp;
import java.util.Hashtable;
import javax.swing.RowFilter.Entry;
import java.lang.Math;

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
        //RelocatorHexMemory RHM = new RelocatorHexMemory();
        String codeLine;
        String instruction;
        int y = 10;
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
        ArrayList<String> opcodeLine = new ArrayList<String>();
        
        RelocatorTable RHM = new RelocatorTable();
        RelocatorTable RHMLst = new RelocatorTable();
        //RHM.setVisible(true);
        String opcode;
        /*for(int i=0;lineaslist.size() > i;i++){  
            codeLine = lineaslist.get(i);
            codeLine = codeLine.replaceAll(",", "");            
            codeLine = codeLine.replaceAll(":", "");
            codeLine = codeLine.trim();
        }*/
        
        address = 0x00;
        int n = 0;
        String OpcodeData = "";
       for(int i=0;lineaslist.size() > i;i++){ 
            instruction = lineaslist.get(i);
            codeLine = lineaslist.get(i);
            codeLine = codeLine.replaceAll(",", "");          
            codeLine = codeLine.replaceAll(":", ""); 
            codeLine = codeLine.trim();
            for(int j = 0; j < relativeDirections(codeLine).size(); j++){              
                opcode = relativeDirections(codeLine).get(j);
                opcodeLine.add(opcode);
                OpcodeData += opcode+" ";
            }         
                data.add(RHM.AddData(Integer.toString(n++),OpcodeData,codeLine,instruction));
                OpcodeData = "";
        }
        
        /*flag = false;
        MemoryZ80.resetMemory();  */ 
        labels.forEach((k,v) -> System.out.println("Key " + k + " Value " + v));
       
        RHMLst.hexMemory(this.arrayListtoString(data));
        RHM.hexFilled(this.arrayListtoOpcodeString(opcodeLine));
        RHM.pack();
        RHM.setVisible(true);
        RHMLst.pack();
        RHMLst.setVisible(true);
        /*for(int i=0;MemoryZ80.readMemory().length > i;i++){
            System.out.println(MemoryZ80.readByte(i));
        }*/     
    }
    
    public String[][] arrayListtoString(ArrayList<ArrayList<String>> param){
        String[][] data= new String[50][4];
        for(int i=0;i < param.size();i++){  
            for(int j=0;j < param.get(i).size();j++){
               data[i][j]  = param.get(i).get(j);
            }
        }
        return data;
    }
        
    public String[][] arrayListtoOpcodeString(ArrayList<String> param){
        String[][] data= new String[100][16];
        int j = 0;
        int i = 0;
        int k = 0;
        int limit = (int) Math.ceil((param.size()/16)) + 1;
        for(i = 0;i < data.length;i++){  
            for(j = 0;j < data[i].length;j++){
                data[i][j]   = "0000";
            }
        }
        j = 0;
        i = 0;
        while (i < limit && k < param.size()){
            if((j % 16) == 0 && j != 0){
                j = 0;
                i++;
            }else{
               data[i][j] = param.get(k);  
               j++;
            }
            k++;
        }
        return data;
    }
    
    public ArrayList<String> relativeDirections(String instruction){
        String[] opcode = instruction.split(" ");
        ArrayList<String> opcodeData =  new ArrayList<String>(); 
        switch(opcode[0]){
            case "LD":
                switch(opcode[1]){
                    case "A":
                        if (opcode[2].equals("B")){
                            MemoryZ80.writeByte(address,0x78);
                            address += 1;
                            opcodeData.add("0x78");                 
                            break;
                        }
                        if (opcode[2].equals("C")){
                            MemoryZ80.writeByte(address,0x79);
                            address += 1;
                            opcodeData.add("0x79");                                             
                            break;
                        }
                        if (Integer.parseInt(opcode[2]) < 255){
                            opcodeData.add("0x3E");                                            
                            break;
                        }       
                    case "B":
                        //System.out.println(opcode[2]);
                        if (opcode[2].equals("A")){
                            MemoryZ80.writeByte(address,0x47);
                            address += 1;
                            opcodeData.add("0x47");                                            
                            break;
                        }
                        if (Integer.parseInt(opcode[2]) < 255){
                            MemoryZ80.writeByte(address,0x06);
                            address += 1;
                            opcodeData.add("0x06");
                            MemoryZ80.writeByte(address,Integer.parseInt(opcode[2]));
                            address += 1;
                            opcodeData.add("0x"+Integer.toHexString(Integer.parseInt(opcode[2])));                                            
                            break;
                        }
                    case "C":
                        if (opcode[2].equals("A")){
                            MemoryZ80.writeByte(address,0x4F);
                            address += 1;
                            opcodeData.add("0x4F");                                            
                            break;
                        }
                        if (Integer.parseInt(opcode[2]) < 255){
                            MemoryZ80.writeByte(address,0x0E);
                            address += 1;
                            opcodeData.add("0x0E");
                            MemoryZ80.writeByte(address,Integer.parseInt(opcode[2]));
                            address += 1;
                            opcodeData.add("0x"+Integer.toHexString(Integer.parseInt(opcode[2])));                                            
                            break;
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
                            opcodeData.add("0x32");                           
                            opcodeData.add("0");                            
                            opcodeData.add("0"); 
                        }
                       
                        break;
                }
                break;    
            case "CP":
                switch(opcode[1]){
                    case "C":
                        MemoryZ80.writeByte(address,0xB9);
                        address += 1;
                        opcodeData.add("0xB9"); 
                        break; 
                }
                break; 
            case "JP":
                switch(opcode[1]){
                    case "Z":
                        MemoryZ80.writeByte(address,0xCA);
                        address += 1;
                        opcodeData.add("0xCA");
                        if(labels.get(opcode[2]) != null){                          
                            MemoryZ80.writeByte(address,labels.get(opcode[2]));
                            address += 1; 
                            opcodeData.add("0x"+Integer.toHexString(labels.get(opcode[2])));                                  
                            
                        }else{                          
                            MemoryZ80.writeByte(address,0);
                            address += 1;  
                            opcodeData.add("0");
                            opcodeData.add("0");  
                        }                
                    break;        
                        
                    case "M":
                        MemoryZ80.writeByte(address,0xFA);
                        opcodeData.add("0xFA");
                        address += 1;
                        if(labels.get(opcode[2]) != null){                          
                            MemoryZ80.writeByte(address,labels.get(opcode[2]));
                            address += 1;
                            opcodeData.add("0x"+Integer.toHexString(labels.get(opcode[2])));                           
                        }else{                          
                            MemoryZ80.writeByte(address,0);
                            address += 1;  
                            opcodeData.add("0");
                            opcodeData.add("0");   
                        }                        
                        break;
                    default:
                        MemoryZ80.writeByte(address,0xC3);
                        address += 1;                      
                        opcodeData.add("0xC3"); 
                        if(labels.get(opcode[1]) != null){                          
                            MemoryZ80.writeByte(address,labels.get(opcode[1]));
                            address += 1;             
                            //opcodeData.add("0xC3");
                            opcodeData.add("0"); 
                            opcodeData.add("0");                           
                        }else{                          
                            MemoryZ80.writeByte(address,0);
                            address += 1;     
                        }                       
                        break;
                        
                }
                                
            break;
            case "SUB":
                switch(opcode[1]){
                    case "C":
                        MemoryZ80.writeByte(address,0x91);
                        address += 1;
                        opcodeData.add("0x91");                        
                        break;
                    case "B":
                        MemoryZ80.writeByte(address,0x90);
                        address += 1;   
                        opcodeData.add("0x90");                       
                        break;
                }                           
            break;
            case "HALT":
                MemoryZ80.writeByte(address,0x76);
                address += 1;  
                opcodeData.add("0x76");                        
                break;
            default:
                if(flag){
                    if (opcode[0].equals("MAIN")){
                        labels.put(opcode[0], 0);  
                    }else{
                        labels.put(opcode[0], address + 1);       
                    } 
                }
        }
        return opcodeData;
    }
    
}


