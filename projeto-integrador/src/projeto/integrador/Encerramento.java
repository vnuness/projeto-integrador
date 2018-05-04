package projeto.integrador;

import static projeto.integrador.CadastroUsers.apelido;
import static projeto.integrador.CadastroUsers.idade;
import static projeto.integrador.CadastroUsers.nome;

public class Encerramento
{

    public void encerramento()
    {
        System.out.println("O aluno "+ nome + "\n"
                + "Conhecido por: " + apelido + "\n"
                + "De " + idade + "anos");
    }
}
