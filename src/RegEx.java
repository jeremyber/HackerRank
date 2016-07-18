import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int numTestCases = scan.nextInt();
        scan.nextLine();


        String username = "[a-z]+";
        String gmail = "@gmail.com";

        Pattern p = Pattern.compile(username+gmail);

        List<String> nameList = new ArrayList<String>();
        for(int i = 0; i<numTestCases; i++)
        {
            String name = scan.next();
            String email = scan.nextLine();

            Matcher m = p.matcher(email);

            if(m.find())
            {
                nameList.add(name);

            }



        }

        Collections.sort(nameList);
        for(int i = 0; i<nameList.size(); i++)
        {
            System.out.println(nameList.get(i));
        }
    }
}