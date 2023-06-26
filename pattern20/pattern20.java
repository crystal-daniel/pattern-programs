//program to display the pattern
public class pattern20
{
    public static void main()
    {
        System.out.println();
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
