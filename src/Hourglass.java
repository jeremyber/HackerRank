import java.io.*;
import java.util.*;

public class Hourglass {


    public static int findAllHourglassSums(int[][] arr)
    {
        int maxHourglass = 0;
        for(int i = 0; i+2 < arr[i].length; i++)
        {
            for(int j = 0; j+2 < arr[i].length; j++)
            {
//                System.out.println(arr[i][j] + " " + arr[i][j+1] + " " + arr[i][j+2]);
//                System.out.println("\t" + arr[i+1][j+1]);
//                System.out.println(arr[i+2][j] + " " + arr[i+2][j+1] + " " + arr[i+2][j+2]);
//                System.out.println("--------------");

                int currentMax = arr[i][j] +  arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j+1]
                        +arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                if(i==0 && j == 0)
                {
                    maxHourglass = currentMax;

                }
                if (currentMax > maxHourglass)
                {
                    maxHourglass = currentMax;
                }
            }

        }

        return maxHourglass;

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int [][] hourglassArr = new int[6][6];

        Scanner sc = new Scanner(System.in);
        int i = 0, j = 0;
        while (sc.hasNextLine()) {
            String[] tempArr = sc.nextLine().split(" ");
            for(; i<hourglassArr.length; i++)
            {
                hourglassArr[j][i] =  Integer.parseInt(tempArr[i]);
            }
            i = 0;
            j++;
        }
        sc.close();

        //hourglassArr now made

        System.out.println(findAllHourglassSums(hourglassArr));
    }

}