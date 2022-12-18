package com.open_bootcamp;

public class Main {

    public static void main(String[], args) {

        var numeroif;

        if (numeroif > 0) {
            println("Es positivo");
        } else if (numeroif < 0) {
            println("Es Negativo");
        } else {
            println("Es 0");
        }
    }
}



public class Main {

    public static void main(String[], args) {

        while (numeroWhile < 3) {
            numeroWhile += 1;
            print(numeroWhile);
        }
    }
}



public class Main {

    public static void main(String[], args) {

        int i = 0;

        do {
            System.out.println(i);
            i++;
        } while (i < 0);

        for (let numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);    
        }
    }
}



public class Main {

    public static void main(String[], args) {

        var estacion = "VERANO";

        switch (key) {
            case estacion = "PRIMAVERA":
                System.out.println(estacion);
                break;
            case estacion = "VERANO":
                System.out.println(estacion);
                break;
            case estacion = "OTOÑO":
                System.out.println(estacion);
                break;
            case estacion = "INVIERNO":
                System.out.println(estacion);
                break; 

            default:
                System.out.println("No es una estacion del año.");
                break;
        }
    }
}