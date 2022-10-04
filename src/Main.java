package com.open_bootcamp;

//public class Main { // Uso de if-elseif-else
//    public static void main(String[] args) {
//        String estacion = "invierno";
//        if (estacion == "primavera") {
//            System.out.println("Es primavera");
//        } else if (estacion == "verano") {
//            System.out.println("Es verano");
//        } else {
//            System.out.println("Es otra estacion...");
//        }
//   }
//}

//public class Main { //Uso de While
//    public static void main(String[] args) {
//        int contador = 10;
//        while (contador > 0) {
//            System.out.println(contador);
//            contador = contador -1;
//            //contador--;
//        }
//    }
//}

//public class Main { //Uso de DO While
//    public static void main(String[] args) {
//        int contador = 10;
//        do {
//            System.out.println(contador);
//            contador = contador - 1;
//        } while (contador > 10);
//    }
//}

//public class Main { //Uso de for
//    public static void main(String[] args) {
//        for (int contador = 1; contador <= 10; contador++){
//            System.out.println(contador);}
//        }
//    }


//ublic class Main { //Uso de for con arrays
//    public static void main(String[] args) {
//        int valores[] = new int[5];
//        for (int i = 0; i < valores.length; i++) {
//            System.out.println(valores[i]);
//        }
//    }
//}


//public class Main { //Uso de for con arrays_v2
//    public static void main(String[] args) {
//        int valor[] = { 10, 20, 30, 40, 50};
//
//        for (int i = 0; i < valor.length; i++) {
//            System.out.println(valor[i]);
//        }
//    }
//}


//public class Main { //Uso de switch
//    public static void main(String[] args) {
//        var estacion = "VERANO";

//        switch (estacion) {
//            case "VERANO":
//                System.out.println("Es Verano");
//                break;
//            case "INVIERNO":
//                System.out.println("Es Invierno");
//                break;
//            default:
//                System.out.println("Estoy en default");
//        }
//    }
//}


public class Main { //Uso de switch_v2
    public static void main(String[] args) {
        var hoy_es = "SABADO";

        switch(hoy_es) {
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                System.out.println("Hoy es dia laboral");
                break;
            default:
                System.out.println("Hoy no se trabaja");
        }
    }
}