package Data.Structures;

import javax.sound.sampled.Line;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Node listOne = new Node(1);
        listOne.next = new Node(2);
        listOne.next = new Node(4);

        Node listTwo = new Node(1);
        listTwo.next = new Node(3);
        listTwo.next = new Node(4);



          var mergeList = LinkedList.mergeList(listOne, listTwo);

          while (mergeList != null) {
            System.out.print(mergeList.value + " ");
            mergeList = mergeList.next;
          }

          System.out.println();

    }
}
