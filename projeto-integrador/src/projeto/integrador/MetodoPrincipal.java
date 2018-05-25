package projeto.integrador;

public class MetodoPrincipal {

    public static void main(String[] args) {
        //criação dos objetos
        BoasVindas saudacao = new BoasVindas();
        CadastroUsers cadastro = new CadastroUsers();
        ProvaVetor provaVetor = new ProvaVetor();
        ProvaIfElse provaIf = new ProvaIfElse();
        ProvaSwitch provaSwitch = new ProvaSwitch();
        TesteVocacional teste = new TesteVocacional();
        Aprendizado aprend = new Aprendizado();
        Encerramento encerramento = new Encerramento();
        
        // chamada de todos os métodos
        
        saudacao.boasvindas();
        cadastro.addUser();
        teste.testeVocacional();
        aprend.aprendizado();
        provaVetor.provaVetor();
        provaIf.provaIfElse();
        provaSwitch.provaSwitch();
        encerramento.encerramento();
    }

}
