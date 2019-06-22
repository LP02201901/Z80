/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Arrays;

/**
 *
 * @author Sunny
 */
public class MemoryOp implements IMemory 
{
    private int[] z80Ram;
    public int address;
    
    public MemoryOp() {
        z80Ram = new int[1000];
    }
    
    public int[] readMemory() {
         return z80Ram;
    }
    
    public void resetMemory(){
        Arrays.fill( z80Ram, 0 );
    }

    @Override
    public int readByte(int address) {
         return z80Ram[address];
    }

    @Override
    public int readWord(int address) {
        return 0;
    }

    @Override
    public void writeByte(int address, int data) {
        z80Ram[address] = data;
    }

    @Override
    public void writeWord(int address, int data) {
         z80Ram[address] = data;
    }
}
