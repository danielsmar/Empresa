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


    public void mostraCp() {
        if (getIndicativo()/10000 == 0){
            this.setZona("Grande SP");
        } else if (getIndicativo()/10000 == 1){
            this.setZona("Interior e Litoral de SP");
        } else if (getIndicativo()/10000 == 2){
            this.setZona("RJ e ES");
        } else if (getIndicativo()/10000 == 3){
            this.setZona("MG");
        } else if (getIndicativo()/10000 == 4){
            this.setZona("BH e SE");
        } else if (getIndicativo()/10000 == 5){
            this.setZona("PE, AL PB e RN");
        } else if (getIndicativo()/10000 == 6){
            this.setZona("CE, PI, MA, PA, AP, AM, RR e AC");
        } else if (getIndicativo()/10000 == 7){
            this.setZona("DF, GO, RO, TO, MT e MS");
        } else if (getIndicativo()/10000 == 8){
            this.setZona("PR e SC");
        } else{
            this.setZona("RS");
        }
        System.out.println("  "+getIndicativo()+"-"+getExtensao()+", "+ getZona());
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
