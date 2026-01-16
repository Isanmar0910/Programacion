package repaso;

public class voltear {
    public static void main(String[] args) {

        int numeroIntroducido;
        int volteado = 0;
        int numero;

        System.out.print("Introduce un numero al que quieras darle la vuelta : ");
        numeroIntroducido = Integer.parseInt(System.console().readLine());

        numero = numeroIntroducido;

       
        System.out.println(voltear(numero, volteado));
    }

    public static int voltear(int numero, int volteado) {
         while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;

        }
        return volteado;
    }
}
