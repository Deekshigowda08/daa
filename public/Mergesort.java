package external_exicution;

public class Mergesort {

	public static void  mergesort(int arr[],int left,int right) {
		
		if(left<right) {
			int mid=(left+right)/2;
			mergesort(arr,left,mid);
			mergesort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	
	public static void  merge(int arr[],int left,int mid,int right) {
		
		int n1=mid-left+1;
		int n2=right-mid;
		int[] leftarr=new int[n1];
		int[] rightarr=new int[n2];
		for(int e=0;e<n1;e++)
			leftarr[e]=arr[left+e];
		for(int e=0;e<n1;e++)
			rightarr[e]=arr[mid+1+e];
		int i=0,k=left,j=0;
		while(i<n1 && j<n2) {
			if(leftarr[i]<rightarr[j]) {
				arr[k++]=leftarr[i++];
			}
			else {
				arr[k++]=rightarr[j++];
			}
		}
		while(i<n1)
			arr[k++]=leftarr[i++];
		while(j<n2)
			arr[k++]=rightarr[j++];
		
	}
	
	public static void main(String[] arg) {
		int[] arr= {20,30,40,10,45,43,65,34,7,5,34,37,455,3,46,45};
		long st=System.nanoTime();
		mergesort(arr,0,arr.length-1);
		long end=System.nanoTime();
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println("Time is :"+(end-st)/1e6);
		
	}

}
