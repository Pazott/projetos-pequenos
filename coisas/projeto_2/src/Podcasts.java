package projeto_2.src;

public class Podcasts extends Audio {
    private String Host;
    private String Descricao;

    


    public String getHost() {
        return Host;
    }
    public void setHost(String host) {
        Host = host;
    }
    public String getDescricao() {
        return Descricao;
    }
    public void setDescricao(String descricao) {
        Descricao = descricao;
    }


    @Override
    public double getClassificacao() {
        if (this.getCurtidas() > 200) {
            return 10;
        } else {
            return 8;
        }
    }
}
