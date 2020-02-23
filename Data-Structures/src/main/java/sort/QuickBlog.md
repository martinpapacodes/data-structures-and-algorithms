# Quick Sort

## Pseudocode

```
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
	
```

## Trace 
Sample Array: `[8,4,23,42,16,15]`

When the quick sort function is called, it takes 3 parameters: array, a left(0 is passed) and a right(length of the array).
If left is less than right, we call the partition function and pass it in into a variable named position.
 
    public void quickSort(int[] arr,int left,int right
     if(left < right) {
        int position = partition(arr,left,right);
    
  
The partition method uses a pivot point then it divides the array into two smaller arrays.

    public int partition(int[] arr, int left, int right) {
          int pivot = arr[right];
  
          int low = left - 1;
          for(int i = left; i < right; i++) {
              if(arr[i] <= pivot) {
                  low++;
                  swap(arr, low, i);
              }
          }
          swap(arr, low + 1, right);
          return low + 1;
      }
      
Inside the partition function, we call the swap method which takes in the initial array, the index, and the low. We then assign the first element of the array to a temporary variable, the we do the swapping of the elements.

         public void swap(int[]arr, int i, int low) {
                int temp = arr[i];
                arr[i] = arr[low];
                arr[low] = temp;
        
            }


## Efficiency
Worst case: O(n^2)
    
   * This will occur if the array is already sorted, and when the array is reversely sorted.
   