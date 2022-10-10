import java.util.Scanner;
class classnme
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i,j,k=1;
        arr=new int[100];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            k=1;
            for(j=0;j<n;j++)
            {
                if(i!=j)
                {
                    k=k*arr[j];
                }
            }
            System.out.print(k+" ");
        }
    }
}