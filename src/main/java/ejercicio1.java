public class ejercicio1 {


    public static void main(String[]args){
        suma(10, 20,5);
        Coche micoche= new Coche();
        micoche.sumarPuerta();
    }
    public static void suma(int a, int b, int c){
        System.out.println(a+b+c);
    }
}


    class Coche{
        public int puertas=0;

        public void sumarPuerta(){
            this.puertas++;
        }
    }

