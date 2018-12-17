
/**
 * Escreva a descrição da classe Rectangle aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
      double a,b;
      a = s.nextDouble();
      b = s.nextDouble();
      if (a == b){
        System.out.println("Square.");
    }
    else{
        System.out.println("This rectangle isn't a square.");
    }
    
        
        
      
    }
}
