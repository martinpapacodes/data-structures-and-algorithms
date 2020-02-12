package sort;

    public class MergeSort {

        // Source:  https://www.baeldung.com/java-merge-sort
        public void mergeSort(int[] arr, int arrLength) {
            if (arrLength < 2) {
                return;
            }

            int midPoint = arrLength / 2;
            int[] leftArr =  new int[midPoint];
            int[] rightArr = new int[arrLength - midPoint];


            for(int i = 0; i < midPoint; i++ ) {
                leftArr[i] = arr[i];
            }

            for(int i = midPoint; i < arrLength; i++) {
                rightArr[i - midPoint] = arr[i];
            }

            mergeSort(leftArr, midPoint);
            mergeSort(rightArr, arrLength - midPoint);

            merge(arr, leftArr, rightArr, midPoint, arrLength - midPoint);

        }
        public void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {
            int i, j, k;
            i = j = k = 0;

            while(i < left && j < right) {
                if(leftArr[i] <= rightArr[j]) {
                    arr[k++] = leftArr[i++];

                } else {
                    arr[k++] = rightArr[j++];
                }
            }

            while (i < left) {
                arr[k++] = leftArr[i++];
            }

            while (j < right) {
                arr[k++] = rightArr[j++];
            }
        }


    }

