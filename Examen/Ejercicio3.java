public class Ejercicio3 {
    public static void main(String[] args) {
        String rojo = "\033[38;2;255;0;0m*\033[0m";
        String naranja = "\033[38;2;247;176;45m*\033[0m";
        String amarillo = "\033[38;2;246;255;0m*\033[0m";
        String verde = "\033[38;2;0;255;0m*\033[0m";
        String celeste = "\033[38;2;45;210;247m*\033[0m";
        String indigo = "\033[38;2;45;72;247m*\033[0m";
        String rosa = "\033[38;2;255;102;255m*\033[0m";
        String morado = "\033[38;2;58;1;92m*\033[0m";
        
        System.out.println(rojo+naranja+amarillo + verde + celeste + indigo + rosa + morado);
        System.out.println("\t" + rojo);
        System.out.println("       " + rojo + naranja + amarillo);
        System.out.println("      " + rojo+naranja + amarillo + verde + celeste);
        System.out.println("     " + rojo + naranja + amarillo + verde + celeste + indigo + morado );
        System.out.println("    " + rojo + naranja + amarillo + verde + celeste + indigo + morado + rosa + rojo);

       

    }
}
