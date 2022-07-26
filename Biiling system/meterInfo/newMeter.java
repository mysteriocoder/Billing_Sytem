package meterInfo;
import java.io.*;
import java.util.Scanner;


public class newMeter {
	
public newMeter(String s){
	
	
	String addressLane;
	String name;
	String address;
	String taxid;
	String distribution;
	
	Scanner fe = new Scanner(System.in);
	
	System.out.println(s);
	System.out.println("");
	System.out.println("");

	System.out.println("Enter the below asked credentials to get a new connection");
	
	
	System.out.println("Enter your name : ");
	name= fe.next();
	
	System.out.println("Enter your address : ");
	address=fe.next();
	System.out.println("Enter your address lane : ");
	addressLane=fe.next();
	System.out.println("Enter the type of distribution : ");
	distribution=fe.next();
	System.out.println("Enter the tax id : ");
	taxid=fe.next();
	
	System.out.println("");
	System.out.println("");
	System.out.println("Your registration details are as follows : ");
	System.out.println("");
	
	
	System.out.println("Name : "+name+"\n"+"Address"+address+"\n"+"Address Lane"+addressLane+"/n"+"Distribution Type : "+distribution+"\n"+"Tax Id : "+taxid+"\n");
	
}

}
