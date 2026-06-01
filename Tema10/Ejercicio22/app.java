package Tema10.Ejercicio22;

import Tema10.Ejercicio22.clases.piezas;

public class app {
    public static void main(String[] args) {
        
        piezas peon = new piezas("Peón", 1);
        piezas caballo = new piezas("Caballo", 2);
        piezas alfil = new piezas("Alfil", 3);
        piezas torre = new piezas("Torre", 5);
        piezas dama = new piezas("dama", 9);

        int peones = 8;
        int caballos = 2;
        int alfiles = 2;
        int torres = 2;
        int damas = 1;

        int capturas = (int)(Math.random()*16);
        int piezaRandom;

        int puntos = 0;

        for (int i = 0; i < capturas; i++) {

            boolean capturaHecha = false;

            while (!capturaHecha) {

                piezaRandom = (int)(Math.random() * 5);

                switch (piezaRandom) {

                    case 0:
                        if (damas > 0) {
                            System.out.println(dama.getNombre() +
                                    " capturada -> " +
                                    dama.getValor() + " peones");

                            damas--;
                            puntos += dama.getValor();
                            capturaHecha = true;
                        }
                        break;

                    case 1:
                        if (torres > 0) {
                            System.out.println(torre.getNombre() +
                                    " capturada -> " +
                                    torre.getValor() + " peones");

                            torres--;
                            puntos += torre.getValor();
                            capturaHecha = true;
                        }
                        break;

                    case 2:
                        if (alfiles > 0) {
                            System.out.println(alfil.getNombre() +
                                    " capturada -> " +
                                    alfil.getValor() + " peones");

                            alfiles--;
                            puntos += alfil.getValor();
                            capturaHecha = true;
                        }
                        break;

                    case 3:
                        if (caballos > 0) {
                            System.out.println(caballo.getNombre() +
                                    " capturada -> " +
                                    caballo.getValor() + " peones");

                            caballos--;
                            puntos += caballo.getValor();
                            capturaHecha = true;
                        }
                        break;

                    case 4:
                        if (peones > 0) {
                            System.out.println(peon.getNombre() +
                                    " capturada -> " +
                                    peon.getValor() + " peones");

                            peones--;
                            puntos += peon.getValor();
                            capturaHecha = true;
                        }
                        break;
                }
            }
        }

        System.out.println();
        System.out.println("Puntuación total: " + puntos + " peones");
    }
}