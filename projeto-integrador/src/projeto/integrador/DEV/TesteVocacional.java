package projeto.integrador.DEV;

import java.util.Scanner;

public class TesteVocacional {

    public static void main(String[] args) {
        int opcao = 0, contA = 0, contB = 0, contC = 0, contD = 0, contE = 0;
        String tmp = null;
        char tmp2;
        Scanner input = new Scanner(System.in);

        System.out.println("Olá Fulano, recebemos seus dados de inscrição com sucesso !\n"
                + "Agora, \n"
                + "Você irá participar do nosso teste vocacional para te ajudar ainda mais a traçar seu caminho. \n");

        do {
            System.out.println("Digite [1] para iniciar o teste\n" + "Digite [2] para sair");
            opcao = input.nextInt();

            if (opcao == 2) {
                //System.exit(0);
                break;
            } else if (opcao != 1 && opcao != 2) {
                System.err.println("Opção inválida!");
            } else {
                System.out.println("### Bem vindo ao Nosso Testes Vocacional ###");
            }
        } while (opcao != 1);

        for (int i = 1; i <= 12; i++) {
            System.out.print(i + "º Pergunta: ");

            if (i == 1) {
                System.out.println("Quando você imagina sua vida daqui a dez anos, como se ve como profissional:");
                System.out.println("A) Realizado, fazendo as coisas que gosto.\n"
                        + "B) Reconhecido e valorizado no mercado.\n"
                        + "C) Sério, dando continuidade ao trabalho dos meus pais.\n"
                        + "D) Muito bem sucedido financeiramente.\n"
                        + "E) Atuante em minha comunidade.");
                tmp = input.next();
            } else if (i == 2) {
                System.out.println("Os profissionais que mais admiro são aqueles que:	");
                System.out.println("A) Sentem-se felizes e plenamente satisfeitos com seu trabalho.\n"
                        + "B) São considerados os melhores na sua profissão.\n"
                        + "C) Têm sucesso seguindo a tradição profissional da família.\n"
                        + "D) Fazem sucesso e ficam ricos com seu trabalho.\n"
                        + "E) São excelentes e sempre desenvolvem trabalhos voluntários.\n");
                tmp = input.next();
            } else if (i == 3) {
                System.out.println("As minhas férias ideais são:");
                System.out.println("A) Fazendo tudo que gosto e que nunca tenho tempo para curtir.\n"
                        + "B) Esquiando nas montanhas nos lugares mais badalados.\n"
                        + "C) Viajando para praia ou o campo com os amigos do colégio.\n"
                        + "D) Não importa o lugar, desde que num hotel 5 estrelas e com todas as mordomias.\n"
                        + "E) Passando o tempo em uma cidade do interior envolvido em um projeto comunitário.\n");
                tmp = input.next();
            } else if (i == 4) {
                System.out.println(" Quando sou apresentado a alguém, geralmente falo sobre:");
                System.out.println("A) Os meus interesses e hobbies.\n"
                        + "B) Pessoas famosas e importantes que conheço.\n"
                        + "C) As histórias engraçadas da minha infância, minha família e amigos comum.\n"
                        + "D) Carros, viagens e os lugares da moda que gosto de freqüentar.\n"
                        + "E) Os problemas que acontecem na política e as desigualdades sociais.\n");
                tmp = input.next();
            } else if (i == 5) {
                System.out.println("Quando os outros se referem a mim, gosto de ser lembrado por:");
                System.out.println("A) Meu jeito de ser.\n"
                        + "B) Minha popularidade.\n"
                        + "C) Meu sobrenome.\n"
                        + "D) Coisas que conquisto.\n"
                        + "E) Sempre ajudar aos outros.\n");
                tmp = input.next();
            } else if (i == 6) {
                System.out.println("Aproveito as minhas horas de lazer para:");
                System.out.println("A) Ir ao cinema, mexer no computador ou ler um livro.\n"
                        + "B) Ir aos lugares da moda ou me informar sobre o que está acontecendo de interessante pela cidade.\n"
                        + "C) Ficar em casa conversando com meus amigos ou assistindo a um vídeo.\n"
                        + "D) Fazer compras ou passear no shopping.\n"
                        + "E) Ficar ligado nas notícias atuais.\n");
                tmp = input.next();
            } else if (i == 7) {
                System.out.println("Quando conheço alguém do sexo oposto, procuro saber:");
                System.out.println("A) Seus hábitos e interesses.\n"
                        + "B) Quem são seus amigos e os lugares que freqüenta.\n"
                        + "C) Sobre sua família e seus melhores amigos.\n"
                        + "D) Onde mora e em que colégio estuda.\n"
                        + "E) Em qual partido votou nas últimas eleições.\n");
                tmp = input.next();
            } else if (i == 8) {
                System.out.println("Nas minhas relações pessoais procuro estar sempre cercado por:");
                System.out.println("A) Quem gosta de coisas que eu gosto.\n"
                        + "B) Gente interessante que tem sempre novidades para contar.\n"
                        + "C) Pessoas próximas, em quem confio.\n"
                        + "D) Gente que gosta de viver bem.\n"
                        + "E) Pessoas que atuam na sociedade de forma ética.\n");
                tmp = input.next();
            } else if (i == 9) {
                System.out.println("Quando me refiro à minha família, geralmente falo sobre:");
                System.out.println("A) O lado interessante da profissão dos meus pais.\n"
                        + "B) O sucesso que alcançaram e o prestígio que eles têm.\n"
                        + "C) As coisas que fazemos juntos.\n"
                        + "D) As suas conquistas pessoais e econômicas.\n"
                        + "E) A sua origem social e orgulho que sinto em relação a ela.\n");
                tmp = input.next();
            } else if (i == 10) {
                System.out.println("O que mais me atrai no jeito do(a) meu(minha) namorado(a) é:");
                System.out.println("A) A maneira como ele (ela) curte tudo o que faz.\n"
                        + "B) A vida agitada e cheia de acontecimentos que ele (ela) tem.\n"
                        + "C) O contato com seus amigos e família.\n"
                        + "D) A maneira como ele (ela) aproveita a vida, com viagens, festas, roupas da moda.\n"
                        + "E) A forma de agir dele(a), sempre preocupado(a) com os outros.\n");
                tmp = input.next();
            } else if (i == 11) {
                System.out.println("Quando vou dar um presente para um amigo procuro:	");
                System.out.println("A) Escolher algo que eu goste e ele também.\n"
                        + "B) Escolher um objeto que o faça se sentir especial e diferente dos demais.\n"
                        + "C) Pensar em alguma coisa que ele possa aproveitar junto com seus amigos.\n"
                        + "D) Escolher algo de qualidade como uma roupa de grife ou um CD importado.\n"
                        + "E) Algo que ele realmente goste e valorize.\n");
                tmp = input.next();
            } else if (i == 12) {
                System.out.println("O paraíso para mim é um lugar onde posso:");
                System.out.println("A) Fazer todas as coisas que gosto e do jeito que eu quero.\n"
                        + "B) Encontrar muitas pessoas interessantes e famosas.\n"
                        + "C) Curtir as pessoas de quem eu mais gosto.\n"
                        + "D) Aproveitar todas as coisas boas da vida.\n"
                        + "E) Confiar nas pessoas, e onde não existam diferenças sociais.\n");
                tmp = input.next();
            }

            tmp2 = tmp.charAt(0);

            switch (tmp2) {
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

            }//FIM DO SWITCH CASE

        } //FIM DO LAÇO DE REPETIÇÃO DO FOR 

        System.out.println("OPÇÃO A = "+contA+" \nOPÇÃO B = "+contB+" \nOPÇÃO C = "+ contC+" \nOPÇÃO D = "+contD+"\nOPÇÃO E = "+contE);
        System.out.println("### FIM DO TESTE VOCACIONAL ###");
    }
}

