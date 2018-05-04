package projeto.integrador.DEV;

public class Aprendizado
{

    public static void main(String[] args)
    {
        System.out.println("Agora, vamos aprender sobre as principais matérias do seu curso: \n"
                + "1 - Estruturas condicionais: \n"
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
    }
}
