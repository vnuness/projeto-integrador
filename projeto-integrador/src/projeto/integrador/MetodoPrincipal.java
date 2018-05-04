package projeto.integrador;

public class MetodoPrincipal {

    public static void main(String[] args) {
        BoasVindas saudacao = new BoasVindas();
        CadastroUsers cadastro = new CadastroUsers();
        ProvaVetor provaVetor = new ProvaVetor();
        ProvaIfElse provaIf = new ProvaIfElse();
        ProvaSwitch provaSwitch = new ProvaSwitch();
        // chamada de todos os métodos
        saudacao.boasvindas();
        cadastro.cadastro();
        provaVetor.provaVetor();
        provaIf.provaIfElse();
        provaSwitch.provaSwitch();
    }

}
