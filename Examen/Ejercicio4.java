public class Ejercicio4 {
    public static void main(String[] args) {
        int codigo;
        Float precio;
        int unidades;
        Float descuento;
        Float total;
        Float porcentaje;
        Float iva;
        Float todo;

        System.out.println("\033[1mTANGO MODAS\033[0m");
        System.out.println("\033[1m======================\033[0m");

        System.out.print("Introduce código de artículo: ");
        codigo = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el precio: ");
        precio = Float.parseFloat(System.console().readLine());
        System.out.print("Introduce unidades vendidas: ");
        unidades = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce descuento: ");
        descuento = Float.parseFloat(System.console().readLine());
        System.out.println("\nSu ticket:");

        System.out.println("\n\033[1mTANGO MODAS\033[0m");
        System.out.println("\033[1m======================\033[0m");

        total = (float )unidades *  precio;
        porcentaje = (float) (total * (descuento/100));
        iva = (float)(total * 0.16);
        todo = (total - porcentaje) + iva;

        System.out.printf("%d\t\t%.2f€\n", codigo , precio);
        System.out.printf("%d uds.\t\t%.2f€\n", unidades , total);
        System.out.printf("-%-2.0f%%\t\t%.2f€\n", descuento, porcentaje);
        System.out.printf("16%% IVA\t\t%.2f€\n", iva);
        System.out.printf("\033[1mTOTAL\t\t%.2f€\033[0m", todo);

       


    }
    }

