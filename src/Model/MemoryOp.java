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
public class MemoryOp {
    private byte z80Ram[] = null;
    
    public MemoryOp() {
        z80Ram = new byte[0x10000];
    }
}
