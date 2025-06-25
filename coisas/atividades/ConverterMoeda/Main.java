package atividades.ConverterMoeda;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda converte = new ConversorMoeda();

        converte.setReal(5.54);;
        converte.setDolar(10);

        System.out.println(converte.converterDolarParaReal());
    }
}
