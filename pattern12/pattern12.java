//program to display the pattern
public class pattern12
{
    public static void main()
    {
        int a=1;
        System.out.println();
        for(int i=1;i<=5;i++)
        {
           for(int j=1;j<=i;j++)
           {
              if(j%2==1)
              {
                System.out.print(a+" ");
              }
              else
              {
                System.out.print(--a +" ");
              }
              a=1;
           }
           System.out.println();
        }
    }
}
