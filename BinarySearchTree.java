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

public static void main(String args[]){
	System.out.println("Hello world");
}
}
