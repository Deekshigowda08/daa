package external_exicution;

public class Binarytree {

	class node {
		int val;
		node left,right; 
		public node(int item) {
			val=item;
			left=right=null;
			
		}
	}
	node root;
	public Binarytree() {
		root=null;
	}
		void insert(int item) {
			root=insertrec(root,item);
		}
		node insertrec(node root,int item) {
			if(root==null) 
				 return new node(item);
			else if(item<root.val) {
				root.left=insertrec(root.left,item);
			}
			else {
				root.right=insertrec(root.right,item);
			}
			return root;
			
		}
		
		
		void delete(int item) {
			root=deleterec(root,item);
		}
		
		int minvalue(node root) {
			int min=0;
			while(root!=null) {
				min=root.val;
				root=root.left;
			}
			return min;
		}
		
		node deleterec(node root,int item) {
			if(root==null) 
				 return root;
			else if(item<root.val) {
				root.left=deleterec(root.left,item);
			}
			else if(item>root.val) {
				root.right=deleterec(root.right,item);
			}
			else {
				if(root.left==null) {
					return root.right;
				}
				else if(root.right==null)
					return root.left;
			
			else {
				 root.val=minvalue(root.right);
				root.right=deleterec(root.right,root.val);
				
			}
			}
			return root;
		}
		
	void inorder() {
		inorderrec(root);
		
	}
	void inorderrec(node root) {
		if(root!=null) {
			inorderrec(root.left);
			System.out.print(" "+root.val+" ");
			inorderrec(root.right);
		}
	}
	
	public static void main(String[] arg) {
		
		Binarytree b= new Binarytree();
		
		b.insert(10);
		b.insert(20);
		b.insert(30);
		b.insert(40);
		b.inorder();
		b.delete(10);
		b.insert(20);
		b.insert(30);
		b.insert(40);
		b.inorder();
		
		
		
	}
	
	}

