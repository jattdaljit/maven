import java.util.*;

class  QuickSort 
{

	public static void main(String args[])
	{
	
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Elements");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" elements");
		for(int i=0; i<n; i++)
		{
         		arr[i] = sc.nextInt();

		}
		quickSort(arr,0,n-1);
		System.out.println("Elements in sorted order are : ");
		for(int i=0 ; i<n ;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	static void quickSort(int arr[], int min, int max)
	{
		if(min < max){
			int p = partition(arr,min,max);
			quickSort( arr, min, p-1);
			quickSort( arr, p+1, max);
		}
	}

	static int partition(int arr[], int min, int max)
	{
		int pivot = arr[max];
		int i = (min - 1); 
 
		for (int j = min; j <= max- 1; j++)
		{
			if (arr[j] <= pivot)
			{
				i++;    
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[max];
		arr[max] = temp;
		
		return (i + 1);
	}
	
	
}