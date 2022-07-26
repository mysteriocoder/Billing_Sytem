package billingsystem;


import java.io.*;
import java.util.Random; 
import java.util.Scanner;
import meterInfo.*;
import credentials.*;


class paybill
{
	int meterno,billno;
	Scanner se = new Scanner(System.in);
	public void calculateBill(int billno,int meterno) {
		this.billno=billno;
		this.meterno=meterno;
		System.out.println("Entered billing "+ billno +" "+meterno);
		System.out.println("Enter the billing amount");
		int ba= se.nextInt();
		System.out.println("Enter the tax gen ID");
		int ti= se.nextInt();
		
		calculateTaxForGivenData obj=new calculateTaxForGivenData();
		double reqData=obj.calculateTax(ba,ti);
		System.out.println("Your tax amount is : "+ reqData);
		System.out.println("Total amount to be paid : " +(reqData+ba));
		System.out.println("");
		System.out.println("");
		System.out.println("How would you like to pay amount? Online Payment or Cash? Type Online for online payment,Cash for cash mode");
		String choose = se.next();
		if(choose.equals("Online")) {
			System.out.println("Our UPI/Bank details have been shared to you through message.Make payments with that details.Thank you");
		}
		else {
			System.out.println("Please make deposit of "+(reqData+ba)+" Rs/- at counter number 5 and do not forget to collect reciet");
		}

		
	}
}







public class start {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Welcome to DESCOM");
		

		System.out.println("Login to pay your bills,check other credentials");
		System.out.println("Enter 1 to login and pay bill");
		System.out.println("Enter 2 to check register credentials");
		System.out.println("Enter 3 to update meter-board/meter-number");
		System.out.println("Enter 4 to get a new connection");
		System.out.println("Enter 5 to quit");
		System.out.println("");
		System.out.println("");
		Scanner sw = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = sw.nextInt();
		
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);  
		
		if(choice==1) {
			System.out.println("Your UserName Please");
			String username=br.readLine();
			System.out.println("Your Password Please");
			String password=br.readLine();
			if(username.equals("shravan")) {
				if(password.equals("shravan123")) {
					System.out.println("Proceed");
					paybill obj = new paybill();
					System.out.println("Enter your meter-board number");
					int mn = sw.nextInt();
					System.out.println("Enter your bill number");
					int bn = sw.nextInt();
					obj.calculateBill(bn,mn);
				}
				else {
					System.out.println("Wrong password");
					System.exit(0);

				}
				
			}
			else {
				System.exit(0);
			}
			
		}
		
		
		else if(choice==2) {
			userCredentials obj1 = new userCredentials();
			
			System.out.println("Enter your register no");
			int rn = sw.nextInt();
			System.out.println("Enter your address lane (ex: 133/fh)");
			String al = sw.next();
			String address = obj1.giveCredentials(rn,al);
			System.out.println("User Crerdentials: ");
			System.out.println(address);

		}
		else if(choice==3) {
			System.out.println("Type Update for updating the existing meter comnnection or Change for renewing the names at connection");
			String uc = sw.next();
			if(uc.equals("Update")) {
				updateMeter obj= new updateMeter();
				obj.updateMeterInfo();
			}
			else {
				updateMeter obj1 = new updateMeter();
				obj1.changeMeter();
			}

				}
		else if(choice==4) {
			newMeter obj5= new newMeter("Welcome to DESCOM get on to counter number 6 to get your new electricity connection.");

		}
		else if(choice==5) {
			//break;
			System.exit(0);
		}
			
		
	}

}
