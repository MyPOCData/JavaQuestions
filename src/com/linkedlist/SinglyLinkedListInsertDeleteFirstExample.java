package com.linkedlist;

public class SinglyLinkedListInsertDeleteFirstExample {
    public static void main(String[] args) {
           LinkedList linkedList = new LinkedList(); // creation of Linked List
           
           linkedList.insertFirst(11);
           linkedList.insertFirst(21);
           linkedList.insertFirst(59);
           linkedList.insertFirst(14);
           linkedList.insertFirst(39);
 
           linkedList.displayLinkedList(); // display LinkedList
                        
           System.out.print("Deleted Nodes: ");
           Node deletedNode = linkedList.deleteFirst(); //delete Node
           deletedNode.displayNode();                                 //display deleted Node.
           deletedNode = linkedList.deleteFirst();      //delete Node.
           deletedNode.displayNode();                                 //display deleted Node.
           
           System.out.println();// sysout used to format output
           linkedList.displayLinkedList(); //Again display LinkedList
           
           
           
 
    }
}
 
/*OUTPUT
 
Displaying LinkedList [first--->last]: 39 14 59 21 11
Deleted Nodes: 39 14
Displaying LinkedList [first--->last]: 59 21 11
 
*/