/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author elmar
 */
public interface IMemory {
    public int readByte(int address);
    public int readWord(int address);
    public void writeByte(int address, int data);
    public void writeWord(int address, int data);
}
