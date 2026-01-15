package repaso;

import java.util.Scanner;

public class gamblin {

    public static void main(String[] args) throws InterruptedException {
        int dado1;
        int dado2;
        int apuesta;
        int suma;
        int tirada;

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuanto dinero quieres apostar? ");
        apuesta = sc.nextInt();
        sc.nextLine();

        retraso();

        dado1 = (int) (Math.random() * 6) + 1;
        dado2 = (int) (Math.random() * 6) + 1;

        System.out.print("Dado 1: " + dado1 + "\n");
        retraso();
        System.out.print("Dado 2: " + dado2 + "\n");
        retraso();

        suma = dado1 + dado2;

        System.out.print("Suma: " + suma + "\n");
        tirada = suma;
        retraso();

        if (suma != 7 && suma != 11) {
            System.out.println("Tiene que seguir tirando , debe conseguir el " + tirada + " para ganar. \nSi obtiene un 7 perdera la partida");
            retraso();
            do {
                System.out.println("Pulse INTRO para tirar los dados");
                sc.nextLine();

                dado1 = (int) (Math.random() * 6) + 1;
                dado2 = (int) (Math.random() * 6) + 1;

                System.out.print("Dado 1: " + dado1 + "\n");
                retraso();
                System.out.print("Dado 2: " + dado2 + "\n");
                retraso();

                suma = dado1 + dado2;

                System.out.print("Suma: " + suma + "\n");
                retraso();

                if (suma != tirada && suma != 7) {
                    System.out.println("Continúe jugando.");

                }

            } while (suma != tirada && suma != 7);

            if (suma == tirada) {
                System.out.println("Enhorabuena!! Ha ganado otros " + apuesta + " €!!\nAhora tiene " + (apuesta*2) + " €!");
            }else if (suma == 7) {
                System.out.println("Has perdido");
            }
        }
        
        if (suma == 7 || suma == 11) {
            
        }

    }

    public static void retraso() throws InterruptedException {
        Thread.sleep(1000);
    }
}
