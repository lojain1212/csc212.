package projectCSC212;
import java.util.Scanner;
public class phoneBook {

	public static void main(String[] args) {
		 System.out.println("Welcome to the Linked Tree Phonebook!");
	        
	     Scanner input= new Scanner(System.in);

	        int choice;
	        do {
	            System.out.println("Please choose an option:");
	            System.out.println("1. Add a contact");
	            System.out.println("2. Search for a contact");
	            System.out.println("3. Delete a contact");
	            System.out.println("4. Schedule an event");
	            System.out.println("5. Print event details");
	            System.out.println("6. Print contacts by first name");
	            System.out.println("7. Print all events alphabetically");
	            System.out.println("8. Exit");
	            System.out.print("Enter your choice: ");
	            choice = input.nextInt();
	            input.nextLine(); 

	            switch (choice) {
	                case 1:
	                    /*Contact Con1=new Contact();
	                    LinkedList con1=new LinkedList();
	                    Con1.contactInfo();
	                    con1.add_Sorted2(Con1);*/
	                    System.out.println("Contact added successfully!");
	                    break;

	                case 2:
	                   /*Enter search criteria:
	                    1. Name
	                    2. Phone Number
	                    3. Email Address
	                    4. Address
	                    5. Birthday*/
	                    
	                    break;

	                case 3:
	                    System.out.print("Enter the first name to delete: ");
	                    // method del
	                            break;
	                        
	                    
	                    

	                case 4:
	                    /*Enter event title: Lunch with Ahmad
	                    Enter contact name: Ahmad Al-Saud
	                    Enter event date and time (MM/DD/YYYY HH:MM): 08/24/2023 12:30
	                    Enter event location: Al-Nakheel Restaurant, Riyadh
	                    Event scheduled successfully!*/
	                    System.out.println("Event scheduled successfully!");
	                    break;

	                case 5:
	                  /*Enter search criteria:
	                    1. contact name
	                    2. Event tittle
	                    Enter your choice: 2
	                    Enter the event title: Lunch with Ahmad
	                    Event found!
	                    Event title: Lunch with Ahmad
	                    Contact name: Ahmad Al-Saud
	                    Event date and time (MM/DD/YYYY HH:MM): 08/24/2023 12:30
	                    Event location: Al-Nakheel Restaurant, Riyadh*/
	                    break;

	                case 6:
	                    /*Enter the first name: Ahmad 
	                    Contacts found! 
	                    Name: Ahmad Al-Saud 
	                    Phone Number: 055-1234-5678 
	                    Email Address: ahmad.al-saud@example.com 
	                    Address: 123 King Fahd Road, Riyadh 
	                    Birthday: 01/01/1980 
	                    Notes: Friend from college 
	                    Name: Ahmad Alzaid
	                    Phonenumber: 0553211234
	                    Email address: ahmad.zaid@example.com
	                    Address: 123 King Faisal Road, Riyadh
	                    Birthday: 01/01/1989
	                    Notes: Friend from work*/
	                    break;

	                case 7:
	                    
	                    System.out.println("Events sorted alphabetically:");
	                    
	                    break;

	                case 8:
	                    System.out.println("Exiting program. Goodbye!");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please choose a valid option.");
	                    break;
	                    
	                     
	            }
	        } while (choice != 8);
	        
	    }
	

	}


