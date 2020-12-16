import java.util.*;

public class BinarySearchTree{

public class Node{
	Node left,right;
	int key;
	public Node(int key){
	this.key=key;
	left=right=null;
	}
}
Node root;

public BinarySearchTree(){
	root=null;
}

public boolean insert(int key){

	return false;
}

public boolean delete(int key){

	return false;
}

public void postOrder(Node r){
	if(r==null){
	return;
	}
	else{
	postOrder(r.left);
	postOrder(r.right);
	System.out.print(r.key+" ");
	}
}
public static void main(String args[]){
	System.out.println("Hello world");
}
}
