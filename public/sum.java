package external_exicution;

import java.util.*;

public class sum {

	public static boolean found(int[] arr,int n,List<Integer> subset,int tar) {
		
		if(tar==0) {
			System.out.print(subset);
			return true;
		}
		
		if(n==0 && tar<n) {
			return false;
			
		}
		subset.add(arr[n-1]);
		if(found(arr,n-1,subset,tar-arr[n-1])) {
			return true;
		}
		subset.remove(subset.size()-1);
		
		return found(arr,n-1,subset,tar);
		
		
	}
	
	public static void main(String[] arg) {
		int[] arr= {1,2,3,4,5};
		List<Integer> subset=new ArrayList<>();
		if(!found(arr,arr.length,subset,10))
			System.out.print("Not found");
		
		}

}
