import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    
    private String nome;
    private int dataFundacao;
    private CodigoPostal cp;

    static Scanner scanner = new Scanner(System.in);    

    
    private static List<Produto> listaProduto = new ArrayList<>();

    public static void Produtos(){
        listaProduto.add(new Produto("MousePad Gamer",(float) 125.90, 19, 2525));
        listaProduto.add(new Produto("Teclado Gamer",(float) 126.90, 18, 2526));
        listaProduto.add(new Produto("HeadSet Gamer",(float) 127.90, 17, 2527));
    }

    public static void mostrarProdutos(){
        System.out.printf("\n--------Lista de Produtos--------\n");
        int i = 1;
        
        for (Produto lista: listaProduto) {
            System.out.printf("%d- Produto: %s | Preço de venda: R$%.2f\n Quantidade em estoque: %d unidades | ID PRODUTO: %d \n\n", i, lista.getDesignacao(), lista.getPrecoVendaPublico(), lista.getStock(), lista.getProdutoID());
            i++;
        }

        if (listaProduto.isEmpty())
            {
                System.out.println("\nLista vazia!");
            } 
    }     

    public static void addProdutos(){
        int n = 1;

        while(n != 0){
            System.out.println("--------ADICIONAR PRODUTO--------");
            System.out.println("Digite o nome do produto:");
            
            String nomeProduto = scanner.nextLine();                        
           
            System.out.println("Digite o Valor do produto(R$):");
            float valor = scanner.nextFloat();

            System.out.println("Digite a quantidade do produto(Uni):");
            int estoque = scanner.nextInt();   
            
            System.out.println("Digite o codigo do produto(ID):");
            int idProduto = scanner.nextInt();

            listaProduto.add(new Produto(nomeProduto, valor, estoque, idProduto));

            System.out.println("\n Produto ("+ nomeProduto +") foi Adicionado.");
            System.out.printf("\nProduto: %s | Preço de venda: R$%.2f\n Quantidade em estoque: %d unidades | Código do Produto: %d\n", nomeProduto,valor, estoque, idProduto);          
            
            System.out.println("\n----Novo pedido(1) ---- Voltar(0)----");
            
            n = scanner.nextInt();
            scanner.nextLine();
        }

    }

    public static void removerProduto(){
        int j = 1;

        do{
            System.out.println("\n--------Remover Produto--------\n Digite o Nome do Produto:");
            int id = scanner.nextInt();
            boolean produto = false;            
    
            for (Produto i: listaProduto)
            {
                if (i.getProdutoID() == id){
                    produto = true;
                    listaProduto.remove(i);
                    System.out.println("Produto: " + i.getDesignacao() + " removido com sucesso!");                    
                    break; 
                };
             }    

             if (listaProduto.isEmpty())
            {
                System.out.println("Lista vazia!");
            } 

             else if(produto == false){
                System.out.println("Erro: Produto não encontrado.\n");
            }

            System.out.println("\n----Remover outro(1) -------- Voltar(0)----");
            j = scanner.nextInt();
            scanner.nextLine();

        }while(j == 1);
    }
    


    private static List<Fornecedor> listaFornecedor = new ArrayList<>();

    public static void Fornecedores(){
        listaFornecedor.add(new Fornecedor("Fornecedor 01", 15915815980L, 25, 2500F,3000F));
        listaFornecedor.add(new Fornecedor("Fornecedor 02", 15945815980L, 30, 2500F,3000F));
        listaFornecedor.add(new Fornecedor("Fornecedor 03", 15914747880L, 50, 2500F,3000F));
        listaFornecedor.add(new Fornecedor("Fornecedor 04", 17852196112L, 34, 2500F,3000F));

    }

    public static void mostrarFornecedor(){
        System.out.printf("\n--------Lista de Fornecedores--------\n");
        int i = 1;
        
        for (Fornecedor lista: listaFornecedor) {
            System.out.printf("%d- Nome: %s | Idade: %d idade | CPF: %d |\n Limite de Gastos: %.2f | Total de Dívida: %.2f\n\n", i, lista.getNome(), lista.getIdade(), lista.getContribuinte(),lista.getPlafond(), lista.getValorEmDivida());
            i++;
        }

        if (listaFornecedor.isEmpty())
            {
                System.out.println("\nLista vazia!");
            } 
    }     
    
    public static void addFornecedor(){
        int n = 1;

        while(n != 0){
            System.out.println("--------ADICIONAR FORNECEDOR--------");
            System.out.println("Digite o nome:");            
            String nomeFornecedor = scanner.nextLine();                        
           
            System.out.println("Digite a Idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite o CPF:");
            long cpf = scanner.nextLong();   
            
            System.out.println("Digite o Limite de Gastos:");
            float limite= scanner.nextFloat();

            System.out.println("Digite a Dívida Atual:");
            float divida= scanner.nextFloat();

            listaFornecedor.add(new Fornecedor(nomeFornecedor, cpf, idade, limite, divida));

            System.out.println("\nFornecedor ("+ nomeFornecedor +") foi Adicionado.");
            System.out.printf("Nome: %s | Idade: %d idade | CPF: %d |\nLimite de Gastos: %.2f | Total de Dívida: %.2f |\n\n", nomeFornecedor, idade, cpf, limite, divida);          
            
            System.out.println("\n----Novo Fornecedor(1) ---- Voltar(0)----");
            
            n = scanner.nextInt();
            scanner.nextLine();
        }

    }

    public static void removerFornecedor(){
        int j = 1;

        do{
            System.out.println("\n--------Remover Fornecedor--------\n Digite o CPF do Fornecedor:");
            Long cpf = scanner.nextLong();
            boolean validador = false;            
    
            for (Fornecedor i: listaFornecedor)
            {
                if (i.getContribuinte() == cpf){
                    validador = true;
                    listaFornecedor.remove(i);
                    System.out.println("Fornecedor: " + i.getContribuinte() + " removido com sucesso!");                    
                    break; 
                };
             }    

             if (listaFornecedor.isEmpty())
            {
                System.out.println("Lista vazia!");
            } 

             else if(validador == false){
                System.out.println("Erro: Fornecedor não encontrado.\n");
            }

            System.out.println("\n----Remover outro(1) -------- Voltar(0)----");
            j = scanner.nextInt();
            scanner.nextLine();

        }while(j == 1);

    }

    private static List<Empregado> listaEmpregados = new ArrayList<>();

    public static void Empregados(){
        listaEmpregados.add(new Empregado("Empregado 01", 38927424050L, 25, 21704555, 5000F, "Analista de Sistema"));
        listaEmpregados.add(new Empregado("Empregado 02", 97780895076L, 35, 21754555, 1500F,  "Estagiário"));
        listaEmpregados.add(new Empregado("Empregado 03", 47396640032L, 19, 21764555, 1100F, "Engenheiro de Software"));
        listaEmpregados.add(new Empregado("Empregado 04", 96627689049L, 23, 21774555, 25075F,  "CEO"));

    }

    public static void mostrarEmpregados() {
        System.out.printf("\n--------Lista de Empregados--------\n");
        int i = 1;
        
        for (Empregado lista: listaEmpregados) {
            System.out.printf("%d- Nome: %s | Idade: %d idade | CPF: %d | Matrícula: %d |\n Cargo: %s | Salário Bruto: %.2f | Salário Líquido: %.2f\n\n", i, lista.getNome(), lista.getIdade(), lista.getContribuinte(), lista.getNumeroSeccao(),
            lista.getCargo(),lista.getSalarioBase(), lista.getSalario());
            i++;
        }

        if (listaEmpregados.isEmpty())
            {
                System.out.println("\nLista vazia!");
            } 
    }     
 
    public static void addEmpregados(){
        int n = 1;

        while(n != 0){
            System.out.println("--------ADICIONAR EMPREGADO--------");
            System.out.println("Digite o nome:");            
            String nomeEmpregado = scanner.nextLine();                        
           
            System.out.println("Digite a Idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite o CPF:");
            long cpf = scanner.nextLong();   
            
            System.out.println("Digite a matrícula:");
            int matricula= scanner.nextInt();

            System.out.println("Digite o Cargo:");
            String cargo= scanner.nextLine();

            System.out.println("Digite o Salário Bruto: ");
            Float salarioBruto = scanner.nextFloat();

            listaEmpregados.add(new Empregado(nomeEmpregado, cpf, idade, matricula, salarioBruto, cargo));

            System.out.println("\nEmpregado ("+ nomeEmpregado +") foi Adicionado.");
            System.out.printf("Nome: %s | Idade: %d idade | CPF: %d | Matrícula: %d |\n Cargo: %s | Salário Bruto: %.2f | \n\n", nomeEmpregado, idade, cpf,matricula, cargo,salarioBruto);
            
            System.out.println("\n----Novo Fornecedor(1) ---- Voltar(0)----");
            
            n = scanner.nextInt();
            scanner.nextLine();
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataFundacao() {
        return this.dataFundacao;
    }

    public void setDataFundacao(int dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public CodigoPostal getCp() {
        return this.cp;
    }

    public void setCp(CodigoPostal cp) {
        this.cp = cp;
    }


}
