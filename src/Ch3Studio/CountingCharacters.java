package Ch3Studio;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void CountingChars (String input) {
        // methods take string input
        // methods loop through each character( convert string to char array)
        // create some collection to hold the following: character: score
        // I will use hashmap data structure because we are looking for key and value

         char [] characters = input.toCharArray();
        HashMap<Character, Integer> scores = new HashMap<>();

         for(char letter: characters) {
             if(!scores.containsKey(letter)) {
                 scores.put(letter,1);
             } else {
                 scores.put(letter, scores.get(letter) + 1);

             }
         }
         for(Map.Entry<Character, Integer> score: scores.entrySet()) {
             System.out.println(String.format("%s: %s", score.getKey(),score.getValue()));

         }
    }


}
