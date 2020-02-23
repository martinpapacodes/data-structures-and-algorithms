# Merge Sort

## Pseudocode

```
mergeSort(int[] arr, int length)

	if (length < 2) 
	    return

	DECLARE midPoint <-- length / 2
	DECLARE leftArr <-- leftArr[midPoint]
	DECLARE rightArr <-- rightArr[length - midPoint]

	FOR i = 0; i < midPoint; i++
		leftArr[i] = arr[i]
	
	FOR i = midPoint; i < arrLength; i++
		rightArr[i - midPoint] = arr[i]

	mergeSort(leftArr, midPoint)
	mergeSort(rightArr, arrLength - midPoint)

	merge(arr, leftArr, midPoint, arrLength - midPoint)
	
```

## Trace 
Sample Array: `[8,4,23,42,16,15]`


The first part of our function is checking if the array has more than 2 elements, if not we break out of the function.

    if (arrLength < 2) {
                    return;
     }


Then we need to get the midpoint by dividing the length array by 2. 
We will need two arrays called leftArr and rightArr where the leftArr takes midpoint as it size and the other one to be the length of the array minus the midpoint.

            int midPoint = arrLength / 2;
            int[] leftArr =  new int[midPoint];
            int[] rightArr = new int[arrLength - midPoint];

Then we go through a for loop to store the first half of the array into the leftArr.

            for(int i = 0; i < midPoint; i++ ) {
                leftArr[i] = arr[i];
            }
            
            
            //leftArr = {8, 4, 23}
            
We do the same thing with our rightArr.

            for(int i = midPoint; i < arrLength; i++) {
                rightArr[i - midPoint] = arr[i];
            }
        
            //rightArr = {42, 16, 15}
            
            
Then we do a recursion by calling the function passing in the leftArr and our midpoint. Same goes with our rightArr. By doing this, we are starting over from the beginning of our function. This means we are dividing the array again by 2 and dividing them to leftArr and rightArr.

             mergeSort(leftArr, midPoint);
             mergeSort(rightArr, arrLength - midPoint);
             
Once we have separated our array into leftArr and rightArr, we call another function called merge that takes in the original arr, leftArr, rightArr, midPoint, and arrLength - midPoint.

            merge(arr, leftArr, rightArr, midPoint, arrLength - midPoint);


This merges the two array which will result to the sorted array.

        { 4, 8, 15, 16, 23, 42 }

## Efficiency
Worst case: O(nLogn)
    
   * The reason being is we are using divide and conquer and recursive approach.
    

