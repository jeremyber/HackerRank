import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
        }



        Stack<Integer> s1 = fillStackFromArray(h1);
        Stack<Integer> s2 = fillStackFromArray(h2);
        Stack<Integer> s3 = fillStackFromArray(h3);

        int s1Height = stackHeight(s1);
        int s2Height = stackHeight(s2);
        int s3Height = stackHeight(s3);


        while(!heightsEqual(s1Height, s2Height, s3Height)) {
            int min = findMin(s1Height, s2Height, s3Height);
            while (s1Height > min) {
                s1Height -= s1.pop();

            }
            while (s2Height > min) {
                s2Height -= s2.pop();
            }
            while (s3Height > min) {
                s3Height -= s3.pop();
            }



        }
        System.out.println(s1Height);




    }

    public static int findMin(int a, int b, int c)
    {
        if(a<=b && a<=c)
        {
            return a;
        }
        else if(b<=a && b<=c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }

    public static boolean heightsEqual(int a, int b, int c)
    {
        if(a==b && a == c && b == c)
        {
            return true;
        }
        return false;
    }
    public static Stack<Integer> fillStackFromArray(int [] arr)
    {
        Stack s = new Stack();
        for(int i = arr.length-1; i>=0; i--)
        {
            s.push(arr[i]);
        }
        return s;
    }
    public static int stackHeight(Stack<Integer> s)
    {
        int height = 0;
        Stack<Integer> clone = new Stack();
        clone.addAll(s);

        while(!clone.isEmpty())
        {
            height+= (int) clone.pop();
        }

        return height;
    }
}
