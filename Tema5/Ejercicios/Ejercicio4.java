package Tema5.Ejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {
        final int N=1452;
        int clave;
        int oportunidades = 4;

        do {
            System.out.print("Introduce el numero de la caja fuerte: ");
            clave = Integer.parseInt(System.console().readLine());

            oportunidades--;

            if (clave != N) {
                System.out.println("Clave Incorrecta");
            }
            
        } while (clave != N && oportunidades > 0);

        if (clave == N) {
            System.out.println("\033[31m\033[1mSe ha abierto la caja fuerte\033[0m");
        }else if (oportunidades == 0) {
            System.out.println("Se ha emitido un aviso a la policia");

        } 
        
    }
}
