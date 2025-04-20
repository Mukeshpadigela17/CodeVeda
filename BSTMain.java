class TreeNode 
{
int data;
TreeNode left,right;
public TreeNode(int data) 
{
this.data=data;
left=right=null;
}
}
class BST 
{
TreeNode root;
public TreeNode insert(TreeNode node,int value) 
{
if(node==null) 
return new TreeNode(value);
if(value<node.data) 
node.left=insert(node.left,value);
else if(value>node.data) 
node.right=insert(node.right,value);
return node;
}
public boolean search(TreeNode node,int key) 
{
if(node==null) 
return false;
if(key==node.data) 
return true;
return key<node.data?search(node.left,key):search(node.right,key);
}
public TreeNode delete(TreeNode node,int key) 
{
if(node==null) 
return null;
if(key<node.data) 
{
node.left=delete(node.left,key);
} 
else if(key>node.data) 
{
node.right=delete(node.right,key);
}
else 
{
if(node.left==null) 
return node.right;
if(node.right==null) 
return node.left;
node.data=minValue(node.right);
node.right=delete(node.right,node.data);
}
return node;
}
private int minValue(TreeNode node) 
{
int min=node.data;
while (node.left!=null) 
{
min=node.left.data;
node=node.left;
}
return min;
}
public void inOrder(TreeNode node) 
{
if(node!=null) 
{
inOrder(node.left);
System.out.print(node.data+" ");
inOrder(node.right);
}
}
public void preOrder(TreeNode node) 
{
if (node!=null) 
{
System.out.print(node.data+" ");
preOrder(node.left);
preOrder(node.right);
}
}
public void postOrder(TreeNode node) 
{
if(node!=null) 
{
postOrder(node.left);
postOrder(node.right);
System.out.print(node.data+" ");
}
}
}
public class BSTMain 
{
public static void main(String[] args) 
{
BST bst=new BST();
bst.root=bst.insert(bst.root, 50);
bst.insert(bst.root,30);
bst.insert(bst.root,70);
bst.insert(bst.root,20);
bst.insert(bst.root,40);
bst.insert(bst.root,60);
bst.insert(bst.root,80);
System.out.println("In-order:");
bst.inOrder(bst.root);  
System.out.println("\nPre-order:");
bst.preOrder(bst.root); 
System.out.println("\nPost-order:");
bst.postOrder(bst.root); 
System.out.println("\n\nSearching 40:" + bst.search(bst.root, 40));
System.out.println("Deleting 20...");
bst.root=bst.delete(bst.root, 20);
System.out.println("In-order after deletion:");
bst.inOrder(bst.root); 
}
}
