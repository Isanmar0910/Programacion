package Tema8;

import java.util.Scanner;

public class Matematicas {
    public static void main(String[] args) {
        int numero;
        int temporal;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();

        temporal = numero; 

        if (esCapicua(numero) == true) {
            System.out.println("El numero " + numero + " es Capicua");
        } else {
            System.out.println("El numero " + numero + " no es Capicua");
        }

        if (esPrimo(numero) == true) {
            System.out.println("El numero " + numero + " es primo");
        } else {
            System.out.println("El numero " + numero + " no es primo");
        }

        System.out.println("El siguiente numero primo mayor a  " +  temporal +  " es " + siguientePrimo(numero) );

    }



    public static boolean esCapicua(int numero) {
        int original = 0;
        int volteado = 0;

        original = numero;

        while (numero > 0) {
            volteado = volteado * 10 + (numero % 10);
            numero /= 10;
        }

        return original == volteado;

    }

    public static boolean esPrimo (int numero) {
       
        if (numero <2) {
            return false;
        }else {
            for (int i = numero/2; i >=2 ; i--){
                if (numero % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int siguientePrimo (int numero) {
        numero++;

        while (!esPrimo(numero)) {
            numero++;
        }
        return numero;
    }
}
