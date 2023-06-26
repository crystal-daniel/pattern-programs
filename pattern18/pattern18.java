//program to display the pattern
public class pattern18
{
    public static void main()
    {
        int sp=40;
        System.out.println();
        for(int r=1;r<=5;r++)
        {
          for(int j=sp;j>=1;j--)
          {
            System.out.print(" ");
          }
          for(int k=1;k<=r;k++)
          {
            System.out.print(r+" ");
          }
          System.out.println();
          sp=sp-2;
        }
    }
}
