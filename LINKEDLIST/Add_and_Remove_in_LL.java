import java.util.LinkedList;

// package LINKEDLIST-1;

public class Add_and_Remove_in_LL {
    public static class Node{

        int data;
        Node next;

        public Node(int data){
            this.data =data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        
        //base case
        if(head ==null){
            head = tail = newNode;
            return;
        }



        //step2 = newNode next = head
        newNode.next = head;//link

        //step3 = hed = newNode
        head = newNode;
    }

    /**
     * @param data
     */
    public void addLast(int data){
        //step1 = create new Node
        Node newNode = new Node(data);
        size++;
        //base case
        if(tail==null){
            head = tail = newNode;
            return;
        }

        //step2 = tail next = newNode
        tail.next = newNode;//link

        //step3 = tail = new node
        tail = newNode;
    }

    public void addMiddle(int idx, int data){
        if(idx ==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while(i <idx -1){
            temp = temp.next;
            i++;
        }

        //i = idx -1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty!!");
            return Integer.MAX_VALUE;
        }else if(size ==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;//link breaked
        size--;
        return val;
    }

    public void deleteMiddle(Node head) {
        if(head.next == null){
            head = head.next;
            return;
        }
        Node slow = head;
        Node fast = head;
        Node entry = null;
        while(fast != null && fast.next != null){
            entry = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        entry.next = entry.next.next;
    }

    
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty!!");
            return Integer.MIN_VALUE;
        }else if(size ==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        //prev : i = size-2;
        Node prev = head;
        for(int i=0; i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;//tail.data
        prev.next= null;
        tail =prev;
        size--;
        return val;
        
    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }
    
    public int RecSearch(Node head, int key){
        if(head == null) return -1;
        if(head.data == key) {
            return 0;
        }
        
        int ans = RecSearch(head.next, key);
        if(ans == -1) return -1;
        return ans + 1;
    }

    public void print(){
        //not required if loop 
        if(head == null){
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail =head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;

    }

    public void deleteNthfromEnd(int n){
        //calculate size of ll
        int sz=0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }

        if(n==sz){
            head = head.next;//remove first
            return;
        }

        //sz-n
        int i=1;
        int iToFind = sz -n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    //slow fast appraoch
    public Node findMid(Node head){//helper
        Node slow=head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow= slow.next;//+1
            fast = fast.next.next;//+2
        }
        return slow;//slow is my midNode
    }

    public boolean checkPalindrome(){
        if(head == null || head.next==null){
            return true;
        }
        //step1 - find mid
        Node midNode  =findMid(head);
        // step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev =curr;
            curr=next;
        }
        Node right = prev;//right half head
        Node left = head;
        // step3 - check left half and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right= right.next;
        }
        return true;
    }
    
    public static void main(String args[]){
        Add_and_Remove_in_LL ll = new Add_and_Remove_in_LL();
        //class ke naam ka object banao tabhi run karega
        //LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(3);
        // ll.print();
        // ll.addLast(4);
        // ll.print();
        // ll.addLast(5);
        // ll.print();
        // ll.addLast(6);
        // ll.print();
        // ll.addMiddle(3,9 );
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        // ll.deleteMiddle(head);
        // ll.print();
        // System.out.println(ll.itrSearch(5));
		// System.out.println(ll.RecSearch(ll.head, 4));
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println(ll.checkPalindrome());
        // ll.reverse();
        // ll.print();
        // ll.deleteNthfromEnd(3);
        // ll.print();

 



    }
    
}