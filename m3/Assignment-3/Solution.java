
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        //gcd(n1,n2);
        System.out.println(gcd(n1,n2));
    }
    /**
     * { function_description }
     *
     * @param      n1    The n 1
     * @param      n2    The n 2
     *
     * @return     { description_of_the_return_value }
     */
    public static int gcd(int n1, int n2) 
    {
        for(int i = n1; i > 1;i --) {
            if(n1 % i == 0){
                if(n2 % i == 0)
                {
                    return i;
                }
                }

            }
        return 1;    
        }

    }
