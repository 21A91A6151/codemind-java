import java.util.Scanner;
class classanme
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int n,arr[],i,j,temp;
    n=sc.nextInt();
    arr=new int[100];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        arr[i]=arr[i]*arr[i];
    }
    for(i=1;i<n;i++)
    {
        temp=arr[i];
        for(j=i-1;j>=0;j--)
        {
            if(temp>arr[j])
            {
                arr[j+1]=temp;
                break;
            }
            else
            {
                arr[j+1]=arr[j];
            }
        }
        if(j==-1)
        {
            arr[j+1]=temp;
        }
    }
    for(i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
    }
}