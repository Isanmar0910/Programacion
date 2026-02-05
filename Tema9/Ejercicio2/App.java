package Tema9.Ejercicio2;

public class App {

    public static void main(String[] args) {

        caballos caballo1 = new caballos("Babieca", 15, "Hembra");
        caballos caballo2 = new caballos("Lykos", 5, "negro");

        caballo1.presentarse();
        caballo1.andar();
        caballo1.relinchar();

        caballo2.presentarse();
        caballo2.comer();
        caballo2.andar();
    }
}
