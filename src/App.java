import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        
        person joseph = new person("Joseph", 10);

        SimpleDateFormat format = new SimpleDateFormat(
            "yy/MM/dd HH:mm:ss aa");  

        String in = "11/03/20 09:00:00 am";
        String out = "11/03/20 10:30:00 pm";

        Date d1 = format.parse(in);
        Date d2 = format.parse(out);

        long diff = d2.getTime() - d1.getTime();
        long diffS = diff/(1000)%60;
        long diffM = diff/(60*1000)%60;
        long diffHours = diff/(60*60*1000);

        System.out.println(diff);
        System.out.println(diffS);
        System.out.println(diffM);
        System.out.println(diffHours);


    }
}
