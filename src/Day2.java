import java.util.Scanner;

public class Day2 {


public static int factorial(int n)
{
    if(n==0 || n==1)
    {
        return 1;
    }
    else{

        int n1=n;
        int n2= factorial(n-1);
        int fact=n1*n2;
        return fact;
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factotial:");
        int a = sc.nextInt();

       int  n=a;
        int result = factorial(a);
        System.out.println("The factorial is:"+result);

    }


}
