    
    /**
     * Escreva a descrição da classe Classifing_Numbers aqui.
     * 
     * @author (seu nome) 
     * @version (número de versão ou data)
     */
    import java.util.Scanner;
    public class Classifing_Numbers
    {
       public static void main(String[] args)
       {
           Scanner s = new Scanner(System.in);
           int[] numbers = new int[3];
           for(int i = 0;i<numbers.length;i++)
           {
               numbers[i] = s.nextInt();
           }
           int num_pos_nums = 0;
           int num_neg_nums = 0;
           int num_odd_nums = 0;
           int num_even_nums = 0;
           int num_zero_nums = 0;
           for(int i: numbers)
           {
               if(i>0){
                   num_pos_nums += 1;    
                }
               else if(i < 0){
                   num_neg_nums += 1;
                }
               else{
                   num_zero_nums += 1;
                }
               if (i%2 == 0){
                   num_even_nums += 1;
                }
               else{
                   num_odd_nums += 1;
                }
               
            }
            System.out.println("Positives: " + num_pos_nums);
            System.out.println("Negatives: " + num_neg_nums);
            System.out.println("Odds: " + num_odd_nums);
            System.out.println("Evens: " + num_even_nums);
            System.out.println("Zeros: " + num_zero_nums);
   }
}
