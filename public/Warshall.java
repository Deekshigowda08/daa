package external_exicution;

public class Warshall {

	public  static void main(String[] arg) {
		int[][] graph= {
				{0,10,999,40},
				{10,0,20,999},
				{999,20,0,30},
				{40,999,30,0}
		};
	
	for(int k=0;k<4;k++) {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				graph[i][j]=Math.min(graph[i][j],graph[i][k]+graph[k][j]);
			}
		} 
	}
	
	System.out.println("Matrix is :");
	
	for(int i=0;i<4;i++) {
		for(int j=0;j<4;j++) {
			System.out.print(graph[i][j]+" ");
			
		}
		System.out.println();
	}
}
}
