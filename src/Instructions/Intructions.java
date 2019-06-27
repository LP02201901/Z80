/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instructions;

import View.Arquitectura;
import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;


/**
 *
 * @author Pacho
 */
public class Intructions {

    public Intructions(int[] mem, int[] br, int ir, int[] mpr, int pc, int ALU, boolean[] flags) {
        
        this.mem = mem;
        this.br = br;
        this.ir = ir;
        this.mpr = mpr;
        this.pc = pc;
        this.ALU = ALU;
        this.flags = flags;
        
    }
    
    public Intructions(int memoria[]) {
        
        pc = 0;
        br = new int[2];
        br[0] = 0;
        br[1] = 0;
        mpr= new int[20];
        mem = new int[1000];
        mem = memoria;
        
        for(int i=0; i<mem.length;i++){
            
            mem[i]=1;
            
        }
        for(int i=0; i<mpr.length;i++){
            
            mpr[i]=0;
            
        }
        
        mem[0]=0x32;
        arq = new Arquitectura();
    }
    
    Arquitectura arq;
    public int mem[];
    int br[];
    int ir;
    int mpr[];
    public int pc;
    int ALU;
    boolean flags[];
    
    public void FDEprocess(int pos) throws InterruptedException{
        
        ir =  mem[pos];
        
        switch(ir){
            
            case 0x06:                  //LD B, *
                
                pc++;
                br[0] = mem[pc];
                mpr[1] = br[0];
                
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                         false, false, false, false, false, false, false, false, false, false, false);
                
                        arq.show();
                Thread.sleep(2000);
                
                        arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                         false, false, false, false, false, false, false, false, false, true, false);
                        arq.Buffer1.setText("Valor: " + mem[pc]);
                        arq.show();
                        
