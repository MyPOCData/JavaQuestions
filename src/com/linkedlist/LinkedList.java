package com.linkedlist;

class LinkedList {
    private Node first; // ref to first link on list
 
    /**
     * Singly LinkedList constructor
     */
    public LinkedList(){
           first = null;
    }
 
    /**
     * Insert New Node at first position in Singly LinkedList 
     */
    public void insertFirst(int data) {
           Node newNode = new Node(data); //Creation of New Node.
           newNode.next = first;   //newLink ---> old first
           first = newNode;  //first ---> newNode
    }
 
    /**
     * Deletes first Node of Singly LinkedList 
     */
    public Node deleteFirst()
    {
           if(first==null){  //means LinkedList in empty, throw exception.              
                  System.out.println("LinkedList doesn't contain any Nodes.");
           }
           Node tempNode = first; // save reference to first Node in tempNode- so that we could return saved reference.
           first = first.next; // delete first Node (make first point to second node)
           return tempNode; // return tempNode (i.e. deleted Node)
    }
    
           
    /**
     * Display Singly LinkedList 
     */
    public void displayLinkedList() {
           System.out.print("Displaying LinkedList [first--->last]: ");
           Node tempDisplay = first; // start at the beginning of linkedList
           while (tempDisplay != null){ // Executes until we don't find end of list.
                  tempDisplay.displayNode();
                  tempDisplay = tempDisplay.next; // move to next Node
           }
           System.out.println();
           
    }
 
}
