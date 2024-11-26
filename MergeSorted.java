 
public class MergeSorted {
	public static void merge(int[] arr1, int[] arr2)
	{
		int len = arr1.length + arr2.length;
		int[] arr3 = new int[len];
		int i = 0, j =0, k=0;
		
		while(i < arr1.length && j < arr2.length)
		{
			if(arr1[i] > arr2[j])
			{
				arr3[k] = arr2[j];
				k++;
				j++;
			}
			else
			{
				arr3[k] = arr1[i];
				i++;
				k++;
			}
		}
		
		while(i < arr1.length)
		{
			arr3[k] = arr1[i];
			k++;
			i++;
		}
		
		while(j < arr2.length) {
			arr3[k] = arr2[j];
			k++;
			j++;
		}
		
		for(int a = 0;a<arr3.length;a++)
		{
			System.out.print(arr3[a]+ "\t");
		}
			
				
	}
	public static void main(String[] args)
	{
		int[] arr1 = {2,3,6,7,9};
		int[] arr2 = {1,4,5,8};
		
		merge(arr1, arr2);
	}
}
