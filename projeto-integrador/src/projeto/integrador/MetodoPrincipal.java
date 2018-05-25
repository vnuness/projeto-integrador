package projeto.integrador;

public class MetodoPrincipal {

    public static void main(String[] args) {
        //criação dos objetos
        BoasVindas saudacao = new BoasVindas();
        CadastroUsers cadastro = new CadastroUsers();
        Prova prova = new Prova();
        TesteVocacional tv = new TesteVocacional();
        Aprendizado aprend = new Aprendizado();
        Encerramento encerramento = new Encerramento();
        
        // chamada de todos os métodos
        
        saudacao.boasvindas();
        cadastro.addUser();
        tv.testeVocacional();
        aprend.aprendizado();
        prova.provaIfElse();
        prova.provaSwitch();
        prova.provaVetor();
        prova.imprimeResultado();
        float nota = prova.imprimeResultado();
        encerramento.encerramento();
        encerramento.resultadoFinal(nota);
    }

}
