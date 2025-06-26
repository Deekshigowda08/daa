package external_exicution;

public class dij {

	public static void main(String[] arg) {
		int[][] graph= {{0,10,999,40},
				{10,0,20,999},
				{999,20,0,30},
				{40,999,30,0}};
		int[] dis=new int[4];
		int s=0;
		for(int i=0;i<4;i++) {
			dis[i]=graph[s][i];
		}
		boolean[] visted=new boolean[4];
		visted[s]=true;
		for(int count=1;count<4;count++) {
			int min=999,u=-1;
		for(int i=0;i<4;i++) {
			if(!visted[i]&&min>dis[i]) {
				min=dis[i];
				u=i;
			}
				}
		visted[u]=true;
		for(int i=0;i<4;i++) {
			if(!visted[i]&&dis[i]>dis[u]+graph[u][i]) {
				dis[i]=dis[u]+graph[u][i];
			}
		}}
		
		
		for(int i=0;i<4;i++) {
			System.out.print(dis[i]+"  ");
		}
	}

}
