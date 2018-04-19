package projeto.integrador.DEV;

import java.util.Scanner;

public class TesteVocacional
{

    public static void main(String[] args)
    {
        int opcao;
        Scanner input = new Scanner(System.in);

        System.out.println("Olá Fulano, recebemos seus dados de inscrição com sucesso !\n"
                + "Agora, \n"
                + "Você irá participar do nosso teste vocacional para te ajudar ainda mais a traçar seu caminho. \n");
        do
        {
            System.out.println("Digite [1] para iniciar o teste\n"
                    + "Digite [2] para sair"
            );
            opcao = input.nextInt();
            if (opcao == 2)
            {
                System.exit(0);
            } else if (opcao != 1 && opcao != 2)
            {
                System.out.println("Opção inválida!");
            }
        } while (opcao != 1);

    }
}
