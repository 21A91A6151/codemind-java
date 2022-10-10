import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,arr[],k,p=0,z=0;
        n=sc.nextInt();
        arr=new int[100];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                z+=1;
                p=i;
            }
        }
        if(z>0)
        {
            System.out.println(p);
        }
        else
        {
            System.out.println("-1");
        }
    }
}