import java.io.IOException;
import java.util.Scanner;

public class Sistema {

    public static void limparTela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    
    public static void main(String[] args) throws Exception {
        Sistema.limparTela();
        Empresa.Produtos();
        Empresa.Fornecedores();
        Empresa.Empregados();

        Scanner menu = new Scanner(System.in);
        
        
        
    

        int i=0;
        do{
            System.out.println("--------SISTEMA EMPRESARIAL--------");
            System.out.println("0- Sair"); //feito             
            System.out.println("1- Mostrar Produtos"); //feito
            System.out.println("2- Adicionar Produto"); //feito
            System.out.println("3- Remover Produto"); //feito
            System.out.println("4- Mostrar Fornecedores"); //feito
            System.out.println("5- Adicionar Fornecedor"); //feito
            System.out.println("6- Remover Fornecedor"); //feito
            System.out.println("7- Lista de Empregados"); //feito
            System.out.println("------------------------------------");                
            int opcao = menu.nextInt();
            
            switch (opcao) {

             case 0:{
              System.out.println("Sessão Finalizada!");
              i=0;
              break;
                }

             case 1: {
                Empresa.mostrarProdutos();
                i=1;            
                break;
                }
             case 2: {
                Empresa.addProdutos();    
                i=1;            
                break;
                }
            
             case 3: {
                Empresa.removerProduto();                    
                i=1; 
                 break;
                }  
                
            case 4: {
                Empresa.mostrarFornecedor();                    
                i=1; 
                 break;
                    }  
            
            case 5: {
            Empresa.addFornecedor();                    
            i=1; 
            break;
            } 

            case 6: {
                Empresa.removerFornecedor();                    
                i=1; 
                break;
            }

            case 7: {
                Empresa.mostrarEmpregados();                    
                i=1; 
                break;
                } 
              default: {
              System.out.println("Opção Inválida, Digite Novamente");
              i=1; 
              } 
            }               
            
        }while(i != 0);


     menu.close();
     
       
        

    }
}
