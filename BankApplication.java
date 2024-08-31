import java.util.*;
class BankApplication
{
	static String name ;
	static String address ;
	static long addharNo ;
	static long phoneNo ;
	static double bal ;
	static int upiPin;

	public static void main(String[] args) {
	    
	    for (; ; ) {
	    	Scanner sc = new Scanner(System.in);

	    System.out.println("********** Welcome To LaxmiChitFund ***********");	
	    System.out.println();
	    System.out.println("1. Create Account ");
	    System.out.println("2. Existing Account Holder");
	    System.out.print("Enter A Option : ");
	    int option =sc.nextInt();
	    System.out.println();
	    switch(option)
	    {
	    case 1 : {
	    	System.out.println(" **** Create Account Module ****");

	    	sc.nextLine();
	    	System.out.print("Enter Your Name : ");
	    	name = sc.nextLine();
	    	System.out.print("Enter Your address : ");
	    	address = sc.nextLine();
	    	System.out.print("Enter Your phone No : ");
	    	phoneNo = sc.nextLong();
	    	System.out.println("Enter Your Addhar No : ");
	    	addharNo = sc.nextLong();
	    	System.out.println("Diposit Amount : ");
	    	bal = sc.nextDouble();
	    	System.out.println("Enter a upi Pin : ");
	    	upiPin = sc.nextInt();
	    	System.out.println("Account Created Successfully.");
	    	System.out.println();

	    	break;
	    }
	    case 2 : {
	    	for (; ; ) {
	    		System.out.println(" ***** Features ***** ");
	    		System.out.println("1. Check Balance 2. Diposit 3. Withdraw 4. Account Information 5. Log Out");
	    		System.out.println();
	    		System.out.print("Enter an option : ");
	    		int opt = sc.nextInt();
	    		switch(opt)
	    		{
	    		case 1 :{
	    			System.out.print("Enter Your upi Pin : ");
	    		int userPin = sc.nextInt();
	    		if(userPin==upiPin){
	    			System.out.println("Your Account Balance is : " + bal);
	    		}else{
	    			System.out.println("Wrong upi Pin");
	    		}
	    		break;
	    		}
	    	    case 2 : {
	    	    	System.out.println(" **** Deposit Amount ***** ");
	    	    	System.out.println();
	    	    	System.out.println("Enter Amount : ");
	    	    	double depAmount = sc.nextDouble();
	    	    	bal += depAmount;
	    	    	System.out.println(" Account Deposited Successfully. ");
	    	    	break;
	    	    }
	    	case 3 : {
	    		System.out.println(" *** Withdraw Amount ***");
	    		System.out.println();
	    		System.out.println("Enter an Amount : ");
	    		double withdrawAmount = sc.nextDouble();
	    		if(withdrawAmount<=bal){
	    			System.out.println("Amount Withdraw Successfully.");
	    			bal = bal - withdrawAmount;
	    		}else{
	    			System.out.println("insufficient Funds ");
	    		}
	    		break;
	    		}
	    	case 4 : {
	    		System.out.println("******** Account Information ***********");
	    		System.out.println();
	    		System.out.println("Account Holder Name : " + name);
	    		System.out.println("Address : " + address);
	    		System.out.println("Phone No : " + phoneNo);
	    		System.out.println("Addhar Number : " +addharNo);
	    		break;
	    	}
	    case 5 : {
	    	System.exit(0);
	    }
	       default : System.out.println("Invalid option"); break;
	    	}
	    	}
	    }
	default : System.out.println("Invalid option");break;
	    }

	}
	    	
	    }
}