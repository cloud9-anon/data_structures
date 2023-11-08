package arrays;

import java.util.Scanner;
import static arrays.Arrays.*;


public class Tester {

	public static void main(String[] args) {
			
		try(Scanner sc = new Scanner(System.in))
		{
			
			
			System.out.println("Enter size of array");
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			
			
			for(int i = 0; i <= size-1 ; i++)
			{
				System.out.println("Enter the " + (i+1) + " Element!");

				arr[i] = sc.nextInt();
			}
			 
			boolean active = true;
			while(active)
			{
			
				System.out.println();
				System.out.println();
				System.out.println("Press 1 : Display Array \n"
					+ "Press 2 : For Reversing the  Array\n"
					+ "Press 3 : For Relacing the Element \n"
					+ "Press 4 : For Addition of all Elements \n "
					+ "Press 5 : For Finding the Maximum \n"
					+ "Press 6 : For Average of all elements \n"
					+ "Press 7 : For Odd and Even elements \n"
					+ "Press 0 : For Exit");
				System.out.println();
			
			switch(sc.nextInt()) 
			{
			case 1 :
				display(arr);
				 break;
			case 2 :
				reverse(arr);
				break;
			
			case 3:
				System.out.println("Enter the index and Element ");
				
				replace(sc.nextInt(), sc.nextInt(),arr);
				break;
			
			case 4:
				System.out.println(" The sum of all elements is : " + sum(arr));
				break;
			case 5 :
				int max = maximum(arr);
				System.out.println("The maximum is : " + max );
				break;
			
			
			case 6 :
				int sum = sum(arr);
				float average = sum / (arr.length-1);
				System.out.println("The Average is : " + average);
				
			case 7:
				Odd_Even(arr);
				break;
				
				
			case 0 : 
				active = false;
			}
		}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
			
		}
		
	}

}
