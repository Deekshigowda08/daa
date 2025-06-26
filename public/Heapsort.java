package external_exicution;

public class Heapsort {
  
	public static void  Heapify(int i,int n,int arr[]) {
		int lg=i;
		int left=i*2+1; 
		int right=i*2+2;
		if(left<n&&arr[left]>arr[lg]) {
			lg=left;
		}
		if(right<n&&arr[right]>arr[lg]) {
			lg=right;
		}
		if(i!=lg) {
			int temp=arr[i];
			arr[i]=arr[lg];
			arr[lg]=temp;
			Heapify(lg,n,arr);
			}
	}
	
	public static void heapsort(int arr[],int n) {
		
		for(int i=(n/2)-1;i>=0;i--) {
			Heapify(i,n,arr);
		}
		for(int i=n-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			Heapify(0,i,arr);
		}
	}
	
	public static void main(String[] arg) {
		
		System.out.println("Noduuuuuu");
		 int[] arr= {10,30,50,20};
		heapsort(arr,4);
		for(int a:arr) {
			System.out.print(a+" ");
		}
				
				
			}

}
