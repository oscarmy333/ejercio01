public class Segunda {

    public static void main(String [] args){
        Coche miCoche = new Coche();
        miCoche.setNumPuertas(4);
        System.out.printf("Num. de puertas: "+miCoche.getNumPuertas());
    }

    public static class Coche{
        private int numPuertas=0;
        public void setNumPuertas(int n){
            this.numPuertas=n;
        }

        public int getNumPuertas() {
            return numPuertas;
        }
    }
}


