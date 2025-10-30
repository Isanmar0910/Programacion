package Tema4;

public class mientras {
    public static void main(String[] args) {
        int numero;
        int total=0;
        int suma = 0;

        System.out.println("Introzca numeros y pulse ENTER. Para acabar ponga un numero negativo");
        numero = Integer.parseInt(System.console().readLine());

        while (numero>0) {
            suma = suma + numero;
            System.out.print("?");
            numero = Integer.parseInt(System.console().readLine());
            total++;
            
            
        }
        
        System.out.printf("Se han introducido un total de %d numeros y la suma es %d" ,total,suma);

    }
}
