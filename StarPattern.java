public class StarPattern 
{
    public static void main(String[] args) 
    {
        int n=5, i, j, k;
        
        for(i=1; i<=n; i++)
        {
            for(k=i; k<=(n-i); k++)
            {
                System.out.print(" ");
            }

            for(j=1; j<=(2*i-1); j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    
}
