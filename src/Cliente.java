public class Cliente extends Pessoa{
    

    private Float plafond;
    private Float valorEmDivida;
    private Float saldo;

    public Cliente(String nome, Long contribuinte, int idade, float plafond, float valorEmDivida) {
        super(nome, contribuinte, idade);
        this.plafond = plafond;
        this.valorEmDivida = valorEmDivida;        
    }

    public Cliente(String nome, Long contribuinte, int idade, float plafond, float valorEmDivida, CodigoPostal cp) {
        super(nome, contribuinte, idade, cp);
        this.plafond = plafond;
        this.valorEmDivida = valorEmDivida;        
    }

    public Float obterSaldo() {

        return this.saldo = this.plafond - this.valorEmDivida;
    }


    public Float getPlafond() {
        return this.plafond;
    }

    public void setPlafond(Float plafond) {
        this.plafond = plafond;
    }

    public Float getValorEmDivida() {
        return this.valorEmDivida;
    }

    public void setValorEmDivida(Float valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }


    public Float getSaldo() {
        obterSaldo();
        return this.saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }
    
}
