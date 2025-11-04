package Tema6.Ejercicio;

public class Ejercicio9 {
    public static void main(String[] args) {
        int n;
        String caracter = null;
        int ncarac;
        int linea=0;

        do {
            n = (int)(Math.random()*(6))+1;
            switch (n) {
                case 1:
                    caracter = ",";
                    break;
                case 2:
                    caracter = "-";
                    break;
                case 3:
                    caracter = "`";
                    break;
                case 4:
                    caracter = "=";
                    break;
                case 5:
                    caracter = ".";
                    break;
                case 6:
                    caracter = "|";
                    break;
                default:
                    caracter = "0";
                    break;
            }
            ncarac = (int)(Math.random()*40)+1;
            for (int i=0; i<ncarac ; i++) {
                System.out.print(caracter + "");
                
                
            }
            System.out.println("");
            linea++;
            

        } while (linea !=10);

        

    }
}
