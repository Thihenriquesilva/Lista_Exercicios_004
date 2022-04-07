public class Ex004Teste {
    public static void main(String[] args) {
        
        //Instânciandos os objetos
        //Atribuindo os dados através dos parametros presentes no método Construtor
        
        Ex003Veiculo v1 = new Ex003Veiculo("Azul","Fusca");
        Ex003Veiculo v2 = new Ex003Veiculo("Vermelho","Azira");

        
        //Chamando o metodo do objeto V1
        v1.ExibirInformacoes();
        v1.ligarVeiculo();
        //Chamando o método do objeto v2
        v2.ExibirInformacoes();
        v2.ligarVeiculo();


        //Ver os valores atribuidos a cada variável com o método de acesso GET
        v1.getCor();//Exibe cor veiculo 1
        v1.getModelo();//Exibe modelo veiculo 1

        v2.getCor();//Exibe cor veiculo 2
        v2.getModelo();//Exibe modelo veiculo 2
    }
}
