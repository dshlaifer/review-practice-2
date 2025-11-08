
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

}