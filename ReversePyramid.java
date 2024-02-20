public class ReversePyramid 
{
    public static void main(String[] args) 
    {
    int n=5, i, j, k;

    for(i=1; i<=n; i++)
    { 

    //upper half
    for(j=i; j<n; j++)
    {
        System.out.print(" ");
    }
    for(k=1; k<=i; k++)
    {
        System.out.print("* ");
    }

    System.out.println();

    }

    //lower half
    for(i=n-1; i>=1; i--)
    {

        //loop to print space before star
        for(j=n; j>i; j--)
        {
            System.out.print(" ");
        }
        

        //loop to print star
        for(k=1; k<=i; k++)
        {
            System.out.print("* ");
        }

        System.out.println();
    }

    }

}
