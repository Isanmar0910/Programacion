package Tema4.RElacionesEjercicios;

public class Ejercicio12 {
    public static void main(String[] args) {
        int numero;
        String parImpar;
        String divisible;

        System.out.print("Introduce un numero: ");
        numero = Integer.parseInt(System.console().readLine());

        parImpar =(numero%2==0)?"par":"impar";  
        divisible =(numero%5==0)?"divisible":"indivisible";
        
        System.out.println("");
}
}