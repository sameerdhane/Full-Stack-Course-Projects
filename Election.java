import java.util.Scanner;

class Election
{
	//this is the nested if else if prpgram to check the voting system in java
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();

		if(age>=18)
		{
			System.out.println("Do u have a Voter Id (yes/no) : ");
			String voterid = sc.next().toLowerCase();

			if(voterid.equals("yes"))
			{
				System.out.println(" ******** WelCome *******");
				System.out.println("1. BJP ");
				System.out.println("2. Congress ");
				System.out.println("3. AAP ");
				System.out.println("4. MNS ");
				System.out.println("5. ShivSena ");
				System.out.println("6. NCP ");
				System.out.println("7. NOTA ");


				System.out.println("Enter the option to vote for your fav party");
				String vote = sc.next().toUpperCase();
				if (vote.equals("BJP")) {
					System.out.println("you have voted for BJP ");
				}
				else if (vote.equals("Congress")) {
					System.out.println("you have voted for Congress ");
				}
				else if (vote.equals("AAP")) {
					System.out.println("you have voted for AAP ");
				}
				else if (vote.equals("MNS")) {
					System.out.println("you have voted for MNS ");
				}
				else if (vote.equals("ShivSena")) {
					System.out.println("you have voted for ShivSena ");
				}
				else if (vote.equals("NCP")) {
					System.out.println("you have voted for NCP ");
				}
				else if (vote.equals("NOTA")) {
					System.out.println("Thank you for wasting your vote ");
				}
				else{
					System.out.println("Invalid Input");
				}
			}
			else{
				System.out.println("Jaldi yaha se hato ");
			}
		}
		else{
			System.out.println("You are not mature to vote try after " + (18-age) + " years ");
		}
	}
}