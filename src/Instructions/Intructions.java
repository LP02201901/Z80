/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instructions;

/**
 *
 * @author Pacho
 */
public class Intructions {
    
    int mem[];
    int br[];
    int ir;
    int mpr[];
    int pc;
    int ALU;
    boolean flags[];
    
    @SuppressWarnings("InfiniteRecursion")
    void FDEprocess(int ins){
        
        ir =  mem[ins];
        pc ++;
        
        switch(ir){
            
            case 0x06:
                
                br[0] = mem[pc];
                mpr[1] = br[0];
                
                break;
                
            case 0x0E:
                
                br[0] = mem[pc];
                mpr[2] = br[0];
                
                break;
                
            case 0x78:
                
                mpr[0] = mpr[1];
                
                break;
                
            case 0xB9:
                
                if(mpr[0] - mpr[2] < 0){
                    
                    // flags
                    
                }
                
                break;
                
            case 0xCA:
                
                if(flags[0] == true){
                    
                    br[0] = mem[pc];
                    br[1] = mem[pc + 1];
                    pc = br[0] + (0x100 * (br[1]));
                    
                }
                
                break;
                
            case 0xFA:
                
                if(flags[1] == true){
                    
                    br[0] = mem[pc];
                    br[1] = mem[pc + 1];
                    pc = br[0] + (0x100 * (br[1]));
                    
                }
                
                break;
                
            case 0x91:
                
                mpr[0] -= mpr[2];
                
                break;
                
            case 0x47:
                
                mpr[1] = mpr[0];
                
                break;
            
            case 0xC3:
                
                br[0] = mem[pc];
                br[1] = mem[pc + 1];
                pc = br[0] + (0x100 * (br[1]));
                
                break;
                
            case 0x79:
                
                mpr[0] = mpr[2];
                
                break;
                
            case 0x90:
                
                mpr[0] -= mpr[1];
                
                break;
                
            case 0x4F:
                
                mpr[2] = mpr[0];
                
                break;
                
        }
        
        pc++;
        FDEprocess(pc);
                
    }
    
}
