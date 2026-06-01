package Tema11.Ejer17;

public class Formateador {
    public static void main(String[] args) {
        
        if (args[0].equals("-m")) {
            for (int i = 1; i < args.length; i++) {
                System.out.println(args[i].toUpperCase());
            }
        }else if (args[0].equals("-min")) {
            for (int i = 1; i < args.length; i++) {
                System.out.println(args[i].toLowerCase());
            }
        }else {
                System.out.println(args[0]);
        }
    }
}
