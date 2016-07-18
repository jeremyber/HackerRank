import java.io.*;
import java.util.*;
import static java.util.Comparator.comparingInt;
import java.util.stream.IntStream;



public class Sticks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        //find min
        //save count when iterating
        //subtract from all by min
        //print count
        //until array is empty
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        List<Integer> theList = new ArrayList<Integer>();
        for(int i = 0; i<n; i++)
        {
            theList.add(scan.nextInt());
        }

        while(!(theList.isEmpty()))
        {
            int min = theList.stream().mapToInt(Integer::intValue).min().getAsInt();
            int numNegatives = 0;
            int initialSize = theList.size();
            for(int i = 0; i<theList.size(); i++)
            {
                int newNum = theList.get(i) - min;
                theList.set(i, newNum);
                if(newNum <=0) {
                    numNegatives++;
                }
            }
            List<Integer> newList = new ArrayList<Integer>(numNegatives);
            for(int i = 0; i<theList.size(); i++)
            {
                if(theList.get(i)>0)
                {
                    newList.add(theList.get(i));
                }
            }
            theList = newList;

            System.out.println(initialSize);
        }

    }
}