package Tema4.RElacionesEjercicios;

public class Ejercicio9 {
    public static void main(String[] args) {
        int mes;
        int dia;

        System.out.println("Este Programa calcula tu horóscopo");
        System.out.print("Introduce en qué mes naciste: ");
        mes = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce en qué día naciste: ");
        dia = Integer.parseInt(System.console().readLine());

        if (mes == 1) {
            if (dia >= 1 && dia <= 20) {
                System.out.println("Eres Capricornio");
            } else if (dia >= 21 && dia <= 31) {
                System.out.println("Eres Acuario");
            } else {
                System.out.println("Día inválido");
            }
        } else if (mes == 2) {
            if (dia >= 1 && dia <= 19) {
                System.out.println("Eres Acuario");
            } else if (dia >= 20 && dia <= 29) {
                System.out.println("Eres Piscis");
            } else {
                System.out.println("Día inválido");
            }
        } else if (mes == 3) {
            if (dia >= 1 && dia <= 20) {
                System.out.println("Eres Piscis");
            } else if (dia >= 21 && dia <= 31) {
                System.out.println("Eres Aries");
            } else {
                System.out.println("Día inválido");
            }
        } else if (mes == 4) {
            if (dia >= 1 && dia <= 20) {
                System.out.println("Eres Aries");
            } else if (dia >= 21 && dia <= 30) {
                System.out.println("Eres Tauro");
            } else {
                System.out.println("Día inválido");
            }
        } else if (mes == 5) {
            if (dia >= 1 && dia <= 21) {
                System.out.println("Eres Tauro");
            } else if (dia >= 22 && dia <= 31) {
                System.out.println("Eres Géminis");
            } else {
                System.out.println("Día inválido");
            }
        } else if (mes == 6) {
            if (dia >= 1 && dia <= 21) {
                System.out.println("Eres Géminis");
            } else if (dia >= 22 && dia <= 30) {
                System.out.println("Eres Cáncer");
            } else {
                System.out.println("Día inválido");
            }
        } else if (mes == 7) {
            if (dia >= 1 && dia <= 22) {
                System.out.println("Eres Cáncer");
            } else if (dia >= 23 && dia <= 31) {
                System.out.println("Eres Leo");
            } else {
                System.out.println("Día inválido");
            }
        } else if (mes == 8) {
            if (dia >= 1 && dia <= 23) {
                System.out.println("Eres Leo");
            } else if (dia >= 24 && dia <= 31) {
                System.out.println("Eres Virgo");
            } else {
                System.out.println("Día inválido");
            }
        } else if (mes == 9) {
            if (dia >= 1 && dia <= 23) {
                System.out.println("Eres Virgo");
            } else if (dia >= 24 && dia <= 30) {
                System.out.println("Eres Libra");
            } else {
                System.out.println("Día inválido");
            }
        } else if (mes == 10) {
            if (dia >= 1 && dia <= 23) {
                System.out.println("Eres Libra");
            } else if (dia >= 24 && dia <= 31) {
                System.out.println("Eres Escorpio");
            } else {
                System.out.println("Día inválido");
            }
        } else if (mes == 11) {
            if (dia >= 1 && dia <= 22) {
                System.out.println("Eres Escorpio");
            } else if (dia >= 23 && dia <= 30) {
                System.out.println("Eres Sagitario");
            } else {
                System.out.println("Día inválido");
            }
        } else if (mes == 12) {
            if (dia >= 1 && dia <= 21) {
                System.out.println("Eres Sagitario");
            } else if (dia >= 22 && dia <= 31) {
                System.out.println("Eres Capricornio");
            } else {
                System.out.println("Día inválido");
            }
        } else {
            System.out.println("Mes inválido");
        }
    }
}
