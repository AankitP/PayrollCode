import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception {
        
        //person joseph = new person("Joseph", 10);

        String a = "12/28/2020 9:30 AM";
        String b = "12/28/2020 9:30 PM";
        
        System.out.println(hourReturn(a));
        System.out.println(hourReturn(b));

    }

    //this is for formatting reasons
    public static String hourReturn(String input)
    {
        StringTokenizer t = new StringTokenizer(input , " :");//creats a String Tokenizer to seperate the String Created
        
        String day = t.nextToken();
        String hour = t.nextToken();
        String min = t.nextToken();
        String amOrPM = t.nextToken();

        System.out.println(day);
        System.out.println(hour);
        System.out.println(min);
        System.out.println(amOrPM);

        //this is to format it better
        if(amOrPM.equals("PM"))
        {
            int h = Integer.parseInt(hour);
            h+=12;

            hour = "" + h;
        }



        String returnThis = day + " " + hour + ":" + min + 
            ":00";
        return returnThis;
    }
}