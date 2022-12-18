import java.util.Scanner;
class c
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int a,b,i;
        s=sc.nextLine();
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            System.out.print(s.charAt(i));
        }
    }
}