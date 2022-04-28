import java.util.Scanner;

/**
 * Write a description of class practice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class practice
{
    public static void main(String args[])
    {
        //Code for Challenge Two
         
        Scanner sc = new Scanner(System.in);
       
         System.out.println("Select a number");
         
         int x = sc.nextInt();
         
         System.out.println("Select a new number");
         
         int y = sc.nextInt();
         
         if (x % y == 0) {
       
         System.out.println("This number is divisible by y");
        }
         else
            if  (x % y != 0) {
           
            System.out.println("This number is not divisible by y");
           
           
            }
   
   

           
        }
}
