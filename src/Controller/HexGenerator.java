/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MemoryOp;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author Sunny
 */
public class HexGenerator {
    
    public static void loadLD(String[] opcode,MemoryOp MemoryZ80,int address,ArrayList opcodeData){
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
                    MemoryZ80.writeByte(address,0x3E);
                    address += 1;      
                    opcodeData.add("0x3E");
                    MemoryZ80.writeByte(address,Integer.parseInt(opcode[2]));
                    address += 1;
                    opcodeData.add("0x"+Integer.toHexString(Integer.parseInt(opcode[2])));                                            
                    break; 
                 }       
            case "B":
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
                    opcodeData.add(""+ memoryValueList[2]+memoryValueList[3]);                            
                    opcodeData.add(""+ memoryValueList[0]+memoryValueList[1]); 
                    }
                    break;
            }                            
    }
    
    
    public static void loadCP(String[] opcode,MemoryOp MemoryZ80,int address,ArrayList opcodeData){
        switch(opcode[1]){
            case "B":
                MemoryZ80.writeByte(address,0xB9);
                address += 1;
                opcodeData.add("0xB8"); 
                break; 
            case "C":
                MemoryZ80.writeByte(address,0xB9);
                address += 1;
                opcodeData.add("0xB9"); 
                break;                     
            default:                       
                if (Integer.parseInt(opcode[1]) < 255){                           
                MemoryZ80.writeByte(address,0xFE);
                address += 1;
                opcodeData.add("0xFE");
                MemoryZ80.writeByte(address,Integer.parseInt(opcode[1]));
                address += 1;
                opcodeData.add("0x"+Integer.toHexString(Integer.parseInt(opcode[1])));                                            
                break; 
            }
            break; 
                        
       }
    }
        
    public static void loadJP(String[] opcode,MemoryOp MemoryZ80,int address,ArrayList opcodeData,Hashtable<String, String[]> labels){
                        switch(opcode[1]){
                    case "Z":
                        MemoryZ80.writeByte(address,0xCA);
                        address += 1;
                        opcodeData.add("0xCA");
                        if(labels.get(opcode[2]) != null){                          
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[0]));
                            address += 1; 
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[1]));
                            address += 1; 
                            opcodeData.add(labels.get(opcode[2])[1]);   
                            opcodeData.add(labels.get(opcode[2])[0]);                                 
                            
                        }else{                          
                            MemoryZ80.writeByte(address,0);
                            address += 1;
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
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[0]));
                            address += 1; 
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[1]));
                            address += 1;  
                            opcodeData.add(labels.get(opcode[2])[1]);   
                            opcodeData.add(labels.get(opcode[2])[0]);                              
                        }else{                          
                            MemoryZ80.writeByte(address,0);
                            address += 1;           
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
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[1])[0]));
                            address += 1; 
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[1])[1]));
                            address += 1;  
                            opcodeData.add(labels.get(opcode[1])[1]);   
                            opcodeData.add(labels.get(opcode[1])[0]);                       
                        }else{                          
                            MemoryZ80.writeByte(address,0);
                            address += 1;            
                            MemoryZ80.writeByte(address,0);
                            address += 1;  
                            opcodeData.add("0"); 
                            opcodeData.add("0"); 
                        }                       
                        break;
                        
                    case "P": 
                        MemoryZ80.writeByte(address,0xF2);
                        opcodeData.add("0xF2");
                        address += 1;
                        if(labels.get(opcode[2]) != null){                          
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[0]));
                            address += 1; 
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[1]));
                            address += 1;  
                            opcodeData.add(labels.get(opcode[2])[1]);   
                            opcodeData.add(labels.get(opcode[2])[0]);                              
                        }else{                          
                            MemoryZ80.writeByte(address,0);
                            address += 1;           
                            MemoryZ80.writeByte(address,0);
                            address += 1;
                            opcodeData.add("0");
                            opcodeData.add("0");   
                        }            
                        break;
                        
                }  
    }
    public static void loadJR(String[] opcode,MemoryOp MemoryZ80,int address,ArrayList opcodeData,Hashtable<String, String[]> labels){
                switch(opcode[1]){
                    case "Z":
                        MemoryZ80.writeByte(address,0x28);
                        address += 1;
                        opcodeData.add("0x28");
                        if(labels.get(opcode[2]) != null){                          
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[0]));
                            address += 1; 
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[1]));
                            address += 1; 
                            opcodeData.add(labels.get(opcode[2])[1]);   
                            opcodeData.add(labels.get(opcode[2])[0]);                                 
                            
                        }else{                          
                            MemoryZ80.writeByte(address,0);
                            address += 1;
                            MemoryZ80.writeByte(address,0);
                            address += 1;  
                            opcodeData.add("0");
                            opcodeData.add("0");  
                        }                
                    break;        
                        
                    case "NZ":
                        MemoryZ80.writeByte(address,0x20);
                        opcodeData.add("0x20");
                        address += 1;
                        if(labels.get(opcode[2]) != null){                          
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[0]));
                            address += 1; 
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[1]));
                            address += 1;  
                            opcodeData.add(labels.get(opcode[2])[1]);   
                            opcodeData.add(labels.get(opcode[2])[0]);                              
                        }else{                          
                            MemoryZ80.writeByte(address,0);
                            address += 1;           
                            MemoryZ80.writeByte(address,0);
                            address += 1;
                            opcodeData.add("0");
                            opcodeData.add("0");   
                        }                        
                        break;
                    default:
                        MemoryZ80.writeByte(address,0x18);
                        address += 1;                      
                        opcodeData.add("0x18"); 
                        if(labels.get(opcode[1]) != null){                  
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[1])[0]));
                            address += 1; 
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[1])[1]));
                            address += 1;  
                            opcodeData.add(labels.get(opcode[1])[1]);   
                            opcodeData.add(labels.get(opcode[1])[0]);                       
                        }else{                          
                            MemoryZ80.writeByte(address,0);
                            address += 1;            
                            MemoryZ80.writeByte(address,0);
                            address += 1;  
                            opcodeData.add("0"); 
                            opcodeData.add("0"); 
                        }                       
                        break;
                        
                } 
    }
    
    public static void loadSUB(String[] opcode,MemoryOp MemoryZ80,int address,ArrayList opcodeData){
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
    } 
    public static void loadADD(String[] opcode,MemoryOp MemoryZ80,int address,ArrayList opcodeData){        
                switch(opcode[1]){
                    case "A":                       
                        if (opcode[2].equals("B")){
                            MemoryZ80.writeByte(address,0x80);
                            address += 1;
                            opcodeData.add("0x80");                 
                            break;
                        }
                        if (opcode[2].equals("C")){
                            MemoryZ80.writeByte(address,0x81);
                            address += 1;
                            opcodeData.add("0x81");                                             
                            break;
                        }
                        if (Integer.parseInt(opcode[2]) < 255){
                            MemoryZ80.writeByte(address,0x3E);
                            address += 1;      
                            opcodeData.add("0x3E");
                            MemoryZ80.writeByte(address,Integer.parseInt(opcode[2]));
                            address += 1;
                            opcodeData.add("0x"+Integer.toHexString(Integer.parseInt(opcode[2])));                                            
                            break; 
                        } 
                }
    }
    
    public static void loadHALT(String[] opcode,MemoryOp MemoryZ80,int address,ArrayList opcodeData){   
        MemoryZ80.writeByte(address,0x76);
        address += 1;  
        opcodeData.add("0x76");  
    }
    
    public static void loadDEC(String[] opcode,MemoryOp MemoryZ80,int address,ArrayList opcodeData){        
        switch(opcode[1]){
            case "C":
                MemoryZ80.writeByte(address,0x0D);
                address += 1;
                opcodeData.add("0x0D");                        
                break;
            case "B":
                MemoryZ80.writeByte(address,0x05);
                address += 1;   
                opcodeData.add("0x05");                       
                break;
        }  
    } 
    public static void loadDEFAULT(String[] opcode,MemoryOp MemoryZ80,int address
            ,ArrayList opcodeData,boolean flag,String[] memoryDirections,
            Hashtable<String, String[]>  labels){   
        if(flag){
            if (opcode[0].equals("MAIN")){
                memoryDirections[0] = Integer.toHexString(0)+'0';
                memoryDirections[1] = Integer.toHexString(0)+'0';
                labels.put(opcode[0], memoryDirections);  
                }else{
                memoryDirections[1] = Integer.toString(0)+'0';
                memoryDirections[0] = Integer.toString(address);
                labels.put(opcode[0], memoryDirections);       
            } 
        } 
    }
    
    
}
