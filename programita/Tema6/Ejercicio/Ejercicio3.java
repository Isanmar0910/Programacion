package Tema6.Ejercicio;

public class Ejercicio3 {
    public static void main(String[] args) {
        String numero = "";
        String palo;

        int numeroCarta = (int)(Math.random()*13) +1;
        int numeroPalo = (int)(Math.random()*4)+1;

        switch (numeroCarta) {
            case 10:
                numero = "sota";
                break;
            case 11:
                numero = "caballo";
                break;
            case 12:
                numero = "rey";
                break;
            case 1:
                numero = "as";
                break;
            default:
                numero = String.valueOf(numeroCarta);
            break;
        }

        switch (numeroPalo) {
            case 1:
                palo = "copas";
                break;
            case 2:
                palo = "bastos";
                break;
            case 3:
                palo = "espadas";
                break;
            case 4:
                palo = "oros";
            break;
            default:
                palo = String.valueOf(numeroPalo);
                break;
        }

        System.out.println(numero + " de " + palo);
    }
}
