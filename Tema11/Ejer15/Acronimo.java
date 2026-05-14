package Tema11.Ejer15;

public class Acronimo {
    public static void main(String[] args) {

        if (args.length == 0) {

            System.out.println("ERROR: debes introducir al menos una palabra");

        } else {

            System.out.print("Acronimo: ");

            for (String i : args) {

                if (i.length() > 3) {
                    System.out.print((""+i.charAt(0)).toUpperCase());
                }
            }
        }
    }
}