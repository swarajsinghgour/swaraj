# swaraj
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedList;

public class ClassAssignment {

	public static void main(String[] args) 
	{
		LinkedList<Contact> contactList = new LinkedList<>();
		contactList.add(new Contact("Vignesh", "9772064219", "vignesh@sbi.co.in"));
		contactList.add(new Contact("Vignesh1", "800554545", "vignesh@sbi.co.in"));
		contactList.add(new Contact("Vignesh2", "804545454", "vignesh@sbi.co.in"));
		contactList.add(new Contact("Vignesh3", "4545645645", "vignesh@sbi.co.in"));
		
		Iterator<Contact> iterator = contactList.iterator();
		while(iterator.hasNext())
		{
			Contact contact = iterator.next();
			System.out.println("Contact   "+contact);
		}
		
		
		
		
	}

}
class Contact //Arraylist
{
	String contactName;
	String mobileNumber;
	String emailAddress;
	public Contact(String contactName, String mobileNumber, String emailAddress) {
		super();
		this.contactName = contactName;
		this.mobileNumber = mobileNumber;
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "Contact [contactName=" + contactName + ", mobileNumber=" + mobileNumber + ", emailAddress="
				+ emailAddress + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
class ChemicalElement
{
	int atmonicNumber;
	String atomicName;
	String atomicFormula;
	float atomicWeight;
	
	

}

class Book
{
	int isbnNumber;
	String bookName;
	String author;
	int numOfPages;
	int edition;
	float price;
}

class Log
{
	String logType;
	LocalDateTime time;
	String name;
	


}
