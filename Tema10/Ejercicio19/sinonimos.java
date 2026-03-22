package Tema10.Ejercicio19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sinonimos {

    public static void main(String[] args) {

        HashMap<String, String> sinonimo = new HashMap<>();

        String palabra;
        String encontradoValor;
        String encontradoLlave;
        String añadir; 
        Scanner sc = new Scanner(System.in);

        sinonimo.put("caliente", "hot");
        sinonimo.put("rojo", "red");
        sinonimo.put("ardiente", "hot");
        sinonimo.put("verde", "green");
        sinonimo.put("agujetas", "stiff");
        sinonimo.put("abrasador", "hot");
        sinonimo.put("hierro", "iron");
        sinonimo.put("grande", "big");

        while (true) {
            System.out.print("Introduce una palabra y le dare los Sinonimos: ");
            palabra = sc.nextLine();

            encontradoValor = null;
            encontradoLlave = null;

            for (Map.Entry<String, String> sin : sinonimo.entrySet()) {
                if (palabra.equalsIgnoreCase(sin.getKey())) {
                    encontradoValor = sin.getValue();
                    encontradoLlave = sin.getKey();
                }
            }

            if (encontradoValor != null) {
                System.out.println("Sinonimos de " + encontradoLlave + ":");
                for (Map.Entry<String, String> sin : sinonimo.entrySet()) {
                    if (sin.getValue().equalsIgnoreCase(encontradoValor) && !sin.getKey().equalsIgnoreCase(encontradoLlave)) {
                        System.out.print(sin.getKey() + " ");
                    }
                }
                System.out.println();
            } else {
                System.out.println("Palabra no encontrada. Quiere añadir alguno (s/n)");
                añadir = sc.next();

            }
        }
    }
}
