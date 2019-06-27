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
    public int address = 0x0;
    private boolean flag = true;
    Hashtable<String, String[]> labels = new Hashtable<String, String[]>();
    public void readAssembler(ArrayList<String> lineaslist) throws InterruptedException{
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
       
        Instructions.Intructions ins;
        ins = new Instructions.Intructions(1000);
        
        /*
        try {
                ins.FDEprocess(0, "0x6");
            } catch (InterruptedException ex) {
                Logger.getLogger(EnlazadorCargador.class.getName()).log(Level.SEVERE, null, ex);
            }
        */
        for(int i=0;MemoryZ80.readMemory().length > i;i++){
            System.out.println("0x"+Integer.toHexString(MemoryZ80.readByte(i))); 
            try {
                ins.FDEprocess(0, "0x"+Integer.toHexString(MemoryZ80.readByte(i)));
            } catch (InterruptedException ex) {
                Logger.getLogger(EnlazadorCargador.class.getName()).log(Level.SEVERE, null, ex);
            }
            //Thread.sleep(1000);
            break;
            
                
        }  

        /*Instructions.Intructions ins = new Instructions.Intructions();
            try {
                ins.FDEprocess(0,"0x6");
            } catch (InterruptedException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        */
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
                break;    
            case "CP":
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
                break; 
            case "JP":
                switch(opcode[1]){
                    case "Z":
                        MemoryZ80.writeByte(address,0xCA);
                        address += 1;
                        opcodeData.add("0xCA");
                        if(labels.get(opcode[2]) != null){                          
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[1]));
                            address += 1; 
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[0]));
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
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[1]));
                            address += 1; 
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[0]));
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
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[1])[1]));
                            address += 1; 
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[1])[0]));
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
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[1]));
                            address += 1; 
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[0]));
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
            break;         
            case "JR":               
                switch(opcode[1]){
                    case "Z":
                        MemoryZ80.writeByte(address,0x28);
                        address += 1;
                        opcodeData.add("0x28");
                        if(labels.get(opcode[2]) != null){                          
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[1]));
                            address += 1; 
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[0]));
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
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[1]));
                            address += 1; 
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[2])[0]));
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
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[1])[1]));
                            address += 1; 
                            MemoryZ80.writeByte(address,Integer.valueOf(labels.get(opcode[1])[0]));
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
            case "ADD":
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
            break;
            case "HALT":
                MemoryZ80.writeByte(address,0x76);
                address += 1;  
                opcodeData.add("0x76");                        
                break;
            case "DEC":
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
            break;
            default:
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


