package Tema5.Ejercicios;

public class Ej21 {
    public static void main(String[] args) {
    
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
        
        int relleno = 1;
        
        int altura = 1;
        int i = 0;
        int espaciosPorDelante = alturaIntroducida - 1;
        int espaciosInternos = 0;
        int nRelleno = relleno;
        
        while (altura < alturaIntroducida) {
          
          // inserta espacios delante
          for (i = 1; i <= espaciosPorDelante; i++) {
            System.out.print(" ");
          }
          
          // pinta la línea
          System.out.print(relleno);
          for (i = 1; i < espaciosInternos; i++) {
            nRelleno++;
            System.out.print(nRelleno);
            nRelleno++;
          }
          
          if (altura>1) {
            System.out.print(relleno);
          }
          
          System.out.println();
          altura++;
          espaciosPorDelante--;
          espaciosInternos += 2;
        } 
        for (i = 1; i < altura*2; i++) {
          System.out.print(relleno);
        }
      }
    }
