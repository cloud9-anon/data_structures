package index_array;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter array size");
				Array arr = new Array(sc.nextInt());
				
				System.out.println("Enter Index  AND Element ");
//				int index = sc.nextInt();
//				int element = sc.nextInt();
				arr.insert(sc.nextInt(), sc.nextInt());
				arr.display();
			
		
		}catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

}

}
