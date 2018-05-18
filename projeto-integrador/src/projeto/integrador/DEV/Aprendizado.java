package projeto.integrador.DEV;

import java.util.Scanner;

public class Aprendizado
{

    public static void main(String[] args)
    {
        int[] opcao = new int[5];
        Scanner input = new Scanner(System.in);
        Scanner teste = new Scanner(System.in);
        System.out.println("Agora, vamos aprender sobre as princispais matérias do seu curso: \n"
                + "Digite [1] para iniciar\n"
                + "Digite [2] para sair\n");
        opcao[0] = input.nextInt();
        if (opcao[0] == 2)
            System.exit(0);

        System.out.println("1 - Estruturas condicionais: \n"
                + "As estruturas condicionais permitem que uma instrução ou bloco de\n"
                + "instruções seja executada após o\n"
                + "resultado de uma avaliação condicional."
                + "Exemplo de estrutura condicional: \n"
                + "\n"
                + "public class Teste {\n"
                + "   public static void main(String args[]) {\n"
                + "      int x = 10;\n"
                + "      if(x < 20){\n"
                + "         System.out.println(“This is a statement”);\n"
                + "      }\n"
                + "   }\n"
                + "}");
        System.out.println("Digite [1] para prosseguir para o estudo de Switch Case \n"
                + "Digite [2] para sair");
                opcao[1] = teste.nextInt();
                if (opcao[1] == 2)
                    System.exit(0);
        System.out.println("2 - Estruturas condicionais - Switch Case: \n"
                + "A estrutura Switch Case Permite que uma variável\n"
                + "seja testada através da operação de igualdade e comparada com uma lista\n"
                + "de valores. Cada valor é chamado de case, e a variável é testada para cada case.\n"
                + "Exemplo de estrutura Switch Case: \n"
                + "char grade = 'C';\n"
                + "switch( grade) {\n"
                + "case 'A' :\n"
                + " System.out.print(\"Excelente!\");\n"
                + " break;\n"
                + " case 'B' :\n"
                + " case 'C' :\n"
                + " System.out.print(\"Bem feito!\");\n"
                + " break;\n"
                + " case 'D' :\n"
                + " System.out.print(\"Você passou!\");\n"
                + " case 'E' :\n"
                + " System.out.print(\"Melhor tentar novamente!\");\n"
                + " break;\n"
                + " default :\n"
                + " System.out.print(\"Conceito inválido!\");\n"
                + "}");
        System.out.println("3 - Estruturas de Repetição: \n"
                + "As estruturas de repetição permitem executar um conjunto de comando várias vezes.\n"
                + "Temos 3 tipos de laços de repetição: FOR, WHILE e DO WHILE.\n"
                + "Exemplo de laço FOR: \n"
                + "int i;\n"
                + "for(i = 0; i < 10; i = i + 1){\n"
                + "System.out.print(\"Este é um laço For\");\n"
                + "}"
                + "Exemplo de laço WHILE: \n"
                + "int i = 0;\n"
                + "while(i < 10){\n"
                + "System.out.println(“ALGORITMOS I”);\n"
                + "i = i + 1;\n"
                + "}");

        System.out.println("4 - Vetores(Arrays): \n"
                + "• Arrays são estruturas de dados que armazenam\n "
                + "uma quantidade fixa de dados de um certo tipo\n"
                + "• Também chamados de vetores. \n"
                + "• São variáveis que servem para guardar vários\n"
                + "valores do mesmo tipo de forma uniforme na\n"
                + "memória\n"
                + "Exemplo de array: \n"
                + "public class Class1\n"
                + "{\n"
                + "	public Class1()\n"
                + "	{\n"
                + "        int soma = 0;\n"
                + "        int menor = v[0];\n"
                + "        int maior = V[0];\n"
                + "\n"
                + "        for (int i = 0; i < n; i++)\n"
                + "        {\n"
                + "            soma = soma + v[i];\n"
                + "\n"
                + "            if(v[i] < menor)\n"
                + "            {\n"
                + "                menor = v[i];\n"
                + "            } else if(v[i] > maior)\n"
                + "            {\n"
                + "                maior = v[i];\n"
                + "            }\n"
                + "            \n"
                + "        }\n"
                + "	}\n"
                + "}");

    }
}
