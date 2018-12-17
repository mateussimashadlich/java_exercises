
/**
 * Escreva a descrição da classe Checking_Inputs aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class Checking_Inputs
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        String c = s.next();
        System.out.println("Are the three the same? " + ((a.equals(b))&&(b.equals(c))&&(c.equals(a))));
        System.out.println(((a.equals(b))||(b.equals(c))||(c.equals(a))));
        
    }
}
