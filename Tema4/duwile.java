package Tema4;

public class duwile {
    public static void main(String[] args) {
        int numero=0;
        int total=0;
        int suma = 0;

        System.out.println("Introzca numeros y pulse ENTER. Para acabar ponga un numero negativo");
        

        do {
            
            System.out.print("?");
            numero = Integer.parseInt(System.console().readLine());
            if (numero>=0) {
                suma = suma + numero;
                total++;
            }
            
        } while (numero>=0 );

        System.out.printf("Se han introducido un total de %d numeros y la suma es %d" ,total,suma);
    }
}
