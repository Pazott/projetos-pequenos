package neps;

public class aprovadoreprovado {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        nota1 = 7;
        nota2 = 7;
        

        if(nota1 >= 7){
            if (nota2 >= 7) {
                System.out.println(nota1 + " " + nota2 + " Aprovado!");
            }
            else{
                System.out.println(nota1 + " " + nota2 + " Reprovado!");
            }
            
        }
        else{
                System.out.println(nota1 + " " + nota2 + " Reprovado!");
        }
    }
}
