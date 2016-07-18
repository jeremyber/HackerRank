import java.util.Scanner;

public class InsertionSort {



    public static void insertIntoSorted(int[] ar) {
        int numToShift = ar[ar.length-1];
        int pivot = ar.length-1;
        ar[pivot] = numToShift+1;
        pivot--;
        while(pivot > -1)
        {
            if(ar[pivot]>numToShift)
            {


                ar[pivot+1] = ar[pivot];
                if(pivot==0)
                {
                    printArray(ar);
                    ar[pivot] = numToShift;
                    printArray(ar);
                    break;
                }
                printArray(ar);

            }
            else
            {
                ar[pivot+1] = numToShift;
                printArray(ar);
                break;
            }

            pivot--;

        }



    }



    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }


}
