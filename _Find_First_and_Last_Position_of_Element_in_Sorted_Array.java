import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,arr[],k,p=0,z=0,c=0;
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
                System.out.print(i+" ");
                break;
            }
        }
        for(i=n-1;i>=0;i--)
        {
            if(arr[i]==k)
            {
                c+=1;
                System.out.print(i+" ");
                break;
            }
        }
        if(c==0 && z==0)
        {
            System.out.println("-1 -1");
        }
    }
}