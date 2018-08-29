
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);    
        int n = s.nextInt();
        int x = 1;
        int temp = 0;
        final int ten = 10;
        final int seven = 7;
        for(int i = 1; i <= n; i++) {
        	x = i;
            
        	while(x != 0)
        	{
        		if(x % ten == seven) {
        			temp = temp + 1;
        		}
                x = x / ten;
        	}
        }
       
        System.out.println(temp);
    }
}
