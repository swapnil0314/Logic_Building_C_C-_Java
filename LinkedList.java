

/**
 * LinkedList
 */
public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    // Methods 
    //add , remove , print , search 

    public void addFirst(int data)
    {
          //step 1 
          Node newNode = new Node(data);
          size++;
        if (head == null) 
        {
            head = tail = newNode;
            return ;
        }
      
        //step 2
        newNode.next = head;    //linking step

        //step 3
        head = newNode;

       
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if (head == null) 
        {
            head = tail = newNode;
            return ;   
        }

        tail.next = newNode;
        
        tail = newNode ; 
        
    }

    public void print()
    {
        if (head == null) 
        {
            System.out.println("LL is empty");
            return;   
        }
        Node temp = head;

        while (temp != null) 
        {
            System.out.print(temp.data+" "+" ---> ");
            temp = temp.next;   
        }
        System.out.println("null");
    }

    public void add(int idx , int data)
    {
        if (idx == 0) 
        {
            addFirst(data);
            return;   
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;

        int i = 0;

        while (i < idx-1) 
        {
            temp = temp.next;
            i++;   
        }

        //i = idx-1;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){

        if (size == 0) 
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;   
        }
        else if (size == 1) 
        {
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast()
    {
        if (size == 0 )
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;   
        }
        else if (size == 1) 
        {
            int val = head.data;
            head = tail = null;
            size = 0 ;
            return val;   
        }
        Node prev = head;
        for(int i = 0 ; i<size-2 ; i++)
        {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail=prev;
        size--;
        return val;
    }

    public int itrSearch(int key)
    {
        Node temp = head;
        int i = 0;

        while (temp != null) 
        {
            if (temp.data == key) 
            {
                 return i;  
            }   
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int helper(Node head , int key)
    {

        if (head == null) 
        {
            return -1;   
        }

        if (head.data == key) 
        {   
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) 
        {
            return -1;   
        }

        return idx+1;

    }

    public int recSearch(int key)
    {

        return helper(head, key);

    }

    public  void reverse( )
    {
        Node prev = null ; 

        Node curr = tail = head;

        Node next;

        while (curr != null) 
        {
            next = curr.next;
            
            curr.next = prev;

            prev = curr;

            curr = next;

        }

        head = prev;
    }


    public Node findMiNode(Node head)
    {
        Node slow = head ; 
        Node fast = head;

        while (fast != null && fast.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;   
        }

        return slow;
    }

    public boolean checkPalindrome()
    {
        if (head == null || head.next == null) 
        {
            return true;    //because single node is called palindrome 

        }

        Node mid = findMiNode(head);

        Node curr = mid;
        Node prev = null;

        while (curr != null) 
        {
            Node next = curr.next;
            
            curr.next = prev;

            prev = curr;

            curr = next;
        }


        Node right = prev;
        Node left = head;

        while (right != null) 
        {
            if (left.data != right.data) 
            {
                return false;   
            }   
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static boolean isCycle()
    {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) 
            {
                return true;   
            }   
        }

        return false;
    }

    public static void removeCycle(){

        Node slow = head;
        Node fast = head;
        boolean cycle = false;


        while (fast != null && fast.next != null) 
        {
            slow=slow.next;
            fast = fast.next.next;
            
            if (fast == slow) 
            {
                cycle = true;
                break;
            }
        }

        if (cycle == false) 
        {
            return;   
        }

        Node prev = null;
        slow = head;
        while (slow != fast) 
        {   
            prev  = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }

    private Node getMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;    
        }
        return slow;    //midNode
    }

    private Node merge(Node head1 , Node head2)
    {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) 
        {
            if (head1.data <= head2.data ) 
            {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;   
            }   
            else
            {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) 
        {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;   
        }

        while (head2 != null) 
        {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;   
        }

        return mergedLL.next;

    }

    public Node mergeSort(Node head)
    {

        if (head == null || head.next == null) 
        {   
            return head;
        }
        //find Mid
        Node mid = getMid();

        //left & right MS

        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) 
    {
        LinkedList ll = new LinkedList();

       

        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        // ll.addFirst(2);
        // ll.addFirst(1);
        
        // ll.addLast(2);
        // ll.addLast(1);
        //ll.add(2, 3);

        // ll.add(0, 1);
        // ll.add(1, 2);
        // ll.add(2, 2);
        // ll.add(3, 1);
        // ll.print();

        // System.out.println(ll.size);

        // ll.removeFirst();

        // ll.print();
        // System.out.println(ll.size);

        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // System.out.println(ll.itrSearch(3));

        // System.out.println(ll.itrSearch(10));

        // System.out.println(ll.recSearch(3));

        // System.out.println(ll.recSearch(10));


    //    ll.reverse();

    //     ll.print();

  //  System.out.println(ll.checkPalindrome());

//   head = new Node(1);
//   Node temp= new Node(2);
//   head.next = temp ;
//   head.next.next = new Node(3);
//   head.next.next.next = temp;

// System.out.println(isCycle());
// removeCycle();
// System.out.println(isCycle());


        ll.addFirst(1);

        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
       
        ll.print();

        ll.head = ll.mergeSort(ll.head);

        ll.print();
        
    }
}