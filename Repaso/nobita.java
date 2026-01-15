package repaso;

import java.util.Scanner;


public class nobita {
    public static void main(String[] args) {
        String papel = "papel";
        String piedra = "piedra";
        String tijera = "tijera";

        String opcionJugador;
        String turnoOrdernador;

        int opcionOrdenador;

        

        Scanner sc = new Scanner(System.in);
        
        System.out.print("turno del jugador (introduzca piedra, papel o tijera): ");
        opcionJugador = sc.nextLine();

       if (opcionJugador.equals(papel) || opcionJugador.equals(piedra) || opcionJugador.equals(tijera)) {
            opcionOrdenador = (int)(Math.random()*3)+1;

            switch (opcionOrdenador) {
                case 1:
                    turnoOrdernador = papel;
                    break;
                case 2:
                    turnoOrdernador = piedra;
                    break;
                case 3:
                    turnoOrdernador = tijera;
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("Turno del ordenador: " + turnoOrdernador);

            if (opcionJugador.equals(turnoOrdernador)) {
                System.out.println("Empate");
            }else if (opcionJugador.equals(papel) && turnoOrdernador.equals(tijera)) {
                System.out.println("Gana Ordenador");
            }else if (opcionJugador.equals(papel) && turnoOrdernador.equals(piedra)) {
                System.out.println("Gana Jugador");
            }else if (opcionJugador.equals(piedra) && turnoOrdernador.equals(tijera)) {
                System.out.println("Gana Jugador");
            }else if (opcionJugador.equals(piedra) && turnoOrdernador.equals(papel)) {
                System.out.println("Gana Ordenador");
            }else if (opcionJugador.equals(tijera) && turnoOrdernador.equals(papel)) {
                System.out.println("Gana Jugador");
            }else if (opcionJugador.equals(tijera) && turnoOrdernador.equals(piedra)) {
                System.out.println("Gana Ordenador");
            }
            
       }else {
        System.out.println("Que tu dise");
       }


    }
}
