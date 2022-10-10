import java.util.Scanner;
class clas
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T,n,arr[],i,k=0;
    n=sc.nextInt();
    arr=new int[100];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    T=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(arr[i]<=T)
        {
            k=k+1;
        }
        else
        {
            k=k+2;
        }
    }
    System.out.print(k);
    }
}