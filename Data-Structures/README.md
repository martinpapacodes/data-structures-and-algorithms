# Data Structures

## Linked List

### Lab 05: Linked List Implementation 

#### Singly Linked List
Implement A Singly Linked List

[Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/linkedList/LinkedList.java)

#### Challenge

    Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
    Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.
        Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
        Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
        Define a method called toString (or __str__ in Python) which takes in no arguments and returns a string representing all the values in the Linked List, formatted as:
            "{ a } -> { b } -> { c } -> NULL"
    Any exceptions or errors that come from your code should be semantic, capturable errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.
    Be sure to follow your language/frameworks standard naming conventions (e.g. C# uses PascalCasing for all method and class names).
#### Approach & Efficiency
* When inserting into the head of the LinkedList, it has an O(1).
* When it is calling the toString and includes method, it has O(N).

#### API
* insert(value)
* toString()
* isEmpty()
* includes(value)
* indexOf()

---

### Code Challenge: Class 06 

#### Linked List Insertion
Linked list insertion

[Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/linkedList/LinkedList.java)

#### Challenge

    Write the following methods for the Linked List class:
    .append(value) which adds a new node with the given value to the end of the list
    .insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node
    .insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node

#### Approach & Efficiency
* The append() method has an O(N) because it adds to the end of the linked list.
* The insertBefore(value, newVal) has an O(1) if values are given is to be inserted in the front, otherwise O(N).
* The insertAfter(value, newVal) has an O(N) because it has to traverse through the list

#### Solution

![whiteboard-image](assets/ll-insertion.jpg)

---

### Code Challenge: Class 07 

#### Linked List (kthFromEnd(k))
k-th value from the end of a linked list

[Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/linkedList/LinkedList.java)
                                         
#### Challenge

    Write a method for the Linked List class which takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list. You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.`

#### Approach & Efficiency
This method is going to have an O(n) depends on the length of the Linked List.

#### Solution

![whiteboard-image](assets/kthFromEnd.jpg)

---

### Code Challenge: Class 08

#### Linked List(merge)
Merge two linked list

[Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/linkedList/LinkedList.java)
                                         
#### Challenge

    Write a function called mergeLists which takes two linked lists as arguments. Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list. Try and keep additional space down to O(1). You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.
    
#### Approach & Efficiency
The merge itself has an o(n) because it has to traverse through both list, while the space is O(1) because it is returning one list.

#### Solution

![whiteboard-image](assets/ll-merge.jpg)

---

## Stack and Queue

### Lab 10: Stack and Queue Implementation 

#### Stacks and Queues
Implement Stack and Queues using Linked List

#### Challenge

    Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.
    Create a Stack class that has a top property. It creates an empty Stack when instantiated.
        This object should be aware of a default empty value assigned to top when the stack is created.
        Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
        Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
        Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
        Define a method called isEmpty that does not take an argument, and returns a boolean indicating whether or not the stack is empty.
    Create a Queue class that has a front property. It creates an empty Queue when instantiated.
        This object should be aware of a default empty value assigned to front when the queue is created.
        Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
        Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
        Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
        Define a method called isEmpty that does not take an argument, and returns a boolean indicating whether or not the queue is empty.
    Any exceptions or errors that come from your code should be semantic, capturable errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.
    Be sure to follow your languages best practices for naming conventions.


#### Approach & Efficiency
* When pushing to stack and enqueuing to the queue has an O(1).
* When popping from a stack, it also has an O(1);
* When dequeuing from queue, it has an O(N) because it has to traverse.
#### API
##### Stack
* push(value)
* isEmpty()
* peek()
* pop()
* display()

##### Queue
* enqueue(value)
* dequeue()
* isEmpty()
* peek()
* display()

### Code Challenge: Class 11 


#### Challenge Summary - PseudoQueue

Implement a Queue using two Stacks.


####  Approach & Efficiency

### Code Challenge: Class 12 

---

## Binary Tree

### Code Challenge: Class 15: Binary Tree and BST Implementation 

#### Singly Binary Tree and BST
Implement Binary Tree and BST

Tree:
[Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/tree/Tree.java)

Binary Search Tree:
[Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/tree/BinarySearchTree.java)
#### Challenge

    Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
    Create a BinaryTree class
        Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.

    Any exceptions or errors that come from your code should be semantic, capturable errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.
    Create a BinarySearchTree class
        Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
        Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

#### Approach & Efficiency
* Recursions was used in the the Tree methods(inOrder, preOrder, postOrder).
    * Time complexities for these methods are O(n) because we have to traverse through the tree.

#### API
* preOrder(root)
* inOrder(root)
* postOrder(root)
* add(value)
* contains(value)

---

###  Code Challenge: Class 16 
#### Fizz Buzz Tree
Implement a fizzBuzz functionality using a tree

fizzBuzzTree:
[Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/utilities/FizzBuzzTree.java)


#### Challenge

    
    Write a function called FizzBuzzTree which takes a tree as an argument.
    Without utilizing any of the built-in methods available to your language, determine whether or not the value of each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, but the values modified as follows:
        If the value is divisible by 3, replace the value with “Fizz”
        If the value is divisible by 5, replace the value with “Buzz”
        If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
        If the value is not divisible by 3 or 5, simply turn the number into a String.
    Return the new tree.


#### Approach & Efficiency
* This method uses an O(n) because it has to traverse through every single node in the tree.

#### API
![whiteboard-image](assets/FizzBuzzTree.jpg)
---

###  Code Challenge: Class 17
#### Breadth First Traversal
Breadth-first Traversal


[Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/tree/Tree.java)


#### Challenge

    
    Write a breadth first traversal method which takes a Binary Tree as its unique input. Without utilizing any of the built-in methods available to your language, traverse the input tree using a Breadth-first approach, and return a list of the values in the tree in the order they were encountered.

#### Approach & Efficiency
* This method uses an O(n) because it has to traverse through every single node in the tree.

#### API
![whiteboard-image](assets/breadthFirst.jpg)


###  Code Challenge: Class 18
#### Find Max Value in a Binary Tree
Find the Maximum Value in a Binary Tree


[Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/tree/Tree.java)


#### Challenge

    
    Write an instance method called find-maximum-value. Without utilizing any of the built-in methods available to your language, return the maximum value stored in the tree. You can assume that the values stored in the Binary Tree will be numeric.

#### Approach & Efficiency
* This method uses an O(n) because it has to traverse through every single node in the tree.

#### API
![whiteboard-image](assets/findMaxValue.jpg)
---
### Code Challenge: Class 26
#### Insertion Sort
    Review the pseudocode below, then trace the algorithm by stepping through the process with the provided sample array. Document your explanation by creating a blog article that shows the step-by-step output after each iteration through some sort of visual.

    Once you are done with your article, code a working, tested implementation of Insertion Sort based on the pseudocode provided.
[Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/sort/InsertionSort.java)

#### Challenge

    Provide a visual step through for each of the sample arrays based on the provided pseudo code
    Convert the pseudo-code into working code in your language
    Present a complete set of working tests

#### Solution

[Blog](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/sort/InsertionBlog.md)

---

### Code Challenge: Class 27
#### Merge Sort
    Review the pseudocode below, then trace the algorithm by stepping through the process with the provided sample array. Document your explanation by creating a blog article that shows the step-by-step output after each iteration through some sort of visual.

    Once you are done with your article, code a working, tested implementation of Insertion Sort based on the pseudocode provided.
[Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/sort/MergeSort.java)

#### Challenge

    Provide a visual step through for each of the sample arrays based on the provided pseudo code
    Convert the pseudo-code into working code in your language
    Present a complete set of working tests

#### Solution

[Blog](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/sort/MergeBlog.md)

---

### Code Challenge: Class 28
#### Quick Sort
    ALGORITHM QuickSort(arr, left, right)
        if left < right
            // Partition the array by setting the position of the pivot value 
            DEFINE position <-- Partition(arr, left, right)
            // Sort the left
            QuickSort(arr, left, position - 1)
            // Sort the right
            QuickSort(arr, position + 1, right)
    
    ALGORITHM Partition(arr, left, right)
        // set a pivot value as a point of reference
        DEFINE pivot <-- arr[right]
        // create a variable to track the largest index of numbers lower than the defined pivot
        DEFINE low <-- left - 1
        for i <- left to right do
            if arr[i] <= pivot
                low++
                Swap(arr, i, low)
    
         // place the value of the pivot location in the middle.
         // all numbers smaller than the pivot are on the left, larger on the right. 
         Swap(arr, right, low + 1)
        // return the pivot index point
         return low + 1
    
    ALGORITHM Swap(arr, i, low)
        DEFINE temp;
        temp <-- arr[i]
        arr[i] <-- arr[low]
        arr[low] <-- temp

[Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/sort/QuickSort.java)

#### Challenge

    Provide a visual step through for each of the sample arrays based on the provided pseudo code
    Convert the pseudo-code into working code in your language
    Present a complete set of working tests

#### Solution

[Blog](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/sort/QuickBlog.md)

---
   
   ### Code Challenge: Class 30
   #### Hash Table Implementation 
   Implement a Hash Table
   
   [Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/hashtable/Hashtable.java)
   
   #### Challenge
   
       Implement a Hashtable with the following methods:
   
       add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
       get: takes in the key and returns the value from the table.
       contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
       hash: takes in an arbitrary key and returns an index in the collection.
   
   #### Approach & Efficiency
   * Worst Case:
       * If items on a hash table were hashed into similar (collision), searching will take an O(N).
   #### API
   * add - add a node to the hash table
   * get - retrieve a node with a key. If not present, return a null. 
   * contains - retrieves a node. If present, return true otherwise false. 
   * hash - hash a key using Bob Jenkin's hashing function. [Jenkins' Hash Function](https://en.wikipedia.org/wiki/Jenkins_hash_function)
   * displayHashTable - display all element within the hash table.
   
   ---
      
  ### Code Challenge: Class 32
  #### First Repeated Word
    Find the first repeated word in a book.
      
   [Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/repeatedWord/RepeatedWord.java)
      
  #### Challenge
      
    Write a function that accepts a lengthy string parameter.
    Without utilizing any of the built-in library methods available to your language, return the first word to occur more than once in that provided string.

      
  #### Approach & Efficiency
  * Implemented HashMap to store strings and keep track of frequency
  
  * Time: O(N)
  * Space: O(N)    
  
      
  #### API
  ![whiteboard-image](assets/MostRepeatedWord.jpg)
  
  ---
        
  ### Code Challenge: Class 33
  
  #### Tree Intersection
  
  Find common values in 2 binary trees. 
  
  [Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/treeIntersection/TreeIntersection.java)
        
  #### Challenge
        
     
    Write a function called tree_intersection that takes two binary tree parameters.
    Without utilizing any of the built-in library methods available to your language, return a set of values found in both trees.

  
        
  #### Approach & Efficiency
   * Implemented Hashset to return unique values between two binary trees.
    
  * Time: O(N)
  * Space: O(N)    
    
        
  #### API
   ![whiteboard-image](assets/TreeIntersection.jpg)
   
   ---
   
   ### Code Challenge: Class 35
   #### Graph Implementation
   Implement a Hash Table
   
   [Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/graph/Graph.java)
   
   #### Challenge
   
      Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:
      
          AddNode()
              Adds a new node to the graph
              Takes in the value of that node
              Returns the added node
          AddEdge()
              Adds a new edge between two nodes in the graph
              Include the ability to have a “weight”
              Takes in the two nodes to be connected by the edge
                  Both nodes should already be in the Graph
          GetNodes()
              Returns all of the nodes in the graph as a collection (set, list, or similar)
          GetNeighbors()
              Returns a collection of nodes connected to the given node
              Takes in a given node
              Include the weight of the connection in the returned collection
          Size()
              Returns the total number of nodes in the graph

   
   #### Approach & Efficiency
   * Worst Case:
       * Time: O(N)
       * Space: O(N) **Returning a set of nodes**
   #### API
   * AddNode() - adds new node to the graph
   * AddEdge() - adds new edge between to nodes
   * GetNodes() - returns all the node in the graph
   * GetNeighbors() - returns a list of nodes connected to the given node
   * Size()  - returns the total number of nodes in the graph
   ---
   
### Code Challenge: Class 36 
#### Breadth First Traversal
Implement a breadth-first traversal on a graph.
      
 [Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/breadthFirst/BreadthFirst.java)
      
 #### Challenge
      
        Extend your graph object with a breadth-first traversal method that accepts a starting node. Without utilizing any of the built-in methods available to your language, return a collection of nodes in the order they were visited. Display the collection.
   
      
 #### Approach & Efficiency
 * Worst Case:
    * Time: O(N)
          
    * Space: O(N) **Returning a set of nodes**
 #### API
   ![whiteboard-image](assets/GraphBreadthFirst.jpg)
   
      ---
      
### Code Challenge: Class 37
#### Get Edge
Given a business trip itinerary, and an Alaska Airlines route map, is the trip possible with direct flights? If so, how much will the total trip cost be?
         
[Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/getEdge/GetEdge.java)
         
#### Challenge
         
           Write a function based on the specifications above, which takes in a graph, and an array of city names. Without utilizing any of the built-in methods available to your language, return whether the full trip is possible with direct flights, and how much it would cost.
      
         
 #### Approach & Efficiency
 * Worst Case:
    * Time: O(N)
    * Space: O(1) **Returning a string**
    
  #### API
  ![whiteboard-image](assets/GraphGetEdges.jpg)
  ---    
 
 ### Code Challenge: Class 38
 #### Depth First Traversal
 Conduct a depth first preorder traversal on a graph
          
 [Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/depthFirst/DepthFirst.java)
          
 #### Challenge
          
            Create a function that accepts an adjacency list as a graph, and conducts a depth first traversal. Without utilizing any of the built-in methods available to your language, return a collection of nodes in their pre-order depth-first traversal order.
          
  #### Approach & Efficiency
  * Worst Case:
     * Time: O(N)
     * Space: O(N) **Returning a set of nodes**
     
   #### API
   ![whiteboard-image](assets/DepthFirstGraph.jpg)
   ---    
