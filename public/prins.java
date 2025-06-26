package external_exicution;

public class prins {

	public static void main(String[] arg) {
		int[][] graph= {
				{0,10,30},
				{10,0,20},
				{30,20,0}		};
		
		int s=0;
		int[] sol=new int[3];
		sol[s]=1;
		int k=1,sum=0,u=0,v=0;
		while(k<3) {
			int min=99;
			for(int i=0;i<3;i++)
				for(int j=0;j<3;j++) 
					if(sol[i]==1 && sol[j]==0&& min>graph[i][j]) {
						min=graph[i][j];u=i;v=j;
					}
					sol[v]=1;
					sum+=min;
					k++;
					System.out.println(u+"->"+v);
				
		}
		System.out.print(sum);
		
		
	}

}
