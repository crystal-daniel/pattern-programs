//program to display the pattern
public class pattern10
{
    public static void main()
    {
        int num=9;
        System.out.println();
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
    }
}