#Midterm Topics
Arrays, linked list, stack, queue, array list, sequential search, and binary search (including comparison tree

#Big-O
**Big O describes the rate of increase**

Tips:
  - Drop the non-dominant terms.
    - Ex: O(n<sup>2</sup> + n) would become O(n<sup>2</sup>) because n<sup>2</sup> increases faster than n.

###Add vs Multiply Big O
Example 1:
  ```
  for(int a : arrA){
    print (a);
  }
  for(int b : arrB){
    print (b);
  }
  ```
Example 2:
  ```
  for(int a : arrA){
    for(int b : arrB){
      print(a + "," + b);
    }
  }
  ```

  What is the run time for Example 1 vs Example 2?

  If your algorithm is in the form "do this, then, when you're all done, do that" then you add the runtimes.

  If your algorithm is in the form "do this for each time you do that" then you multiply the runtimes.

###Time Complexity vs Space Complexity
How much time does it take to complete this task? This is typically what you've encoutered as "Big-O".

For example: Merge sort's time complexity is O(nlogn) which is pretty fast, but takes quite a lot of space (a lot of arrays need to be generated) versus selection sort which takes a long time in the worst case, O(n<sup>2</sup>), but doesn't require any extra space to do the sort.



