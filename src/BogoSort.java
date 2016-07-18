import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

/**
 * Created by Jeremy on 6/28/2016.
 */
public class BogoSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        Integer [] arr = new Integer[n];
        for(int i = 0; i< arr.length; i++)
        {
            arr[i]=scan.nextInt();
        }

        Map<Integer, Integer> theMap = new HashMap<Integer, Integer>();
        for(int i = 0; i<arr.length; i++)
        {
            Integer a = theMap.get(arr[i]);
            if(a == null)
            {
                theMap.put(arr[i], 1);
            }
            else
            {
                theMap.put(arr[i], a+1);
            }
        }


        double factorial = getFactorial(n);
        Iterator it  = theMap.entrySet().iterator();

        while(it.hasNext())
        {
            Map.Entry pair = (Map.Entry) it.next();
            factorial/=getFactorial((int) pair.getValue());
        }


        DecimalFormat df = new DecimalFormat("#.000000");
        System.out.println(df.format(factorial));
    }

    public static double getFactorial(Integer n)
    {
        double factorial = 1;
        for(int i = 1; i<=n; i++)
        {
            factorial*=i;
        }
        return factorial;
    }

}



