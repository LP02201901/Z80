/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Sunny
 */
public class MemoryOp implements IMemory 
{
    private int[] z80Ram;
    public int address;
    
    public MemoryOp() {
        z80Ram = new int[100000];
    }
    
    public int[] readMemory() {
         return z80Ram;
    }

    @Override
    public int readByte(int address) {
         return z80Ram[address];
    }

    @Override
    public int readWord(int address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void writeByte(int address, int data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void writeWord(int address, int data) {
         z80Ram[address] = data;
    }
}
