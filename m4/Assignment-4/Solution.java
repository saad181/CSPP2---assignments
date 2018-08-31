import java.util.Scanner;
public class Solution
{/*
	Do not modify the main function 
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
        
		String reverse=reverseString(s);
		
		System.out.println(reverse);
		
	}
    
	static String reverseString(String reverse1) {//hellowrld
		String s ="";
		for (int i = reverse1.length()-1; i>=0 ; i--) {
			//System.out.println(reverse.charAt(i));
			s = s + reverse1.charAt(i);
		}
		return s;
	}


}
