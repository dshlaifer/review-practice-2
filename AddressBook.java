import java.util.HashMap;

/**
 * Write a description of class AddressBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AddressBook
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> addressBook = new HashMap<>();

    /**
     * Constructor for objects of class AddressBook
     */
    public AddressBook()
    {
        addressBook.put ("author 1", "book1");
        addressBook.put ("author 2", "book2");
        addressBook.put ("author 3", "book3");

    }

}