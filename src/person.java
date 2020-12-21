import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class person {
    // fields
    private String name;
    private double payRate;
    private ArrayList<Date[]> hours = new ArrayList<Date[]>();
    private double totalHours;

    // default constructor
    public person(String name) {
        this.name = name;
        this.payRate = 7.25;
        this.totalHours = 0;
    }

    // not default constructor
    public person(String name, double payRate) {
        this.name = name;
        this.payRate = payRate;
        this.totalHours = 0;
    }

    // public get functions
    public String getName() {
        return this.name;
    }

    public double getPayRate() {
        return this.payRate;
    }

    public void setPayRate(double newPay) {
        this.payRate = newPay;
    }

    public void addHours(String in, String out) throws ParseException
    {
        SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss");  
        
        Date [] inOut = new Date[2];

        Date d1 = format.parse(in);
        Date d2 = format.parse(out);

        inOut[0] = d1;
        inOut[1] = d2;

        this.hours.add(inOut);

    }

    public ArrayList getHours()
    {
        return this.hours;
    }

    public String toString()
    {
        String stringRepresentation = this.name + ":";

        int i = 0;
        while(i < this.hours.size())
        {
            stringRepresentation += "\n\tIn: " + this.hours.get(i)[0] +
            "\n\tOut: " + this.hours.get(i)[1];
            i++;
        }

        return (stringRepresentation);
    }

}