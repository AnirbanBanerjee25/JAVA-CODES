import java.util.*;
class Anirban
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,c,n;
        System.out.println("Enter two num");
        a=in.nextInt();
        b=in.nextInt();
        c=a+b;
        System.out.println("Sum="+c);
        do {
            System.out.println("Enter a number");
            n=in.nextInt();
            if(n==0)
                System.out.println("Loop terminates Thank You");
            else if(n%2==0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }while(n!=0);
    }
}