package Tema4;

public class operadore {
    public static void main(String[] args) {
        final int RANGO = 0;
        final int RANGOM = 100;
        
        float num;

        System.out.print("Introduce un numero del 1 al 100: ");
        num = Float.parseFloat(System.console().readLine());

        if (num >= RANGO && RANGOM <= 100) {
            System.out.println("Enhorabuena, el numero esta en el rango indicado");
            
        }else{
            System.out.println("no esta entre el 1 y el 100");
        }


    }
}
