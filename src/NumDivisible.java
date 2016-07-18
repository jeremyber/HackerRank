import java.io.*;
import java.util.*;

public class NumDivisible {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int numTestCases = scan.nextInt();

        for(int i = 0; i<numTestCases; i++)
        {
            int n = scan.nextInt();
            int z = n;
            List<Integer> set = new ArrayList<Integer>();
            while(z>0)
            {
                if(z%10>0)
                {
                    set.add(z%10);
                }
                z = z/10;
            }


            int numDivisible = 0;
            for(Integer k : set)
            {
                if(n%k==0)
                {
                    numDivisible++;
                }
            }

            System.out.println(numDivisible);


        }
    }


}