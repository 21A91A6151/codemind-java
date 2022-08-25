import java.util.Scanner;
class classname
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        float area,pi=3.14f;
        a=sc.nextInt();
        area=pi*a*a;
        System.out.printf("%.2f",area);
    }
}