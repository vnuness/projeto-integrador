package projeto.integrador.DEV;

import java.util.Scanner;

public class ProvaIfElse {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String resposta;
        float nota = 0;

        System.out.println("1) Qual estrutura condicional que pode substituir um bloco com vários if/else?  3,0 pontos");
        System.out.println("a) While ");
        System.out.println("b) for ");
        System.out.println("c) switch case ");
        System.out.println("d) switch default ");
        resposta = entrada.next();
        switch (resposta) {
            case "c":
            case "C":
                nota += 3;
                break;
        }

        System.out.println("2) Como é chamado o conjunto de vários If else no mesmo bloco? 3,0 pontos");
        System.out.println("a) if else conjunto ");
        System.out.println("b) if else alinhado ");
        System.out.println("c) if else aninhado ");
        System.out.println("d) Nenhum desses ");
        resposta = entrada.next();
        switch (resposta) {
            case "c":
            case "C":
                nota += 3;
                break;
        }
        System.out.println("3) Dado a seguinte sintaxe: if (expressão);{"
                + " comando "
                + "}");
        System.out.println("3) Assinale a alternativa correta: 2,0 pontos");
        System.out.println("a) A sintaxe está correta. ");
        System.out.println("b) Não deve-se usar ponto e virgula após a expressão. ");
        System.out.println("c) Não se deve usar os comandos de dentro da condição. ");
        System.out.println("d) Nenhuma das alternativas. ");
        resposta = entrada.next();
        switch (resposta) {
            case "b":
            case "B":
                nota += 2;
                break;
        }
        System.out.println("Qual o tipo de variável é verificado na condição do if? 2, pontos");
        System.out.println("a) Boolean ");
        System.out.println("b) char ");
        System.out.println("c) String ");
        System.out.println("d) Double");
        resposta = entrada.next();
        switch (resposta) {
            case "a":
            case "A":
                nota += 2;
                break;
        }
        System.out.println("Sua nota foi: " +nota);
    }

}
