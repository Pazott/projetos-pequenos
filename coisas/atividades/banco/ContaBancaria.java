
package atividades.banco;

public class ContaBancaria {
    private double dinheiro;
    private String menu;
    private String opcoes;
    //SETS
    //________________________________________
    public void setdinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void setdepositar(double deposito){
        this.dinheiro = deposito;
        
    }
    
    public void setsacar(double saque){
        this.dinheiro = dinheiro - saque;
    }
    //__________________________________________
    //GETS
    public double getconsultarSaldo(){
        return this.dinheiro;
    }
    public String getmenu(){
        return this.menu;
    }
    public String getopcoes(){
        return this.opcoes;
    }
    //___________________________________________

    
    /*Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
*/
}