/*
Tipo A – Em busca do prazer 
Você faz suas escolhas baseado principalmente na busca da satisfação e realização pessoal.
Ao se decidir por uma profissão, considere se ela irá de fato lhe proporcionar a realização que tanto valoriza.
Se você levar em conta seus gostos e interesses irá, com certeza, ter sucesso e ser feliz.
Lista das Profissões:
Arquitetura, Artes Cênicas, Artes Plásticas, Astronomia, Ciências Biológicas, Artes Plásticas, Cinema,
Engenharia Mecânica, Esporte, Filosofia, Jornalismo, Matemática, Publicidade, Rádio e TV, Turismo e Veterinária.

Dica: Converse com pessoas que têm as profissões pelas quais se interessa e observe o que elas fazem no dia-a-dia.
Lembre-se que irá passar boa parte da vida nessas atividades e que, para você, estar em sintonia com os desejos é essencial.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Tipo B – Em busca da fama e do reconhecimento
Para você, o mais importante é ser reconhecido e valorizado pelos outros.
Ao escolher uma profissão, leve em conta as oportunidades que ela lhe oferece para se projetar socialmente.
Ser considerado o melhor naquilo que faz e ficar famoso são atributos muito importantes para você e devem participar da sua decisão.
Lista das Profissões:
Medicina, Direito, Artes Cênicas, Arquitetura, Cinema, Editoração, Engenharia Aeronáutica, Jornalismo e Odontologia. 
Em medicina, Dermatologia, Ginecologia, Cirurgia plástica e Cirurgia geral.

Dica: Dê atenção especial às profissões que oferecem oportunidades para se destacar ou esteja em alta.
Converse com pessoas que você admira por essas características e veja o que elas fizeram para alcançar sucesso.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Tipo C - Em busca do afeto
Você faz suas escolhas baseado principalmente nas suas relações interpessoais e familiares.
Fazer o que sua família valoriza e ser aceito e respeitado pelos amigos é essencial para o seu bem-estar.
Ao optar por uma profissão, verifique se ela está de acordo com os valores da sua família e amigos.
Lista das Profissões:
Medicina, Odontologia, Engenharia Civil, Engenharia da Computação, Letras, Nutrição, Pedagogia, Psicologia e Veterinária.
Em medicina, Infectologia, Geriatria, Cirurgia pediátrica e oncologia.

Dica: Fique atento às oportunidades que a profissão de seus familiares lhe oferece.
Outra alternativa é uma atividade profissional que lhe permita se associar a amigos ou parentes.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Tipo D – Em busca da grana ( ANALISE E DESENVOLVIMENTO DE SISTEMAS)
Você faz suas escolhas pensando nas recompensas financeiras e materiais.
Poder comprar o que quiser e usufruir de todo o conforto são suas principais ambições.
Portanto, ao decidir por uma profissão esteja seguro sobre as possibilidades de remuneração que ela oferece.
Lista das Profissões:
Administração, Ciências Contábeis, Análise de sistemas, Economia, Engenharia da Computação, Fármacia, Fisíca Médica.
Em medicina, ortopedia, Neurociência, Cardiologista, Oftalmologia e Cirurgia plástica.

Dica: Investigue quais profissões remuneram melhor ou permitem grandes ganhos financeiros a curto prazo.
Procure conversar com pessoas bem-sucedidas financeiramente e tente descobrir os negócios e oportunidades do momento.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Tipo E – Em busca do social
Suas escolhas são sempre baseadas em valores éticos e morais,levando em conta os interesses da comunidade em que você vive e,
de maneira mais ampla, da sociedade, acima mesmo de seus interesses pessoais.
Lista das Profissões: 
Ciências Sociais, Enfermagem, Fonoaudiologia, Engenharia de Alimentos, Jornalismo, Nutrição, Terapia Ocupacional, Psicologia,
Serviço Social, fisioterapia, terapia ocupacional, musicoterapia, odontologia, decoração e moda.
Em medicina, pediatria, ginecologia e obstetrícia, geriatria e dermatologia.

Dica: Investigue as profissões nas quais você possa desenvolver trabalhos dos mais diversos tipos junto à comunidade,
auxiliando a população carente. Pense ainda na possibilidade de uma carreira tradicional,
mas reservando um espaço para o trabalho voluntário. Outra opção que vem crescendo é o chamado Terceiro Setor,
que recebe financiamento dos governos federal, estadual, municipal e também da iniciativa privada.
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


*/