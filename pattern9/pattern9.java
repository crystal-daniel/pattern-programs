//program to display the pattern
public class pattern9
{
    public static void main()
    {
        int a=2;
        System.out.println();
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=5;j=j+2)
            {
                System.out.print(a+" ");
                a=a+2;
            }
            System.out.println();
            a=a-4;
        }
    }
}
