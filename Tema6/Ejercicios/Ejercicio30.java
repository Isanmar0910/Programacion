package Tema6.Ejercicios;

public class Ejercicio30 {

    public static void main(String[] args) {
        String rayas[][] = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
        };

        String respuesta;
        int filaMaq;
        int columnMaq;

        for (int i = 0; i < 8; i++) {
            filaMaq = (int) (Math.random() * 3);
            columnMaq = (int) (Math.random() * 3);

            if ("X".equals(rayas[filaMaq][columnMaq]) || "O".equals(rayas[filaMaq][columnMaq])) {
                i--;
            }else {
                rayas[filaMaq][columnMaq] = "X";
            }

            
        }
    }
}
