

import java.util.Scanner;

public class Ex002Teste {
    public static void main(String[] args) {

        // 2-Escreva uma classe de teste que:
        //2.1-Instância dois veiculos
        Ex001Veiculo v1 = new Ex001Veiculo();
        Ex001Veiculo v2 = new Ex001Veiculo();

        //2.2-Obtém valores para seus atributos e os atribui adequadamente

        //Scanner objeto responsavel por ler dados do usuário
        Scanner scn = new Scanner(System.in);
        
        //1ºVEICULO
        System.out.printf("Cor do 1º veiculo: ");
        String cor = scn.nextLine();
        System.out.printf("\nModelo do 1º veiculo: ");
        String modelo =scn.nextLine();
        v1.setCor(cor);
        v1.setModelo(modelo);
        //2º VEICULO
        System.out.printf("Cor do 2º veiculo: ");
        String cor2 = scn.nextLine();
        System.out.printf("\nModelo do 2º veiculo: ");
        String modelo2 =scn.nextLine();
        v2.setCor(cor2);
        v2.setModelo(modelo2);

        //2.3Chama cada um dos métodos que você criou.
        //Chamando o metodo do objeto V1
        v1.ExibirInformacoes();
        v1.ligarVeiculo();
    
        System.out.println();//Apenas para pularuma linha
        //Chamando o método do objeto v2
        v2.ExibirInformacoes();
        v2.ligarVeiculo();

        //2.4-Exibe os valores das variáveis usando os métodos getters
        v1.getCor();//Exibe a cor do veiculo 1
        v1.getModelo();//Exibe o modelo do veiculo 1

        v2.getCor();//Exibe a cor do veiculo 2
        v2.getModelo();//Exibe o modelo do veiculo 2
        
        scn.close();
    }
}
