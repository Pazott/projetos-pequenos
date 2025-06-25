package ae.aulas;

public class aula1 {
	public static void main(String[] args) {
		String nome = "Pazotti";
		String cumprimento = "\ntudo bem?";
	
		System.out.println("Olá " + nome + "!" + cumprimento + "\n\n");
		anotacao.batata(args);
		soma.main(args);
		subtracao.main(args);
		multiplicacao.main(args);
		divisao.main(args);
		potencia.main(args);
		maior.main(args);
		menor.main(args);
	}
}
//junção entre todos os codigos e o codigo principal
class anotacao{
	public static void batata(String[] args) {
		System.out.println("oláa");
	}
}
// nada aqui, decepcionante
class soma{
	public static void main(String[] args){
		int a = 10;
		int b = 5;
		int resultado = a + b;
		
		System.out.println(resultado);
	}

}
//soma sobre o numero a e o numero b
class subtracao{
	public static void main(String [] args){
		int a = 10;
		int b = 5;
		int resultado = a - b;

		System.out.println(resultado);
	}
}
//subtração sobre o numero a e o numero b
class multiplicacao{
	public static void main(String [] args){
		int a = 10;
		int b = 5;
		int resultado = a * b;

		System.out.println(resultado);
	}
	
}
//multiplicação sobre o numero a e o numero b
class divisao{
	public static void main(String [] args){
		int a = 10;
		int b = 5; 
		int divisao = a / b;

		System.out.println(divisao);
	}
}
//divisao sobre o numero a e o numero b
class potencia{
	public static void main(String[] args){
		int a = 10;
		int b = 5;
		int potencia = a ^ b;

		System.out.println(potencia);
	}
}
//potencia de a sobre b
class maior{
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int maior = a << b;
		
		System.out.println(maior);
	}
}
//brincadeira1
class menor{
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int menor = a >> b;

		System.out.println(menor);
	}
}
//brincadeira2