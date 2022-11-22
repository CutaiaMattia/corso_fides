package org.example;

public class Utility {
    
    public static double sum(double...is){
        double risultato = 0;
        for(int i = 0; i<is.length; i++){
            risultato += is[i];
        }
        return risultato;
        
    }
}
