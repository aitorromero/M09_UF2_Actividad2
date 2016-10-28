package m09_uf2_activitat2_1;

import java.util.concurrent.Callable;

public class Multiplo implements Callable<Integer>{
    
    private int num;
    private int noDivisor=-1;

    /**
     * Declarem el constructor Multiplo amb un int.
     * @param num 
     */
    public Multiplo(int num) {
        this.num = num;
        
    }
    
    /**
     * Comprobamos que el numero sea multiplo de 2 y 3 para mostrarlo por pantalla
     * o guarda -1 en su defecto.
     * @return
     * @throws Exception 
     */
    public Integer call() throws Exception {
        
        if (num%2==0 && num%3==0){
            return num;
        }else{
            return noDivisor;
        }
        
    }
}
