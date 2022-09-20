import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,a[],l,r,temp,d,k=0,z=0;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
                k=0;
                l=sc.nextInt();
                r=sc.nextInt();
            for(j=l;j<=r;j++)
             {
                temp=j;
                if(temp!=0)
                {
                   d=temp%10;
                   temp=temp/10;
                   if(d==2 || d==3 || d==9)
                   {
                       k+=1;
                    }
                }
             }
           System.out.println(k);
        }
    }
}