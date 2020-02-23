package sort;

public class QuickSort {

    public int[] quickSort(int[] arr) {
        quickSort(arr, 0, arr.length -1);
        return arr;
    }
    public void quickSort(int[] arr,int left,int right) {
        if(left < right) {
            int position = partition(arr,left,right);

            quickSort(arr, left, position -1);

            quickSort(arr, position + 1, right);
        }

    }

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


    public void swap(int[]arr, int i, int low) {
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;

    }
}
