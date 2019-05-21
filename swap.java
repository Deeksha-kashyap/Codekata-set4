import java.util.*;
class Swap
{
   public static void main(String[] args)
   {
      int a,b,temp;
      System.out.println("Enter the a and b");
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      System.out.println("Before swapping\n a="+a+"\nb="+b);
      temp=a;
      a=b;
      b=temp;
      System.out.println("After swapping\n a="+a+"\nb="+b);
   }
}
