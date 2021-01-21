
public class SinglyLinkedList {

    Node head;

    public SinglyLinkedList() {
        head = new Node();
    }


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

        Node() {
            next = null;
        }
    }

    public void insert(int data) {
        Node head = this.head;
        while (head.next != null) {
            head = head.next;
        }
        head.next = new Node(data);
    }

    public void insert(int data, int position) {
        Node head = this.head;
        if (head.next == null)
            head.next = new Node(data);
        else {
            int c = 0;
            while (c < position - 1) {
                head = head.next;
                c++;
                if (head.next == null) {
                    break;
                }
            }
            Node node = new Node(data);
            node.next = head.next;
            head.next = node;
        }
    }

    public void print() {
        Node head = this.head;
        if (head.next != null) {
            System.out.print("List: ");
            while (head.next != null) {
                head = head.next;
                System.out.print(head.data + " ");
            }
            System.out.println();
        } else
            System.out.println("List is empty");
    }

    public void delete(int position) {  // Deleting by position of element
        Node head = this.head;
        if (head.next != null) {
            int c = 0;
            while (c < position - 1) {
                head = head.next;
                if (head.next == null) {
                    return;
                }
                c++;
            }
            head.next = head.next.next;
        }
    }

    public void remove(int element) {   //Deleting by element
        Node head = this.head;
        if (head.next != null) {
            Node prev;
            while (head.next != null) {
                prev = head;
                head = head.next;
                if (head.data == element) {
                    prev.next = head.next;
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list1.insert(5);
        list1.insert(6,6);
        list1.insert(7,10);
        list1.print();

        list1.delete(0);
        list1.remove(10);
        list1.print();
    }

}
