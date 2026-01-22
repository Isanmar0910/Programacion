package Tema6.Ejercicios;

import java.util.Scanner;


public class Ejercicio27 {

    public static void main(String[] args) {
        String[][] tablero = {
            {" ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " "},};

        int x, y;
        int tesoroX = 0, tesoroY = 0;
        int minaX = 0, minaY = 0;

        boolean victoria = false;

        Scanner sc = new Scanner(System.in);

        dibujarTablero(tablero);

        try {

            // Posiciones aleatorias
            tesoroX = (int) (Math.random() * 5);
            tesoroY = (int) (Math.random() * 4);

            do {
                minaX = (int) (Math.random() * 5);
                minaY = (int) (Math.random() * 4);
            } while (minaX == tesoroX && minaY == tesoroY);

           do {
            System.out.print("Coordenada x: ");
                x = sc.nextInt();

                System.out.print("Coordenada y: ");
                y = sc.nextInt();

                if (x == tesoroX && y == tesoroY) {
                    tablero[y][x] = "€";
                    dibujarTablero(tablero);
                    System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
                    victoria = true;
                    
                } else if (x == minaX && y == minaY) {
                    tablero[y][x] = "*";
                    dibujarTablero(tablero);
                    throw new Exception();
                } else {
                    tablero[y][x] = "X";
                    dibujarTablero(tablero);
                }
            
           } while (victoria == false);
                

        } catch (Exception e) {
            System.out.println("¡BOOOM! Lo siento, has perdido.");
        }

       
        tablero[tesoroY][tesoroX] = "€";
        tablero[minaY][minaX] = "*";
        System.out.println("Tablero final:");
        dibujarTablero(tablero);

        
    }

    public static void dibujarTablero(String[][] tablero) {
        for (int fila = 3; fila >= 0; fila--) {
            System.out.print(fila + "| ");
            for (int col = 0; col < 5; col++) {
                System.out.print(tablero[fila][col] + " ");
            }
            System.out.println();
        }
        System.out.println("  ---------");
        System.out.println("  0 1 2 3 4");
    }
}
