import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int dimensionsOfArray = scan.nextInt();
        scan.nextLine();

        int [][] diagonalArray = new int[dimensionsOfArray][dimensionsOfArray];
        int rightToLeftSum = 0;
        int leftToRightSum = 0;

        //fill the array


        for(int i = 0; i<dimensionsOfArray; i++) {
            for (int j = 0; j < dimensionsOfArray; j++) {
                diagonalArray[i][j] = scan.nextInt();
            }
            if(scan.hasNextLine())
            {
                scan.nextLine();
            }
            else
            {
                break;
            }
        }

        for(int i = 0; i<dimensionsOfArray; i++)
        {
            for(int j = dimensionsOfArray-1; j>=0; j--)
            {
                rightToLeftSum += diagonalArray[i][i];
                leftToRightSum += diagonalArray[i][j];
                i++;
            }
            break;
        }

        System.out.println(Math.abs(rightToLeftSum - leftToRightSum));
    }
}