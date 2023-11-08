package arrays;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
	

	
	

		public static void display(int[] arr) 
		{
			System.out.print("{ ");
			for(int i=0; i<= arr.length-1 ; ++i)
			{
				
				System.out.print(arr[i] + ",");
				
			}
			System.out.println(" }");
		}
		
		
		public static void reverse(int[] arr)
		{
			int start = 0;
			int end = arr.length-1;
			int temp;
			while(start < end) 
			{
				temp = arr[start];
			
				arr[start] = arr[end];
				
				arr[end] = temp;
				start++;
				end--;
			}
		}
		
		public static void replace(int index, int element,int[] arr)
		{
			arr[index] = element;
			
		}
		
		
		public static int  sum(int[] arr)
		{
			int sum=0;
				for(int i =0; i <= arr.length-1 ; i++)
				{
					sum = sum + arr[i];
				}
				
           return sum;		
         }
		
		public static int maximum (int[] arr)
		{
			int max = arr[0];
			
			for(int i = 1; i <= arr.length-1 ; i++)
			{
				if(arr[i]> max)
				{
					max  = arr[i];
				}
			}
			return max;
		}
		
		
		public static void Odd_Even(int[] arr)
		{
			List<Integer> odd = new ArrayList<Integer>();
			List<Integer> even = new ArrayList<Integer>();
			
			for(int i =0; i<= arr.length-1 ; i++)
			{
				if((arr[i] & 1) == 0)
				{
					even.add(arr[i]);
				}
				else {
					odd.add(arr[i]);
				}
			}
			
			System.out.println("Even Elements : ");
			System.out.println(even);
			System.out.println("Odd Elements : ");
			System.out.println(odd);
			
		}
		

		
		
			
	}

	

