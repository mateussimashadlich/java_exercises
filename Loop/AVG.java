
/**
 * Escreva a descrição da classe AVG aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;

public class AVG
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public static void main(String[] args){
        int i;
        double result = 0;
        Scanner s = new Scanner(System.in);
        for(i = 1;i <= 10; i++){
            System.out.print("Enter the value " + i + ":");
            double value = s.nextDouble();
            result = result + value;    
        }
        System.out.println("The average is: " + result/10);
    }
}
