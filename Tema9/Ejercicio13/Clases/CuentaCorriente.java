package Tema9.Ejercicio13.Clases;

public class CuentaCorriente {

    private int saldo;
    private long numCuenta;

    public CuentaCorriente() {
        this.saldo = 0;
        this.numCuenta = (long) (Math.random() * 100000000000L);
    }

    public CuentaCorriente(int saldo){
        this.saldo = saldo;
        this.numCuenta = (long) (Math.random() * 100000000000L);
    }

    public void ingreso(int n){
        this.saldo += n;
    }

    public void cargo(int n){
        if (this.saldo > n) {
            this.saldo -= n;
        }else {
            System.out.println("No tienes suficiente dinero en la cuenta");
        }
    }

    public void transferencia(CuentaCorriente c1, int n){

        if (this.saldo > n) {
            c1.saldo += n;
            this.saldo -= n;
        }else{
            System.out.println("Esta cuenta no tiene el dinero suficiente como para hacer esa transferencia");
        }
    }

    @Override
    public String toString(){
        return "Número de cuenta: " + numCuenta + " Saldo: " + saldo + " €";
    }



}
