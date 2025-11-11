import java.util.HashMap;
import java.util.Scanner;
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
    public String findMary() {
        if (addressBook.containsKey("Mary")) {
        return addressBook.get("Mary");
 
    } else {
        return "contact not found";
    }

}
 public void addContact() {
     Scanner input = new Scanner(System.in);
     
     System.out.println("Enter name:");
     String name = input.nextLine();
     
     System.out.println("Enter Address:");
     String address = input.nextLine();
     
     addressBook.put(name, address);
     System.out.println("Contract added successfully");
 }
 }