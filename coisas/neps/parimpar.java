package neps;

public class parimpar {
    public static void main(String[] args) {
        int cino = 0;
        int bino = 0;
        
        int soma  = cino + bino;

        if (soma % 2 == 0) {
            System.out.println("Bino");
        }
        else if(soma % 1 == 0){
            System.out.println("Cino");
        }
    }
}
