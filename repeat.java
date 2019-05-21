import java.util.*;
class Sample
{
  public static void main(String[] args)
  {
     Scanner s=new Scanner(System.in);
     int k;
     String str;
     System.out.println("Enter the string");
     str=s.next();
     System.out.println("Enter the number");
     k=s.nextInt();
     for(int i=0;i<=k;i++)
     {
        System.out.println(str);
     }
  }
}
