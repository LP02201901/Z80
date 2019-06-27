/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instructions;

import View.Arquitectura;
import View.Pastilla;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pacho
 */
public class Intructions {

    private Intructions(int[] mem, int[] br, int ir, int[] mpr, int pc, int ALU, boolean[] flags) {

        this.mem = mem;
        this.br = br;
        this.ir = ir;
        this.mpr = mpr;
        this.pc = pc;
        this.ALU = ALU;
        this.flags = flags;

    }

    public Intructions(int[] memoria) {

        pc = 0;
        br = new int[2];
        br[0] = 0;
        br[1] = 0;
        mpr = new int[20];
        mem = new int[1000];
        //mem = memoria;
        for (int i = 0; i < memoria.length; i++) {
            mem[i] = memoria[i];
        }
        //System.out.println(mem[3]);
        //for(int i = 0; i < mem.length;i++){
        // System.out.println(mem[i]);
        //}

        for (int i = 0; i < mem.length; i++) {

            mem[i] = 1;

        }
        for (int i = 0; i < mpr.length; i++) {

            mpr[i] = 0;

        }

        //mem[0]=0x32;
        arq = new Arquitectura();
        pas = new Pastilla();
    }

    Arquitectura arq;
    Pastilla pas;
    public int mem[];
    int br[];
    int ir;
    int mpr[];
    public int pc;
    int ALU;
    boolean flags[];

    public int FDEprocess(int pos) {

        ir = mem[pos];

        switch (ir) {

            case 0x06:                  //LD B, *
                System.out.println("case 0x06:");

                pc++;
                br[0] = mem[pc];
                mpr[1] = br[0];

                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);

                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, true, false);
                arq.Buffer1.setText("Valor: " + mem[pc]);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");

                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.Buffer1.setText("Buffer");
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.B.setBackground(Color.red);
                arq.B.setText("" + mpr[1]);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");

                break;

