import java.util.Scanner;
public class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,b,s,c;
        t=sc.nextInt();
        b=sc.nextInt();
        s=sc.nextInt();
        c=2*t*s*b*512;
        System.out.println(c);
        sc.close();
    }
}