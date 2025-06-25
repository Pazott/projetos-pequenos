package atividades.banco;

public class ContaCorrente extends ContaBancaria{
    private double tarifa;
    
    @Override
    public String getopcoes() {
        return "Selecione uma opção na qual deseja realizar.\n1-Consultar saldo.\n2-Depositar.\n3-Sacar.\n4-Consultar tarifa.\n5-Sair.";
    }
    @Override
    public String getmenu() {
        return "Seja muito bem vindo!";
        }

    public void setcobrarTarifaMensal(){
        this.tarifa = 25;
    }

    public double gettarifa(){
        return this.tarifa;
    }

    public double getsaldo(){
        return getconsultarSaldo() - gettarifa();
    }




    /*Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.*/
}
