public class CodigoPostal {
    
    private int indicativo;
    private int extensao;
    private String zona;
        
    public CodigoPostal(){

    }

    public CodigoPostal(int indicativo, int extensao){
        this.indicativo = indicativo;
        this.extensao = extensao;
    }   

    public void mostrar(){
    System.out.println("CEP:"+getIndicativo()+"-"+getExtensao());
    }
    

    public int getIndicativo() {
        return this.indicativo;
    }

    public void setIndicativo(int indicativo) {
        this.indicativo = indicativo;
    }

    public int getExtensao() {
        return this.extensao;
    }

    public void setExtensao(int extensao) {
        this.extensao = extensao;
    }

    public String getZona() {
        return this.zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

}
