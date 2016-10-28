package m09_uf2_activitat2_3;

import java.util.Date;
import java.util.Random;

public class Display implements Runnable{
    
    public Display() {
    }
    
    /**
     * Creamos el array con las oraciones, no me lo tomes muy en cuenta Jorge, 
     * pero estas son mas divertidas.
     */
    private final String[] oraciones = 
        {"No muerdas los cables", "Deja de meter los dedos en los enchufes", 
        "Te he dicho que dejes de lamer el suelo", "No... ese es el juguete de mamá", 
        "Si te vas a poner así, te devuelvo al orfanato"};
    /**
     * Entraremos en el run cada 5 segundo, exceptuando la primera vez.
     */
    @Override
    public void run() {
        System.out.println(oraciones[new Random().nextInt(oraciones.length)]);
    }
}
