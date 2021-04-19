import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

public class App {

    //arraylist of people
    private static ArrayList<person> workers = new ArrayList<person>();

    public static void main(String[] args) throws Exception {
        
        /*
        String a = "12/28/2020 9:30 AM";
        String b = "12/28/2020 9:30 PM";
        */

        addWorker("Johnny");
        addWorker("Janet", 10.2);

        

    }

    //create worker without payRate
    public static int addWorker(String name)
    {
        workers.add(new person(name));
        return 1;
    }

    //create worker with payRate
    public static int addWorker(String name, double payRate)
    {
        workers.add(new person(name, payRate));
        return 1;
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