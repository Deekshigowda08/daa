package external_exicution;

public class travelings {
	static int[][] graph= {{0,0,0,0,0},
			{0,0,10,999,40},
			{0,10,0,20,999},
			{0,999,20,0,30},
			{0,40,999,30,0}};
	static int n=4;
	static int[][] memo=new int[n+1][1<<(n+1)];
	static int fun(int i,int mask) {
		int res=99999;
		if(mask==((1<<i))) {
			return graph[i][1];
			
		}
		if(memo[i][mask]!=0) {
			return memo[i][mask];
		}
		for(int j=1;j<=n;j++) {
			if((mask&(1<<j))!=0&&i!=j)
			res=Math.min(res, fun(j, mask ^ (1 << i)) + graph[i][j]);
		}
		return memo[i][mask]=res;
	}
	public static void main(String[] arg) {
		int max=999999;
		for (int j = 2; j <= n; j++) {
		    max = Math.min(max, fun(j, ((1 << (n + 1)) - 2)) + graph[j][1]);
		}

		System.out.print(max);
		}
	

}
