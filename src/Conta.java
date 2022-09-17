public class Conta {
    private String conta;
    private String agencia;
    private double saldo;
    private String nomeCliente;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }





    public int sacar(double valor){
        if(saldo>0 && valor<=saldo){
            this.saldo = saldo-valor;
            return 1;
        }
        else{
            return 0;
        }
    }

    public void depositar (double valor){
        this.saldo = this.saldo+valor;

    }

    public void imprimir(){
        System.out.println("Conta: "+this.getConta());
        System.out.println("Agencia:"+this.getAgencia());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Nome: "+this.getNomeCliente());
    }

}
