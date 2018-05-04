package projeto.integrador;

import java.util.Scanner;
import static projeto.integrador.CadastroUsers.apelido;

public class TesteVocacional
{

    public void testeVocacional()
    {
        int opcao, contA = 0, contB = 0, contC = 0, contD = 0, contE = 0;
        String tmp = null;
        char tmp2;
        Scanner input = new Scanner(System.in);

        System.out.println("Olá, " + apelido + " recebemos seus dados de inscrição com sucesso !\n"
                + "Agora, \n"
                + "Você irá participar do nosso teste vocacional para te ajudar ainda mais a traçar seu caminho. \n");

        do
        {
            System.out.println("Digite [1] para iniciar o teste\n" + "Digite [2] para sair");
            opcao = input.nextInt();

            if (opcao == 2)
            {
                System.exit(0);
                break;
            } else if (opcao != 1 && opcao != 2)
            {
                System.err.println("Opção inválida!");
            } else
            {
                System.out.println("### Bem vindo ao nosso Teste Vocacional ###");
            }
        } while (opcao != 1);

        for (int i = 1; i <= 12; i++)
        {
            System.out.print(i + "º Pergunta: ");

            switch (i)
            {
                case 1:
                    System.out.println("Como você imagina sua vida daqui a dez anos, como você se ve como profissional:");
                    System.out.println("A) Realizado, fazendo as coisas que gosto.\n"
                            + "B) Reconhecido e valorizado no mercado.\n"
                            + "C) Sério, dando continuidade ao trabalho dos meus pais.\n"
                            + "D) Muito bem sucedido financeiramente.\n"
                            + "E) Atuante em minha comunidade.");
                    tmp = input.next();
                    break;
                case 2:
                    System.out.println("Os profissionais que mais admiro são aqueles que:	");
                    System.out.println("A) Sentem-se felizes e plenamente satisfeitos com seu trabalho.\n"
                            + "B) São considerados os melhores na sua profissão.\n"
                            + "C) Têm sucesso seguindo a tradição profissional da família.\n"
                            + "D) Fazem sucesso e ficam ricos com seu trabalho.\n"
                            + "E) São excelentes e sempre desenvolvem trabalhos voluntários.\n");
                    tmp = input.next();
                    break;
                case 3:
                    System.out.println("As minhas férias ideais são:");
                    System.out.println("A) Fazendo tudo que gosto e que nunca tenho tempo para curtir.\n"
                            + "B) Esquiando nas montanhas nos lugares mais badalados.\n"
                            + "C) Viajando para praia ou o campo com os amigos do colégio.\n"
                            + "D) Não importa o lugar, desde que num hotel 5 estrelas e com todas as mordomias.\n"
                            + "E) Passando o tempo em uma cidade do interior envolvido em um projeto comunitário.\n");
                    tmp = input.next();
                    break;
                case 4:
                    System.out.println(" Quando sou apresentado a alguém, geralmente falo sobre:");
                    System.out.println("A) Os meus interesses e hobbies.\n"
                            + "B) Pessoas famosas e importantes que conheço.\n"
                            + "C) As histórias engraçadas da minha infância, minha família e amigos comum.\n"
                            + "D) Carros, viagens e os lugares da moda que gosto de freqüentar.\n"
                            + "E) Os problemas que acontecem na política e as desigualdades sociais.\n");
                    tmp = input.next();
                    break;
                case 5:
                    System.out.println("Quando os outros se referem a mim, gosto de ser lembrado por:");
                    System.out.println("A) Meu jeito de ser.\n"
                            + "B) Minha popularidade.\n"
                            + "C) Meu sobrenome.\n"
                            + "D) Coisas que conquisto.\n"
                            + "E) Sempre ajudar aos outros.\n");
                    tmp = input.next();
                    break;
                case 6:
                    System.out.println("Aproveito as minhas horas de lazer para:");
                    System.out.println("A) Ir ao cinema, mexer no computador ou ler um livro.\n"
                            + "B) Ir aos lugares da moda ou me informar sobre o que está acontecendo de interessante pela cidade.\n"
                            + "C) Ficar em casa conversando com meus amigos ou assistindo a um vídeo.\n"
                            + "D) Fazer compras ou passear no shopping.\n"
                            + "E) Ficar ligado nas notícias atuais.\n");
                    tmp = input.next();
                    break;
                case 7:
                    System.out.println("Quando conheço alguém do sexo oposto, procuro saber:");
                    System.out.println("A) Seus hábitos e interesses.\n"
                            + "B) Quem são seus amigos e os lugares que freqüenta.\n"
                            + "C) Sobre sua família e seus melhores amigos.\n"
                            + "D) Onde mora e em que colégio estuda.\n"
                            + "E) Em qual partido votou nas últimas eleições.\n");
                    tmp = input.next();
                    break;
                case 8:
                    System.out.println("Nas minhas relações pessoais procuro estar sempre cercado por:");
                    System.out.println("A) Quem gosta de coisas que eu gosto.\n"
                            + "B) Gente interessante que tem sempre novidades para contar.\n"
                            + "C) Pessoas próximas, em quem confio.\n"
                            + "D) Gente que gosta de viver bem.\n"
                            + "E) Pessoas que atuam na sociedade de forma ética.\n");
                    tmp = input.next();
                    break;
                case 9:
                    System.out.println("Quando me refiro à minha família, geralmente falo sobre:");
                    System.out.println("A) O lado interessante da profissão dos meus pais.\n"
                            + "B) O sucesso que alcançaram e o prestígio que eles têm.\n"
                            + "C) As coisas que fazemos juntos.\n"
                            + "D) As suas conquistas pessoais e econômicas.\n"
                            + "E) A sua origem social e orgulho que sinto em relação a ela.\n");
                    tmp = input.next();
                    break;
                case 10:
                    System.out.println("O que mais me atrai no jeito do(a) meu(minha) namorado(a) é:");
                    System.out.println("A) A maneira como ele (ela) curte tudo o que faz.\n"
                            + "B) A vida agitada e cheia de acontecimentos que ele (ela) tem.\n"
                            + "C) O contato com seus amigos e família.\n"
                            + "D) A maneira como ele (ela) aproveita a vida, com viagens, festas, roupas da moda.\n"
                            + "E) A forma de agir dele(a), sempre preocupado(a) com os outros.\n");
                    tmp = input.next();
                    break;
                case 11:
                    System.out.println("Quando vou dar um presente para um amigo procuro:	");
                    System.out.println("A) Escolher algo que eu goste e ele também.\n"
                            + "B) Escolher um objeto que o faça se sentir especial e diferente dos demais.\n"
                            + "C) Pensar em alguma coisa que ele possa aproveitar junto com seus amigos.\n"
                            + "D) Escolher algo de qualidade como uma roupa de grife ou um CD importado.\n"
                            + "E) Algo que ele realmente goste e valorize.\n");
                    tmp = input.next();
                    break;
                case 12:
                    System.out.println("O paraíso para mim é um lugar onde posso:");
                    System.out.println("A) Fazer todas as coisas que gosto e do jeito que eu quero.\n"
                            + "B) Encontrar muitas pessoas interessantes e famosas.\n"
                            + "C) Curtir as pessoas de quem eu mais gosto.\n"
                            + "D) Aproveitar todas as coisas boas da vida.\n"
                            + "E) Confiar nas pessoas, e onde não existam diferenças sociais.\n");
                    tmp = input.next();
                    break;
                default:
                    break;
            }

            tmp2 = tmp.charAt(0);

            switch (tmp2)
            {
                case 'a':
                case 'A':
                    contA++;
                    break;

                case 'b':
                case 'B':
                    contB++;
                    break;

                case 'c':
                case 'C':
                    contC++;
                    break;

                case 'd':
                case 'D':
                    contD++;
                    break;

                case 'e':
                case 'E':
                    contE++;
                    break;

                default:
                    System.err.println("Opção Invalida");

            }
        }
    }
}