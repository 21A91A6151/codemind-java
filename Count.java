import java.util.Scanner;
class classanme
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i,ec=0,oc=0;
    n=sc.nextInt();
    arr=new int[100];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        if(arr[i]%2==0)
        {
            ec++;
        }
        else
        {
            oc++;
        }
    }
        System.out.print(ec+" ");
        System.out.print(oc+" ");
    }
}