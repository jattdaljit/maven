import java.util.*;

class  MergeSort 
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
		mergeSort(arr,0,n-1);
		System.out.println("Elements in sorted order are : ");
		for(int i=0 ; i<n ;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	static void mergeSort(int arr[], int left, int right)
	{
		if(left < right){
			int mid = (left+right)/2;
			mergeSort( arr, left, mid);
			mergeSort( arr, mid+1, right);
			merge(arr, left, mid, right);
		}
	}

	static void merge(int arr[], int left, int mid, int right)
	{
		int n1 = mid-left+1;
		int n2 = right-mid;
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];

		for(int i=0 ; i<n1 ; i++)
		{
			leftArr[i] = arr[left+i];
		}
		for(int i=0 ; i<n2 ; i++)
		{
			rightArr[i] = arr[mid+1+i];
		}

		int i = 0, j = 0, k = left;
		while (i<n1 && j <n2)
		{
 			if(leftArr[i] <= rightArr[j])
			{
				arr[k] = leftArr[i];
				i++;
			}
			else
			{
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while (i <n1)
		{
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while (j < n2)
		{
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}
}