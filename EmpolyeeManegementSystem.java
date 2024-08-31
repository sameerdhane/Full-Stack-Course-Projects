import java.util.*;

class EmpolyeeManegementSystem
{
	static String ename;
	static int eid;
	static String erole;
	static double esal;
	static String eskills;
	static int experiance;

	public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println(" **** Welcome ****");
	 System.out.println();

	 feature:
	 for (; ; ) {
	 		
	 		System.out.println(" ***** FEATURE *****");
	 		System.out.println();
	 		System.out.println("1. Add New Employee ");
	 		System.out.println("2. View Employee ");
	 		System.out.println("3. Edit Employee ");
	 		//System.out.println("4. ");
	 		System.out.println("4. Exit ");
	 		System.out.println();
	 		System.out.println("Enter an Option");
	 		int opt = sc.nextInt();
	 		switch(opt)
	 		{
	 		case 1 : {
	 			addNewEmployee();
	 			break;
	 		}
	 		case 2 : {
	 			// System.out.println("Enter a Employee id : ");
	 			// int eid1 = sc.nextInt();
	 			viewEmployee(eid);
	 			break;
	 		}
	 		case 3 : {
	 			System.out.println("Edit Employee Data");
	 			System.out.println("Select Option that you Edit .");
	 			System.out.println(" 1. E_Name \n 2. E_Role \n 3. E_Salary: ");
	 			editEmployeeData();
	 			break;
	 		}
	 	    // case 4: {
	 	    // 	editEmployeeData();
	 	    // }
	 		case 4 : {
	 			System.exit(0);
	 			break;
	 		}
	 	default :{
	 		System.out.println();
	 		System.out.println("Invalid input ..!!!!!");
	 		System.out.println();
	 		}
	 	}
	 	}	

	}
	public static void addNewEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" **** Enter a New Employee Data *****");
		System.out.println();
		System.out.print("Employee Name : ");
		ename = sc.nextLine();
		System.out.print("Employee id : ");
		eid = sc.nextInt();
		Scanner s = new Scanner(System.in);
		System.out.print("Employee Role : ");
		erole = s.nextLine();
		System.out.print("Employee salary : ");
		esal = s.nextDouble();
		Scanner ss = new Scanner(System.in);
		System.out.print("Enter a skills : ");
		eskills = ss.nextLine();
		System.out.print("Employee Experiance : ");
		experiance = sc.nextInt();
		System.out.println();

	}
	public static void viewEmployee(int eid1)
	{
		if(eid==eid1)
		{
			System.out.println("********  Employee Data *********");
			System.out.println();
			System.out.println("Name : "+ ename);
			System.out.println("Emp Id : " + eid);
			System.out.println("Role :" + erole);
			System.out.println("salary : " + esal);
			System.out.println("Employee skills : " + eskills);
			System.out.println("Year Of Experiance : "+ experiance);
			System.out.println();
		}
		else{
			System.out.println("wrong EId");
		}
	}

	public static void editEmployeeData(){

         Scanner sc = new Scanner(System.in);

         int option = sc.nextInt();
         switch(option)
         {
            case 1 : {
            	editName();
            	break;
            }
            case 2 : {
            	editRole();
            	break;
            }
            case 3 : {
               editSal();
               break;
            	
            }
            default : {
            	System.out.println("Invalid Attribute of Employee ");
            }
         }
	}
	public static void editName(){

		   Scanner sc = new Scanner(System.in);

			System.out.println("Enter Employee new Name : ");
         String newname = sc.nextLine();
         ename = newname;

	}
	public static void editRole(){

		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Employee new Role : ");
         String newRole = sc.nextLine();
         erole = newRole;
	}
	public static void editSal(){

		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter new Salary of Empolyee : ");
         double newSal = sc.nextDouble();
         esal = newSal;
	}
}