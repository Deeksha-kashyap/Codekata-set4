import java.util.Scanner;

class ConcatenateString{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
    
		System.out.println("Enter First String :");
		String Str1 = sc.next();
		
		System.out.println("Enter Second String :");
		String Str2 = sc.next();
		
		System.out.println("Result after concatenation:");
		
		System.out.println(Str1+ " " + Str2);
	}
}
