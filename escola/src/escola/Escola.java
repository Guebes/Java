
package escola;

import java.util.Scanner;


public class Escola {

   
    public static void main(String[] args) {

       Scanner leia = new Scanner(System.in);

       
       media CalculadoraMedia = new media();   
      
 
        System.out.println("Escreva o nome do aluno: ");
        String nomeAluno = leia.nextLine();
        
        System.out.println("Escreva a nota 1: ");
        double notaAluno = leia.nextDouble();
        
        System.out.println("Escreva a nota 2: ");
        double nota2Aluno = leia.nextDouble();
        
        
         aluno DadosAluno = new aluno(nomeAluno, notaAluno, nota2Aluno);
        
                
        DadosAluno.exibirNotas();
        DadosAluno.exibirMedia();
        DadosAluno.exibirAprovacao();
        
        
    }
    
}
