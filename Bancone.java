
package mensa;

import java.util.concurrent.Semaphore;
import java.util.Random;

public class Bancone {

    
    public static void main(String[] args) {
        
        Dipendete d1 = new Dipendete("Marco");
        Dipendete d2 = new Dipendete("Mairko");
        Dipendete d3 = new Dipendete("Matteo");
        Dipendete d4 = new Dipendete("Matteo");
        Dipendete d5 = new Dipendete("Matteo");
        
                
        
        d1.start();
        d2.start();
        d3.start();
        d4.start();
        d5.start();
        
        

        try {
            
            d1.join();
            d2.join();
            d3.join();
            d4.join();
            d5.join();
            
            
                
                Cuoco.bufferPiatti--;
                Cuoco.semPieno.acquire();
                
                System.out.println("Piatto preso da: " + d1);
                System.out.println("Piatti rianenti: " + Cuoco.bufferPiatti);
                
                Thread.sleep(Random(1000 - 2000));
                
                Cuoco.semVuoto.release();
                
                Cuoco.bufferPiatti--;
                Cuoco.semVuoto.acquire();
                
                System.out.println("Piatto preso da" + d2);
                System.out.println(" Piatti rimanenti: " + Cuoco.bufferPiatti);
                
                Thread.sleep(Random(1000 - 2000));
                
                Cuoco.semVuoto.release();
                
                Cuoco.bufferPiatti--;
                Cuoco.semVuoto.acquire();
                
                System.out.println("Piatto preso da" + d3);
                System.out.println(" Piatti rimanenti: " + Cuoco.bufferPiatti);
                
                Thread.sleep(Random(1000 - 2000));
                
                Cuoco.semVuoto.release();
                
                Cuoco.bufferPiatti--;
                Cuoco.semVuoto.acquire();
                
                System.out.println("Piatto preso da" + d4);
                System.out.println(" Piatti rimanenti: " + Cuoco.bufferPiatti);
                
                Thread.sleep(Random(1000 - 2000));
                
                Cuoco.semVuoto.release();
                
                Cuoco.bufferPiatti--;
                Cuoco.semVuoto.acquire();
                
                System.out.println("Piatto preso da" + d5);
                System.out.println(" Piatti rimanenti: " + Cuoco.bufferPiatti);
                
                Thread.sleep(Random(1000 - 2000));
                
                Cuoco.semVuoto.release();
                
                System.out.println("Mensa chiusa");
            
            
            } catch (Exception e) {}
    }

    private static long Random(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
