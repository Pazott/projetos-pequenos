package atividades.CalculadoraArea;

public class Main {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculo = new CalculadoraSalaRetangular();

        calculo.setAltura(6);
        calculo.setLargura(10);

        System.out.println("A área do retangulo é " + calculo.calcularPerimetro());
        System.out.println("O pêrimetro do retangulo é " + calculo.calcularArea());
    }
}
