package projeto.integrador;

public class MetodoPrincipal {

    public static void main(String[] args) {
        BoasVindas saudacao = new BoasVindas();
        CadastroUsers cadastro = new CadastroUsers();
        ProvaVetor provaVetor = new ProvaVetor();
        ProvaIfElse provaIf = new ProvaIfElse();
        
        saudacao.boasvindas();
        cadastro.cadastro();
        provaVetor.provaVetor();
        provaIf.provaIfElse();
    }

}
