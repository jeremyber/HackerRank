import java.util.*;

/**
 * Created by Jeremy on 6/27/2016.
 */
public class LuckBalance {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        scan.nextLine();

        ArrayList<Integer> luckBalance = new ArrayList<Integer>();
        ArrayList<Integer> importanceRating = new ArrayList<Integer>();
        int numImportant=0;

        for(int i = 0; i< n; i++)
        {
           luckBalance.add(i, scan.nextInt());
           int importance = scan.nextInt();
           importanceRating.add(i, importance);
           if(importance==1)
           {
               numImportant++;
           }

            if(scan.hasNextLine())
            {
                scan.nextLine();
            }
        }

        //find all minimums until (k - importantContests == 0)
        int maxLuck = 0;
        while(numImportant>k)
        {
            int minImportantIndex = findMinimumIndexOfImportantLuck(luckBalance, importanceRating);
            int luck = luckBalance.get(minImportantIndex);
            maxLuck-=luck;
            luckBalance.remove(minImportantIndex);
            importanceRating.remove(minImportantIndex);
            numImportant--;

        }

        for(int i = 0; i<luckBalance.size(); i++)
        {
            maxLuck+=luckBalance.get(i);
        }

        System.out.println(maxLuck);


    }

    private static int findMinimumIndexOfImportantLuck(ArrayList<Integer> luck, ArrayList<Integer> importance)
    {
        int min = 99999999;
        int minIndex = 0;
        for(int i = 0; i<importance.size(); i++)
        {
            if(importance.get(i)==1)
            {
                if(luck.get(i)<min)
                {
                    min = luck.get(i);
                    minIndex = i;
                }
            }
        }
        return minIndex;
    }
}
