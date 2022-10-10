import java.util.Scanner;
class classanme
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],d,i,c=0,k=0;
    n=sc.nextInt();
    arr=new int[1000];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        k=(int)Math.log10(arr[i])+1;
        if(k%2==0)
        {
            c+=1;
        }
    }
    System.out.println(c);
    }
}