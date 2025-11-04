package Tema6.Ejercicio;

public class Ejercicio7 {
    public static void main(String[] args) {
        int n = 1; 
        int local = 0;
        int visitante = 0;
        String resultadoL;
        String resultadoV;

        for (int i=0; i<14; i++) {
            local = (int)(Math.random()*4);
            visitante = (int)(Math.random()*4);

            resultadoL = String.valueOf(local);
            resultadoV = String.valueOf(visitante); 

            if (local > 2) {
                resultadoL = "X";
            }
            if (visitante > 2) {
                resultadoV = "X";
            }
            
            System.out.println(n + ".| " + resultadoL + " | X | " + resultadoV + " |");
            n++;
            
        }
    }
}
