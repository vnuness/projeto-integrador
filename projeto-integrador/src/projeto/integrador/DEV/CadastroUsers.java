package projeto.integrador.DEV;

import java.util.Scanner;

public class CadastroUsers {

    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        int idade;

        System.out.println("Para realizar seu cadastro precisamos que responda as seguintes perguntas: ");

        System.out.println("Informe seu nome e sobrenome :");
        String nome = entrada.next();

        System.out.println("Informe o nome que gostaria de ser chamado no decorrer do curso:");
        String apelido = entrada2.nextLine();

        System.out.println("Informe sua idade: ");
        idade = entrada2.nextInt();

        System.out.println("Informe seu e-mail: ");
        String email = entrada2.next();

        System.out.println("Está trabalhando? Se sim informar qual área: ");
        String empregado = entrada2.next();

        System.out.println("Possui alguma graduação? se sim informar o nome do curso: ");
        String outraGraduacao = entrada2.next();

    }
}
