package external_exicution;
import java.util.*;
public class BFS {
	int ver;
	LinkedList<Integer>[] adj; 
	public BFS(int v) {
		ver=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<>();
		}
	}
	void insert(int v,int w) {
		adj[v].add(w);
	}
	void bfs(int root) {
		boolean[] visted=new boolean[ver];
		Queue<Integer> q= new LinkedList<>();
		
		visted[root]=true;
		q.add(root);
		while(!q.isEmpty()) {
			int item = q.poll();
			System.out.print(item+"  ");
			for(int nieg:adj[item]) {
				if(!visted[nieg]) {
					visted[nieg]=true;
					q.add(nieg);
				}
			}
		}
	}
	
public static void main(String[] arg) {
		
		BFS b= new BFS(3);
		
		b.insert(0,1);
		b.insert(0,2);
		b.bfs(0);
		
		
		
	}
}
