import java.io.*;
import java.util.*;

public class Sherlock {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numTestCases = scan.nextInt();
        scan.nextLine();


        while(numTestCases > 0)
        {
            int n = scan.nextInt();
            if(n < 3)
            {
                System.out.println(-1);
            }
            else if(n%3==0)
            {
                for(int i = 0; i<n; i++)
                {
                    System.out.print("5");

                }
                System.out.println();
            }
            else if(n%5==0)
            {
                for(int i = 0; i<n; i++)
                {
                    System.out.print("3");

                }
                System.out.println();
            }
            else
            {
                int z = n;
                while(z%3 != 0)
                {
                    z-=5;
                }
                if(z<0)
                {
                    System.out.println(-1);
                }
                else
                {

                    StringBuilder sb = new StringBuilder();
                    for(int i = 0; i<z; i++)
                    {
                        sb.append("5");
                    }
                    for(int i = 0; i<(n-z); i++)
                    {
                        sb.append("3");
                    }
                    System.out.println(sb.toString());
                }
            }



            numTestCases--;
        }
    }
}