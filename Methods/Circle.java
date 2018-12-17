
/**
 * Escreva a descrição da classe Circumference aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;

public class Circle
{
    public static void calculate_circ_and_area(double radius)
    {
        System.out.println("Circumference: " + 2*Math.PI*radius);
        System.out.println("Area: " + Math.PI*(radius*radius));
    }
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = s.nextDouble();
        calculate_circ_and_area(radius);
        
    }
}
