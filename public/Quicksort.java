package external_exicution;

import java.util.*;
public class Quicksort {

	public static void quicksort(int arr[],int left,int right) {
		if(left<right) {
			int p=pivot(arr,left,right);
			quicksort(arr,left,p-1);
			quicksort(arr,p+1,right);
		}
	}
	
	public static int pivot(int arr[],int left,int right) {
		int pivot=arr[left];
		int i=left+1;
		int j=right;
		while(i<=j) {
			while(i<=right&& arr[i]<pivot)
				i++;
			while(arr[j]>pivot)
				j--;
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		int temp=arr[left];
		arr[left]=arr[j];
		arr[j]=temp;
		return j;
		
		
	}

	public static void main(String[] arg) {
		Random r=new Random();
		int[] arr= new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=r.nextInt(100);
		}
		long st=System.nanoTime();
		quicksort(arr,0,9);
		long end=System.nanoTime();
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println("Time is :"+(end-st)/1e6);
		
	}
	
}
