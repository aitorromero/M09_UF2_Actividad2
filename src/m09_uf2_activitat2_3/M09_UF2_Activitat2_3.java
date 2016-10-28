package m09_uf2_activitat2_3;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class M09_UF2_Activitat2_3 {

    public static void main(String[] args) throws InterruptedException {
        /**
         * Declaramos el ScheduledExecutorService.
         */
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        /**
         * Declaramos la frecuencia con la que se mostraran las frases y el 
         * primer periodo.
         */
        executor.scheduleAtFixedRate(new Display(), 0, 5, TimeUnit.SECONDS);
        // Bloqueja fins que totes les tasques es completin o passi el temps d'espera.
        /**
         * 
         */
        executor.awaitTermination(1, TimeUnit.MINUTES);
        /**
         * Llamamos a shutdown para acabar.
         */
        executor.shutdown();

    }
    
}
