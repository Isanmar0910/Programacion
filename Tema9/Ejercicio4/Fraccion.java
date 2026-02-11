package Tema9.Ejercicio4;

public class Fraccion {

    int numerador;
    int denominador;

    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser 0");
        }

        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void invertir() {

        int aux = this.numerador;
        this.numerador = this.denominador;
        this.denominador = aux;
    }

    public Fraccion multiplica(Fraccion frac){
        return new Fraccion(this.numerador * frac.numerador, this.denominador * frac.denominador);
    }

    public Fraccion divide(Fraccion frac){
        return new Fraccion(this.numerador * frac.denominador, this.denominador * frac.numerador);
    }

    public Fraccion simplifica(Fraccion frac) {
        return new Fraccion(this.numerador, denominador);
    }

    @Override
    public String toString() {
        String cadena = String.format("%d", this.numerador);

        if (this.denominador!=1) {
            cadena += String.format("/d", this.denominador);
            
        }

        return cadena;
    }




}
