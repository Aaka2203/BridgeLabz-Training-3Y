package Practice;
import java.util.*;
public class FitnessCentreMembershipSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("==== Fitness Centre Membership System ====");
			
			System.out.print("Enter no. of member to register: ");
			int n=sc.nextInt();
			
			for(int i=1; i<=n; i++) {
				System.out.print("Registering member "+i);
				
				System.out.println(" Select membership type: ");
                System.out.println("1. Monthly (1000 Rs)");
                System.out.println("2. Quarterly (2500 Rs)");
                System.out.println("3. Yearly (8000 Rs)");
                System.out.print("Enter choice: ");
                int type=sc.nextInt();
                
                int fee=0;
                
                switch(type) {
                case 1:
                	fee=1000;
                	break;
                case 2:
                	fee=2500;
                	break;
                case 3:
                	fee=8000;
                	break;
                default:
                	System.out.print("Invalid Choice!!!, defaulting to monthly");
                	fee=1000;
                }
                
                System.out.print("Are you a student or a senior citizen? (Yes=1/No=0): ");
                int discount=sc.nextInt();
                if(discount==1) {
                	fee-=(fee*20/100);
                	System.out.println("Discount applied! New fee: Rs "+fee);
                }
                else if(discount==0 || discount!=1) {
                	System.out.println("Discount not applied! Fee: Rs "+fee);
                }
                System.out.println("Final membership fee for member " + i + ": Rs " + fee);
			}
			System.out.print("Do you want to register more member? (Yes=1/No=0): 1");
			choice=sc.nextInt();
		}while (choice==1); {
			System.out.print("Centre closed!!!, No more registration");
			sc.close();
		}

	}

}
