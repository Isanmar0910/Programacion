public class Ejercicio2 {
    public static void main(String[] args) {
         Double radioMayor;
         Double radioMenor;
         Double volumen;

         System.out.println("\033[1mVOLUMEN DE UN TOROIDE\033[0m");
         System.out.println("\033[1m=============================\033[0m");
         System.out.print("Introduzca el radio mayor (cms): ");
         radioMayor = Double.parseDouble(System.console().readLine());
         System.out.print("Introduzca el radio menor (cms): ");
         radioMenor = Double.parseDouble(System.console().readLine());
         volumen = (2 * (Math.PI * Math.PI)) * (radioMayor * (radioMenor * radioMenor));
         System.out.printf("El Volumen del Toroide es de \033[1m\033[31m%.4f \033[0m\033[1mcm\u00B3\033[0m", volumen);

    }
}
