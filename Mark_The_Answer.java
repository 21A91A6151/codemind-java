import java.util.Scanner;
class classanme
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,m,a[],c=0,k=0;
    n=sc.nextInt();
    m=sc.nextInt();
    a=new int[100];
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        if(k==2)
        {
            break;
        }
        if(m>=a[i])
        {
            c+=1;
        }
        else
        {
            k+=1;
        }
    }
    System.out.println(c);
    }
}