import java.util.*;

public class DoublyLinkedList{
	
	Node head;
	
	public class Node{
		int data;
		Node next=null;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public Node insertFirst(Node head,int data){
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		return head;
	}
	
	public Node insertLast(Node head,int data){
		Node newNode=new Node(data);
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newNode;
		return head;
	}
	
	public Node insert(Node head,int position,int data){
		if(position==0)
			head=insertFirst(head,data);
		else{
			int c=0;
			Node temp=head;
			while(c<position-1 && temp.next!=null){
				temp=temp.next;
				c+=1;
			}
			Node newNode=new Node(data);
			if(temp.next!=null){
			newNode.next=temp.next;
			temp.next=newNode;
			}
			else{
			temp.next=newNode;
			}
		}
		return head;
	}
	
	public void print(Node head){
		if(head!=null){
			while(head.next!=null){
				System.out.print(head.data+" ");
				head=head.next;
			}
			System.out.println(head.data);
		}else{
			System.out.println("List is empty");
		}
	}
	
	
	public static void main(String args[]){
		DoublyLinkedList list=new DoublyLinkedList();
		Node head=list.head;
		head=list.insertFirst(head,12);
		head=list.insertFirst(head,13);
		head=list.insertLast(head,14);
		head=list.insert(head,0,11);
		head=list.insert(head,1,10);
		head=list.insert(head,200,15);
		
		list.print(head);
		
		
	}

}