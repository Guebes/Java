
package principall;


public class Conta {
    
    
    private double saldo = 10000;
    private String tipo;

    public Conta(double valorInicial) {
       
        
    }
    
    
     public Conta(double valorInicial, String tipo) {
       
        this.tipo = tipo;
    }
    
    
    public boolean depositar(double valor){
        
        if(valor > 5000 && tipo.equals("Corrente")){
            
            System.out.println("Depósito recusado");
            
            return false;
            
        }else{
 
            saldo += valor; 
            
             System.out.println("Depósito aceito!");
        
             return true;
        }
        
     
    }
    
    
    
     public boolean sacar(double saque){
        
        if(saque > saldo){
            
            System.out.println("Valor não consta em sua conta!");
        
            return false;
            
        }else{
            
            saque -= saldo;
                    
            System.out.println("Saque realizado com sucesso!");
        
                return true;
        }
        
    }
    
    
      public boolean transferir(double valor, Conta tipoConta){
        
        if(saldo - valor < 0){
            
            System.out.println("O saldo não deve ficar no vermelho");
        
        return false;
        
        }else{
            
                saldo -= valor;
                tipoConta.depositar(valor);
                
                String TipoContaDestino = tipoConta.getTipo();
                
                
            System.out.println("O saldo " + valor + " foi tranferido para " + TipoContaDestino);
        
                     return true;
        }
            
      }

      
    
      
      
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
   
      
     
     
     
     
     
    
    
    
    
}
