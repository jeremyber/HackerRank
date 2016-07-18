import java.io.*;
import java.util.*;

public class Chocolate {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numTests = scan.nextInt();
        scan.nextLine();


        for(int i = 0; i<numTests; i++)
        {
            int dollars = scan.nextInt();
            int cost = scan.nextInt();
            int wrapperRedemptionCost = scan.nextInt();

            if(scan.hasNextLine())
            {
                scan.nextLine();
            }

            int numBought = dollars / cost;
            int numWrappers = numBought;
            while(numWrappers >= wrapperRedemptionCost)
            {
                numBought+=numWrappers/wrapperRedemptionCost;
                numWrappers = numWrappers/wrapperRedemptionCost + numWrappers % wrapperRedemptionCost;

            }
            System.out.println(numBought);

        }
    }
}