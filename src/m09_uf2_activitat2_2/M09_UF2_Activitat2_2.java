package m09_uf2_activitat2_2;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class M09_UF2_Activitat2_2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero;
        
        System.out.println("Introdueix un numero: ");
        numero = lector.nextInt();
        
        ScheduledExecutorService executor = (ScheduledExecutorService) Executors.newScheduledThreadPool(numero);
        
        
        for (int i = 2; i < 1000; i++) {
        
        Fils fils = new Fils(i);
        executor.scheduleWithFixedDelay(fils, 1, 1, TimeUnit.SECONDS);
        }
        
        /*
        if (numero > 1) {
        for (int i = numero + 1; i <= numero; i++) {
            for (int j = numero * 1000; j < (numero + 1) * 1000; j++) {
                Fils fils = new Fils(j);
                executor.scheduleWithFixedDelay(fils, 0, 0, TimeUnit.SECONDS);
            }
        }
        }*/
        
        
        
    }
    
}
