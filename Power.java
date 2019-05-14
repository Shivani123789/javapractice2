import java.util.Scanner;
import java.lang.Math;
//this enble to use pow function
public class Power {
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        Power obj1=new Power();
       double num2= obj1.calculate(num);
        System.out.println("power of "+num+" is "+ num2);
    }
    public double calculate(double temp)
    {
        double result=Math.pow(temp,4);
        return result;
    }
}
