import java.util.Scanner;
class classname
{
    public static int ispal(int n)
{
    int d,k=0,temp;
    temp=n;
    while(n!=0)
    {
        d=n%10;
        n=n/10;
        k=k*10+d;
    }
    if(k==temp)
    {
        return 2;
    }
    else
    {
        return 1;
    }
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,k=0,d,temp,x;
        n=sc.nextInt();
        temp=n;
        x=ispal(n);
        System.out.println(x);
    }
}