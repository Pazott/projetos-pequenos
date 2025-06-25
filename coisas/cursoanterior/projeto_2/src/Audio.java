package projeto_2.src;

public class Audio {
    private String Titulo;
    private int Duracao;
    private int TotalDeReproducoes;
    private int Curtidas;
    private int Classificacao;
    
    
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public int getDuracao() {
        return Duracao;
    }
    public void setDuracao(int duracao) {
        Duracao = duracao;
    }
    public int getTotalDeReproducoes() {
        return TotalDeReproducoes;
    }
    public void setTotalDeReproducoes(int totalDeReproducoes) {
        TotalDeReproducoes = totalDeReproducoes;
    }
    public int getCurtidas() {
        return Curtidas;
    }
    public void setCurtidas(int curtidas) {
        Curtidas = curtidas;
    }
    public double getClassificacao() {
        return Classificacao;
    }
    public void setClassificacao(int classificacao) {
        Classificacao = classificacao; 
    }


    public void curte(){
        this.Curtidas ++;
    }
    public void reproduz() {
    this.TotalDeReproducoes++;
}
}