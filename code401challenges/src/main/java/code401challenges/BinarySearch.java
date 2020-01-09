package code401challenges;

public class BinarySearch {
    public static int BinarySearch(int[] sortedArray, int searchKey) {
        int firstIndex = 0;
        int lastIndex = sortedArray.length - 1;

        while (firstIndex <= lastIndex) {
            int midPoint = (firstIndex + lastIndex) / 2;
            if(sortedArray[midPoint] == searchKey) {
                return midPoint;
            } else if (sortedArray[midPoint] > searchKey ) {
                lastIndex = midPoint - 1;
            } else if (sortedArray[midPoint] < searchKey) {
                firstIndex = midPoint + 1;
            }
        }
        return -1;


    }
}
