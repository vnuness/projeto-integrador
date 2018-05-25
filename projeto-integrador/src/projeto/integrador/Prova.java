package projeto.integrador;

import java.util.Scanner;
import static projeto.integrador.CadastroUsers.apelido;

public class Prova
{

    static float nota = 0;
    static String[] resposta = new String[12];
    static String[][] respostauser = new String[13][2];
    static String[][] gabarito = new String[13][2];
    
    public static void gabarito()
    {
        
        respostauser[0][0] = "Pergunta |";
        respostauser[0][1] = " Resposta";
        respostauser[1][0] = "    1    |";
        respostauser[2][0] = "    2    |";
        respostauser[3][0] = "    3    |";
        respostauser[4][0] = "    4    |";
        respostauser[5][0] = "    5    |";
        respostauser[6][0] = "    6    |";
        respostauser[7][0] = "    7    |";
        respostauser[8][0] = "    8    |";
        respostauser[9][0] = "    9    |";
        respostauser[10][0] = "    10   |";
        respostauser[11][0] = "    11   |";
        respostauser[12][0] = "    12   |";
        
        gabarito[0][0] = "Pergunta |";
        gabarito[0][1] = " Resposta";
        gabarito[1][0] = "    1    |";
        gabarito[1][1] = "    " + "C";
        gabarito[2][0] = "    2    |";
        gabarito[2][1] = "    " + "C";
        gabarito[3][0] = "    3    |";
        gabarito[3][1] = "    " + "B";
        gabarito[4][0] = "    4    |";
        gabarito[4][1] = "    " + "A";
        gabarito[5][0] = "    5    |";
        gabarito[5][1] = "    " + "A";
        gabarito[6][0] = "    6    |";
        gabarito[6][1] = "    " + "C";
        gabarito[7][0] = "    7    |";
        gabarito[7][1] = "    " + "B";
        gabarito[8][0] = "    8    |";
        gabarito[8][1] = "    " + "A";
        gabarito[9][0] = "    9    |";
        gabarito[9][1] = "    " + "C";
        gabarito[10][0] = "    10   |";
        gabarito[10][1] = "    " + "A";
        gabarito[11][0] = "    11   |";
        gabarito[11][1] = "    " + "D";
        gabarito[12][0] = "    12   |";
        gabarito[12][1] = "    " + "B";
    }

    public void provaIfElse()
    {
        gabarito();
        Scanner input = new Scanner(System.in);
        int opcao;
        do
        {
            System.out.println("Olá " + apelido + " hoje iremos avaliá-lo na disciplina \"Algoritmos e Programação\" \n"
                    + "Digite [1] para começar! ");
            opcao = input.nextInt();
        } while (opcao != 1);
        System.out.println("1 - Qual estrutura condicional que pode substituir um bloco com muitas estruturas if/else? (0,2 pontos)");
        System.out.println("a) While ");
        System.out.println("b) for ");
        System.out.println("c) switch case ");
        System.out.println("d) switch default ");
        resposta[0] = input.next();
        respostauser[1][1] = "    " + resposta[0];
        switch (resposta[0])
        {
            case "c":
            case "C":
                nota += 0.2;
                break;
        }

        System.out.println("2 - Como é chamado o conjunto de vários If else no mesmo bloco? (0,2 pontos)");
        System.out.println("a) if else conjunto ");
        System.out.println("b) if else alinhado ");
        System.out.println("c) if else aninhado ");
        System.out.println("d) Nenhum desses ");
        resposta[1] = input.next();
        respostauser[2][1] = "    " + resposta[1];
        switch (resposta[1])
        {
            case "c":
            case "C":
                nota += 0.2;
                break;
        }
        System.out.println("3 - Dado a seguinte sintaxe: if (expressão);{ (1,0 pontos)"
                + " comando "
                + "}");
        System.out.println(" Assinale a alternativa correta: 2,0 pontos");
        System.out.println("a) A sintaxe está correta. ");
        System.out.println("b) Não deve-se usar ponto e virgula após a expressão. ");
        System.out.println("c) Não se deve usar os comandos de dentro da condição. ");
        System.out.println("d) Nenhuma das alternativas. ");
        resposta[2] = input.next();
        respostauser[3][1] = "    " + resposta[2];
        switch (resposta[2])
        {
            case "b":
            case "B":
                nota += 1;
                break;
        }
        System.out.println("4 - Qual o tipo de variável é verificado na condição do if?  (0,2 pontos)");
        System.out.println("a) Boolean ");
        System.out.println("b) char ");
        System.out.println("c) String ");
        System.out.println("d) Double");
        resposta[3] = input.next();
        respostauser[4][1] = "    " + resposta[3];
        switch (resposta[3])
        {
            case "a":
            case "A":
                nota += 0.2;
                break;
        }

    }

