import java.util.Scanner;
public class Revinput {

    public static void main(String[] args)
    {
        System.out.println("enter a input");
     Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        Revinput obj=new Revinput();
        String s2=obj.rev(s1);
        //we can not compare directly ,it will not work on string
        if(s2.equals(s1))
        {
            System.out.println("given input is palindrom");
        }
        else
        {
            System.out.println("given input is not a palindrom");
        }
    }
public String rev (String s3)
    {
        StringBuffer s4=new StringBuffer(s3);
      String s5=s4.reverse().toString();
        System.out.println("reversed string is " + s4);
        return s5;

    }
}

