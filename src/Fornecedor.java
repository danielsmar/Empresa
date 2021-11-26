

public class Fornecedor extends Pessoa {

   
    private Float plafond;
    private Float valorEmDivida;
    private int extensao;
    private int indicativo;
    private CodigoPostal cp = new CodigoPostal();
    

    


    public Fornecedor(String nome, Long contribuinte, int idade, float plafond, float valorEmDivida, int indicativo, int extensao) {
        super(nome, contribuinte, idade);
        this.plafond = plafond;
        this.valorEmDivida = valorEmDivida;    
        cp.setIndicativo(indicativo);
        cp.setExtensao(extensao);
           
        
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


    public int getExtensao() {
        return this.extensao;
    }

    public void setExtensao(int extensao) {
        this.extensao = extensao;
    }

    public int getIndicativo() {
        return this.indicativo;
    }

    public void setIndicativo(int indicativo) {
        this.indicativo = indicativo;
    }


    public CodigoPostal getCp() {
        return this.cp;
    }

    public void setCp(CodigoPostal cp) {
        this.cp = cp;
    }
    


    
}
