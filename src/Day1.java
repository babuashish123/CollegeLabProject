import java.util.Scanner;

public class Day1 {
     static void add()// fun with no return type no agrs
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number for sum :");
        int a =sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum is:"+sum);
    }
    static int substraction()// fun with no arg with return type
    {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number for difference");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int subs = x-y;
        return subs;

    }
    // function with arguments and no return type
    static void product( int a,int b)
    {
       int prod = a*b;
        System.out.println("the product is"+prod);


    }
    public static void main(String[] args) {
        // add two function using function
        System.out.println("function demo class");
        // how to call our function in main method
        add();

        int resultOfSubstraction = substraction();
        System.out.println("The difference is :"+resultOfSubstraction);
    product(4, 6);

    }
}
