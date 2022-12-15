import java.util.*;
class cl
{
public static int fun(int k)
{
    if(k<0)
    {
        return 0;
    }
    else if(k==0)
    {
        return 1;
    }
    return fun(k-1)+fun(k-2)+fun(k-3);
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n,i,j;
    n=sc.nextInt();
    i=fun(n);
    System.out.println(i);
}
}