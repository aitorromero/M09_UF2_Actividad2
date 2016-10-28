package m09_uf2_activitat2_2;


    public class Fils implements Runnable {

        int numComprovar;

        public Fils(int numero) {
            this.numComprovar = numero;
        }

        public void run() {
            int contador = 2;
            boolean primo = true;

            while ((primo) && (contador != numComprovar)) {
                if (numComprovar % contador == 0) {
                    primo = false;
                }
                contador++;
            }
        
            if (primo) {
                System.out.println(numComprovar + " es un numero primo." + Thread.currentThread().getId());
            }   
        }

    }
