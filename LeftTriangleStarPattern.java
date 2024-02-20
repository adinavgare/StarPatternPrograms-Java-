public class LeftTriangleStarPattern
{
    public static void main(String[] args) 
    {
        int n=5, i, j, k;
        
        for(i=1; i<=n; i++)
        {
            for(k=i; k<=(n-1); k++)
            {
                System.out.print("  ");
            }

            for(j=1; j<=i; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}