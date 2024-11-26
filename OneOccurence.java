
public class OneOccurence {
	public static int Occurence(int[] arr)
	{
		int i=0;
		while(i < arr.length)
		{
			if(arr[i] != arr[i+1])
			{
				return arr[i];
			}
			i+=2;
		}
		
		return -1;
		
	}
	public static void main(String[] args)
	{
		int[] arr = {1,1,2,2,3,4,4};
		int res = Occurence(arr);
		System.out.println("One occuring number is : " + res);
	}
}
