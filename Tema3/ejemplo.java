package Tema3;

import java.util.Scanner;

public class ejemplo {

    public static void main(String[] args) {
        
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Este programa multiplica dos números enteros.");
        System.out.print("Porfavor Introduzca el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        num2 = sc.nextInt();
        //System.out.println("" + num1 + " " + "*" + " "  + num2 + " " + " " + "=" + " " +(num1*num2));
        System.out.printf("%d * %d = %d \n", num1, num2, num1*num2);

    }
    
}