    public void provaSwitch()
    {
        gabarito();
        Scanner input = new Scanner(System.in);
        System.out.println("\n ");
        System.out.println("5 - Selecione a melhor situação para se usar switch case. (0,4 pontos)\n"
                + "a) No menu de um sistema gostaria que me levasse a determinada\n"
                + "opção selecionada no menu.\n"
                + "b) Mostrar a Soma ou divisão ou qualquer equação matemática"
                + "de dois números.\n"
                + "c) Informações de usúarios do sistema.");
        resposta[4] = input.next();
        respostauser[5][1] = "    " + resposta[4];
        switch (resposta[4])
        {
            case "a":
            case "A":
                nota += 0.4;
                break;
        }
        System.out.println("6 - O switch case tem como a principal função dentro de uma linguagem de programação... (0,5 pontos)"
                + "\n a) Fazer equações matemáticas e retornar o resultado."
                + "\n b) Fazer que algo selecionado se repita varias e varias"
                + "vezes dentro do sistema."
                + "\n c) Levar o usuário para determinado lugar selecionado no menu. ");
        resposta[5] = input.next();
        respostauser[6][1] = "    " + resposta[5];
        switch (resposta[5])
        {
            case "c":
            case "C":
                nota += 0.5;
                break;
        }
        System.out.println("7 - Qual das opções está certa de como inciar o Switch case? (1,0 pontos)"
                + "\n a) Declarar Variável associada ao Switch e colocar, Switch();"
                + "\n b) Declarar Váriável associada ao switch, inicializar ela, coloca,"
                + "switch(variável){ e iniciar as cases."
                + "\n c) Declarar Variável associada ao switch, e colocar,"
                + "switch(variável) e iniciar as cases. ");
        resposta[6] = input.next();
        respostauser[7][1] = "    " + resposta[6];
        switch (resposta[6])
        {
            case "b":
            case "B":
                nota += 1;
                break;
        }
        System.out.println("8 - Qual a informação INCORRETA? (2,0 pontos)\n"
                + " a) Switch pode ser usado para que as informações dentro \n"
                + "dele seja repetida inúmeras vezes ou até mesmo determinadas vezes"
                + "\n b) Switch pode ser usado para guarda funções e informações dentro de cada case"
                + "\n c) Switch pode ser usado para deixar as funções mais organizadas na hora"
                + "de chamar para ser executada. ");
        resposta[7] = input.next();
        respostauser[8][1] = "    " + resposta[7];
        switch (resposta[7])
        {
            case "a":
            case "A":
                nota += 2;
                break;
        }

    }

