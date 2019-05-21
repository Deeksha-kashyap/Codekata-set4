import java.util.*;
class Sample
{
   public static void main(String[] args)
   {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the number");
       int n=s.nextInt();
       if ( 0 < n && n < 10)
       {
         System.out.println("Satisfy in the range");
       }
       else 
       {
          System.out.println("it is not in the range");
       }
   }
}
