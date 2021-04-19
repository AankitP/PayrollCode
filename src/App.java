import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.Scanner;

public class App {

    //arraylist of people
    private static ArrayList<person> workers = new ArrayList<person>();

    public static void main(String[] args) throws Exception {
        
        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        /*
        String a = "12/28/2020 9:30 AM";
        String b = "12/28/2020 9:30 PM";
        */
        boolean exit = false;
        while(!exit)
        {
            menue();
            int a = intScanner.nextInt();

            switch(a)
            {
                case 1://If 1 is inputted, we create a new Worker
                    System.out.println("Creating new Worker...");
                    System.out.println("\tEnter Name");
                    String nameOfNewWorker = stringScanner.nextLine();

                    System.out.println("\tdo you want to add a payRate at this time? (Y/N)");
                    String addPay = stringScanner.nextLine();

                    if(addPay.compareTo("Y") == 0)//This is for if we want to add hourly pay
                    {
                        System.out.println("\t\tEnter Payrate: ");
                        double pay = stringScanner.nextDouble();

                        addWorker(nameOfNewWorker,pay);

                    }
                    else//If we don't want to add pay
                    {
                        addWorker(nameOfNewWorker);
                    }

                    break;
                case 2://this is to adjust a workers hourly pay
                    System.out.println("Typed 2");
                    break;
                case 3://this is to add a workers clock in and clock out
                    System.out.println("Typed 3");
                    break;
                case 4://this prints all workers current status
                    System.out.println("Printing Workers...");

                    for(int i = 0; i < workers.size(); i++)
                    {
                        System.out.println(workers.get(i).toString());
                    }

                    break;
                case 5://exits the system
                    System.out.println("Exiting...");
                    exit = true;
                    break;

            }
        }
        

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

    private static void menue()
    {
        System.out.println("\nThis is the menue, input a number: ");
        System.out.println("\t1)Add Worker ");
        System.out.println("\t2)change worker pay");
        System.out.println("\t3)Add Worker ClockIn/ClockOut");
        System.out.println("\t4)Print current workers status");
        System.out.println("\t5)Exit");
    }
}