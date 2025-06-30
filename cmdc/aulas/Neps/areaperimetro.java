public class areaperimetro {
    public static void main(String[] args) {
        int base, altura, area, perimetro;
        
        base = 10;
        altura = 10;

        perimetro = (base * 2) + (altura * 2);
        area = (base * altura);

        System.out.printf("O perimetro da forma geometrica é de %d e a área é %d", perimetro, area);
    }
}
