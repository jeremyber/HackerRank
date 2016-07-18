import java.util.Scanner;

public class MinimumDistances {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }

        int min = -1;
        for(int i = 0; i<A.length; i++)
        {
            for(int j = i+1; j<A.length; j++)
            {
                if(A[i]==A[j])
                {
                    int distance = j - i;
                    if(distance<min && distance > -1)
                    {
                        min = distance;
                    }
                }
            }
        }
        System.out.println(min);
    }
}
