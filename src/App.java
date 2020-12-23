import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        
        person joseph = new person("Joseph", 10);

        SimpleDateFormat format = new SimpleDateFormat(
            "yy/MM/dd HH:mm:ss");  

        String in = "20/03/20 09:00:00";
        String out = "20/03/20 22:30:00";

        joseph.addHours(in, out);

        in = "20/01/21 09:00:00";
        out = "20/01/21 22:30:00";

        joseph.addHours(in, out);

        System.out.println(joseph);

        System.out.println(joseph.calculateHourDifferences());

    }
}