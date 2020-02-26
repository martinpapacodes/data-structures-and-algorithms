package repeatedWord;

import java.util.HashMap;

public class RepeatedWord {

    public String findTheFirstRepeatedWord(String lengthyString) {
        String[] splittedWords = lengthyString.split("[\\s,]+");

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < splittedWords.length; i++) {
            if(map.containsKey(splittedWords[i])) {
                return splittedWords[i].toLowerCase();
            } else {
                map.put(splittedWords[i].toLowerCase(), 1);

            }
        }
        return "No repeated word!";
    }

}
