package projeto.integrador;

import java.util.Scanner;

public class CadastroUsers
{

    static String nome;
    static String apelido;
    static int idade;
    static String email;
    static String empregado;
    static String outraGraduacao;

    public void cadastro()
    {

        Scanner entrada = new Scanner(System.in);
        Scanner inteiro = new Scanner(System.in);

        System.out.println("\n");

        System.out.println("Para realizar seu cadastro precisamos que responda as seguintes perguntas: ");

        System.out.print("Informe seu nome e sobrenome: ");
        nome = entrada.nextLine();

        System.out.print("Informe o nome que gostaria de ser chamado no decorrer do curso: ");
        apelido = entrada.next();

        System.out.print("Informe sua idade: ");
        idade = inteiro.nextInt();

        System.out.print("Informe seu e-mail: ");
        email = entrada.next();

        System.out.print("Está trabalhando? Se sim informar qual área: ");
        empregado = entrada.next();

        System.out.print("Possui alguma graduação? se sim informar o nome do curso: ");
        outraGraduacao = entrada.next();

        /*System.out.println("\n Switch case é uma estrutura muito utilizada em \n"
                + "programação. A estrutura Switch case verifica uma variável e age\n"
                + "de acordo com suas possibilidades (casos). Os casos são as possibilidade de \n"
                + "resultados que são obtidos por switch case. Basicamente, o Switch case\n"
                + "serve para controlar várias ações diferentes de acordo com\n"
                + "a ação definido dentro de cada .");*/

    }
}
