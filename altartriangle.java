public class altartriangle
{
    public static void main(String args[]) 
    {
        int n=5;

        //outer loop
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
        {
            //sum=i+j;
            if((i+j)%2==0)
            {
                System.err.print(1+" ");
            }
            else
            {
                System.out.print(0+" ");
            }
        }
        System.err.println();
    }
}
}
