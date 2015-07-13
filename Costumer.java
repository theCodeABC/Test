import java.util.ArrayList;

public class Costumer {
	
	private ArrayList<PhoneNumber> PhoneNumbers;
	
	
	private String name;
	private String address = "Nothing here";
	

	public Costumer(){
		
	}
	
	public Costumer(String name){
		this.name = name;
	
	}
	
	public Costumer(String name, PhoneNumber phoneNumber) {	
		this.name = name;
		this.PhoneNumbers = new ArrayList<>();
		this.PhoneNumbers.add(phoneNumber);
	}
	
	public void addPhoneNumber(PhoneNumber phoneNumber){
		
		this.PhoneNumbers.add(phoneNumber);
	}
	
	public String getNamn(){
		return name;
	}
	
	public String toString(){
		return name + "\n" + address;
	}
}