package basic;

import java.util.Scanner;

public class SwitchCase {

		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			int orderNo =0;
			String choice =null;
			do {
				System.out.println("### The Taj Hotel ###");
				System.out.println("***Menu**");
				System.out.println("1. Starter");
				System.out.println("2. Beverages");
				System.out.println("3. Main Course");
				System.out.println("4. Dessert");
				System.out.println("5. Tea");
				System.out.println("6. Exit");
				System.out.println("Please order from above list");
				orderNo = sc.nextInt();
				
				switch(orderNo) {
				case 1: 
				 System.out.println("your order for starter is placed successfully !");
				 break;
				case 2:
					 System.out.println("your order for Beverages is placed successfully !");
					 break;
				case 3:
					 System.out.println("your order for Main course is placed successfully !");
					 break;
				case 4:
					 System.out.println("your order for Dessert is placed successfully !");
					 break;
				case 5:
					 System.out.println("your order for Tea is placed successfully !");
					 break;
				case 6:
					System.out.println("Exited");
					System.exit(0);
			   default:System.out.println("Please enter Valid Number");
			    	break;
				}
				System.out.println("do you want to order more ?(yes/no)");
				choice = sc.next();
				
			}while(choice.equalsIgnoreCase("yes"));
			
			System.out.println("Thank you ! Visit Again !");
			
			
		}

	}


