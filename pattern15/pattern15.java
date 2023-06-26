//program to display the pattern
public class pattern15
{
    public static void main()
    {
        int a;
        System.out.println();
        for(int i=1;i<=5;i++)
        {
            a=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(a +" ");
                a++;
            }
            System.out.println();
        }
    }
}
