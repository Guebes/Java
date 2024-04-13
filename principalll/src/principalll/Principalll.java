
package principalll;

import java.util.Scanner;

public class Principalll {

    
    public static void main(String[] args) {

           Scanner leia = new Scanner(System.in);
           
            System.out.println("Escreva o tipo do produto");
            String descricao = leia.nextLine();


            System.out.println("Escreva a quantidade que deseja incluir: ");
            int quantidade = leia.nextInt();
            
            leia.nextLine();
            
            System.out.println("Escreva o nome do produto que deseja incluir: ");
            String nome = leia.nextLine();
    
          Produto products = new Produto(descricao, quantidade, nome);
    
          products.incluirItem(quantidade, nome);
          products.alertaEstoqueMax();
          products.ExcluirItem(quantidade);
          products.alertaEstoqueMin();
          
          products.Descricao();
         
          
          
    }
    
}
