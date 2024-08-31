import java.util.Scanner;

class ArmyProcess
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		if(age>=18)
		{
			System.out.println("Enter your height (in cm)  :  ");
			int height = sc.nextInt();

			if(height>=162)
			{
				System.out.println(" Enter your weight (in kg) : ");
				int weight = sc.nextInt();

				if(weight>=56)
				{
					System.out.println("you are eligible for Join the army ");
				}
			}
			else{
				System.out.println("you are not Eligible for joining the army");
			}
		}
		else{
			System.out.println("you are not Eligible for applying army try after " + (18-age) + " year ");
		}
	}
}