import java.util.Scanner;
class c
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int z=0;
        String s;
        s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                z=z+Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(z);
    }
}