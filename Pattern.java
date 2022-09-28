import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,k=64;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n;j>0;j--)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}