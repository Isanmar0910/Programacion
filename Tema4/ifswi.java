package Tema4;

public class ifswi {
    public static void main(String[] args) {
         int num;

         System.out.println("1.Lunes");
         System.out.println("2.Martes");
         System.out.println("3.Miercos");
         System.out.println("4.Jueves");
         System.out.println("5.Viernes");
         System.out.println("6.Sabado");
         System.out.println("7.Domingo");
         System.out.print("Introduce el dia de la semana: ");
         num = Integer.parseInt(System.console().readLine());

         switch (num) {
            case 1,2,3,4,5:
                System.out.println("Es dia de la semana");
                break;
            case 6,7:
                System.out.println("Es fin de semana");
                break;
         
            default:
                System.out.println("La semana no tiene tantos dias mentecato");
                break;
         }
         }


    }
