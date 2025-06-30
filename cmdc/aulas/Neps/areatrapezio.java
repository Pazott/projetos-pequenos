public class areatrapezio {
    public static void main(String[] args) {

        int baseb , baseB, lados;

        baseB = 12;
        baseb =  9;
        lados = 15;


        double area = ((baseB + baseb) / 2) * lados;


        double casting = (double) baseB / baseb;
        System.out.println(area);
        System.out.printf("%.2f",casting);
    }
}
