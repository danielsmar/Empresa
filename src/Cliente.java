public class Cliente extends Pessoa{
    

    private Float plafond;
    private Float valorEmDivida;

    public Cliente(String nome, Long contribuinte, byte idade, float plafond, float valorEmDivida) {
        super(nome, contribuinte, idade);
        this.plafond = plafond;
        this.valorEmDivida = valorEmDivida;
        
    }

    public void obterSaldo(Float Saldo) {

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

}
