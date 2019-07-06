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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sunny
 */
public class EnlazadorCargador {
    MemoryOp MemoryZ80 = new MemoryOp();
    HexGenerator HexGen = new HexGenerator();
    public int address = 0x0;
    private boolean flag = true;
    Hashtable<String, String[]> labels = new Hashtable<String, String[]>();
    public void readAssembler(ArrayList<String> lineaslist) {
        String codeLine;
        String instruction;
        int y = 10;
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
        ArrayList<String> opcodeLine = new ArrayList<String>();
        
        RelocatorTable RHM = new RelocatorTable();
        RelocatorTable RHMLst = new RelocatorTable();
        String opcode;
        int n = 0;
        String OpcodeData = "";
        Integer aux = 0;
        ArrayList<String> relative_direction = new ArrayList<String>();
       for(int i=0;lineaslist.size() > i;i++){     
            instruction = lineaslist.get(i);
            codeLine = lineaslist.get(i);
            codeLine = codeLine.replaceAll(",", "");          
            codeLine = codeLine.replaceAll(":", ""); 
            codeLine = codeLine.trim();
            
            relative_direction = relativeDirections(codeLine, i);
            for(int j = 0; j < relative_direction.size(); j++){              
                opcode = relative_direction.get(j);
                opcodeLine.add(opcode);
                OpcodeData += opcode+" ";                                                                       
                n++;
            }     
            relative_direction = new ArrayList<String>();
            data.add(RHM.AddData(memoryLoadaddressHex(Integer.toHexString(aux)),OpcodeData,codeLine,instruction));
            OpcodeData = "";
            aux = n;
        }
       
        flag = false;
        MemoryZ80.resetMemory();  
        //labels.forEach((k,v) -> System.out.println("Key " + k + " Value " + v[0]));
        //labels.forEach((k,v) -> System.out.println("Key " + k + " Value " + v[1]));     
        
        n = 0;
        address = 0x0;
        relative_direction = new ArrayList<String>();
        OpcodeData = "";
        opcodeLine = new ArrayList<String>();
        data = new ArrayList<ArrayList<String>>();
        
        for(int i=0;lineaslist.size() > i;i++){     
            instruction = lineaslist.get(i);
            codeLine = lineaslist.get(i);
            codeLine = codeLine.replaceAll(",", "");          
            codeLine = codeLine.replaceAll(":", ""); 
            codeLine = codeLine.trim();
            
            relative_direction = relativeDirections(codeLine, i);
            for(int j = 0; j < relative_direction.size(); j++){              
                opcode = relative_direction.get(j);
                opcodeLine.add(opcode);
                OpcodeData += opcode+" ";                                                                       
                n++;
            }    
            
            relative_direction = new ArrayList<String>();
            data.add(RHM.AddData(memoryLoadaddressHex(Integer.toHexString(aux)),OpcodeData,codeLine,instruction));
            OpcodeData = "";
            aux = n;
        }          
        
        RHMLst.hexMemory(this.arrayListtoString(data));
        RHMLst.pack();
        RHMLst.setVisible(true);
        RHM.hexFilled(this.arrayListtoOpcodeString(opcodeLine));
        RHM.pack();
        RHM.setVisible(true);
       
        //Instructions.Intructions ins;
        //ins = new Instructions.Intructions(1000);
        
        /*
        try {
                ins.FDEprocess(0, "0x6");
            } catch (InterruptedException ex) {
                Logger.getLogger(EnlazadorCargador.class.getName()).log(Level.SEVERE, null, ex);
            }
        */
        for(int i=0;MemoryZ80.readMemory().length > i;i++){
            System.out.println("0x"+Integer.toHexString(MemoryZ80.readByte(i))); 
            /*try {
                ins.FDEprocess(0, "0x"+Integer.toHexString(MemoryZ80.readByte(i)));
            } catch (InterruptedException ex) {
                Logger.getLogger(EnlazadorCargador.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            //Thread.sleep(1000);
            //System.out.println(MemoryZ80.read); 
            int[] aux2;
            aux2= new int[1000];
            aux2 = MemoryZ80.readMemory();
            
            System.out.println(aux2[0]);
            break;
            
                
        }  
        

        Instructions.Intructions ins = new Instructions.Intructions(MemoryZ80.readMemory());
        ins.Ejecutar(MemoryZ80.readMemory());
            
        
    }
    
        public void readAssemblerperLine(ArrayList<String> lineaslist, int linecode){
        String codeLine;
        String instruction;
        int y = 10;
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
        ArrayList<String> opcodeLine = new ArrayList<String>();
        
        RelocatorTable RHM = new RelocatorTable();
        RelocatorTable RHMLst = new RelocatorTable();
        String opcode;
        int n = 0;
        String OpcodeData = "";
        Integer aux = 0;
        ArrayList<String> relative_direction = new ArrayList<String>();
       for(int i=0;lineaslist.size() > i;i++){     
            instruction = lineaslist.get(i);
            codeLine = lineaslist.get(i);
            codeLine = codeLine.replaceAll(",", "");          
            codeLine = codeLine.replaceAll(":", ""); 
            codeLine = codeLine.trim();
            
            relative_direction = relativeDirections(codeLine, i);
            for(int j = 0; j < relative_direction.size(); j++){              
                opcode = relative_direction.get(j);
                opcodeLine.add(opcode);
                OpcodeData += opcode+" ";                                                                       
                n++;
            }     
            relative_direction = new ArrayList<String>();
            data.add(RHM.AddData(memoryLoadaddressHex(Integer.toHexString(aux)),OpcodeData,codeLine,instruction));
            OpcodeData = "";
            aux = n;
        }
       
        flag = false;
        MemoryZ80.resetMemory();  
        //labels.forEach((k,v) -> System.out.println("Key " + k + " Value " + v[0]));
        //labels.forEach((k,v) -> System.out.println("Key " + k + " Value " + v[1]));     
        
        n = 0;
        address = 0x0;
        relative_direction = new ArrayList<String>();
        OpcodeData = "";
        opcodeLine = new ArrayList<String>();
        data = new ArrayList<ArrayList<String>>();
        
        for(int i=0;lineaslist.size() > i;i++){     
            instruction = lineaslist.get(i);
            codeLine = lineaslist.get(i);
            codeLine = codeLine.replaceAll(",", "");          
            codeLine = codeLine.replaceAll(":", ""); 
            codeLine = codeLine.trim();
            
            relative_direction = relativeDirections(codeLine, i);
            for(int j = 0; j < relative_direction.size(); j++){              
                opcode = relative_direction.get(j);
                opcodeLine.add(opcode);
                OpcodeData += opcode+" ";                                                                       
                n++;
            }    
            
            relative_direction = new ArrayList<String>();
            data.add(RHM.AddData(memoryLoadaddressHex(Integer.toHexString(aux)),OpcodeData,codeLine,instruction));
            OpcodeData = "";
            aux = n;
        }    
        
        if (linecode == 1){          
            RHMLst.hexMemory(this.arrayListtoString(data));
            RHMLst.pack();
            RHMLst.setVisible(true);
            RHM.hexFilled(this.arrayListtoOpcodeString(opcodeLine));
            RHM.pack();
            RHM.setVisible(true);
        }else{            
            RHMLst.hexMemory(this.arrayListtoString(data), linecode);
            RHM.hexFilled(this.arrayListtoOpcodeString(opcodeLine), linecode);
        }
        
       /*
        Instructions.Intructions ins = new Instructions.Intructions(MemoryZ80.readMemory());
            try {
                ins.FDEprocess(0, "0x6");
            } catch (InterruptedException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
*/
        
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
                data[i][j] = param.get(k);
            }else{
               data[i][j] = param.get(k);  
               j++;
            }
            k++;
        }
        return data;
    }
    
    public ArrayList<String> relativeDirections(String instruction, Integer i){
        String[] opcode = instruction.split(" ");
        String[] memoryDirections = new String[2];
        ArrayList<String> opcodeData =  new ArrayList<String>(); 
        switch(opcode[0]){
            case "LD":
                HexGen.loadLD(opcode,MemoryZ80,address,opcodeData);
                break;    
            case "CP":
                HexGen.loadCP(opcode,MemoryZ80,address,opcodeData);             
                break; 
            case "JP":
                HexGen.loadJP(opcode,MemoryZ80,address,opcodeData,labels); 
                             
            break;         
            case "JR": 
                HexGen.loadJR(opcode,MemoryZ80,address,opcodeData,labels);               
                              
            break;
            case "SUB":
                HexGen.loadSUB(opcode,MemoryZ80,address,opcodeData);       
            break;
            case "ADD":  
                HexGen.loadADD(opcode,MemoryZ80,address,opcodeData); 
            break;
            case "HALT":
                HexGen.loadHALT(opcode,MemoryZ80,address,opcodeData);                
                break;
            case "DEC":
                HexGen.loadDEC(opcode,MemoryZ80,address,opcodeData);                
            break;
            default:
                HexGen.loadDEFAULT(opcode,MemoryZ80,address,opcodeData,flag,memoryDirections,labels);               
        }
        return opcodeData;
    }
    
    public String memoryLoadvalue(String firstno, String secondno){
        
       return ""; 
    }
    public String memoryLoadaddress(String firstno, String secondno){
        
       return ""; 
    }
    public String memoryLoadaddressHex(String firstno){
       if(firstno.length() == 1){
           return "000" + firstno;
       }
       if(firstno.length() == 2){
           return "00" + firstno;
       }
       if(firstno.length() == 3){
           return "0" + firstno;
       }
       return ""; 
    }
    
}


