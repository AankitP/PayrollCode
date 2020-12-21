import java.util.ArrayList;

public class person
{
    //fields
    private String name;
    private double payRate;
    private ArrayList<String[]> hours = new ArrayList<String[]>();
    private double totalHours;

    //default constructor
    public person(String name)
    {
        this.name = name;
        this.payRate = 7.25;
        this.totalHours = 0;
    }

    //not default constructor
    public person(String name, double payRate)
    {
        this.name = name;
        this.payRate = payRate;
        this.totalHours = 0;
    }

    //public get functions
    public String getName()
    {
        return this.name;
    }

    public double getPayRate()
    {
        return this.payRate;
    }

    public void setPayRate(double newPay)
    {
        this.payRate = newPay;
    }

    public void addHours(String day, String in, String out)
    {
        String[] inOut = new String[3];
        inOut[0] = day;
        inOut[1] = in;
        inOut[2] = out;

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
            stringRepresentation += "\n\t" + this.hours.get(i)[0] +
            " : \n\t\tIn: " + this.hours.get(i)[1] +
            "  \n\t\tOut: " + this.hours.get(i)[2];
            i++;
        }

        return (stringRepresentation);
    }

}