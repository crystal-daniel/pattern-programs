//program to display the pattern
public class pattern19
{
    public static void main()
    {
        int sp=2;int a;
        System.out.println();
        for(int r=5;r>=1;r--)
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
          sp=sp+2;
        }
    }
}
