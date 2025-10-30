package Tema4.RElacionesEjercicios;

public class Ejejercicio3 {
    public static void main(String[] args) {
        int horas;

        System.out.print("Introduzca el numero de horas trabajadas durante la semana: ");
        horas = Integer.parseInt(System.console().readLine());

       if (horas >= 0 && horas <= 40) {
        System.out.println("El sueldo semanal que le corresponde es " + (horas * 12) + " euros");
       }else if (horas >= 41) {
        System.out.println("El sueldo semanal que le corresponde es " + (horas * 16) + " euros");
       }else {
        System.out.println("Una noche entera");
       }
    }
}
