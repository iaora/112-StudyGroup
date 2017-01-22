#Welcome to 112 study group! :+1:

We will be going over some Big-O review and introduce the various Linked List methods (insert, delete, search) and the different types of Linked List (single, double, circular).

#Questions for the week

1. Write code to remove duplicates from an unsorted linked list (without using extra data structures).

2. Implement an algorithm to find the kth to last element of a single Linked List.

3. Implement an algorithm to check if a double linked list is a palindrome.

4. Given a circular linked list, implement an algorithm which returns node at the beginning
of the loop.


#Creating a Linked List
```java
public class Node {
  Node next = null;
  int data;
  public Node(int d) {
    data = d;
  }

  void appendToTail(int d) {
    Node end = new Node(d);
    Node n = this;
    while (n.next != null) {
      n = n.next;
    }
    n.next = end;
  }
}
```

#Deleting from single Linked List
```java
Node deleteNode(Node head, int d) {
  Node n = head;
  if (n.data == d) {
    return head.next; /* moved head */
  }
  while (n.next != null) {
    if (n.next.data == d) {
      n.next = n.next.next;
      return head; /* head didn’t change */
    }
    n = n.next;
  }
}
```



