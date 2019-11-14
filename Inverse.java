

public class Inverse {
	
 class Node{
	 Node left,right;
	 int key;
	 Node(int k)
	 {
		 key=k;
		 left=right=null;
	 }
 }
 Node root;
       Inverse()
	{
		root=null;
	}
       
       Node insert(Node root,int key)
   	{
   		if(root==null) {
   			root=new Node(key);
   		//return root;
   		}
   		if(key < root.key){
               root.right = insert(root.right, key);
           }else if(key > root.key){
               root.left = insert(root.left, key);
           }
           return root;
   	}
       void inOrderTraversal(Node node){
           if(node != null){
               inOrderTraversal(node.left);
               System.out.print(node.key + " ");
               inOrderTraversal(node.right);
           }
       }
   	void preOrderTraversal(Node node){
           if(node != null){
               System.out.print(node.key + " ");
               preOrderTraversal(node.left);
               preOrderTraversal(node.right);
           }
       }
	void postOrderTraversal(Node node){
        if(node != null){
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
            System.out.print(node.key + " ");
        }
    }
	int height(Node node)
	{
		if (node==null)
			return 0;
		int lh=height(node.left);
		int rh=height(node.right);
		if(lh>rh)
			return lh+1;
		else
			return rh+1;
	}
	void levelOrder()
	{
		int height=height(root);
		for(int i=0;i<height;i++)
		{
			printlevel(root,i);
		}
	}
	
	void printlevel(Node root,int l)
	{
		if(root==null)
			return;
		if(l==1)
			System.out.print(root.key+" ");
		else if(l>1) {
			printlevel(root.right,l-1);
			printlevel(root.left,l-1);
			
			
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inverse tree=new Inverse();
		tree.root=tree.insert(tree.root, 50);
		tree.root=tree.insert(tree.root, 30);
		tree.root=tree.insert(tree.root, 10);
		tree.root=tree.insert(tree.root, 40);
		tree.root=tree.insert(tree.root, 70);
		tree.root=tree.insert(tree.root, 60);
		tree.root=tree.insert(tree.root, 80);
		
		tree.inOrderTraversal(tree.root);
        System.out.println();

        tree.preOrderTraversal(tree.root);
        System.out.println();
        
        tree.postOrderTraversal(tree.root);
        System.out.println();
        
//        tree.levelOrder();
//        System.out.println();
        
        tree.printlevel(tree.root, 3);
        System.out.println();


	}

}
