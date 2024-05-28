package Searching;

public class Algorithms {



	public static int linear_search(int a[], int key)
	{
		for(int i = 0; i<= a.length-1 ; i++)
		{
			if(a[i]==key)
			{
				return i;
			}
			
		}
		return -1;
	}
	
	
	public static int  binary_search(int i , int j , int arr[], int key)
	{
		if(i==j)
		{
			if(arr[i]==key)
			{
				return i;
			}
			else {return -1;}
		}
		else
		{
			int mid = (i + (j-i)) / 2 ;
			if(arr[mid] == key) {
				return mid;
			}
			else if (arr[mid]< key)
			{
				return binary_search(mid+1,j,arr,key);
			}
			else if (arr[mid]> key)
			{
				return binary_search(i,mid-1,arr,key);
			}
			else return -1;
		}
		
		
		
	}





}
