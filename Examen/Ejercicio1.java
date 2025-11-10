import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Double m;
        Double f;
        Double a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la masa del objeto (kg): ");
        m = sc.nextDouble();
        System.out.print("Ingrese la fuerza neta aplicada (N): ");
        f = sc.nextDouble();
        a = f / m;
        System.out.printf("La aceleracion del objeto es aproximadamente \033[1m%.2f m/s\u00B2\033[0m", a);

    }
}
