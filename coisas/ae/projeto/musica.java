package ae.projeto;

public class musica {

        String titulo;
        String artista;
        int anolancamento;
        double avaliacao;
        int numavaliacoes;

        void mostrarmuzika(){
            System.out.println("O nome da música: " + titulo);
            System.out.println("O nome do artista é: " + artista);
            System.out.println("A música foi lançada em: " + anolancamento);
        }

        void avalia(double nota){
            avaliacao += nota;
            numavaliacoes++;
        }
    
        double pegamedia(){
            return avaliacao / numavaliacoes;
        }
}