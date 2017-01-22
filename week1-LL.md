Welcome to 112 study group! :+1:

Feel free to add/message me on Facebook(www(.)facebook(.)com/jamiee.liao) or email me at j.liao5079 @gmail.com with any questions about the course, future courses, or anything in general :)

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
