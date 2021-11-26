import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    
    private String nome;
    private String dataFundacao;
    private String cnpj;
    private String email;
    private String telefone;
    private CodigoPostal cp= new CodigoPostal(29122,125);

    static Scanner scanner = new Scanner(System.in); 
    static Scanner menu = new Scanner(System.in);   

    

    public Empresa(){
        this.nome = "INSIGHT SOLUCOES EM TECNOLOGIA E COMPLIANCE LTDA.";
        this.cnpj = "29.779.498/0001-14";
        this.dataFundacao = ("26/08/2018");
        this.email = "contato@insight.com.br";
        this.telefone= "(27)3030-7045";    
    }

    public  void mostrar(){
        System.out.println("------DADOS EMPRESARIAIS------");
        System.out.printf("Nome Empresarial: " + getNome());    
        System.out.println("\nCNPJ: " + getCnpj());    
        System.out.println( "E-mail: "+ getEmail()); 
        System.out.println("Contato: " + getTelefone());         
        System.out.println("Data de Fundação: " + getDataFundacao());             
        

    }
    
    private  List<Produto> listaProduto = new ArrayList<>();

    public  void Produtos(){
        listaProduto.add(new Produto("MousePad Gamer",(float) 125.90, 19, 2525));
        listaProduto.add(new Produto("Teclado Gamer",(float) 126.90, 18, 2526));
        listaProduto.add(new Produto("HeadSet Gamer",(float) 127.90, 17, 2527));
    }

    public  void mostrarProdutos(){
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

    public  void addProdutos(){
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
            
            System.out.println("\n----Novo Produto(1) ---- Voltar(0)----");
            
            n = scanner.nextInt();
            scanner.nextLine();
        }

    }

    public  void removerProduto(){
        int j = 1;

        do{
            System.out.println("\n--------Remover Produto--------\n Digite o ID do Produto:");
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
   
    public  void menuProdutos(){
        
        int i = 0;

        do{
            System.out.println("--------MENU PRODUTOS--------");
            System.out.println("0- Voltar"); //feito             
            System.out.println("1- Mostrar Produtos"); //feito
            System.out.println("2- Adicionar Produto"); //feito
            System.out.println("3- Remover Produto"); //feito
            
            int opcao = menu.nextInt();

            switch (opcao) {

                case 0:{
                    i=0;
                    break;
                }
   
                case 1: {
                    mostrarProdutos();
                    i=1;            
                    break;
                }
                case 2: {
                    addProdutos();    
                    i=1;            
                    break;
                }
               
                case 3: {
                    removerProduto();                    
                    i=1; 
                    break;
                }  

                default: {
                    System.out.println("Opção Inválida, Digite Novamente");
                    i=1; 
                }
            }


        }while(i != 0);
     
    }

    
    public void menuPessoas(){
        
        int i = 0;

        do{
            System.out.println("--------MENU PESSOAS--------");
            System.out.println("0- Voltar"); //feito             
            System.out.println("1- Fornecedores"); //feito
            System.out.println("2- Empregados"); //feito
            System.out.println("3- Clientes"); //feito
            
            int opcao = menu.nextInt();

            switch (opcao) {

                case 0:{
                    i=0;
                    break;
                }
   
                case 1: {
                    menuFornecedor();;
                    i=1;            
                    break;
                }
                case 2: {
                    menuEmpregado();   
                    i=1;            
                    break;
                }
               
                case 3: {
                    menuCliente();                  
                    i=1; 
                    break;
                }  

                default: {
                    System.out.println("Opção Inválida, Digite Novamente");
                    i=1; 
                }
            }


        }while(i != 0);
     
    }
    

    private  List<Fornecedor> listaFornecedor = new ArrayList<>();

    public  void Fornecedores(){
        listaFornecedor.add(new Fornecedor("Fornecedor 01", 15915815980L, 25, 2500F,3000F));
        listaFornecedor.add(new Fornecedor("Fornecedor 02", 15945815980L, 30, 2500F,3000F));
        listaFornecedor.add(new Fornecedor("Fornecedor 03", 15914747880L, 50, 2500F,3000F));
        listaFornecedor.add(new Fornecedor("Fornecedor 04", 17852196112L, 34, 2500F,3000F));

    }

    public  void mostrarFornecedor(){
        System.out.printf("\n--------Lista de Fornecedores--------\n");
        int i = 1;
        
        for (Fornecedor lista: listaFornecedor) {
            System.out.printf("%d- Nome: %s | Idade: %d idade | CPF: %d |\n Limite de Gastos: R$%.2f | Total de Dívida: R$%.2f\n\n", i, lista.getNome(), lista.getIdade(), lista.getContribuinte(),lista.getPlafond(), lista.getValorEmDivida());
            i++;
        }

        if (listaFornecedor.isEmpty())
            {
                System.out.println("\nLista vazia!");
            } 
    }     
    
    public  void addFornecedor(){
        int n = 1;

        while(n != 0){
            System.out.println("--------ADICIONAR FORNECEDOR--------");
            System.out.println("Digite o nome:");            
            String nomeFornecedor = scanner.nextLine();                        
           
            System.out.println("\nDigite a Idade:");
            int idade = scanner.nextInt();

            System.out.println("\nDigite o CPF:");
            long cpf = scanner.nextLong();   
            
            System.out.println("Digite o Limite de Gastos:");
            float limite= scanner.nextFloat();

            System.out.println("Digite a Dívida Atual:");
            float divida= scanner.nextFloat();

            listaFornecedor.add(new Fornecedor(nomeFornecedor, cpf, idade, limite, divida));

            System.out.println("\nFornecedor ("+ nomeFornecedor +") foi Adicionado.");
            System.out.printf("Nome: %s | Idade: %d idade | CPF: %d |\nLimite de Gastos: R$%.2f | Total de Dívida: R$%.2f |\n\n", nomeFornecedor, idade, cpf, limite, divida);          
            
            System.out.println("\n----Novo Fornecedor(1) ---- Voltar(0)----");
            
            n = scanner.nextInt();
            scanner.nextLine();
        }

    }

    public  void removerFornecedor(){
        int j = 1;

        do{
            System.out.println("\n--------Remover Fornecedor--------\n Digite o CPF:");
            long id = scanner.nextLong();
            boolean fornecedor = false;            
    
            for (Fornecedor i: listaFornecedor)
            {
                if (i.getContribuinte() == id){
                    fornecedor = true;
                    listaFornecedor.remove(i);
                    System.out.println("Fornecedor: " + i.getNome() + " removido com sucesso!");                    
                    break; 
                };
             }    

             if (listaFornecedor.isEmpty())
            {
                System.out.println("Lista vazia!");
            } 

             else if(fornecedor == false){
                System.out.println("Erro: Fornecedor não encontrado.\n");
            }

            System.out.println("\n----Remover outro(1) -------- Voltar(0)----");
            j = scanner.nextInt();
            scanner.nextLine();

        }while(j == 1);
    }

    public  void menuFornecedor(){
        
        int i = 0;

        do{
            System.out.println("--------MENU FORNECEDORES--------");
            System.out.println("0- Voltar"); //feito             
            System.out.println("1- Mostrar Fornecedores"); //feito
            System.out.println("2- Adicionar Fornecedores"); //feito
            System.out.println("3- Remover Fornecedores"); //feito
            
            int opcao = menu.nextInt();

            switch (opcao) {

                case 0:{
                    i=0;
                    break;
                }
   
                case 1: {
                    mostrarFornecedor();
                    i=1;            
                    break;
                }
                case 2: {
                    addFornecedor();    
                    i=1;            
                    break;
                }
               
                case 3: {
                    removerFornecedor();                    
                    i=1; 
                    break;
                }  

                default: {
                    System.out.println("Opção Inválida, Digite Novamente");
                    i=1; 
                }
            }


        }while(i != 0);
     
    }
    
    
    private  List<Empregado> listaEmpregados = new ArrayList<>();

    public  void Empregados(){
        listaEmpregados.add(new Empregado("Empregado 01", 38927424050L, 25, 21704555, 5000F, "Analista de Sistema"));
        listaEmpregados.add(new Empregado("Empregado 02", 97780895076L, 35, 21754555, 1500F,  "Estagiário"));
        listaEmpregados.add(new Empregado("Empregado 03", 47396640032L, 19, 21764555, 1100F, "Engenheiro de Software"));
        listaEmpregados.add(new Empregado("Empregado 04", 96627689049L, 23, 21774555, 25075F,  "CEO"));

    }

    public  void mostrarEmpregados() {
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
 
    public  void addEmpregados(){
        int n = 1;

        while(n != 0){
            System.out.println("--------ADICIONAR EMPREGADO--------");
            System.out.println("Digite o nome:");            
            String nomeEmpregado = scanner.nextLine();                        
           
            System.out.println("\nDigite a Idade:");
            int idade = scanner.nextInt();

            System.out.println("\nDigite o CPF:");
            long cpf = scanner.nextLong();   
            
            System.out.println("\nDigite a matrícula:");
            int matricula= scanner.nextInt();

            System.out.println("\nDigite o Cargo:");
            String cargo= scanner.next();
            scanner.nextLine();

            System.out.println("\nDigite o Salário Bruto: ");
            Float salarioBruto = scanner.nextFloat();

            listaEmpregados.add(new Empregado(nomeEmpregado, cpf, idade, matricula, salarioBruto, cargo));

            System.out.println("\nEmpregado ("+ nomeEmpregado +") foi Adicionado.");
            System.out.printf("Nome: %s | Idade: %d idade | CPF: %d | Matrícula: %d |\n Cargo: %s | Salário Bruto: R$%.2f | \n\n", nomeEmpregado, idade, cpf,matricula, cargo,salarioBruto);
            
            System.out.println("\n----Novo Fornecedor(1) ---- Voltar(0)----");
            
            n = scanner.nextInt();
            scanner.nextLine();
        }
    }

    public  void removerEmpregados(){
        int j = 1;

        do{
            System.out.println("\n--------Remover Empregado--------\n Digite a Matrícula:");
            int id = scanner.nextInt();
            boolean empregado = false;            
    
            for (Empregado i: listaEmpregados)
            {
                if (i.getNumeroSeccao() == id){
                    empregado = true;
                    listaEmpregados.remove(i);
                    System.out.println("Empregado: " + i.getNome() + " removido com sucesso!");                    
                    break; 
                };
             }    

             if (listaEmpregados.isEmpty())
            {
                System.out.println("Lista vazia!");
            } 

             else if(empregado == false){
                System.out.println("Erro: Produto não encontrado.\n");
            }

            System.out.println("\n----Remover outro(1) -------- Voltar(0)----");
            j = scanner.nextInt();
            scanner.nextLine();

        }while(j == 1);
    }

    public  void menuEmpregado(){
        
        int i = 0;

        do{
            System.out.println("--------MENU EMPREGADO--------");
            System.out.println("0- Voltar"); //feito             
            System.out.println("1- Mostrar Empregados"); //feito
            System.out.println("2- Adicionar Empregado"); //feito
            System.out.println("3- Remover Empregados"); //feito
            
            int opcao = menu.nextInt();

            switch (opcao) {

                case 0:{
                    i=0;
                    break;
                }
   
                case 1: {
                    mostrarEmpregados();
                    i=1;            
                    break;
                }
                case 2: {
                    addEmpregados();    
                    i=1;            
                    break;
                }
               
                case 3: {
                    removerEmpregados();                    
                    i=1; 
                    break;
                }  

                default: {
                    System.out.println("Opção Inválida, Digite Novamente");
                    i=1; 
                }
            }


        }while(i != 0);
     
    }

    private List<Cliente> listaClientes = new ArrayList<>();

    public  void Clientes(){
        listaClientes.add(new Cliente("Cliente 01", 22430783096L, 25, 1000.00F,580.50F));
        listaClientes.add(new Cliente("Cliente 02", 78643763047L, 35, 1500.00F,1080.60F));
        listaClientes.add(new Cliente("Cliente 03", 83872477072L, 28, 2500.00F,2000.00F));
        listaClientes.add(new Cliente("Cliente 04", 92182587020L, 51, 5500.00F,3240.00F));
    }

    public  void mostrarClientes(){
        System.out.printf("\n--------Lista de Clientes--------\n");
        int i = 1;
        
        for (Cliente lista: listaClientes) {
            System.out.printf("%d- Nome: %s | Idade: %d idade | CPF: %d |\n Limite de Gastos: R$%.2f | Total de Dívida: R$%.2f | Saldo: R$%.2f |\n\n", i, lista.getNome(), lista.getIdade(), lista.getContribuinte(),lista.getPlafond(), lista.getValorEmDivida(), lista.getSaldo());
            i++;
        }

        if (listaFornecedor.isEmpty())
            {
                System.out.println("\nLista vazia!");
            } 
    }

    public  void addClientes(){
        int n = 1;

        while(n != 0){
            System.out.println("--------ADICIONAR CLIENTE--------");
            System.out.println("Digite o nome:");            
            String nomeCliente = scanner.nextLine();                        
           
            System.out.println("\nDigite a Idade:");
            int idade = scanner.nextInt();

            System.out.println("\nDigite o CPF:");
            long cpf = scanner.nextLong();   
            
            System.out.println("\nDigite o Limite de Gastos:");
            float limite= scanner.nextFloat();

            System.out.println("\nDigite a Dívida Atual:");
            float divida= scanner.nextFloat();

            listaClientes.add(new Cliente(nomeCliente, cpf, idade, limite, divida));

            System.out.println("\nCliente ("+ nomeCliente +") foi Adicionado.");
            System.out.printf("Nome: %s | Idade: %d idade | CPF: %d |\nLimite de Gastos: R$%.2f | Total de Dívida: R$%.2f |\n\n", nomeCliente, idade, cpf, limite, divida);          
            
            System.out.println("\n----Novo Cliente(1) ---- Voltar(0)----");
            
            n = scanner.nextInt();
            scanner.nextLine();
        }

    }

    public  void menuCliente(){
        
        int i = 0;

        do{
            System.out.println("--------MENU CLIENTE--------");
            System.out.println("0- Voltar"); //feito             
            System.out.println("1- Mostrar Clientes"); //feito
            System.out.println("2- Adicionar Cliente"); //feito
            System.out.println("3- Remover Cliente"); //feito
            
            int opcao = menu.nextInt();

            switch (opcao) {

                case 0:{
                    i=0;
                    break;
                }
   
                case 1: {
                    mostrarClientes();
                    i=1;            
                    break;
                }
                case 2: {
                    addClientes();    
                    i=1;            
                    break;
                }
               
                case 3: {
                    //removerClientes();                    
                    i=1; 
                    break;
                }  

                default: {
                    System.out.println("Opção Inválida, Digite Novamente");
                    i=1; 
                }
            }


        }while(i != 0);
     
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataFundacao() {
        return this.dataFundacao;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public CodigoPostal getCp() {
        return this.cp;
    }

    public void setCp(CodigoPostal cp) {
        this.cp = cp;
    }


    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

   

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
