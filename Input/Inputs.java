
/**
 * Escreva a descrição da classe Inputs aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;

public class Inputs
{
    public static void main(String[] args)
    {
     Scanner s = new Scanner(System.in);
     int x,y;
     System.out.println("Enter the first integer: ");
     x = s.nextInt();
     System.out.println("Enter the second integer: ");
     y = s.nextInt();
     System.out.print("Sum int1 and int2: ");
     System.out.println(x+y);

    System.out.println("Product int1 and int2: " + x*y);
    }
}
