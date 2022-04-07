public class Ex003Veiculo {
    //atributos: Caracteristicas que o objeto possui
    /*
        Visibilidade: Importante para a proteção do código e suas funcionalidades. Define quem pode alterar cada dado dos trechos de código. Há três principais niveis:
        Public - Qualquer um possui;
        Private - Acesso limitado a própria classe;
        Protect - Acesso limitado a própria classe e as classes derivadas;
    */
    private String cor;
    private String modelo;

    // Encapsulamento
    // Métodos de acesso
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }


    /**
     * 3-Reescreva a classe do exercicio 1 adicionando a ela um construtor que recebe valores a serem atribuidos as duas variáveis de instância da classe.
     */
    //Construtor: Responvavel pela inicialização do objeto
    //Por padrão o construtor inicializa o obejto vazio
    //O construtor pode ser modificado adicionando parametros nele
    //Para que o objeto ja inicialize com dados
    //Quando o construtor é alterado com a adição de parametros
    //O construtor padrão deixa de esxistir, dando espaço para esse novo construtor com parametros
    public Ex003Veiculo(String cor, String modelo){
        this.cor = cor;
        this.modelo = modelo;
    }

    public void ExibirInformacoes(){
        System.out.println("Informações do veículo");
        System.out.printf("\nCor: %s\nModelo: %s", this.cor, this.modelo);
    }

    
    public void ligarVeiculo(){
        System.out.println("\nO veículo está ligado");
    }

}
