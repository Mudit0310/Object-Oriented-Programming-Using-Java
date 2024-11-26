
public class MaxMin {
	public static void maxmin(int[] arr)
	{
		int max=arr[0];
		int min=arr[0];
		
		for(int i =0;i<arr.length;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
			
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		
		System.out.println("Maximum = " + max);
		System.out.println("Minimum = " + min);
	}
	
	
	public static void main(String[] args)
	{
		int[] arr = {4,2,1,6,5,7,9};
		maxmin(arr);
	}
}
