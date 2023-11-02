package linked_list;

import java.util.LinkedList;
import java.util.Scanner;


public class Tester {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in))
		{
			Linked list = new Linked();	
			
		

			boolean active = true;
			
			try {
						
				while(active) {
					System.out.println();
					System.out.println("Press 1 : For Inserting Data ");
					System.out.println("Press 2 : For Displaying Data ");
					System.out.println("Press 3 : For Number of Elements Present ");
					System.out.println("Press 4 : To Check Is list Empty ? ");
					System.out.println("Press 5 : To Exit ");
					
					
				switch(sc.nextInt()) 
								{
										case 1:
												System.out.println("Enter an integer");
												
												list = list.addNode(sc.nextInt(),list);
												break;
											
										case 2:
												list.display(list);
									
												break;
											
										case 3 :
											
											
										
										case 4:
												if(list.isEmpty())
														{
															System.out.println("List is Empty");
															
														}
												else 
												{	
													System.out.println("List is not Empty");
												}
												break;
												
										
												
										case 5 :
												active = false;
													
										default : System.out.println("Enter Valid Input ! ");
								} 
					
			
		}
			}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		
		}

}

	private static void addNode(int nextInt, LinkedList list) {
		// TODO Auto-generated method stub
		
	}
	


}
