import java.io.*;
import java.util.*;

public class Lisa {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numChapters = scan.nextInt();
        int numProblemsPerPage = scan.nextInt();
        int pageNum = 1;
        int specialProblems = 0;
        for(int i = 0; i<numChapters; i++)
        {
            int numProblemsInChapter = scan.nextInt();
            int numProblemsOnThisPage = 0;
            for(int j = 1; j<=numProblemsInChapter; j++)
            {

                if(numProblemsOnThisPage==numProblemsPerPage)
                {
                    pageNum++;
                    numProblemsOnThisPage = 0;
                }
                numProblemsOnThisPage++;
                if(j==pageNum)
                {
                    specialProblems++;
                }


            }
            pageNum++;


        }
        System.out.println(specialProblems);
    }
}