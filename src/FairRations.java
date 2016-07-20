/**
 * Created by Jeremy on 7/18/2016.
 */
import java.util.Scanner;

public class FairRations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }

        if(allLoavesAreEvenAndPositive(B))
        {
            System.out.println(0);
        }
        else if(B.length==1)
        {
            System.out.println(1);
            return;
        }
        else if(countOddLoaves(B)%2!=0)
        {
            System.out.println("NO");
            return;
        }
        else
        {
            System.out.println(findMinimumLoavesSoTheyAreAllEven(B));
        }
    }

    private static int countOddLoaves(int[] b) {
        int oddCount = 0;

        for(int i = 0; i<b.length; i++)
        {
            if(b[i]%2!=0)
            {
                oddCount++;
            }
        }
        return oddCount;

    }

    private static int findMinimumLoavesSoTheyAreAllEven(int[] b)
    {
        int loavesDistributed = 0;
        for(int i = 0; i<b.length; i++)
        {
            if(allLoavesAreEvenAndPositive(b))
            {
                return loavesDistributed;
            }
                int center = b[i];
                if(center%2!=0)
                {
                    Integer left = null;
                    Integer right = null;
                    if(i>0)
                    {
                        left = b[i-1];
                    }
                    if(i<b.length-1)
                    {
                        right = b[i+1];
                    }

                    //it's odd so we must add one
                    b[i]++;
                    loavesDistributed++;

                    //find minimum of left and right, preferably odd and add one
                    if(right==null)
                    {
                        b[i-1]++;
                        loavesDistributed++;

                    }
                    else
                    {
                        b[i+1]++;
                        loavesDistributed++;

                    }
                }

            }

        return loavesDistributed;
    }

    private static boolean allLoavesAreEvenAndPositive(int[] b) {
        for(int i = 0; i<b.length;i++)
        {
            if(b[i]%2!=0 || b[i]<=0)
            {
                return false;
            }
        }
        return true;
    }
}

