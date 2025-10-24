package Tema4.RElacionesEjercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        int hora;

        System.out.print("Introduce una hora del dia (0-23): ");
        hora = Integer.parseInt(System.console().readLine());
        
        switch (hora) {
            case 0,1,2,3,4,5,20,21,22,23:
                System.out.println("Buenas Noches");
                break;
            case 6,7,8,9,10,11:
                System.out.println("Buenos Dias");
                break;
            case 12,13,14,15,16,17,18,19:
                System.out.println("Buenas tardes");
                break;
            default:
                System.out.println("La hora introducida no es correcta");
                break;
        }
    }
}
