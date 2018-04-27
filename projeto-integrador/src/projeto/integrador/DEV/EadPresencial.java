package projeto.integrador.DEV;
import java.util.Scanner;


public class EadPresencial {
  
    public static void main(String[] args) {
       Scanner ler = new Scanner (System.in);
       int p1,p2,p3, ead = 0, presenc = 0, confir;
       
        System.out.println("Você possui um tempo muito justo e apertado, "
                + "para um ensino presencial na faculdade?"
                + "\n 1- Sim"
                + "\n 2- Não");
        p1 = ler.nextInt();
        if (p1 == 1){
            ead += 1; 
        } else {
            presenc += 1;
        }
        System.out.println("Você possui uma difícil deslocação para o hambiente do curso?"
                + "\n 1- Sim"
                + "\n 2- Não");
        p2= ler.nextInt();
        if (p2 == 1){
            ead += 1; 
        } else {
            presenc += 1;
        }
        System.out.println("Agora nós da universidade .... "
                + "queremos saber a sua opinião, você prefere"
                + "um ensino presencial, facilitando no ensino pessoal?"
                + "\n 1- Sim"
                + "\n 2- Não");
        p3 = ler.nextInt();
        if (p3 == 1){
            presenc += 1; 
        } else {
            ead += 1;
        }
        if (ead > presenc && p3 == 1){
            System.out.println("Vimos que você tem uma rotina bem apertada, "
                    + "recomendamos o ensino a distancia, mas a sua "
                    + "escolha tem a maior impotância.  ");
            System.out.println("digite [1] para confimar ensino presncial "
                    + "[2] para confirmar ensino a distância");
        confir= ler.nextInt();
        if (confir !=1 && (confir !=2)){
            System.err.println("Opção inválida");
            if (confir == 1){
                System.out.println("OK, seu ensino é o presncial,"
                        + " estaremos te transferindo para as aulas do curso"
                        + "Seja Bem Vindo à Universidade... ");
                
            }else{
                System.out.println("OK, seu ensino é a distância,"
                        + "estaresmos preparando as aulas do curso"
                        + "e te enviando para a área de ensino do aluno. "
                        + "Seja Bem Vindo à Universidade");
            }
        }
        
        if (p1!=1 && (p1!=2)){
            System.err.println("Opção inválida");
            if (p2!=1 && (p2!=2)){
                System.err.println("Opção inválida");
                if (p3!=1 && (p3!=2)){
                    System.err.println("Opção inválida");
                    
                }
            }
        }
    }
}}
