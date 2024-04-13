
package escola;


public class aluno {
    
    private String nome;
    private double n1;
    private double n2;
    private double media;

    public aluno(String nome, double n1, double n2) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        
        this.media = calcularMedia();   
    }
    
    
    public void exibirNotas(){
        
        System.out.println("As notas do aluno " + nome + ":");
        System.out.println("Nota 1: " + n1);
        System.out.println("Nota 2: " + n2);
        
    }

    public void exibirMedia(){
        
        System.out.println("A média do " + nome + " foi de: " +media);
        
    }
    
    public void exibirAprovacao(){
        
        if(media >= 7){
            
            System.out.println("Aprovado!");
        }else{
            
            System.out.println("Reprovado");
        }
        
    }
    
    
    
    private double calcularMedia(){
        
        return(n1 + n2) / 2;
    }

    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    
    
    
    
    
    
    
    
}
