import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        double dX1 = x1;
        double dX2 = x2;
        double dV1 = v1;
        double dV2 = v2;

        double result = (dX2-dX1) / (dV2-dV1);



        if(result == (int) result)
        {
            if(result < 0)
            {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
        return;
    }
}
