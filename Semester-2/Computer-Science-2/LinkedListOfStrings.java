
import java.util.NoSuchElementException;

public class LinkedListOfStrings {
    private int N;          // size of list
    private Node first;     // first node of list

    // helper Node class
    private static class Node {
        private String item;
        private Node next;
    }

    public LinkedListOfStrings() {
        N = 0;
        first = null;
    }

    // is the list empty?
    public boolean isEmpty()
    { return first == null; }

    // number of elements on the stack
    public int size()
    { return N; }




    // add an element to the front of the list
    public void addFront(String item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public void addBack(String item){
        if (isEmpty()){
            first = new Node();
            first.item = item;
            N++;
        }
        else {
            Node x = first;
            while (x.next != null){
                x = x.next;
            }
            x.next = new Node();
            x.next.item = item;
            N++;
        }
    }

    // delete and return the first item in the list
    public String delFront() {
        if (isEmpty()) throw new NoSuchElementException("No items in list");
        String item = first.item;      // save item to return
        first = first.next;            // delete first node
        N--;
        return item;                   // return the saved item
    }

    public String delBack() {   
        Node last = first;
        if(isEmpty()) {
            return "empty string";
        }
        else if (last.next == null){
            String lastitem = last.item;
            last.item = null;
            N--;
            return lastitem;
        }
        while (last.next.next != null){
            last = last.next;
        }  
        String lastitem = last.next.item;
        last.next.item = null;
        N--;
        return lastitem;

    }

    // print out the list
    public void printList() {
        Node x = first;
        for (int i=0; i<N; i++) {
            System.out.print(x.item);
            x = x.next;
        }
    }        

    // test client
    public static void main(String[] args) {
        LinkedListOfStrings list = new LinkedListOfStrings();
        
        list.addFront("1");
        System.out.print("Items in the linked list after adding 1 in front: ");
        list.printList();
        System.out.println();
        list.addFront("2");
        System.out.print("Items in the linked list adding 2 in front: ");
        list.printList();
        System.out.println();
        list.addBack("0");
        System.out.print("Items in the linked list after adding 0 in back: ");
        list.printList();
        System.out.println();

        list.delBack();
        System.out.print("Items in linked list after deleting in back: ");
        list.printList();
        
        
    }

}