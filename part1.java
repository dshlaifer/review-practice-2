
/**
 * Write a description of class part1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class part1
{
    // instance variables - replace the example below with your own
    private int price;


    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int price()
    {
        if (price > 100) {
        System.out.println("expensive");
    }else { System.out.println("cheap");
        
    }
    return price;
    }
    
    public String checkPrice(int Price)
    {
        return (Price > 10) ? "expensive" : "Cheap";
    
    }
    public String help()
    {
        System.out.println("You must do this to fix your issue");
        return help();
    }
    public String quit()
    {
        System.out.println("You will exit the tab");
        return quit();
    } 
    
    public void processCommand(String command)
    {
        if (command.equals("help")) {
            help();
            
        }else if  (command.equals("quit")) {
            quit();
        } else {
            System.out.println("sorry, I dont understand your command");
        }
    }

}