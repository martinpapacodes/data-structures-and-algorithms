import java.util.Arrays;
public class ArrayReverse {
  public static void main (String[] args) {
    // create the array to test your code on later
    int[] startArr = new int[] {1,2,3,4,5,10};
    // print it out, nicely
    System.out.println(Arrays.toString(startArr));
    // call your reverseArray method and save the result in a variable
    int[] endArr = reverseArray(startArr);
    // print out the result, nicely
    System.out.println(Arrays.toString(endArr));
  }

  // the method you should write, to reverse an array
  public static int[] reverseArray(int[] inputArray) {
    // your code goes here!
    // for now, to make sure that it compiles, here is a bad answer
    int[] reverseArray = new int[inputArray.length];
    int counter = 0;

    for(int i = inputArray.length - 1; i >= 0; i--) {
        reverseArray[counter] = inputArray[i];
        counter++;
    }
    return reverseArray;
  }
}