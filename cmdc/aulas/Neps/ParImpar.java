public class ParImpar {
    public static void main(String[] args) {
        int valo1 = 1;
        int valor2 = 2;
        int valor3 = 4;

        int somadivi = (valo1 + valor2 + valor3) %2;

        if (somadivi == 1){
            System.out.println("impar");
        } if (somadivi == 0){
            System.out.println("par");
        } else {
            System.out.println("o valor disposto não esta disponível para tal atribuição");
        }
    }
}
