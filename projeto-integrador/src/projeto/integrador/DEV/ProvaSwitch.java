package projeto.integrador.DEV;
import java.util.Scanner;

public class ProvaSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String resposta;
        float nota = 0;
        System.out.println("Bem vindo, esta é a aula de Switch case.");
        System.out.println("\n Switch é uma estrutura muito utilizada em "
                + "programação. A estrutura Switch verifica uma variável e age"
                + "de acordo com suas cases. As cases são as possibilidade de "
                + "resultados que são obtidos por switch. Basicamente, o Switch"
                + "serve para controlar várias ações diferentes de acordo com"
                + "a case definido dentro dele.");
        System.out.println("\n Agora que você aprendeu o que é Switch, Vou fazer"
                + "algumas perguntas sobre o assunto");
        System.out.println("\n ");
        System.out.println("Pergunta 1 valendo 3,0 pontos\n"
                + "1- Quero que você selecione a melhor opção para se usar o switch.\n"
                + "A- No menu de um sistema gostaria que me levasse a determinada\n"
                + "opção selecionada no menu.\n"
                + "B- Mostrar a Soma ou divisão ou qualquer equação matemática"
                + "de dois números.\n"
                + "C- Informações de usúarios do sistema.");
        resposta = input.next();
        switch (resposta){
            case "a":
            case "A":
                nota += 3;
                break;
        }
        System.out.println("Pergunta 2 valendo 3,0 pontos\n"
                + "2- O switch case tem como a principal função dnetro do java de..."
                + "\n A- Fazer equações matemáticas e retornar o resultado."
                + "\n B- Fazer que algo selecionado se repita varias e varias"
                + "vezes dentro do sistema."
                + "\n C- Levar o usuário para determinado lugar selecionado no menu. ");
        resposta = input.next();
        switch (resposta){
            case "c":
            case "C":
                nota += 3;
                break;
        }
        System.out.println("Pergunta 3 valendo 3,0 pontos\n"
                + "3-Qual das opções está certa de como inciar o Switch case?"
                + "\n A- Declarar Variável associada ao Switch e colocar, Switch();"
                + "\n B- Declarar Váriável associada ao switch, inicializar ela, coloca,"
                + "switch(variável){ e iniciar as cases."
                + "\n C- Declarar Variável associada ao switch, e colocar,"
                + "switch(variável) e iniciar as cases. ");
        resposta = input.next();
        switch (resposta){
            case "b":
            case "B":
                nota += 3;
                break;
        }
        System.out.println("Pergunta 4 valendo 1,0 ponto\n"
                + "4-Qual a informação INCORRETA?\n"
                + " A- Switch pode ser usado para que as informações dentro \n"
                + "dele seja repetida inúmeras vezes ou até mesmo determinadas vezes"
                + "\n B- Switch pode ser usado para guarda funções e informações dentro de cada case"
                + "\n C- Switch pode ser usado para deixar as funções mais organizadas na hora"
                + "de chamar para ser executada. ");
        resposta = input.next();
        switch (resposta){
            case "a":
            case "A":
                nota += 1;
                break;
        }
        System.out.println("A prova valia 10 pontos e sua nota foi: " + nota);
    }
}