    public void provaVetor()
    {
        gabarito();
        Scanner input = new Scanner(System.in);
        System.out.println("9 - Como é feita uma declaração de variável do tipo Vetor em Java? (0,5 pontos)\n"
                + "a) Int Vetor();\n"
                + "b) Int Vetor{};\n"
                + "c) Int Vetor[];\n"
                + "d) Int Vetor /**/;\n"
                + "e) Int Vetor ([]);\n");
        resposta[8] = input.next();
        respostauser[9][1] = "    " + resposta[8];
        switch (resposta[8])
        {
            case "c":
            case "C":
                nota += 0.5;
                break;
        }
        System.out.println("\n");
        System.out.println("10 - Considerando que um vetor foi declarado com o nome “array”, como seria feita\n"
                + "a reserva de espaço para este vetor? (considere que o vetor terá 10 espaços na memória). (1,0 pontos)\n"
                + "a) array = new int[10];\n"
                + "b) int array() = new array [10]\n"
                + "c) array = new int[20];\n"
                + "d) array = {10};\n");
        resposta[9] = input.next();
        respostauser[10][1] = "    " + resposta[9];
        switch (resposta[9])
        {
            case "a":
            case "A":
                nota += 1;
                break;
        }
        System.out.println("\n");
        System.out.print("11 - Dada a sequência numérica de até 100 números : {0, 3, 6, 12 , 21, 36 ...} supondo que a sequência \n"
                + "seja um vetor e os valores sejam armazenados da esquerda para a direita, \n"
                + "sendo (vetor[0] = 0, vetor[1] = 3 ...) qual seria o valor do vetor na posição [9] ? (2,0 pontos)d\n"
                + "a) 251\n"
                + "b) 93\n"
                + "c) 248\n"
                + "d) 264\n");
        resposta[10] = input.next();
        respostauser[11][1] = "    " + resposta[10];
        switch (resposta[10])
        {
            case "d":
            case "D":
                nota += 2;
                break;
        }
        System.out.println("\n");
        System.out.println("12 - Um programa utiliza o laço de repetição FOR para realizar uma contagem de 1 até 10 e armazena\n"
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
        resposta[11] = input.next();
        respostauser[12][1] = "    " + resposta[11];
        switch (resposta[11])
        {
            case "b":
            case "B":
                nota += 2;
                break;
        }
        
        
    }
    
    public float  imprimeResultado()
    {
        System.out.println("A prova valia 10 pontos, e sua nota foi: " + nota + "\n");
        System.out.print("   Suas Respostas:");
        System.out.print("                        Gabarito: \n");
        System.out.println(respostauser[0][0] + respostauser[0][1] + "                  " + gabarito[0][0] + gabarito[0][1]);
        System.out.println(respostauser[1][0] + respostauser[1][1] + "                      " + gabarito[1][0] + gabarito[1][1]);
        System.out.println(respostauser[2][0] + respostauser[2][1] + "                      " + gabarito[2][0] + gabarito[2][1]);
        System.out.println(respostauser[3][0] + respostauser[3][1] + "                      " + gabarito[3][0] + gabarito[3][1]);
        System.out.println(respostauser[4][0] + respostauser[4][1] + "                      " + gabarito[4][0] + gabarito[4][1]);
        System.out.println(respostauser[5][0] + respostauser[5][1] + "                      " + gabarito[5][0] + gabarito[5][1]);
        System.out.println(respostauser[6][0] + respostauser[6][1] + "                      " + gabarito[6][0] + gabarito[6][1]);
        System.out.println(respostauser[7][0] + respostauser[7][1] + "                      " + gabarito[7][0] + gabarito[7][1]);
        System.out.println(respostauser[8][0] + respostauser[8][1] + "                      " + gabarito[8][0] + gabarito[8][1]);
        System.out.println(respostauser[9][0] + respostauser[9][1] + "                      " + gabarito[9][0] + gabarito[9][1]);
        System.out.println(respostauser[10][0] + respostauser[10][1] + "                      " + gabarito[10][0] + gabarito[10][1]);
        System.out.println(respostauser[11][0] + respostauser[11][1] + "                      " + gabarito[11][0] + gabarito[11][1]);
        System.out.println(respostauser[12][0] + respostauser[12][1] + "                      " + gabarito[12][0] + gabarito[12][1]);
        System.out.println("\n");
        return nota;
    }
    
    
}