                Thread.sleep(2000);
                        arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                         false, false, false, false, false, false, false, false, false, false, false);
                        arq.Buffer1.setText("Buffer");
                        arq.show();
                Thread.sleep(2000);
                        arq.B.setBackground(Color.red);
                        arq.B.setText("" + mpr[1]);
                        arq.show();
                    
                break;
                
            case 0x0E:                  //LD C, *
                
                pc++;
                br[0] = mem[pc];
                mpr[2] = br[0];
                
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                         false, false, false, false, false, false, false, false, false, false, false);
                
                // Cambiar esos valores de false, por los valores de los registros como 
                // lo hacemos abajo para que no se vea ese reguero de falses
                
                        arq.show();
                Thread.sleep(2000);
                
                        arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                         false, false, false, false, false, false, false, false, false, true, false);
                        arq.Buffer1.setText("Valor: " + mem[pc]);
                        arq.show();
                        
                Thread.sleep(2000);
                        arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                         false, false, false, false, false, false, false, false, false, false, false);
                        arq.Buffer1.setText("Buffer");
                        arq.show();
                Thread.sleep(2000);
                        arq.C.setBackground(Color.BLUE);
                        arq.C.setText("" + mpr[1]);
                        arq.show();
                        
                break;
                
            case 0x78:                  //LD A, B
                
                mpr[0] = mpr[1];
                
                arq.B.setBackground(Color.ORANGE);
                arq.show();
                Thread.sleep(2000);
                
                arq.A.setText("" + mpr[0]);
                arq.A.setBackground(Color.BLUE);
                arq.show();
                Thread.sleep(2000);
                
                arq.B.setBackground(Color.white);
                arq.show();
                
                break;
                
            case 0xB9:                  //CP C
                
                arq.ALU.setBackground(Color.ORANGE);
                arq.show();
                Thread.sleep(2000);
                
                arq.ALU.setBackground(Color.WHITE);
                    
                if(mpr[0] - mpr[2] == 0){
                    
                    arq.F7.setBackground(Color.BLUE);
                    arq.F7.setText("1");
                    arq.show();
                    Thread.sleep(2000);
                    
                }else{
                    
                    arq.F7.setBackground(Color.BLUE);
                    arq.F7.setText("0");
                    arq.show();
                    Thread.sleep(2000);
                    
                }
                
                if(mpr[0] - mpr[2] < 0){
                    
                    arq.F8.setBackground(Color.BLUE);
                    arq.F8.setText("1");
                    arq.show();
                    Thread.sleep(2000);
                    
                }else{
                    
                    arq.F8.setBackground(Color.BLUE);
                    arq.F8.setText("0");
                    arq.show();
                    Thread.sleep(2000);
                    
                }
                
                if(mpr[1]%0 == 0){
                    
                    arq.F3.setBackground(Color.BLUE);
                    arq.F3.setText("1");
                    arq.show();
                    Thread.sleep(2000);
                    
                }else{
                    
                    arq.F3.setBackground(Color.BLUE);
                    arq.F3.setText("0");
                    arq.show();
                    Thread.sleep(2000);
                    
                }
                
                break;
                
            case 0xCA:                  //JP Z, **
                
                if(arq.F7.getText().equals("1")){
                    
                    pc++;
                    br[0] = mem[pc];
                    br[1] = mem[pc + 1];
                    pc = br[0] + (0x100 * (br[1]));
                    
                    arq.Buffer1.setBackground(Color.BLUE);
                    arq.Buffer2.setBackground(Color.BLUE);
                    arq.Buffer1.setText("Valor: " + br[0]);
                    arq.Buffer2.setText("Valor: " + br[1]);
                    arq.show();
                    Thread.sleep(2000);
                    
                    arq.PC.setBackground(Color.BLUE);
                    arq.PC.setText("" + pc);
                    arq.show();
                    Thread.sleep(2000);
                    
                }else{
                    
                    pc = 3;
                    
                }
                
                break;
                
            case 0xFA:                  //JP M, **
                
                if(arq.F8.getText().equals("1")){
                    
                    pc++;
                    br[0] = mem[pc];
                    br[1] = mem[pc + 1];
                    pc = br[0] + (0x100 * (br[1]));
                    
                    arq.Buffer1.setBackground(Color.BLUE);
                    arq.Buffer2.setBackground(Color.BLUE);
                    arq.Buffer1.setText("Valor: " + br[0]);
                    arq.Buffer2.setText("Valor: " + br[1]);
                    arq.show();
                    Thread.sleep(2000);
                    
                    arq.PC.setBackground(Color.BLUE);
                    arq.PC.setText("" + pc);
                    arq.show();
                    Thread.sleep(2000);
                    
                }else{
                    
                    pc += 3;
                    
                }
                
                break;
                
            case 0x91:                  //SUB C
                
                mpr[0] -= mpr[2];
                
                arq.ALU.setBackground(Color.BLUE);
                arq.A.setBackground(Color.BLUE);
                arq.A.setText("" + mpr[0]);
                arq.show();
                Thread.sleep(2000);
                
                arq.ALU.setBackground(Color.WHITE);
                
                break;
                
            case 0x47:                  //LD B, A
                
                mpr[1] = mpr[0];
                
                arq.A.setBackground(Color.ORANGE);
                arq.show();
                Thread.sleep(2000);
                
                arq.B.setBackground(Color.BLUE);
                arq.B.setText("" + mpr[1]);
                arq.show();
                Thread.sleep(2000);
                
                arq.A.setBackground(Color.WHITE);
                
                break;
            
            case 0xC3:                  //JP **
                
                pc++;
                br[0] = mem[pc];
                br[1] = mem[pc + 1];
                pc = br[0] + (0x100 * (br[1]));
                
                arq.Buffer1.setBackground(Color.BLUE);
                arq.Buffer2.setBackground(Color.BLUE);
                arq.Buffer1.setText("Valor: " + br[0]);
                arq.Buffer2.setText("Valor: " + br[1]);
                arq.show();
                Thread.sleep(2000);
                
                arq.Buffer2.setBackground(Color.white);
                arq.Buffer1.setBackground(Color.white);
                arq.Buffer1.setText("Buffer");
                arq.Buffer2.setText("Buffer");
                arq.PC.setBackground(Color.BLUE);
                arq.PC.setText("" + pc);
                arq.show();

                break;
                
            case 0x79:                  //LD A, C
                
                mpr[0] = mpr[2];
                
                arq.C.setBackground(Color.ORANGE);
                arq.show();
                Thread.sleep(2000);
                
                arq.A.setBackground(Color.BLUE);
                arq.A.setText("" + mpr[0]);
                arq.show();
                Thread.sleep(2000);
                
                arq.C.setBackground(Color.WHITE);
                
                break;
                
            case 0x90:                  //SUB B
                
                mpr[0] -= mpr[1];
                
                arq.ALU.setBackground(Color.BLUE);
                arq.A.setBackground(Color.BLUE);
                arq.A.setText("" + mpr[0]);
                arq.show();
                Thread.sleep(2000);
                
                arq.ALU.setBackground(Color.WHITE);
                
                break;
                
            case 0x4F:                  //LD C, A
                
                mpr[2] = mpr[0];
                
                arq.A.setBackground(Color.ORANGE);
                arq.show();
                Thread.sleep(2000);
                
                arq.C.setBackground(Color.BLUE);
                arq.C.setText("" + mpr[2]);
                arq.show();
                Thread.sleep(2000);
                
                arq.A.setBackground(Color.WHITE);
                
                break;
                
            case 0x32:                  //LD (**), A
                
                pc++;
                br[0] = mem[pc];
                br[1] = mem[pc + 1];
                pc = br[0] + (0x100 * (br[1]));
                mem[pc] = mpr[0];
                
                arq.Buffer1.setBackground(Color.BLUE);
                arq.Buffer2.setBackground(Color.BLUE);
                arq.Buffer1.setText("Valor: " + br[0]);
                arq.Buffer2.setText("Valor: " + br[1]);
                arq.PC.setBackground(Color.BLUE);
                arq.PC.setText("" + pc);
                arq.show();
                Thread.sleep(2000);
                
                arq.Buffer1.setBackground(Color.white);
                arq.Buffer2.setBackground(Color.white);
                arq.Buffer1.setText("Buffer");
                arq.Buffer2.setText("Buffer");
                arq.show();
                
                break;
                
            case 0x3A:                  //LD A, (**)
                
                pc++;
                br[0] = mem[pc];
                br[1] = mem[pc + 1];
                pc = br[0] + (0x100 * (br[1]));
                mpr[0] = mem[pc];
                
                break;
                
            case 0xFE:                  //CP *
                
                pc++;
                
                arq.ALU.setBackground(Color.ORANGE);
                arq.show();
                Thread.sleep(2000);
                arq.ALU.setBackground(Color.WHITE);
                
                if(mpr[0] - mem[pc] == 0){
                    
                    arq.F7.setBackground(Color.BLUE);
                    arq.F7.setText("1");
                    arq.show();
                    Thread.sleep(2000);
                    
                }else{
                    
                    arq.F7.setBackground(Color.BLUE);
                    arq.F7.setText("0");
                    arq.show();
                    Thread.sleep(2000);
                    
                }
                
                if(mpr[0] - mem[pc] < 0){
                    
                    arq.F8.setBackground(Color.BLUE);
                    arq.F8.setText("1");
                    arq.show();
                    Thread.sleep(2000);
                    
                }else{
                    
                    arq.F8.setBackground(Color.BLUE);
                    arq.F8.setText("0");
                    arq.show();
                    Thread.sleep(2000);
                    
                }
                
                if(mpr[0]%0 == 0){
                    
                    arq.F3.setBackground(Color.BLUE);
                    arq.F3.setText("1");
                    arq.show();
                    Thread.sleep(2000);
                    
                }else{
                    
                    arq.F3.setBackground(Color.BLUE);
                    arq.F3.setText("0");
                    arq.show();
                    Thread.sleep(2000);
                    
                }
                
                break;
                
            case 0x28:                  //JR Z, *
                
                if(arq.F7.getText().equals("1")){
                    
                    pc++;
                    br[0] = mem[pc];
                    br[1] = mem[pc + 1];
                    pc += br[0] + (0x100 * (br[1]));
                    
                    arq.Buffer1.setBackground(Color.BLUE);
                    arq.Buffer2.setBackground(Color.BLUE);
                    arq.Buffer1.setText("Valor: " + br[0]);
                    arq.Buffer2.setText("Valor: " + br[1]);
                    arq.show();
                    Thread.sleep(2000);
                    
                    arq.PC.setBackground(Color.BLUE);
                    arq.PC.setText("" + pc);
                    arq.show();
                    Thread.sleep(2000);
                    
                }else{
                    
                    pc += 3;
                    
                }
                
                break;   
                
            case 0xB8:                  //CP B
                
                arq.ALU.setBackground(Color.ORANGE);
                arq.show();
                Thread.sleep(2000);
                
                arq.ALU.setBackground(Color.WHITE);
                
                if(mpr[0] - mpr[1] == 0){
                    
                    arq.F7.setBackground(Color.BLUE);
                    arq.F7.setText("1");
                    arq.show();
                    Thread.sleep(2000);
                    
                }else{
                    
                    arq.F7.setBackground(Color.BLUE);
                    arq.F7.setText("0");
                    arq.show();
                    Thread.sleep(2000);
                    
                }
                
                if(mpr[0] - mpr[1] < 0){
                    
                    arq.F8.setBackground(Color.BLUE);
                    arq.F8.setText("1");
                    arq.show();
                    Thread.sleep(2000);
                    
                }else{
                    
                    arq.F8.setBackground(Color.BLUE);
                    arq.F8.setText("0");
                    arq.show();
                    Thread.sleep(2000);
                    
                }
                
                if(mpr[1]%0 == 0){
                    
                    arq.F3.setBackground(Color.BLUE);
                    arq.F3.setText("1");
                    arq.show();
                    Thread.sleep(2000);
                    
                }else{
                    
                    arq.F3.setBackground(Color.BLUE);
                    arq.F3.setText("0");
                    arq.show();
                    Thread.sleep(2000);
                    
                }
                
                break;
                
            case 0xF2:                  //JP P, **
                
                if(arq.F3.getText().equals("1")){
                    
                    pc++;
                    br[0] = mem[pc];
                    br[1] = mem[pc + 1];
                    pc += br[0] + (0x100 * (br[1]));
                    
                    arq.Buffer1.setBackground(Color.BLUE);
                    arq.Buffer2.setBackground(Color.BLUE);
                    arq.Buffer1.setText("Valor: " + br[0]);
                    arq.Buffer2.setText("Valor: " + br[1]);
                    arq.show();
                    Thread.sleep(2000);
                    
                    arq.PC.setBackground(Color.BLUE);
                    arq.PC.setText("" + pc);
                    arq.show();
                    Thread.sleep(2000);
                    
                }else{                    
                    pc += 3;                    
                }                
                break;                
            case 0x3E:                  //LD A, *
                
                pc++;
                br[0] = mem[pc];
                mpr[1] = br[0];
                
                break;
