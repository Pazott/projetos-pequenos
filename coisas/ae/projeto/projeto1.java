package ae.projeto;

public class projeto1 {
    public static void main(String[] args) {
        pessoa pessoua = new pessoa();
        pessoua.mundo = "Olá mundo!";
        pessoua.mostrar();


        musica muzika = new musica();
        muzika.titulo = "Valsinha";
        muzika.artista = "Chico Buarque";
        muzika.anolancamento = 1971;

        muzika.mostrarmuzika();
 
        muzika.avalia(5);
        muzika.avalia(3);
        muzika.avalia(9);

        System.out.println(muzika.pegamedia());
    }
}
//crie uma classe musica com atributos titulo, artista, anolancamento, avaliacao e numavaliacoes, e metodos para exibir a ficha tecnica, avaliar a musica e calcular a media de avaliacoes