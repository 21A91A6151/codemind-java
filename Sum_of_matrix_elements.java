import java.util.Scanner;
class classanme
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[][],k=0,r,c,i,n,j;
    r=sc.nextInt();
    c=sc.nextInt();
    arr=new int[100][100];
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
        arr[i][j]=sc.nextInt();
        }
    }
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            k=k+arr[i][j];
        }
    }
    System.out.println(k);
    }
}