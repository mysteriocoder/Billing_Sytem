package credentials;

public class userCredentials {
	int regNum;
	String addressLane;
	String username;
	String registeredDate;
	String type;
	String reminder;
	String address;
	
	public String giveCredentials(int regNum,String addressLane) {
		this.addressLane=addressLane;
		this.regNum=regNum;
		
		address="Shravan.V,Near ambedkar school,Lakshmishnagar, Chickmagalur";
		username="Shravan.v";
		registeredDate="20-02-1980";
		type="domestic";
		reminder="Bills are upto date and no reminders";

		return ("Register Number : " + regNum+ "\n" +"Address Lane : " + addressLane+ "\n" +"Username : " + username+ "\n"+"Address : " + address+ "\n" +"Registered Date : " + registeredDate+ "\n" +"Registered Type : " + type+ "\n" +"Reminders : " + reminder+ "\n");
	}
	
	public String giveCredentials(int regNum,String addressLane,String username,String type,String address) {
		this.addressLane=addressLane;
		this.regNum=regNum;
		
		this.address=address;
		this.username=username;
		registeredDate="20-02-1980";
		this.type=type;
		reminder="Bills are upto date and no reminders";

		return ( "Register Number : " + regNum+ "\n" +"Address Lane : " + addressLane+ "\n" +"Username : " + username+ "\n"+"Address : " + address+ "\n" +"Registered Date : " + registeredDate+ "\n" +"Registered Type : " + type+ "\n" +"Reminders : " + reminder+ "\n");
	}
	
}