            case 0x0E:                  //LD C, *
                System.out.println("case 0x0E:");

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
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, true, false);
                arq.Buffer1.setText("Valor: " + mem[pc]);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");

                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.Buffer1.setText("Buffer");
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.C.setBackground(Color.BLUE);
                arq.C.setText("" + mpr[2]);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");

                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                
                break;

            case 0x78:                  //LD A, B
                System.out.println("case 0x78:");

                mpr[0] = mpr[1];

                arq.B.setBackground(Color.ORANGE);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                arq.A.setText("" + mpr[0]);
                arq.A.setBackground(Color.BLUE);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                arq.B.setBackground(Color.white);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");

                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                
                break;

            case 0xB9:                  //CP C
                System.out.println("case 0xB9:");

                arq.ALU.setBackground(Color.ORANGE);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                arq.ALU.setBackground(Color.WHITE);

                if (mpr[0] - mpr[2] == 0) {

                    arq.F7.setBackground(Color.BLUE);
                    arq.F7.setText("1");
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else {

                    arq.F7.setBackground(Color.BLUE);
                    arq.F7.setText("0");
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                }

                if (mpr[0] - mpr[2] < 0) {

                    arq.F8.setBackground(Color.BLUE);
                    arq.F8.setText("1");
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else {

                    arq.F8.setBackground(Color.BLUE);
                    arq.F8.setText("0");
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                }

                if (mpr[2] %2 == 0) {

                    arq.F3.setBackground(Color.BLUE);
                    arq.F3.setText("1");
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else {

                    arq.F3.setBackground(Color.BLUE);
                    arq.F3.setText("0");
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                }
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0xCA:                  //JP Z, **
                System.out.println("case 0xCA:");

                //if(arq.F7.getText().equals("1")){
                if (arq.F7.getText().equals("1")) {

                    pc++;
                    br[0] = mem[pc];
                    pc++;
                    br[1] = mem[pc];
                    pc = br[0] + (0x100 * (br[1])); //Pasar lo que esta en mem[pc] a hex                    

                    arq.Buffer1.setBackground(Color.BLUE);
                    arq.Buffer2.setBackground(Color.BLUE);
                    arq.Buffer1.setText("Valor: " + br[0]);
                    arq.Buffer2.setText("Valor: " + br[1]);
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    arq.PC.setBackground(Color.BLUE);
                    arq.PC.setText("" + pc);
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else {

                    pc+=2;

                }
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0xFA:                  //JP M, **
                System.out.println("case 0xFA:");

                if (arq.F8.getText().equals("1")) {
                    
                    pc++;
                    br[0] = mem[pc];
                    pc++;
                    br[1] = mem[pc];
                    pc = br[0] + (0x100 * (br[1])); //Pasar lo que esta en mem[pc] a hex
                    

                    arq.Buffer1.setBackground(Color.BLUE);
                    arq.Buffer2.setBackground(Color.BLUE);
                    arq.Buffer1.setText("Valor: " + br[0]);
                    arq.Buffer2.setText("Valor: " + br[1]);
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    arq.PC.setBackground(Color.BLUE);
                    arq.PC.setText("" + pc);
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else {

                    pc += 2;

                }
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0x91:                  //SUB C
                System.out.println("case 0x91:");

                mpr[0] -= mpr[2];

                arq.ALU.setBackground(Color.BLUE);
                arq.A.setBackground(Color.BLUE);
                arq.A.setText("" + mpr[0]);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                arq.ALU.setBackground(Color.WHITE);
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0x47:                  //LD B, A
                System.out.println("case 0x47:");

                mpr[1] = mpr[0];

                arq.A.setBackground(Color.ORANGE);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                arq.B.setBackground(Color.BLUE);
                arq.B.setText("" + mpr[1]);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                arq.A.setBackground(Color.WHITE);
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0xC3:                  //JP **
                System.out.println("case 0xC3:");

                pc++;
                br[0] = mem[pc];
                pc++;
                br[1] = mem[pc];
                pc = br[0] + (0x100 * (br[1])); //Pasar lo que esta en mem[pc] a hex
                
                arq.Buffer1.setBackground(Color.BLUE);
                arq.Buffer2.setBackground(Color.BLUE);
                arq.Buffer1.setText("Valor: " + br[0]);
                arq.Buffer2.setText("Valor: " + br[1]);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                arq.Buffer2.setBackground(Color.white);
                arq.Buffer1.setBackground(Color.white);
                arq.Buffer1.setText("Buffer");
                arq.Buffer2.setText("Buffer");
                arq.PC.setBackground(Color.BLUE);
                arq.PC.setText("" + pc);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0x79:                  //LD A, C
                System.out.println("case 0x79:");

                mpr[0] = mpr[2];

                arq.C.setBackground(Color.ORANGE);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                arq.A.setBackground(Color.BLUE);
                arq.A.setText("" + mpr[0]);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                arq.C.setBackground(Color.WHITE);
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0x90:                  //SUB B
                System.out.println("case 0x90:");

                mpr[0] -= mpr[1];

                arq.ALU.setBackground(Color.BLUE);
                arq.A.setBackground(Color.BLUE);
                arq.A.setText("" + mpr[0]);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                arq.ALU.setBackground(Color.WHITE);
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0x4F:                  //LD C, A
                System.out.println("case 0x4F:");

                mpr[2] = mpr[0];

                arq.A.setBackground(Color.ORANGE);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                arq.C.setBackground(Color.BLUE);
                arq.C.setText("" + mpr[2]);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                arq.A.setBackground(Color.WHITE);
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0x32:                  //LD (**), A
                System.out.println("case 0x32:");

                pc++;
                br[0] = mem[pc];
                pc++;
                br[1] = mem[pc];
                pc = br[0] + (0x100 * (br[1])); //Pasar lo que esta en mem[pc] a hex
                mem[pc] = mpr[0];

                System.out.println(mem[pc]);

                arq.Buffer1.setBackground(Color.BLUE);
                arq.Buffer2.setBackground(Color.BLUE);
                arq.Buffer1.setText("Valor: " + br[0]);
                arq.Buffer2.setText("Valor: " + br[1]);
                arq.PC.setBackground(Color.BLUE);
                arq.PC.setText("" + pc);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                arq.Buffer1.setBackground(Color.white);
                arq.Buffer2.setBackground(Color.white);
                arq.Buffer1.setText("Buffer");
                arq.Buffer2.setText("Buffer");
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");

                //pas.A0.setBackground(Color.red);
                //pas.show();
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0x3A:                  //LD A, (**)
                System.out.println("case 0x3A:");

                pc++;
                br[0] = mem[pc];
                br[1] = mem[pc + 1];
                pc = br[0] + (0x100 * (br[1]));
                mpr[0] = mem[pc];
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0xFE:                  //CP *
                System.out.println("case 0xFE:");

                pc++;

                arq.ALU.setBackground(Color.ORANGE);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.ALU.setBackground(Color.WHITE);

                if (mpr[0] - mem[pc] == 0) {

                    arq.F7.setBackground(Color.BLUE);
                    arq.F7.setText("1");
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else {

                    arq.F7.setBackground(Color.BLUE);
                    arq.F7.setText("0");
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                }

                if (mpr[0] - mem[pc] < 0) {

                    arq.F8.setBackground(Color.BLUE);
                    arq.F8.setText("1");
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else {

                    arq.F8.setBackground(Color.BLUE);
                    arq.F8.setText("0");
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                }

                if (mpr[0] % 2 == 0) {

                    arq.F3.setBackground(Color.BLUE);
                    arq.F3.setText("1");
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else {

                    arq.F3.setBackground(Color.BLUE);
                    arq.F3.setText("0");
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                }
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0x28:                  //JR Z, *
                System.out.println("case 0x28:");

                if (arq.F7.getText().equals("1")) {

                    pc++;
                    br[0] = mem[pc];
                    br[1] = mem[pc + 1];
                    pc += br[0] + (0x100 * (br[1]));

                    arq.Buffer1.setBackground(Color.BLUE);
                    arq.Buffer2.setBackground(Color.BLUE);
                    arq.Buffer1.setText("Valor: " + br[0]);
                    arq.Buffer2.setText("Valor: " + br[1]);
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    arq.PC.setBackground(Color.BLUE);
                    arq.PC.setText("" + pc);
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else {

                    pc += 3;

                }
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0xB8:                  //CP B
                System.out.println("case 0xB8:");

                arq.ALU.setBackground(Color.ORANGE);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                arq.ALU.setBackground(Color.WHITE);

                if (mpr[0] - mpr[1] == 0) {

                    arq.F7.setBackground(Color.BLUE);
                    arq.F7.setText("1");
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else {

                    arq.F7.setBackground(Color.BLUE);
                    arq.F7.setText("0");
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                }

                if (mpr[0] - mpr[1] < 0) {

                    arq.F8.setBackground(Color.BLUE);
                    arq.F8.setText("1");
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else {

                    arq.F8.setBackground(Color.BLUE);
                    arq.F8.setText("0");
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                }

                if (mpr[1] % 2 == 0) {

                    arq.F3.setBackground(Color.BLUE);
                    arq.F3.setText("1");
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else {

                    arq.F3.setBackground(Color.BLUE);
                    arq.F3.setText("0");
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                }
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0xF2:                  //JP P, **
                System.out.println("case 0xF2:");

                if (arq.F3.getText().equals("1")) {

                    pc++;
                    br[0] = mem[pc];
                    br[1] = mem[pc + 1];
                    pc += br[0] + (0x100 * (br[1]));

                    arq.Buffer1.setBackground(Color.BLUE);
                    arq.Buffer2.setBackground(Color.BLUE);
                    arq.Buffer1.setText("Valor: " + br[0]);
                    arq.Buffer2.setText("Valor: " + br[1]);
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    arq.PC.setBackground(Color.BLUE);
                    arq.PC.setText("" + pc);
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else {
                    pc += 3;
                }
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;
            case 0x3E:                  //LD A, *
                System.out.println("case 0x3E:");

                pc++;
                br[0] = mem[pc];
                mpr[1] = br[0];

                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;
//////////////////////////////////////////////////////////////////////////////
            case 0x80:                  //ADD A, B
                System.out.println("case 0x80:");

                mpr[0] += mpr[1];

                arq.B.setBackground(Color.red);
                arq.B.setText("" + mpr[1]);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.B.setBackground(Color.white);
                arq.A.setText("" + mpr[0]);
                arq.A.setBackground(Color.red);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0x0D:                  //DEC C
                System.out.println("case 0x0D:");

                mpr[2]--;
                arq.C.setBackground(Color.red);
                arq.C.setText("" + mpr[2]);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0x20:                  //JR NZ, *
                System.out.println("case 0x20:");

                if (arq.F7.getText().equals("0")) {

                    pc++;
                    br[0] = mem[pc];
                    br[1] = mem[pc + 1];
                    pc += br[0] + (0x100 * (br[1]));

                    arq.Buffer1.setBackground(Color.BLUE);
                    arq.Buffer2.setBackground(Color.BLUE);
                    arq.Buffer1.setText("Valor: " + br[0]);
                    arq.Buffer2.setText("Valor: " + br[1]);
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    arq.PC.setBackground(Color.BLUE);
                    arq.PC.setText("" + pc);
                    arq.show();
                    JOptionPane.showMessageDialog(arq, "Ejecutando");
                    {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else {

                    pc += 3;

                }
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0x81:                  //ADD A, C
                System.out.println("case 0x81:");

                mpr[0] += mpr[2];
                arq.C.setBackground(Color.red);
                arq.C.setText("" + mpr[2]);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.C.setBackground(Color.white);
                arq.A.setText("" + mpr[0]);
                arq.A.setBackground(Color.red);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0x05:                  //DEC B
                System.out.println("case 0x05:");
                arq.B.setBackground(Color.red);
                arq.B.setText("" + mpr[1]);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                mpr[1]--;
                arq.B.setBackground(Color.red);
                arq.B.setText("" + mpr[1]);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.B.setBackground(Color.white);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

            case 0x18:                  //JR *
                System.out.println("case 0x18:");

                pc++;
                br[0] = mem[pc];
                br[1] = mem[pc + 1];
                pc += br[0] + (0x100 * (br[1]));

                arq.Buffer1.setBackground(Color.red);
                arq.Buffer2.setBackground(Color.red);
                arq.Buffer1.setText("Valor: " + br[0]);
                arq.Buffer2.setText("Valor: " + br[1]);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Buffer1.setBackground(Color.white);
                arq.Buffer2.setBackground(Color.white);
                arq.PC.setBackground(Color.red);
                arq.Buffer1.setText("Buffer 1");
                arq.Buffer2.setText("Buffer 2");
                arq.PC.setText("" + pc);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                 {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Intructions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");

                break;

            case 0x76:                  //HALT
                System.out.println("case 0x76:");

                //Restaurar valores inciales de la interfaz
                arq.Control(false, false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false, false);
                arq.show();
                JOptionPane.showMessageDialog(arq, "Ejecutando");
                break;

        }

        pc++;

        //Recursión tomando como punto de partida pc
        if (ir != 0x76) {

            //FDEprocess(pc);
        }
        return pc;

    }

    private void Enter() {
        try {
            Robot robot = new Robot();
            
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void Ejecutar(int[] mem2) {
        
        mem = mem2;
        int fde = 0;
        System.out.println(mem[0]);
        fde = FDEprocess(0);
        System.out.println(fde);

        while (mem[fde] != 0x76) {
            fde = FDEprocess(fde);
            //System.out.println(fde);                

        }
        JOptionPane.showMessageDialog(arq, "Registro A: " + mpr[0]);

        //System.out.println(mem[201]);
        System.out.println("Memoria Despues");
        for (int i = 0; i < mem2.length; i++) {
            System.out.println(i + " - " + Integer.toHexString(mem[i]));
        }

    }

}
