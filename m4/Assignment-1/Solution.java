
import java.util.Scanner;
public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		
		int arr[] = new int[n];
		for(int j=0; j<n; j++)
		{
			arr[j]=sc.nextInt();
		}
		int max = arr[0] ;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			
		}
		System.out.println(max);
		

	}
}
