package m09_uf2_activitat2_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Servidor {
    
    private final ExecutorService executor;
    
    /**
    * Declarem l'executor que ens permetrà realitzar tres tasques 
    * simultaneament.
    */
    public Servidor() {  
 
        executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);

    }
    /**
    * Executa la multiplicació i retorna el resultat per a emmagatzemarlo
    * en el nostre ArrayList Future.
    * @param multiplo
    * @return 
    */
    public Future<Integer> ejecutaTarea(Multiplo multiplo) {  
            Future <Integer> future = executor.submit(multiplo);// Ejecuta una tarea 
            
            return future;
    } 
    
    /**
    * Feta la tasca, fem shutdown a l'executor.
    */
    public void terminaServidor () {  
        executor.shutdown();// Este metodo termina el executor  
    }
}
