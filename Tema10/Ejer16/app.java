package Tema10.Ejer16;

import java.util.HashMap;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        HashMap<String, String> paises = new HashMap<>();

        String respuesta;

        Scanner sc = new Scanner(System.in);

        paises.put("Espania", "Madrid");
        paises.put("Francia", "París");
        paises.put("Italia", "Roma");
        paises.put("Alemania", "Berlín");
        paises.put("Portugal", "Lisboa");
        paises.put("Reino Unido", "Londres");
        paises.put("Países Bajos", "Ámsterdam");
        paises.put("Bélgica", "Bruselas");
        paises.put("Suiza", "Berna");
        paises.put("Austria", "Viena");
        paises.put("Grecia", "Atenas");
        paises.put("Polonia", "Varsovia");
        paises.put("Noruega", "Oslo");
        paises.put("Suecia", "Estocolmo");
        paises.put("Finlandia", "Helsinki");


        System.out.print("Introduce el nombre de un pais y te dire su capital: ");
        respuesta = sc.nextLine();

        if (paises.containsKey(respuesta)) {
            
            System.out.println("\nLa capital de " + respuesta + " es " + paises.get(respuesta));

        }else{
            System.out.println("\nNo me se su capital soy baka UwU ");
        } 
    }
}
