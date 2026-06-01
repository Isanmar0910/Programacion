package Tema11.Ejer14;

public class GeneradorEmail {
    public static void main(String[] args) {
        
        String nombre = args[0].toLowerCase();
        String apellido = args[1].toLowerCase();

        String correo = nombre + "." + apellido + "@alanturing.es";

        

        System.out.println("Tu nuevo correo es: " + correo);

    }
}
