
import java.util.Scanner;

public class Palindrom2 {
    public static void main(String [] args)
    {
        System.out.println("enter a number");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int m=num;
        Palindrom2 obj1=new Palindrom2();
        int rev=obj1.reverse(num);
        System.out.println();
       if(m==rev)
       {
           System.out.println("this is a palindrom number");
       }
       else
       {
           System.out.println("number is not a palindrom");
       }

    }


      public int reverse(int a)
        {

            int b,c=0;
            while(a>0)
            {
                b=  a % 10;
                c=c*10+b;
                a= a/ 10;

            }
            return c;
        }



}
