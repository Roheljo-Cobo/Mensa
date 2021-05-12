
package mensa;

import java.util.concurrent.Semaphore;

public class Cuoco extends Thread{
    
    protected static Semaphore semVuoto = new Semaphore(1);
    protected static Semaphore semPieno = new Semaphore(0);
    
    protected static int bufferPiatti = 5;
    
    public void bufferIncrementa(){
        
        bufferPiatti++;
    }
    
    
    public void bufferDecrementa(){
        
        bufferPiatti--;
    }
    
}
