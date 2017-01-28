##A few linked lists solutions

#####Solutions to Single LL #2

If we don't have a buffer, we can iterate with two pointers: cu rrent which iterates through the linked list, and runner which checks all subsequent nodes for duplicates.

```java
void deleteDups(LinkedListNode head) {
  LinkedListNode current = head;
  while (current != nUll) {
    /* Remove all future nodes that have the same value */
    LinkedListNode runner = current;
    while (runner. next != nUll) {
      if (runner.next.data == current.data) {
        runner. next = runner.next.nextj
      } else {
        runner = runner.next;
      }
    }
    current current.nextj
  }
}
```

This code runs in O(1) space, but O(N<sup>2</sup>) time.


#####Solution for single LL #3
We can use two pointers, pi and p2. We place them k nodes apart in the linked list by putting p2 at the beginning and moving pi k nodes into the list. Then, when we move them at the same pace, pi will hit the end of the linked list after LENGTH - k steps. At that point, p2 will be LENGTH - k nodes into the list, or k nodes from the end.

```java
  LinkedListNode nthToLast( LinkedListNode head, int k) {
  LinkedListNode p1 head;
  LinkedListNode p2 = head;
  /* Move pi k nodes into the list. */
  for (int i = 0; i < k; i++) {
    if ( p1 == nUll) return null; II Out of bounds
    p1 = pl. next;
  }

  /* Move them at the same pace. When p1 hits the end, p2 will be at the right element . */
  while (p1 != nUll) {
    pl pl . next;
    p2 = p2.next;
  }
  return p2;
}
```

This algorithm takes O(n) time and O(1) space.

