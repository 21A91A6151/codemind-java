import java.util.Scanner;
class classanme
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,arr[],j=0;
    n=sc.nextInt();
    arr=new int[100];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        if(arr[i]!=0)
        {
            arr[j]=arr[i];
            j++;
        }
    }
    for(i=j;i<n;i++)
    {
        arr[i]=0;
    }
    for(i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
    }
}