package projetocalc.classes;

public class Calcular implements Calculos {
    @Override
    public double somar(double a, double b) {
        return a + b;
    }
    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }
    @Override
    public double dividir(double a, double b) {
        return a / b;
    }
    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }
    @Override
    public double potencializar(double base, double expoente) {
        return Math.pow(base, expoente);
    }
    @Override
    public double radiciar(double base, double indice) {
        return Math.pow(base, 1.0 / indice);
    }
}