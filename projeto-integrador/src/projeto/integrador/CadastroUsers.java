package projeto.integrador;

import java.util.Scanner;

public class CadastroUsers {

    public void cadastro() {
        Scanner entrada = new Scanner (System.in);    
        
        System.out.println("\n");
        
        System.out.println("Para realizar seu cadastro precisamos que responda as seguintes perguntas: ");
        
        System.out.print("Informe seu nome e sobrenome: ");
        String nome = entrada.next();
        
        System.out.print("Informe o nome que gostaria de ser chamado no decorrer do curso: ");
        String apelido = entrada.next();
        
        System.out.print("Informe sua idade: ");
        int idade = entrada.nextInt();
        
        System.out.print("Informe seu e-mail: ");
        String email = entrada.next();
        
        System.out.print("Está trabalhando? Se sim informar qual área: ");
        String empregado = entrada.next();
        
        System.out.print("Possui alguma graduação? se sim informar o nome do curso: ");
        String outraGraduacao = entrada.next();
        
        
        
    }
}
