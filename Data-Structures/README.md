# Data Structures

## Linked List

### Lab 05: Linked List Implementation 

#### Singly Linked List
Implement A Singly Linked List (
[Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/linkedList/LinkedList.java)
)
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
Linked list insertion (
[Code](https://github.com/martinpapacodes/data-structures-and-algorithms/blob/master/Data-Structures/src/main/java/linkedList/LinkedList.java)
)
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
