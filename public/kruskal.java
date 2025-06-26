package external_exicution;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;


class Edge implements Comparable<Edge>{
	int sour,dest,weight;
	public Edge(int s,int d,int w){
		sour=s;
		dest=d;
		weight=w;
		}
	@Override
	public int compareTo(Edge e) {
		
		return this.weight-e.weight;
	}
}


public class kruskal {
		
	public static int find(int parent[],int vertex) {
		if(parent[vertex]==vertex) {
			return vertex;
		}
		else
			return find(parent,parent[vertex]);
	}
	
	public static void union(int parent[],int rank[],int x, int y) {
		
		int rootx=find(parent,x);
		int rooty=find(parent,y);
		if(rank[rootx]>rank[rooty]) {
			parent[rooty]=rootx;
		}
		else if(rank[rootx]<rank[rooty]) {
			parent[rootx]=rooty;
		}
		else {
			parent[rooty]=rootx;
			rank[rootx]++;
		}
		
	}
	
	
	public static void main(String[] arg) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter thr number of edge :");
		int n=s.nextInt();
		Edge[] edg=new Edge[n];
		System.out.print("Enter the elements :");
		for(int i=0;i<n;i++) {
			int so=s.nextInt();
			int des=s.nextInt();
			int w=s.nextInt();
			edg[i]=new Edge(so,des,w);
		}
		Arrays.sort(edg);
		
		int[] parent = new int[n];
		int[] rank= new int[n];
		
		for(int i=0;i<n;i++) {
			parent[i]=i;
		}
		int total_cost=0,cost=0;
		for (Edge e:edg) {
			int parentX=find(parent,e.sour);
			int parentY=find(parent,e.dest);
			if(parentX!=parentY) {
				//can join
				System.out.println(e.sour+"->"+e.dest+"="+e.weight);
				total_cost+=e.weight;
				cost++;
				union(parent,rank,parentX,parentY);
				if(cost==n-1) {
					break;
				}
			}
		}
		System.out.println(total_cost);
		
			
		}
}

