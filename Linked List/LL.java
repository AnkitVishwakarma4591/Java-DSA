public class LL {
    Node head;
    class Node{
        String data;
        Node Next;

        Node(String data){
            this.data = data;
            this.Next = null;
        }
    }

    // add - first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.Next = head;
        head = newNode;
    }

    // add last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.Next != null){
            currNode = currNode.Next;
        }

        currNode.Next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.Next;
        }
        System.out.println("NULL");

    }

    public static void main(String[] args){
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("a");
        list.printList();

        list.addLast("List");
        list.printList();

        list.addFirst("This");
        list.printList();

    }
}