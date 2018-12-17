
/**
 * Escreva a descrição da classe Draw_Patterns aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Draw_Patterns
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
   public static void main(String[] args)
   {
    int rows = 4;
    int i;
    int j;
    for(i = 1; i<= 4; i++)
    {
     for(j = 1; j <= i; j++)
     {
         System.out.print("*");
        }
     System.out.println();   
    }
    }
}
