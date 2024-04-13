
package prin;

import java.util.Scanner;


public class Prin {

    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        
        System.out.println("Escolha um canal: ");
        int canal = leia.nextInt();
        
        leia.nextLine();
        
        System.out.println("Aumente ou abaixe o volume: ");
        int volume = leia.nextInt();
        
        leia.nextLine();
        
        System.out.println("Ligue (ligado) ou desligue (desligado) a TV");
        String ligadoStr = leia.nextLine();
        boolean ligado = ligadoStr.equalsIgnoreCase("ligado");
        
        
        Televisor tv = new Televisor(canal, ligado ,volume);
        
     
        tv.MostrarStatus();
        tv.ligado();
        
        
        
    }
    
}
