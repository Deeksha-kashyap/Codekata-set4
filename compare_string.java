import java.util.Scanner;
class CompareStrings
{
	public static void main(String args[])
	{
		String str1=null;
		String str2=null;
		Scanner S=new Scanner(System.in);
		System.out.print("Enter string1: ");
		str1=S.nextLine();

		System.out.print("Enter string2: ");
		str2=S.nextLine();		
		
		
		if(str1.length()!=str2.length()){
			System.out.println("Strings are not same, lengths are different!!!");
			return;
		}
		
		boolean flag=true;
		for(int loop=0; loop<str1.length();loop++){
			if(str1.charAt(loop)!=str2.charAt(loop)){
				flag=false;
				break;
			}
		}
		
		if(flag){
			System.out.println("Strings are same.");
		}
		else{
			System.out.println("Strings are not same.");
		}
		
	}
}
