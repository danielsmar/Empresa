public class Pessoa {

    private String nome;
    private Long contribuinte;
    private int idade;
    private CodigoPostal cp = new CodigoPostal();
    



    public Pessoa(String nome, Long contribuinte, int idade) {
        
        this.nome = nome;
        this.contribuinte = contribuinte;
        this.idade = idade; 
        
        
    } 

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getContribuinte() {
        return this.contribuinte;
    }

    public void setContribuinte(Long contribuinte) {
        this.contribuinte = contribuinte;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public CodigoPostal getCp() {
        return this.cp;
    }

    public void setCp(CodigoPostal cp) {
        this.cp = cp;
    }
   
   

    
}
