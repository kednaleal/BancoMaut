

public class Transacoes {

    private String tipo;
    private String data;
    private String descricao; 
    
    public Transacoes(String tipo, String data, String descricao) {
        this.tipo = tipo;
        this.data = data;
        this.descricao = descricao;
    }
   
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void sacar(double valor, Conta conta){
        double novoSaldo = conta.getSaldo() - valor;
        conta.setSaldo(novoSaldo);
        
    }

    public void deposito(double valor, Conta conta){
       double saldoAtual = conta.getSaldo();
       double novoSaldo = saldoAtual + valor;
        conta.setSaldo(novoSaldo);
    }
    public void transferir( double valor, Conta conta){  
        double novoSaldo = conta.getSaldo() - valor;
        conta.setSaldo(novoSaldo);
      conta.getNumeroConta();
    
    }

    public void addExtrato(String imformacao){

    }

    public void extrato(String dados){

    }
}
