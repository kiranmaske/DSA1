import java.util.*;
public class Floydstri {
    public static void main(String args[])
    {
        int n=6;
        int m=1;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++)
            {
                System.out.print(m+" ");
                m++;  //m=m+1
            }
            System.out.println(  );
        }
    }
}

