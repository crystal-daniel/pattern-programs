//program to display the pattern
public class pattern14
{
    public static void main()
    {
        System.out.println();
        for(int i=5;i>=1;i--)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
