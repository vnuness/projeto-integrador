package projeto.integrador.DEV;

import java.util.Scanner;

public class TesteVocacional {

    public static void main(String[] args) {
        int opcao = 0, tmp = 0, contD = 0, contA = 0, contC = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Olá Fulano, recebemos seus dados de inscrição com sucesso !\n"
                + "Agora, \n"
                + "Você irá participar do nosso teste vocacional para te ajudar ainda mais a traçar seu caminho. \n");

        do {
            System.out.println("Digite [1] para iniciar o teste\n" + "Digite [2] para sair");
            opcao = input.nextInt();

            if (opcao == 2) {
                //System.exit(0);
                break;
            } else if (opcao != 1 && opcao != 2) {
                System.err.println("Opção inválida!");
            } else {
                System.out.println("### Bem vindo ao Nosso Testes Vocacional ###");
            }
        } while (opcao != 1);

        for (int i = 1; i < 12; i++) {
            System.out.println(i + "º Pergunta:");

            System.out.println("Agora Imagine sua vida daqui dez anos, como você se imagina como um profissional ?");

            System.out.println("1) Realizado, fazendo as coisas que gosto.");
            System.out.println("2) Reconhecido e valorizado no mercado.");
            System.out.println("3) Sério, dando continuidade ao trabalho dos meus pais.");
            System.out.println("4) Muito bem sucedido financeiramente.");
            System.out.println("5) Atuante em minha comunidade.");
            tmp = input.nextInt();

            while (tmp < 1 || tmp > 5) {
                System.err.println("Opção invalida! digite de 1 a 5");
                tmp = input.nextInt();
            }

            
            
            
            
            
            
        } //FIM DO LAÇO DE REPETIÇÃO DO FOR 

        System.out.println("### FIM DO TESTE VOCACIONAL ###");
    }
}
