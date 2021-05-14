
public class LinearSearching {

	public static int search(int arr[], int x)
	{
		int n = arr.length;
		for (int i = 0; i < n; i++)
		{
			if (arr[i] == x)
				return i;
		}
		return -1;
	}

	
	public static void main(String args[])
	{
		int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int x = 19;

		
		int result = search(arr, x);
		if (result == -1)
			System.out.print(
				"Element is not present in array");
		else
			System.out.print("Element is present at index "
							+ result);
	}


}

