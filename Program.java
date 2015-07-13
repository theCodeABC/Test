import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	static String name;
	
	static ArrayList<Costumer> costumers = new ArrayList<>();
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		// These shall be made into methods later on..
		
		//REG COSTUMER
		
		System.out.print("Name: ");
		name = reader.nextLine();	
		Costumer costumer = new Costumer(name, null);
		costumers.add(costumer);
		
		System.out.println("");
		
		//ADD NUMBER TO COSTUMER
		
		System.out.print("Name of costumer: ");
		String nameToBePaired = reader.nextLine();
		
		// en s�kning p� namnet i kundlistan, om den INTE finns s�
		// felmeddelande "Namnet finns inte" annars....
		
		for(int index = 0; index < costumers.size(); index++){
			/*s�ker igenom arraylistens alla object och
			 * kallar sen p� getNamn fr�n Kund-klassen f�r att kunna j�mf�ra med just namn.
			 * equalsIgnoreCase struntar i om det var stora eller sm� bokst�ver n�r man s�ker.
			 * on�digt men najs
			 */
			if(costumers.get(index).getNamn().equalsIgnoreCase(nameToBePaired)){
				// l�gga till ett nummer till kunden med det namn du angav
				System.out.print("Phone number: ");
				String phoneNumber = reader.nextLine();
				PhoneNumber newNumber = new PhoneNumber(phoneNumber);
				

				newNumber.setPhoneNumber(phoneNumber);
				costumers.get(index).addPhoneNumber(newNumber);
				
				
				System.out.println("Name found!");
				System.out.println(costumers);
				
			}else{
				System.out.println("Sought after name does not exist..");
			}
		}
		}
	}

