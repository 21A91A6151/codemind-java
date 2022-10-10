import java.util.Scanner;
class classanme
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i,j,c=0;
    n=sc.nextInt();
    arr=new int[100];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        c=0;
        for(j=i;j<n;j++)
        {
            if(arr[j]==arr[i])
            {
                c++;
            }
        }
         if(c>n/2)
            {
                System.out.print(arr[i]);
                 arr[i]=-1;
                break;
            }
    }
    }
}