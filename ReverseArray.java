
public class ReverseArray {
	static int[] reverse(int[] arr)
	{
		System.out.println("Array before reversing: ");
		for(int ele:arr)
		{
			System.out.print(ele + "\t");
		}
		int i=0, j= arr.length-1;
		int temp;
		while(i < j)
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
		return arr;
	}
	public static void main(String[] args)
	{
		int arr[] = {8,0,7,4,9,1,5,6,3,2};
		int[] res = reverse(arr);
		
		System.err.println();
		System.out.println("Array after reversing:");
		for(int ele:res)
		{
			System.out.print(ele + "\t");
		}
	}
}
