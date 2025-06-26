package external_exicution;

public class Dfs {

	public static int[][] graph= {
			{0,1,0,0},
			{0,0,0,1},
			{0,0,0,0},
			{1,0,1,0}
	};
	 public static void dfs(int st,boolean visted[]) {
		System.out.print(st+"  ");
		visted[st]=true;
		for(int i=0;i<4;i++) {
			if(!visted[i] && graph[st][i]==1) {
				dfs(i,visted);
			}
		}
	}
	 
	 public static void main(String[] arg) {
			
		System.out.println("Noduuuuuu");
		boolean[] visted= new boolean[4];
		dfs(0,visted);
				
				
			}
}
