package Tema6.Ejercicio;

public class Ejercicio10 {
    public static void main(String[] args) {
        String nota = null;
        int n;
        int nSuspenso = 0;
        int nSuficiente = 0;
        int nBien = 0;
        int nNotable = 0;
        int nSobresaliente = 0;

        for (int i=0; i<20; i++){
            n = (int)(Math.random()*5)+1;

            switch (n) {
                case 1:
                    nota = "suspenso";
                    nSuspenso++;
                    break;
                case 2:
                    nota = "suficiente";
                    nSuficiente++;
                    break;
                case 3:
                    nota = "bien";
                    nBien++;
                    break;
                case 4:
                    nota = "Notable";
                    nNotable++;
                    break;
                case 5:
                    nota = "Sobresaliente";
                    nSobresaliente++;
                    break;
            
                default:
                    break;
            }
            System.out.print(nota + " ");
        }
        
        System.out.println("\nNo de Suspensos: " + nSuspenso + "\nNo de Suficientes: " + nSuficiente + "\nNo de Bienes: " + nBien + "\nNo de Notables: " + nNotable + "\nNo de Sobresalientes: " + nSobresaliente);
    }
}
