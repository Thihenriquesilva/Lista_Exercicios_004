

public class Ex001Veiculo{
    /*
        1Escrever uma classe que representa um veiculo:
        2 atributos;
        2 métodos;
        Getter/Setters para cada atributo
    */

    //************ATRIBUTOS***************/
    //atributos: Caracteristicas que o objeto possui
    /*
        Visibilidade: Importante para a proteção do código e suas funcionalidades. Define quem pode alterar cada dado dos trechos de código. Há três principais niveis:
        Public - Qualquer um possui;
        Private - Acesso limitado a própria classe;
    */
    private String cor;
    private String modelo;

    /*************GET / SET**************/
    // Encapsulamento
    // Métodos de acesso
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        //Auto referencia ao atributo
        //A cor deste veículo recebe o valor  da cor passada por parametro
        this.cor = cor;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }


    /**************MÉTODOS ***************/
    public void ExibirInformacoes(){
        System.out.println("Informações do veículo");
        System.out.printf("\nCor: %s\nModelo: %s", this.cor, this.modelo);
    }

    
    public void ligarVeiculo(){
        System.out.println("\nO veículo está ligado");
    }
}