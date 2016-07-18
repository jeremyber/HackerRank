import java.util.Scanner;

/**
 * Created by Jeremy on 6/21/2016.
 */
public class Cavity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        scan.nextLine();
        int [][] map = makeArray(scan, size, size);

        //find boundaries of middle
        //start to print out the array
        //for each middle entry, look at top, right, left, and bottom to see if they are less
        //if they are, print X instead of number
        if(size>2)
        {
            int startMiddle = 1;
            int endMiddle = size-1;
            for(int i = 0; i<map.length; i++)
            {
                for(int j = 0; j<map[0].length; j++)
                {
                    if(i>=startMiddle && i<endMiddle && j>=startMiddle && j<endMiddle)
                    {
                        if(isCavity(map, i, j))
                        {
                            System.out.print("X");
                        }
                        else
                        {
                            System.out.print(map[i][j]);
                        }
                    }
                    else
                    {
                        System.out.print(map[i][j]);
                    }
                }
                System.out.println();

            }

        }
        else
        {
            for(int i = 0; i<map.length; i++)
            {
                for(int j = 0; j<map[0].length; j++) {
                    System.out.print(map[i][j]);
                }
                System.out.println();
        }   }
    }

    private static boolean isCavity(int [][] map, int row, int col)
    {
        int numInQuestion = map[row][col];
        int top = map[row-1][col];
        int left = map[row][col-1];
        int right = map[row][col+1];
        int bottom = map[row+1][col];
        //check top
        if(top>=numInQuestion || left>=numInQuestion || right >= numInQuestion || bottom >=numInQuestion)
        {
            return false;
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
        return theGrid;
    }
}
