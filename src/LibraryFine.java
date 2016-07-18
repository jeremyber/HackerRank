import java.io.*;
import java.util.*;

public class LibraryFine {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int actualDay = scan.nextInt();
        int actualMonth = scan.nextInt();
        int actualYear = scan.nextInt();

        if(scan.hasNextLine())
        {
            scan.nextLine();
        }
        int expectedDay = scan.nextInt();
        int expectedMonth = scan.nextInt();
        int expectedYear = scan.nextInt();


        int fine = 0;
        if(actualYear<expectedYear)
        {
            //no fine
            System.out.println(fine);
            return;
        }
        if(actualYear == expectedYear)
        {
            if(actualMonth<=expectedMonth)
            {
                if(actualDay<=expectedDay)
                {
                    //no fine
                    System.out.println(fine);
                    return;
                }
                else
                {
                    //fine = 15 hackos * numDaysLate
                    fine = 15 * (actualDay - expectedDay);
                    System.out.println(fine);
                    return;
                }


            }
            else
            {
                //fine = 500 hackos * numMonthsLate
                fine = 500 * (actualMonth - expectedMonth);
                System.out.println(fine);
                return;
            }



        }
        else
        {
            fine = 10000;
            System.out.println(fine);
            return;
        }
    }

}