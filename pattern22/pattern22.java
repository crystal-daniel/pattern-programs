//program to display the pattern
public class pattern22
{
    public static void main()
    {
        int a=65;
        System.out.println();
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)a+" ");
            }
            a++;
            System.out.println();
        }
    }
}
