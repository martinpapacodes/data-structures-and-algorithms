//package RepeatedWord    ;
//
//
//import java.util.*;
//
//public class RepeatedWord {
//
//   public String mostFrequentWord(String words) {
//       String[] collectionOfWords = words.split(" ");
//
//        HashSet<String> map = new HashSet<String>();
//       for( String word : collectionOfWords.ke) {
//           Integer oldCount = map.get(word);
//           if(oldCount== null) {
//               oldCount = 0;
//           }
//           map.put(word, oldCount++);
//       }
//       return map.toString();
//   }
//}
