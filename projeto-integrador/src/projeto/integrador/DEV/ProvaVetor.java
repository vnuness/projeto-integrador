package projeto.integrador.DEV;

import java.util.Scanner;

public class ProvaVetor
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int opcao;
        String resposta;
        int nota = 0;
        do
        {
            System.out.println("Olá Fulano, hoje iremos avaliá-lo na disciplina \"Algoritmos e Programação\" \n"
                    + "Digite [1] para começar! ");
            opcao = input.nextInt();
        } while (opcao != 1);
        System.out.println("1 - Como é feita uma declaração de variável do tipo Vetor em Java? (3,0 pontos)\n"
                + "a) Int Vetor();\n"
                + "b) Int Vetor{};\n"
                + "c) Int Vetor[];\n"
                + "d) Int Vetor /**/;\n"
                + "e) Int Vetor ([]);\n");
        resposta = input.next();
        switch (resposta)
        {
            case "c":
            case "C":
                nota += 3;
                break;
        }
        System.out.println("\n");
        System.out.println("2 - Considerando que um vetor foi declarado com o nome “array”, como seria feita\n"
                + "a reserva de espaço para este vetor? (considere que o vetor terá 10 espaços na memória). (3,0 pontos)\n"
                + "a) array = new int[9];\n"
                + "b) int array() = new array [10]\n"
                + "c) array = new int[20];\n"
                + "d) array = {10};\n");
        resposta = input.next();
        switch (resposta)
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
        resposta = input.next();
        switch (resposta)
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
        resposta = input.next();
        switch(resposta){
            case"b":
            case"B":
                nota += 1;
                break;
        }
        System.out.println("A prova valia 10 pontos, e sua nota foi: " + nota);
    }
}
