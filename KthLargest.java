import java.util.Arrays;

public class KthLargest {
	public static int klargest(int[] arr, int k)
	{
		int n = arr.length;
		Arrays.sort(arr);
		return arr[n-k];
	}
	public static void main(String[] args)
	{
		int[] arr = {3,1,4,2,9,6,8,7};
		int k = 1;
		int res = klargest(arr, k);
		System.out.println("Kth largest element = " + res);
	}
}
