
package escola;


public class media {
    
    
    public double MediaSimples(double n1, double n2){
            
        return(n1 + n2) / 2;
    }
    
    public double MediaPonderada(double n1, double n2, double p1, double p2){
        
        
        return(n1 * p1 + n2 * p2) / (p1 + p2);
    }
    
    
    public double MediaGeometrica(double n1, double n2){
        
        return Math.sqrt(n1 * n2);  
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
