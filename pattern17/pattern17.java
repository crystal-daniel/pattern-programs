//program to display the pattern
public class pattern17
{
    public static void main()
    {
        int sp=40;int a;
        System.out.println();
        for(int r=1;r<=5;r++)
        {
          a=r;
          for(int j=sp;j>=1;j--)
          {
            System.out.print(" ");
          }
          for(int k=1;k<=r;k++)
          {
            System.out.print(a+" ");
            a--;
          }
          System.out.println();
          sp=sp-2;
        }
    }
}
