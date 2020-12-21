import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        person joseph = new person("Joseph", 10);

        joseph.addHours("Mon", "10:25 AM", "10:36 PM");
        joseph.addHours("Tues", "10:59 AM", "10:01 PM");
        joseph.addHours("Wed", "10:50 AM", "10:05 PM");
        joseph.addHours("Thurs", "10:49 AM", "10:22 PM");

        System.out.println(joseph);

        ArrayList<String[]> hours = joseph.getHours();

    }

    public void calculateDiffInHours(ArrayList<String[]> hours)
    {
        int i = 0;
        while(i < hours.size())
        {
            
        }
    }
}
