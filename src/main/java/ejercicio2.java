public class ejercicio2 {



    public static void main(String[]args){
     int numeroIf=-4;
     int numeroWhile=1;
     int numeroFor=0;
     String estacion="verano";

     if(numeroIf >0){
         System.out.println("mumeroIf es positivo");
     } else if (numeroIf==0) {
         System.out.println("numeroIf es 0");
     } else {
         System.out.println("numeroIf es negativo");
     }
        while(numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        }while (numeroWhile < 2);

        for (; numeroFor <= 3; numeroFor ++){
            System.out.println(numeroFor);
        }

        switch (estacion){
            case"verano":
            case"invierno":
            case"primavera":
            case"otoño":
                System.out.println("es una estacion del año");
                break;
            default:
                System.out.println("no es una estacion del año");
                break;
        }

    }
}
