import java.util.Scanner;

public class dadosdig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x;
        String y;
        double z;
        
        System.out.printf("Digite os dados na seguinte ordem: inteiro, textos, decimais\n");

        x = sc.nextInt();
        y = sc.next();
        z = sc.nextDouble();

        System.out.printf("digitou :\n %d\n %.2f\n %s" , x, z, y);
        sc.close();
    }
}
