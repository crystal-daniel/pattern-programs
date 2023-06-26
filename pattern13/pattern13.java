//program to display the pattern
public class pattern13
{
    public static void main()
    {
        System.out.println();
        for(int i=1;i<=5;i++)
        {
           for(int j=1;j<=i;j++)
           {
              if(j%2==1)
              {
                System.out.print("* ");
              }
              else
              {
                System.out.print("# ");
              }
           }
           System.out.println();
        }
    }
}
