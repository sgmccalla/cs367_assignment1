
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class InteractiveDBTester {

	// make the Employee database a static data member so it does not have to
	// be passed to each help method
        // It is protected so that subclasses representing particular testers can
        // access it


	protected static EmployeeDatabase EmployeeDB = new EmployeeDatabase();

        // Initialize DB from external data file
        protected static void populateDB(String [] args) {

            // Step 1: check whether exactly one command-line argument is given
            /* https://www.roseindia.net/java/beginners/java-read-file-line-by-line.shtml*/
            /* Code to implement Step 1 goes here  */
            // first check to see if the program was run with the command line argument
            // https://www.cs.swarthmore.edu/~newhall/unixhelp/Java_files.html
            if(args.length < 1) {
                System.out.println("Please provide input file as command-line argument");
                System.exit(1);
            }
            // https://stackoverflow.com/questions/16802147/java-i-want-to-read-a-file-name-from-command-line-then-use-a-bufferedreader-to
            File inFile = null;
            if (0 < args.length) {
                inFile = new File(args[0]);
            }
            else {
                System.err.println("Please provide input file as command-line argument");
                System.exit();
            }

            // Step 2: check whether the input file exists and is readable
           /* Code to implement Step 2 goes here  */
           if (!file.exists()) { //Checks whether the input file exists and is readable
               {
                   System.out.println("Error: Cannot access input file"); //print error
                   System.exit();
               }
           else {
                // Open file
                FileInputStream fstream = new FileInputStream();
                DataInputStream in = new DataInputStream(fstream);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String strLine
           }

    	// Step 3: load the data from the input file and use it to construct a
    	//         Employee database


            /* Code to implement Step 3 goes here  */

        File file = new File(fileName);     // create a File object
        try
        {
            DataInputStream in = new DataInputStream
        }

       // Create a single shared Scanner for keyboard input
       Scanner employeeScanner = new Scanner(employeeFile)
       String line = "";
       String [] employeeList = new String[2];
       String employeeName = "";
       String destinationName = "";

        while (employeeScanner.hasNext())
        {
            oneLine = employeeScanner.nextLine().trim; //read in each line
            employeeName = oneLine.split(",", 2); // put everything before the first comma in a new list
            employeeDest = destinationList[0].trim(); // put everything after the first comma in a new list
            ArrayList<String> splitList = new ArrayList<String> (Arrays.asList(destArray[1].split(",")));
            String [] splitArray = new String [2];
            ArrayList<Destinations> destinationList = new ArrayList<Destinations>();
            Iterator<Destinations> iter = destinationList.iterator();
            while (iter.hasNext()) {
                Destinations current = iter.next();
                if (current.getUsername().equals(e)) {
                    return true;
                }
            }
            return false;







        /*  while ((strLine = br.readLine()) != null) {

             }*/

            }

     static boolean GUIactive;  //is GUI tester active?

// Methods that implement GUI buttons or testing actions

    protected static String pushFind(String employee){
       /* Code to implement find command goes here:
          Find the supplied employee in the employee database
       */
    }

    protected static String pushDiscontinue(String destination){
       /* Code to implement discontinue command goes here:
          The supplied destination is removed from the wish lists
           of all employees in the employee database
       */
    }

    protected static String pushSearch(String destination){
       /* Code to implement search command goes here:
           Search the employee database for all employees who have
            the supplied destination in their wish list
       */
    }

    protected static String pushRemove(String employee){
       /* Code to implement remone command goes here:
          Remove the supplied employee from the employee database
       */
    }

    protected static String pushInformation(){
       /* Code to implement information command goes here:
           Compute key information on the state of the employee database
       */
    }

    protected static String pushList(){
       /* Code to implement list command goes here:
          List the current contents of the employee database
       */
    }

    // The pushHelp method may be used as is:

    protected static String pushHelp(){
        String cmds = "";
	if (GUIactive) {
          cmds +="Available commands:\n" +
                "\tFind employee\n" +
                "\tDiscontinue destination\n" +
                "\tSearch destination\n" +
                "\tRemove employee\n" +
                "\tInformation on database\n" +
                "\tList contents of database\n" +
                "\tText interface activated\n" +
                "\tHelp on available commands\n" +
                "\tQuit database testing\n" ;
       }else {
          cmds +=
        	("discontinue/d <destination> - discontinue the given <destination>\n") +
        	("find/f <Employee> - find the given <Employee>\n") +
        	("gui/g Switch to GUI testing interface\n") +
        	("help/h - display this help menu\n") +
        	("information/i - display information about this Employee database\n") +
        	("list/l - list contents of Employee database\n") +
        	("search/s <destination> - search for the given <destination>\n") +
        	("quit/q - quit\n") +
        	("remove/r <Employee> - remove the given <Employee>\n");

       }
            return cmds;
    }

    // The pushQuit method may be used as is:

    protected static String pushQuit(){
        System.exit(0);
        return "";
    }
}
