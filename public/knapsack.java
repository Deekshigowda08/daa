package external_exicution;

public class knapsack {

	public static int knap(int w,int weight[],int profit[],int n) {
		
		if(w==0||n==0) {
			return 0;
		}
		if(weight[n-1]>w) {
			return knap(w,weight,profit,n-1);
		}
		else {
			return Math.max(profit[n-1]+knap(w-weight[n-1],weight,profit,n-1), knap(w,weight,profit,n-1));
		}
		
		
		
		
	}
	
	public static void main(String[] arg) {
		int[] profit= {10,80,30};
		int[] weight= {4,5,6};
		int w=9;
		System.out.print("Max profit is :"+knap(w,weight,profit,weight.length));
		
	}
}
