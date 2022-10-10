import java.util.Scanner;
class Classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,arr[],k,p,q=0,z=0,c=0;
        n=sc.nextInt();
        arr=new int[100];
        for(i=0;i<n;i++)
        {
            k=sc.nextInt();
            for(j=0;j<k;j++)
            {
                arr[j]=sc.nextInt();
            }
            c=0;
            for(j=0;j<k;j++)
            {
                for(p=0;p<k;p++)
                {
                    for(q=0;q<k;q++)
                    {
                        if(j!=q && j!=p && q!=p)
                        {
                            if(arr[j]+arr[p]==arr[q])
                            {
                                c+=1;
                            }
                        }
                    }
                }
            }
                if(c>0)
                {
                    System.out.println(c/2);
                }
                else
                {
                    System.out.println("-1");
                }
        }
    }
}
                    