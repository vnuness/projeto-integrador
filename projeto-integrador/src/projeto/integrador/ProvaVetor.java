package projeto.integrador;

import java.util.Scanner;
import static projeto.integrador.CadastroUsers.apelido;

public class ProvaVetor
{

    public void provaVetor()
    {
        Scanner input = new Scanner(System.in);
        int opcao;
        String[] resposta = new String[4];
        String[][] respostauser = new String[5][2];
        respostauser[0][0] = "Pergunta |";
        respostauser[0][1] = " Resposta";
        respostauser[1][0] = "    1    |";
        respostauser[2][0] = "    2    |";
        respostauser[3][0] = "    3    |";
        respostauser[4][0] = "    4    |";
        String[][] gabarito = new String[5][2];
        gabarito[0][0] = "Pergunta |";
        gabarito[0][1] = " Resposta";
        gabarito[1][0] = "    1    |";
        gabarito[1][1] = "    " + "C";
        gabarito[2][0] = "    2    |";
        gabarito[2][1] = "    " + "A";
        gabarito[3][0] = "    3    |";
        gabarito[3][1] = "    " + "D";
        gabarito[4][0] = "    4    |";
        gabarito[4][1] = "    " + "B";

        float nota = 0;
        do
        {
            System.out.println("Olá "+ apelido + " hoje iremos avaliá-lo na disciplina \"Algoritmos e Programação\" \n"
                    + "Digite [1] para começar! ");
            opcao = input.nextInt();
        } while (opcao != 1);
        System.out.println("1 - Como é feita uma declaração de variável do tipo Vetor em Java? (3,0 pontos)\n"
                + "a) Int Vetor();\n"
                + "b) Int Vetor{};\n"
                + "c) Int Vetor[];\n"
                + "d) Int Vetor /**/;\n"
                + "e) Int Vetor ([]);\n");
        resposta[0] = input.next();
        respostauser[1][1] = "    " + resposta[0];
        switch (resposta[0])
        {
            case "c":
            case "C":
                nota += 3;
                break;
        }
        System.out.println("\n");
        System.out.println("2 - Considerando que um vetor foi declarado com o nome “array”, como seria feita\n"
                + "a reserva de espaço para este vetor? (considere que o vetor terá 10 espaços na memória). (3,0 pontos)\n"
                + "a) array = new int[10];\n"
                + "b) int array() = new array [10]\n"
                + "c) array = new int[20];\n"
                + "d) array = {10};\n");
        resposta[1] = input.next();
        respostauser[2][1] = "    " + resposta[1];
        switch (resposta[1])
        {
            case "a":
            case "A":
                nota += 3;
                break;
        }
        System.out.println("\n");
        System.out.print("3 - Dada a sequência numérica de até 100 números : {0, 3, 6, 12 , 21, 36 ...} supondo que a sequência \n"
                + "seja um vetor e os valores sejam armazenados da esquerda para a direita, \n"
                + "sendo (vetor[0] = 0, vetor[1] = 3 ...) qual seria o valor do vetor na posição [9] ? (3,0 pontos)d\n"
                + "a) 251\n"
                + "b) 93\n"
                + "c) 248\n"
                + "d) 264\n");
        resposta[2] = input.next();
        respostauser[3][1] = "    " + resposta[2];
        switch (resposta[2])
        {
            case "d":
            case "D":
                nota += 3;
                break;
        }
        System.out.println("\n");
        System.out.println("4 - Um programa utiliza o laço de repetição FOR para realizar uma contagem de 1 até 10 e armazena\n"
                + "os valores da contagem dentro de um vetor, e imprime o vetor na posição “i”.\n"
                + "Considere o código a seguir: \n"
                + "int v[] = new int[10];\n"
                + "   for (int i = 1; i <= 10; i++)\n"
                + "   {\n"
                + "       v[i] = i;\n"
                + "       System.out.println(v[i]);\n"
                + "   }\n"
                + "\n"
                + "O laço de repetição imprime os valores de 1 até 10 ao final da execução ? (1,0 pontos)\n"
                + "a) Verdadeiro\n"
                + "b) Falso\n");
        resposta[3] = input.next();
        respostauser[4][1] = "    " + resposta[3];
        switch (resposta[3])
        {
            case "b":
            case "B":
                nota += 1;
                break;
        }
        System.out.println("A prova valia 10 pontos, e sua nota foi: " + nota + "\n");
        System.out.print("   Suas Respostas:");
        System.out.print("                        Gabarito: \n");
        System.out.println(respostauser[0][0] + respostauser[0][1] + "                  " + gabarito[0][0] + gabarito[0][1]);
        System.out.println(respostauser[1][0] + respostauser[1][1] + "                      " + gabarito[1][0] + gabarito[1][1]);
        System.out.println(respostauser[2][0] + respostauser[2][1] + "                      " + gabarito[2][0] + gabarito[2][1]);
        System.out.println(respostauser[3][0] + respostauser[3][1] + "                      " + gabarito[3][0] + gabarito[3][1]);
        System.out.println(respostauser[4][0] + respostauser[4][1] + "                      " + gabarito[4][0] + gabarito[4][1]);

    }
}
