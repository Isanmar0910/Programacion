package Tema8;

public class Ej3 {
    public static void main(String[] args) {
        int nbinario;
        int digitos;
        int decimal = 0;

        System.out.println("Introduzca un numero binario: ");
        nbinario = Integer.parseInt(System.console().readLine());

        digitos = matematicas.digitos(nbinario);

        for (int i = 0; i < digitos; i++) {
            decimal += matematicas.digitos(nbinario) * matematicas.potencia(2, i);
        }
        System.out.println(nbinario + " en binario es " + decimal + " en decimal.");

    }
}
