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
    
    public Intructions(int memoria) {
        pc=0;
        br = new int[2];
        br[0]=0;
        br[1]=0;
        
        mpr= new int[20];
        
        mem = new int[memoria];
        for(int i=0; i<mem.length;i++)
        {
            mem[i]=1;
        }
        for(int i=0; i<mpr.length;i++)
        {
            mpr[i]=0;
        }
        mem[0]=0x32;
        
        arq=new Arquitectura();
    }
    
    
    Arquitectura arq;
    public int mem[];
    int br[];
    int ir;
    int mpr[];
    public int pc;
    int ALU;
    boolean flags[];
    
    
    @SuppressWarnings("InfiniteRecursion")
    public void FDEprocess(int ins) throws InterruptedException{
        
        ir =  mem[ins];
        pc ++;
        
        switch(ir){
            
            case 0x06:
                
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
                        arq.Buffer1.setText("Valor: "+mem[pc]);
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
                        arq.B.setText(""+mpr[1]);
                        arq.show();
                    
                break;
                
            case 0x0E:
                
                br[0] = mem[pc];
                mpr[2] = br[0];
                
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
                        arq.Buffer1.setText("Valor: "+mem[pc]);
                        arq.show();
                        
                Thread.sleep(2000);
                        arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                         false, false, false, false, false, false, false, false, false, false, false);
                        arq.Buffer1.setText("Buffer");
                        arq.show();
                Thread.sleep(2000);
                        arq.C.setBackground(Color.red);
                        arq.C.setText(""+mpr[1]);
                        arq.show();
                break;
                
            case 0x78:
                
                mpr[0] = mpr[1];
                arq.B.setBackground(Color.ORANGE);
                arq.show();
                Thread.sleep(2000);
                        arq.A.setText(""+mpr[0]);
                        arq.A.setBackground(Color.red);
                        arq.show();
                Thread.sleep(2000);
                arq.B.setBackground(Color.white);
                arq.show();
                break;
                
            case 0xB9:
                
                if(mpr[0] - mpr[2] == 0){
                    
                    arq.ALU.setBackground(Color.ORANGE);
                    arq.show();
                    Thread.sleep(2000);
                    arq.ALU.setBackground(Color.WHITE);
                    arq.F7.setBackground(Color.red);
                    arq.F7.setText("1");
                    arq.show();
                    Thread.sleep(2000);
                    
                }
                if(mpr[0] - mpr[2] < 0){
                    
                    arq.ALU.setBackground(Color.ORANGE);
                    arq.show();
                    Thread.sleep(2000);
                    arq.ALU.setBackground(Color.WHITE);
                    arq.F8.setBackground(Color.red);
                    arq.F8.setText("1");
                    arq.show();
                    Thread.sleep(2000);
                    
                }
                
                break;
                
            case 0xCA:
                
                //if(flags[0] == true){
                arq.F7.setText("1");//Borrar despues
                if(arq.F7.getText().equals("1")){
                    br[0] = mem[pc];
                    br[1] = mem[pc + 1];
                    pc = br[0] + (0x100 * (br[1]));
                    
                    arq.Buffer1.setBackground(Color.red);
                    arq.Buffer2.setBackground(Color.red);
                    
                    arq.Buffer1.setText("Valor: "+br[0]);
                    arq.Buffer2.setText("Valor: "+br[1]);
                    
                    arq.show();
                    Thread.sleep(2000);
                    
                    arq.PC.setBackground(Color.red);
                    arq.PC.setText(""+pc);
                    arq.show();
                    Thread.sleep(2000);
                    
                }
                
                break;
                
            case 0xFA:
                arq.F8.setText("1");//Borrar despues
                if(arq.F8.getText().equals("1")){
                    
                    br[0] = mem[pc];
                    br[1] = mem[pc + 1];
                    pc = br[0] + (0x100 * (br[1]));
                    
                    arq.Buffer1.setBackground(Color.red);
                    arq.Buffer2.setBackground(Color.red);
                    
                    arq.Buffer1.setText("Valor: "+br[0]);
                    arq.Buffer2.setText("Valor: "+br[1]);
                    
                    arq.show();
                    Thread.sleep(2000);
                    
                    arq.PC.setBackground(Color.red);
                    arq.PC.setText(""+pc);
                    arq.show();
                    Thread.sleep(2000);
                }
                break;
                
            case 0x91:
                
                mpr[0] -= mpr[2];
                arq.ALU.setBackground(Color.red);
                arq.A.setBackground(Color.red);
                arq.A.setText(""+mpr[0]);
                arq.show();
                Thread.sleep(2000);
                break;
                
            case 0x47:
                
                mpr[1] = mpr[0];
                
                arq.A.setBackground(Color.ORANGE);
                arq.show();
                Thread.sleep(2000);
                arq.B.setBackground(Color.red);
                arq.B.setText(""+mpr[1]);
                arq.show();
                Thread.sleep(2000);
                arq.A.setBackground(Color.WHITE);
                break;
            
            case 0xC3:
                
                br[0] = mem[pc];
                br[1] = mem[pc + 1];
                pc = br[0] + (0x100 * (br[1]));
                
                arq.Buffer1.setBackground(Color.red);
                arq.Buffer2.setBackground(Color.red);
                arq.Buffer1.setText("Valor: "+br[0]);
                arq.Buffer2.setText("Valor: "+br[1]);
                arq.show();
                Thread.sleep(2000);
                arq.Buffer2.setBackground(Color.white);
                arq.Buffer1.setBackground(Color.white);
                arq.Buffer1.setText("Buffer");
                arq.Buffer2.setText("Buffer");
                arq.PC.setBackground(Color.red);
                arq.PC.setText(""+pc);
                arq.show();

                break;
                
            case 0x79:
                
                mpr[0] = mpr[2];
                arq.C.setBackground(Color.ORANGE);
                arq.show();
                Thread.sleep(2000);
                arq.A.setBackground(Color.red);
                arq.A.setText(""+mpr[0]);
                arq.show();
                Thread.sleep(2000);
                arq.C.setBackground(Color.WHITE);
                
                break;
                
            case 0x90:
                
                mpr[0] -= mpr[1];
                
                arq.ALU.setBackground(Color.red);
                arq.A.setBackground(Color.red);
                arq.A.setText(""+mpr[0]);
                arq.show();
                Thread.sleep(2000);
                
                break;
                
            case 0x4F:
                
                mpr[2] = mpr[0];
                
                arq.A.setBackground(Color.ORANGE);
                arq.show();
                Thread.sleep(2000);
                arq.C.setBackground(Color.red);
                arq.C.setText(""+mpr[2]);
                arq.show();
                Thread.sleep(2000);
                arq.A.setBackground(Color.WHITE);
                
                break;
                
            case 0x32:
                br[0] = mem[pc];
                br[1] = mem[pc + 1];
                pc = br[0] + (0x100 * (br[1]));
                mem[pc] = mpr[0];
                
                arq.Buffer1.setBackground(Color.red);
                arq.Buffer2.setBackground(Color.red);
                
                arq.Buffer1.setText("Valor: "+br[0]);
                arq.Buffer2.setText("Valor: "+br[1]);
                
                arq.PC.setBackground(Color.red);
                arq.PC.setText(""+pc);
                arq.show();
                Thread.sleep(2000);
                arq.Buffer1.setBackground(Color.white);
                arq.Buffer2.setBackground(Color.white);
                
                arq.Buffer1.setText("Buffer");
                arq.Buffer2.setText("Buffer");
                
                
                arq.show();
                
                
                break;
                
        }
        
        pc++;
        //FDEprocess(pc);
                
    }
    
}
