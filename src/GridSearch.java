/**
 * Created by Jeremy on 6/16/2016.
 */
import java.io.*;
import java.util.*;

public class GridSearch {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTestCases = scan.nextInt();
        scan.nextLine();

        for(int n = 0; n<numTestCases; n++)
        {
            int gridRows = scan.nextInt();
            int gridCols = scan.nextInt();
            if(scan.hasNextLine())
            {
                scan.nextLine();
            }
            int[][] theGrid = makeArray(scan, gridRows, gridCols);

            int patternRows = scan.nextInt();
            int patternCols = scan.nextInt();
            if(scan.hasNextLine())
            {
                scan.nextLine();
            }
            int[][] thePattern = makeArray(scan, patternRows, patternCols);

            boolean result = isPatternInGrid(theGrid, thePattern);
            if(result)
            {
                System.out.println("YES");
            }
            else
            {
               System.out.println("NO");
            }

        }
    }

    private static boolean isPatternInGrid(int [][] grid, int [][] pattern)
    {
        for(int i = 0; (i+pattern.length)<=grid.length; i++)
        {
            for(int j = 0; (j+pattern[0].length)<=grid[i].length; j++)
            {
                if(pattern[0][0]==grid[i][j])
                {
                    if(thePatternIsThere(grid, pattern, i, j))
                    {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean thePatternIsThere(int [][] grid, int [][] pattern, int startRow, int startCol)
    {
        int patternI = 0;

        for(int i = startRow; patternI<pattern.length; i++)
        {
            int patternJ = 0;
            for(int j = startCol; patternJ<pattern[0].length; j++)
            {
                if(!(pattern[patternI][patternJ]==grid[i][j]))
                {
                    return false;
                }
                patternJ++;
            }
            patternI++;
        }
        return true;
    }
    private static int[][] makeArray(Scanner scan, int rows, int cols) {
        int [][] theGrid = new int[rows][cols];
        for(int i = 0; i<rows; i++)
        {
            String line = scan.nextLine();
            for(int j= 0; j<cols; j++)
            {
                theGrid[i][j] = Integer.parseInt(line.substring(j, j+1));
            }

        }

      /**  for(int i = 0; i<theGrid.length; i++)
        {
            for(int j = 0; j<theGrid[i].length; j++)
            {
                System.out.print(theGrid[i][j]+ " ");
            }
            System.out.println();
        }*/
        return theGrid;
    }

}
