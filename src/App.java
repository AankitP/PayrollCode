import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        
        person joseph = new person("Joseph", 10);

        SimpleDateFormat format = new SimpleDateFormat(
            "dd/MM/yy HH:mm:ss");  

        String in = "11/03/20 09:00:00";
        String out = "11/03/20 22:30:00";

        joseph.addHours(in, out);

        System.out.println(joseph);

        System.out.println(joseph.calculateHourDifferences());

    }
}
