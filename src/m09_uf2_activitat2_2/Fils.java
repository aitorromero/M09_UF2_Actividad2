package m09_uf2_activitat2_2;


    public class Fils implements Runnable {

        int comprovar;

        public Fils(int numero) {
            this.comprovar = numero;
        }

        public void run() {
            int contador = 2;
            boolean num = true;

            while (num && contador != comprovar) {
                if (comprovar%contador == 0) {
                    num = false;
                }
                contador++;
            }
        
            if (num) {
                System.out.println(comprovar+" es primo.");
            }   
        }

    }
