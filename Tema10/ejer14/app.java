package Tema10.ejer14;

import java.util.HashMap;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        HashMap<String, Float> productos = new HashMap<>();
        HashMap<String, Integer> carrito = new HashMap<>();

        productos.put("avena", 2.21f);
        productos.put("garbanzos", 2.39f);
        productos.put("tomate", 1.59f);
        productos.put("jengibre", 3.13f);
        productos.put("quinoa", 4.50f);
        productos.put("guisantes", 1.60f);

        Scanner sc = new Scanner(System.in);

        String respuesta = "";

        while (!respuesta.equalsIgnoreCase("fin")) {

            System.out.print("Producto: ");
            respuesta = sc.nextLine();

            if (!respuesta.equalsIgnoreCase("fin")) {

                if (!productos.containsKey(respuesta)) {
                    System.out.println("Ese producto no existe");
                } else {

                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();

                    if (carrito.containsKey(respuesta)) {
                        carrito.put(
                                respuesta,
                                carrito.get(respuesta) + cantidad
                        );
                    } else {
                        carrito.put(respuesta, cantidad);
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Producto\tPrecio\tCantidad\tSubtotal");

        float total = 0;

        for (String producto : carrito.keySet()) {

            float precio = productos.get(producto);
            int cantidad = carrito.get(producto);
            float subtotal = precio * cantidad;

            total += subtotal;

            System.out.println(
                    producto + "\t\t" +
                    precio + "\t" +
                    cantidad + "\t\t" +
                    subtotal
            );
        }

        System.out.println();
        System.out.println("TOTAL: " + total + " euros");
    }
}