class MyLinkedList {


        class Node{
            int val;
            Node next;
          

            Node(int val){
                this.val=val;
                this.next=null;
            }
        }

        Node head;
        Node tail;
        public MyLinkedList(){
            head=null;
            tail=null;
        }
    
    
    public int get(int index) {
        // Node temp=head;
        // int x=0;
        // while(x!= index){
        //     temp=temp.next;
        // }
        // return temp.val;


        if(index < 0) {
            return -1;
        }

        Node temp = head;
        int x = 0;

        while(x < index && temp != null) {
            temp = temp.next;
            x++;
        }

        if(temp == null) {
            return -1;
        }

        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newNode= new Node(val);
        if(head==null){
            tail=newNode;

        }
        Node temp=head;
        head=newNode;
        newNode.next=temp;

    }
    
    public void addAtTail(int val) {
        Node temp= new Node(val);
        if(tail != null){
            tail.next=temp;
            tail=temp;
        }
        if(tail == null){
            addAtHead(val);

        }
    }
    
public void addAtIndex(int index, int val) {

    if(index < 0) {
        return;
    }

    if(index == 0) {
        addAtHead(val);
        return;
    }

    Node NewNode = new Node(val);
    Node temp = head;
    int x = 0;
    Node prev = null;

    while(x < index && temp != null) {
        prev = temp;
        temp = temp.next;
        x++;
    }

    // Index is greater than list size
    if(x != index) {
        return;
    }

    NewNode.next = temp;
    prev.next = NewNode;

    // IMPORTANT: Update tail
    if(temp == null) {
        tail = NewNode;
    }
}
    

public void deleteAtIndex(int index) {

    if(index < 0 || head == null) {
        return;
    }

    if(index == 0) {
        head = head.next;

        if(head == null) {
            tail = null;
        }

        return;
    }

    Node temp = head;
    int x = 0;
    Node prev = null;

    while(x < index && temp != null) {
        prev = temp;
        temp = temp.next;
        x++;
    }

    if(temp == null) {
        return;
    }

    prev.next = temp.next;

    if(temp == tail) {
        tail = prev;
    }
}
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */