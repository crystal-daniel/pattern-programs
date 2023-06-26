//program to display the pattern
public class pattern2
{
    public static void main()
    {
        System.out.println();
        for(int i=1;i<=3;i++)
        {
            for(int j=i;j<=3+i-1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
