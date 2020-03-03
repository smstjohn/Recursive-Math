import java.util.Scanner;

public class RecursiveMath {
   public static void main(String[] args) {
   
      int num; //Assumes n is non-negative integer
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please enter a non-negative integer: ");
      num = keyboard.nextInt();
      
      System.out.println(String.format("Sum(%d): %d", num, Sum(num) ) );
      System.out.println(String.format("BiPower(%d): %d", num, BiPower(num) ) );
      System.out.println(String.format("TimesFive(%d): %d", num, TimesFive(num) ) );
   }
   
      //Sum[N] method
      static int Sum(int num) {
          if (num == 0)
            return 0;
         else 
            return (num + Sum(num - 1) );
      }
      
      //BiPower[N] method
      static int BiPower(int num) {
         if (num == 0)
            return 1;
         else 
          return (2 * BiPower(num - 1) );
      }
   
      //TimesFive[N] method
      static int TimesFive(int num) {
         if (num == 0)
            return 0;
         if (num == 1)
            return 5;
         else 
          return (5 * TimesFive(num - 1) );
      }
}