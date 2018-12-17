
/**
 * Escreva a descrição da classe Grading_System aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;

public class Grading_System
{
    public static void main(String[] args)
    {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int mark = s.nextInt();
        
        if (mark > 80){
            System.out.println("A");
        }
        else if (mark <= 80 && mark >= 60){
            System.out.print("B");
        }
        else if (mark >= 50 && mark < 60){
            System.out.println("C");
        }
        else if (mark >= 45 && mark < 50){
            System.out.println("D");
        }
        else if (mark >= 25 && mark < 45){
            System.out.println("E");
        }
        else if (mark < 25){
            System.out.println("F");
        }
        else{
            System.out.println("Invalid mark.");
        }
    }
        
}

