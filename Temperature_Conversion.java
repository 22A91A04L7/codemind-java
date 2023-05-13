import java.util.Scanner;
public class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c;
        float f;
        c=sc.nextInt();
        f=32+(c*(float)9/5);
        System.out.format("%.2f",f);
        sc.close();
    }
}