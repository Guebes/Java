
package principalll;


public class Produto {
    
    String tipo;
    int estoqueMax = 100;
    int estoqueMin = 1;
    int quantidade;
    String nome;

    
    public Produto(String tipo, int quantidade, String nome) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.nome = nome;
    }

  
    void incluirItem(int qtdItem, String nome){
        
        System.out.println("Foram armazenados " +qtdItem+ " de " +nome);
    }
    
 
       void alertaEstoqueMax(){
        
        if(quantidade > estoqueMax){
            
            System.out.println("\nSem espaço no estoque");
        }
    }
    
    
    public boolean ExcluirItem(int qtdItem){
        
        do{
            if(qtdItem > estoqueMax){
                
                System.out.println(+quantidade+ " deverá ser excluido");
            }
        
            
            }while(quantidade > estoqueMax);
     
           
        
             return false;
    
    } 
    
 
   
     void alertaEstoqueMin(){
        
         if(quantidade < estoqueMin){
             
             System.out.println("Sem itens adicionados");
         }else{
             
             System.out.println("Quantidade: " +quantidade+ " adicionado");
         }
    }
    
     void Descricao(){
         
         System.out.println(nome + "\n");
         System.out.println("O estoque máximo é: " +estoqueMax+ "\n");
         System.out.println("O estoque minimo é: " +estoqueMin);
         
     }

    public String getDescricao() {
        return tipo;
    }

    public void setDescricao(String descricao) {
        this.tipo = descricao;
    }

    public int getEstoqueMax() {
        return estoqueMax;
    }

    public void setEstoqueMax(int estoqueMax) {
        this.estoqueMax = estoqueMax;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
     
     
}
