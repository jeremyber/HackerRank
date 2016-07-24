import java.util.Scanner;

/**
 * Created by Jeremy on 7/19/2016.
 */
public class MarsExploration {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String S = in.next();
            String originalString = "SOS";
            int length = S.length();
            int numRepeated = length/3;
            StringBuffer sb = new StringBuffer();

            for(int i = 0; i<numRepeated; i++) {
                sb.append(originalString);

            }

            int numChanged = 0;

            for(int i = 0; i<length; i++)
            {
                if(S.charAt(i)!=sb.charAt(i))
                {
                    numChanged++;
                }
            }
            System.out.println(numChanged);


        }
    }


