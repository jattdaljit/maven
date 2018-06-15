import java.util.*;

class BubbleSort 
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
		for(int i=0; i<n-1;i++)
		{
			for(int j=0 ; j < n-i-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Elements in sorted order are : ");
		for(int i=0 ; i<n ;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}