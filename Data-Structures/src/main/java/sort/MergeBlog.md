
Code Challenge: 27


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

**Pass 1:**


