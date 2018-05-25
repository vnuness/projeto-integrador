package projeto.integrador;

import static projeto.integrador.CadastroUsers.apelido;
import static projeto.integrador.CadastroUsers.idade;
import static projeto.integrador.CadastroUsers.nome;

public class Encerramento
{

    public void encerramento()
    {
        System.out.println("O aluno " + nome + "\n"
                + "Conhecido por: " + apelido + "\n"
                + "De " + idade + " anos");
    }

    public void resultadoFinal(float nota)
    {
        String aprovacao;
        if (nota >= 6)
        {
            aprovacao = "Aprovado";
        } else
        {
            aprovacao = "Reprovado";
        }
        System.out.println("Com base na média de nossa instituição (6,0)\n"
                + "Você foi " + aprovacao + " !!!");
        if (aprovacao.equals("Aprovado"))
        {
            System.out.println("Obrigado por escolher nossa instituição, foi um prazer tê-lo conosco durante o curso.\n"
                    + "Esperamos que tenha muito sucesso em sua carreira. \n"
                    + "Um grande abraço !! \n"
                    + "Equipe UTB");
        } else
        {
            System.out.println("Não desanime, você foi reprovado mas tem muito potencial para dar a volta por cima.\n"
                    + "Basta realizar nossa prova de recuperação.");
        }
    }
}
