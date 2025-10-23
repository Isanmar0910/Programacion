package Tema4;

public class ejemploif {
    public static void main(String[] args) {
        int edad;

        System.out.print("Indica tu edad: ");
        edad = Integer.parseInt(System.console().readLine());

        if (edad < 18) {
            System.out.println("Eres menor de edad");
            
        } else {
            if (edad >=18 && edad <=65) {
                System.out.println("Estas en activo");
                
            }else{
                System.out.println("Jubilao");
            }
        }
    }
}
