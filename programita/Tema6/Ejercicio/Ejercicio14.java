package Tema6.Ejercicio;

public class Ejercicio14 {
    public static void main(String[] args) {
        int nota = 0;
        int totalNota = 0;
        int nNotas = 0;
        String clave = null;

        totalNota = (int)(Math.random()*(28 - 4 + 1))+4;

        do {
            
            for (int i=0 ; i<4  ; i++) {
                nota = (int)(Math.random()*7)+1;
            
            switch (nota) {
                case 1:
                    clave = "do";
                    break;
                case 2:
                    clave = "re";
                    break;
                case 3:
                    clave = "mi";
                    break;
                case 4:
                    clave = "fa";
                    break;
                case 5:
                    clave = "sol";
                    break;
                case 6:
                    clave = "la";
                    break;
                case 7:
                    clave = "si";
                    break;
            
                default:
                    break;
            }
                System.out.print(" " + clave);
                
            }
            nNotas++;
            System.out.print("|");
        } while (nNotas != totalNota);
    }
}
