package Tema6.Ejercicio;

public class Ejercicio13 {
    public static void main(String[] args) {
        int numero;
        int oportunidad = 5;
        int acierto= 0;

        System.out.println("Piensa un numero del 1 al 100. Intentare adivinarlo en 5 intentos.");
        System.out.println("Pulsa INTRO cuando estes listo");
        numero = (int)(Math.random()*100);

        do {
            System.out.println("Es el numero " + numero);
            System.out.print("El numero que estas pensando es 1)Mayor 2)Menor 3)El mismo : ");
            acierto = Integer.parseInt(System.console().readLine());
            oportunidad--;
            if (acierto == 1) {
                numero = (int)(Math.random()*(100 - numero +1)+numero);
                

            }else if (acierto == 2) {
                numero = (int)(Math.random()*(numero - 0 +1)+0);
                

            }
        } while (acierto != 3 && oportunidad>0);
        
        if (oportunidad == 0) {
            System.out.println("Se me acabaron los turnos, has ganado");
        }else if (acierto == 3) {
            System.out.println("Bien! He acertado");
        }
        
    }
}
