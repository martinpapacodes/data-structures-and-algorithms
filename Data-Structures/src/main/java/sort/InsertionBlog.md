# Insertion Sort

## Pseudocode

```
 InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
```

## Trace 
Sample Array: `[8,4,23,42,16,15]`

**Pass 1:**

This function will take in an array that will be sorted using the Insertion Sort.
With Insertion Sort, we would want to start and from the very beginning and compare each element while we traverse through the entire array.
In the first pass of the for loop, the iterator(i) was set to start to 1. A **j** and **temp** variable was initialized. Refer below.

    
    int j = i - 1; // j: 0
    
    int temp = arr[i]; // temp: 4
    
    while(j >= 0 && temp < arr[j]) // In this pass, temp  is less than arr[j] 
    
    4 < 8 // TRUE

The code inside is evaluated, assigning arr[j] (8) to index arr[j+1]. This results to 8 and 4 being flipped. See the new array below.


    { 4, 8, 23, 42, 16, 15 }
    
**Pass 2:**

We go through the next iteration, incrementing our iterator by 1.
    
    i = 2;
    j = 1;
    temp = 23;
    
     23     8
    temp < arr[j] // FALSE
    

The condition is false therefore, we skip the while loop and execute the line below.

    arr[j + 1] = temp;

 This line of code does is passing the 23 to index 2 which basically means 23 is staying in its original place.
 
    
    { 4, 8, 23, 42, 16, 15 }
    
**Pass 3:**

    i = 3;
    j = 2;
    temp = 42;
    
     42      23
    temp < arr[j] // FALSE
    
Similar to the previous pass, the condition is false. 42 stays in its original location.

    { 4, 8, 23, 42, 16, 15 }
    
**Pass 4:**


    i = 4;
    j = 3;
    temp = 16;
    
     16      42
    temp < arr[j] // TRUE
    
The condition is true. 

    { 4, 8, 23, 42, 42, 15 }

Once that switch happens, the while condition is executed.
      
      16      23        
     temp < arr[j] // TRUE
    
    { 4, 8, 16, 23, 42, 15 }
    
**Pass 5:**

    i = 5
    j = 4
    temp = 15
    
    { 4, 8, 15, 16, 23, 42 }
    
## Efficiency
Worst case: O(N^2)
    
   * Worst case will occur if the array is in reverse order. 
    
    
    


