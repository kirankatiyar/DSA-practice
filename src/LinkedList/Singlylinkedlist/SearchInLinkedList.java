// Search an element in a Singly linked list.
package LinkedList.Singlylinkedlist;
public class SearchInLinkedList {
    Node head;
    //Node class
    class Node{
        String data;
        Node next;
        //Parameterized Constructor
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertNode(String data){
        Node new_node = new Node(data);
        if(head==null){
            head=new_node;
            return;
        }
        Node tem = head;
        while(tem.next!=null){
            tem=tem.next;
        }
        tem.next=new_node;
    }
    public void displayList(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"   ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public void SearchElement(){
        String list_element="Rajasthan";
        int pos=0;
        if(head==null){
            System.out.println("list is empty");
        }
        Node temp=head;
        while(temp!=null){
            pos++;
            if(list_element==temp.data){
                System.out.println("list_element is found at" +"  "+  +pos+"th position");
            }
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        SearchInLinkedList obj = new SearchInLinkedList();
        obj.insertNode("Uttar Pradesh");
        obj.insertNode("Chhattisgarh");
        obj.insertNode("Maharashtra");
        obj.insertNode("Gujarat");
        obj.insertNode("Rajasthan");
        System.out.println("Five states touches MP in India");
        obj.displayList();
        obj.SearchElement();
    }
}