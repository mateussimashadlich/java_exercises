
/**
 * Escreva a descrição da classe Employees aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

class Employee{
        private String name;
        private String address;
        private int joining_year;
        public Employee(String n,String a,int joining_y){
            name = n;
            address = a;
            joining_year = joining_y;
        }
        
        public String getName(){
            return name;
        }
        public String getAddress(){
            return address;
        }               
        public int getJoiningYear(){
            return joining_year;
        }               
    }
public class Employees
{
  public static void main(String[] args){
      Employee robert = new Employee("Robert","Street 0",2001);
      Employee sam = new Employee("Sam","Street 1",2005);
      Employee john = new Employee("John","Street 2",1997);
      System.out.println("Employee " + robert.getName() +"\n" +robert.getJoiningYear() +" " +robert.getAddress());
      System.out.println("Employee " + sam.getName() +"\n" +sam.getJoiningYear() +" " +sam.getAddress());
      System.out.println("Employee " + john.getName() +"\n" +john.getJoiningYear() +" " +john.getAddress());
      }
}
