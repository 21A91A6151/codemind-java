import java.util.Scanner;
class classanme
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int n,a[],b[],i,k[];
    n=sc.nextInt();
    a=new int[100];
    b=new int[100];
    k=new int[100];
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        b[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
            k[i]=a[i]+b[i];
    }
   for(i=0;i<n;i++)
    {
            System.out.print(k[i]+" ");
    }
    }
}