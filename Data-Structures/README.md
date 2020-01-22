# Data Structures

## Linked List

 To be submitted later

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
Not Applicable

---