package LinkedList.CircularLinkedList;
public class SearchANodeInList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertNode(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            new_node.next = new_node;
        } else {
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            last.next = new_node;
            new_node.next = head;
        }
    }
    public void searchNode(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node curr = head;
        int s=0;
        int search_data = 900;
        while(curr.next!=head){
            s++;
            if(curr.data==search_data){
                System.out.println("\n"+"find data at"+"  "+ +s+ "th position");
            }
            curr=curr.next;
        }
    }

    public void displayList() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            Node temp = head;
            do {
                System.out.print(temp.data + "  ");
                temp = temp.next;
            }
            while (temp != head);
        }
    }

    public static void main(String[] args) {
        SearchANodeInList  refobj = new SearchANodeInList ();
        System.out.println("add new node in Circular linkedlist");
        refobj.insertNode(100);
        refobj.displayList();
        System.out.println("\n" + "add another Nodes in Circular linked list");
        System.out.println("show Circular linked list");
        refobj.insertNode(200);
        refobj.insertNode(300);
        refobj.insertNode(400);
        refobj.insertNode(500);
        refobj.insertNode(600);
        refobj.insertNode(700);
        refobj.insertNode(800);
        refobj.insertNode(900);
        refobj.insertNode(1000);
        refobj.displayList();
        refobj.searchNode();

    }
}
