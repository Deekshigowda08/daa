package external_exicution;

import java.util.*;

public class Topo {

	
	int ver;
	LinkedList<Integer>[] adj;
	public Topo(int v) {
		ver=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<>(); 
		}
	}
	void insert(int v,int w) {
		adj[v].add(w);
	}
	void topoutil(int v,boolean visted[],Stack s) {
		
		visted[v]=true;
		for(int nieg:adj[v]) {
			if(!visted[nieg])
				topoutil(nieg,visted,s);
		}
		s.push(v);
		
	}
	void toposort() {
		Stack s=new Stack<>();
		boolean[] visted= new boolean[ver];
		for(int i=0;i<ver;i++) {
			if(!visted[i])
				topoutil(i,visted,s);
		}
		while(!s.isEmpty()) {
			System.out.print(" "+s.pop());
		}
	}
	
	
public static void main(String[] arg) {
		
	Topo b= new Topo(4);
		
		b.insert(0,1);
		b.insert(0,2);
		b.insert(3,2);
		b.toposort();
		
		
		
	}
}
