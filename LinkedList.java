class LinkedList
{
    // head of list
    Node head;

    // Linked list Node
    class Node
    {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }


    void removeDuplicates()
    {

        Node temp = head,prev=head;

        // Traverse list till the last node
        while (temp != null) {

            if(temp.data!=prev.data)
            {

                prev.next=temp;
                prev=temp;
            }

            temp=temp.next;
        }

        if(prev!=temp){
            prev.next=null;
        }
    }

    public void push(int new_data)
    {

        Node new_node = new Node(new_data);


        new_node.next = head;


        head = new_node;
    }

    /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(2);
        llist.push(2);
        llist.push(3);
        llist.push(3);
        llist.push(3);

        System.out.print("List before ");
        System.out.println("removal of duplicates");
        llist.printList();

        llist.removeDuplicates();

        System.out.println("List after removal of elements");
        llist.printList();
    }
}