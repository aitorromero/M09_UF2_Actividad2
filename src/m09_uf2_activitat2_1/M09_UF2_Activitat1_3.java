package m09_uf2_activitat2_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class M09_UF2_Activitat1_3 {
    /**
     * Declaramos la lista de multiplos y la llenamos.
     * 
     * A continuacion se declara la lista de futures en la que almacenaremos los
     * resultados.
     * 
     * Llamamos al servidor para que nos realice la tarea y llene la lista future.
     * 
     * Utilizamos foreach para recorrer a lista cuando esya haya finalizado 
     * finalizar el servidor.
     * 
     * Mostramos la lista de multiplos. 
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {
        List<Multiplo> listaMultiplos=new ArrayList<Multiplo>();
        
        for (int i = 2; i <= 100; i++) {
            Multiplo indice = new Multiplo(i);
            listaMultiplos.add(indice);
        }
        
        List<Future<Integer>> listaResultados = new ArrayList<>();
        
        Servidor server = new Servidor();
        for (int i = 0; i < 98; i++) {
            Future<Integer> future = server.ejecutaTarea(listaMultiplos.get(i));
            listaResultados.add(future);    
        }
        
        for(Future<Integer> result : listaResultados){
            while(!result.isDone()){
                System.out.println("Esperando..." +result);
                    Thread.sleep(500);
            }
        }
        
        server.terminaServidor();
        
        for (int i = 0; i < listaResultados.size(); i++) {
            Future<Integer> resultat = listaResultados.get(i);
            
            try {
                if(resultat.get()!=-1){
                    System.out.println("Lista de divisores: " + resultat.get());
                }
            }catch (InterruptedException | ExecutionException e) {
            
            }
        }
    }
    
}
