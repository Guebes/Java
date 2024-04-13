
package principall;

import java.util.Scanner;

public class banco {

    
    public static void main(String[] args) {
       
        Scanner leia = new Scanner(System.in);
        
            
            System.out.println("Escreva o valor inicial: ");
            double valorInicial = leia.nextDouble();
            
            leia.nextLine();
            
            System.out.println("Escreva o tipo da conta: ");
            String tipo = leia.nextLine();
            
            System.out.println("Digite o valor que deseja depositar: ");
            double depositar = leia.nextDouble();
            
        
            
            System.out.println("Digite o valor que deseja sacar: ");
            double sacar = leia.nextDouble();
            
            leia.nextLine();
            
            System.out.println("Digite o valor que deseja transferir para a poupança: ");
            double valorTransferir = leia.nextDouble();
            
            
        
        Conta ContaCorrente = new Conta(9000, "Corrente");
           Conta ContaPoupanca = new Conta(0, "Poupança");

    
    ContaCorrente.depositar(depositar);
    ContaCorrente.sacar(sacar);
    ContaCorrente.transferir(valorTransferir, ContaPoupanca);
    
    
    }
    
}
