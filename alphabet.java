import java.util.*;
public class JavaProgram
{
   public static void main(String[] args)
   {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character");
        ch=sc.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print(ch + " is an Alphabet");
        }
        else
        {
            System.out.print(ch + " is not an Alphabet");
        }
   }
}
