package Tema6.Ejercicio;

public class Ejercicio12 {
    public static void main(String[] args) {
        int tirada1;
        int tirada2;

        do {
            tirada1 = (int)(Math.random()*6)+1;
            tirada2= (int)(Math.random()*6)+1;

            System.out.println(tirada1 + " " + tirada2);
        } while (tirada1 != tirada2);
    }
    

    
}
