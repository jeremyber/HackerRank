import java.io.*;
import java.util.*;

public class Bubble {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        scan.nextLine();
        int [] bubbleArray = new int[length];
        for(int i = 0; i<length; i++)
        {
            bubbleArray[i] = scan.nextInt();
        }

        bubbleSort(bubbleArray);

    }

    public static void bubbleSort(int [] a)
    {            int numberOfSwaps = 0;


        for (int i = 0; i < a.length; i++)
        {

            for (int j = 0; j < a.length - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    swap(j, j+1, a);
                    numberOfSwaps++;
                }
            }



        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);

    }

    public static void swap(int j, int jPlusOne, int [] a)
    {
        int numToSwap = a[j];
        a[j] = a[j+1];
        a[j+1] = numToSwap;
    }
}