//////////////////////////////////////////////////////////////////////////////
            case 0x80:                  //ADD A, B
                
                mpr[0] += mpr[1];
                
                arq.B.setBackground(Color.red);
                arq.B.setText(""+mpr[1]);
                arq.show();
                Thread.sleep(2000);
                arq.B.setBackground(Color.white);
                arq.A.setText(""+mpr[0]);
                arq.A.setBackground(Color.red);
                arq.show();
                Thread.sleep(2000);
                
                break;
                
            case 0x0D:                  //DEC C
                
                mpr[2]--;
                arq.C.setBackground(Color.red);
                arq.C.setText(""+mpr[2]);
                arq.show();
                Thread.sleep(2000);
                
                break;
                
            case 0x20:                  //JR NZ, *
                
                if(arq.F7.getText().equals("0")){
                    
                    pc++;
                    br[0] = mem[pc];
                    br[1] = mem[pc + 1];
                    pc += br[0] + (0x100 * (br[1]));
                    
                    arq.Buffer1.setBackground(Color.BLUE);
                    arq.Buffer2.setBackground(Color.BLUE);
                    arq.Buffer1.setText("Valor: " + br[0]);
                    arq.Buffer2.setText("Valor: " + br[1]);
                    arq.show();
                    Thread.sleep(2000);
                    
                    arq.PC.setBackground(Color.BLUE);
                    arq.PC.setText("" + pc);
                    arq.show();
                    Thread.sleep(2000);
                    
                }else{
                    
                    pc += 3;
                    
                }
                
                break;
                
            case 0x81:                  //ADD A, C
                
                mpr[0] += mpr[2];
                arq.C.setBackground(Color.red);
                arq.C.setText(""+mpr[2]);
                arq.show();
                Thread.sleep(2000);
                arq.C.setBackground(Color.white);
                arq.A.setText(""+mpr[0]);
                arq.A.setBackground(Color.red);
                arq.show();
                Thread.sleep(2000);
                break;
                
            case 0x05:                  //DEC B
                arq.B.setBackground(Color.red);
                arq.B.setText(""+mpr[1]);
                arq.show();
                Thread.sleep(2000);
                mpr[1]--;
                arq.B.setBackground(Color.red);
                arq.B.setText(""+mpr[1]);
                arq.show();
                Thread.sleep(2000);
                arq.B.setBackground(Color.white);
                arq.show();
                Thread.sleep(2000);
                
                break;
                
            case 0x18:                  //JR *
                
                pc++;
                br[0] = mem[pc];
                br[1] = mem[pc + 1];
                pc += br[0] + (0x100 * (br[1]));
                
                arq.Buffer1.setBackground(Color.red);
                arq.Buffer2.setBackground(Color.red);
                arq.Buffer1.setText("Valor: "+br[0]);
                arq.Buffer2.setText("Valor: "+br[1]);
                arq.show();
                Thread.sleep(2000);
                arq.Buffer1.setBackground(Color.white);
                arq.Buffer2.setBackground(Color.white);
                arq.PC.setBackground(Color.red);
                arq.Buffer1.setText("Buffer 1");
                arq.Buffer2.setText("Buffer 2");
                arq.PC.setText(""+pc);
                arq.show();
                Thread.sleep(2000);
                
                break;
                
            case 0x76:                  //HALT
                
                //Restaurar valores inciales de la interfaz
                arq.Control(false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false,
             false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                break;
                
        }
        
        pc++;
        
        //Recursión tomando como punto de partida pc
        if(ir != 0x76){
            
            FDEprocess(pc);
            
        }
                
    }
    
}
