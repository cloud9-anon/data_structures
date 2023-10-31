
package index_array;

public class Array {
	private int array[];
	
	
	public Array(int size)
	{
		 array = new int[size];
		
	}
	
	
	public void insert (int index, int element) {
		array[index] = element;
	}
	
	
	
	public void display() 
	{
		for(int i=0; i<= array.length-1;i++) 
		{
			System.out.println(array[i]);
		}
	}
}
