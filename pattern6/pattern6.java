//program to display the pattern
public class pattern6
{
    public static void main()
    {
        int alphabet=65;
        System.out.println();
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                System.out.print((char)alphabet+" ");
                alphabet++;
            }
            System.out.println();
        }
    }
}
