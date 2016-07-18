import java.util.Scanner;

public class BitwiseAnd {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i<testCases; i++)
        {
            int n = scan.nextInt();
            int k = scan.nextInt();

            if(scan.hasNextLine())
            {
                scan.nextLine();
            }

            int maxAndLessThanK = 0;
            for(int a = 1; a<n; a++)
            {
                for(int b = a+1; b<=n; b++)
                {
                    int and = a&b;
                    if(and>maxAndLessThanK && and <k)
                    {
                        maxAndLessThanK = and;
                    }
                }
            }
            System.out.println(maxAndLessThanK);
        }


    }
}