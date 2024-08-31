import java.util.Scanner;

class BloodDonation
{
	//blood donation program in the if else nested java
   public static void main(String[] args) {
   	
   	Scanner sc = new Scanner(System.in);

   	System.out.println("Enter Your Age: ");
   	int age = sc.nextInt();
   	if(age<20)
   	{
   		System.out.println("Your are kid try after " + (20-age) + " years.");

   	}
   	else
   	{
   		System.out.println("have u consumed alcohol or cigar (yes/no) :");
        String nasha = sc.next().toLowerCase();
        
        if(nasha.equals("no"))
        {
           System.out.println(" Enter your weight : ");
           double wght = sc.nextDouble();


           if(wght>=50)
           {
           	System.out.println("We can pump your blood.");

           }
           else{
           	System.out.println("Go and eat some food and inccrese your weight.");
           }
        }
        else
   	    {
           System.out.println("You cannot donate blood becouse are in nasha.");
   	    } 	
   	}    
   	     
   }
}