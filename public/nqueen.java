package external_exicution;

public class nqueen {
 static int n=6;
 public static boolean issafe(int board[][],int row,int col) {
	 for(int i=0;i<row;i++)
		 if(board[i][col]==1)
			 return false;
	 for(int i=row,j=col;i>=0&&j>=0;i--,j--)
		 if(board[i][j]==1)
			 return false;
	 for(int i=row,j=col;i>=0&&j<n;i--,j++)
		 if(board[i][j]==1)
			 return false; 
	 return true;
 }
 
 public static void printsol(int board[][]) {
	 for(int[] rows:board) {
		 for(int ele:rows) {
			 System.out.print(ele+" ");
		 }
		 System.out.println();
	 }
	 
	 
 }
 
 
	public static boolean solution(int board[][],int row) {
		if(row>=n) {
			printsol(board);
			System.out.println("---------------------");
			return true;
		}
		boolean res=false;
		for(int i=0;i<n;i++) {
			if(issafe(board,row,i)) {
				board[row][i]=1;
			res=solution(board,row+1)||res;
			board[row][i]=0;
		}}
		return res;
	}
	public static void main(String[] arg) {
		int[][] board=new int[n][n];
		if(!solution(board,0)) {
			System.out.print("No solution");
		}
		}

}
