package meterInfo;
import credentials.*;
import java.util.Scanner;
public class updateMeter {
	
	
	String username;
	String registeredDate;
	String type;
	String reminder;
	String address;
	
	Scanner re = new Scanner(System.in);
	

	public void updateMeterInfo() {
		System.out.println("Your reg number : ");
		int reg = re.nextInt();
		System.out.println("Your address lane : ");
		String adlane = re.next();
		System.out.println("Your current credentials:");
		userCredentials obj2= new userCredentials();
		userCredentials obj3= new userCredentials();
		
		
		String hg=obj2.giveCredentials(reg, adlane);
		System.out.println(hg);
		
		System.out.println("Now you can update by changing the whole terms");
		System.out.println("Username : ");
		username = re.next();
		System.out.println("Type : ");
		type=re.next();
		System.out.println("Address : ");
		address = re.next();
		String finalRes=obj3.giveCredentials(reg, adlane,username,type,address);
		
		System.out.println("Updated results:");
		System.out.println(finalRes);
		
	}
	public void changeMeter() {
		System.out.println("Hai hello from change meter");
	}

}
