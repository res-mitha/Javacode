class Main
{
	public static void main(String [] args)
	{
		int n=5;
		int arr[] = {1,2,3,4,5};
		int temp=arr[n-1];
		for(int i=n-2; i>=0; i--)
		{
			arr[i+1] = arr[i];
		}
		arr[0]=temp;
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
	}
}