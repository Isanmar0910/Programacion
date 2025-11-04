package Tema6.Ejercicio;

public class Ejercicio6 {
    public static void main(String[] args) {
        int numero;
        int oportunidad = 5;
        int adivinarlo;
        boolean acierto= false;

        System.out.println("Estoy pensando en un numero del 0 al 100, tienes 5 intentos, intenta adivinarlo");
        adivinarlo = (int)(Math.random()*100)+1;
        
        do {
                System.out.print("Introduce el numero: ");
                numero = Integer.parseInt(System.console().readLine());
                oportunidad--;

                if ((numero < adivinarlo) && (oportunidad >0)) {
                    System.out.println("El numero que estoy pernsando es mayor que " + numero + " sigue intentando");
                    System.out.println("Te quedan " + (oportunidad) + " oportunidades");
                }
                
                if ((numero > adivinarlo) && (oportunidad >0)) {
                    System.out.println("El numero que estoy pernsando es menor que " + numero + " sigue intentando");
                    System.out.println("Te quedan " + (oportunidad) + " oportunidades");
                }

                if (numero == adivinarlo) {
                    acierto = true;
                    System.out.println("Enhorabuena");
                }
           
        }while (!acierto && oportunidad >0);     
        
        if (!acierto) {
            System.out.println("No has acertado, el numero era " + adivinarlo);
        }
    }
}