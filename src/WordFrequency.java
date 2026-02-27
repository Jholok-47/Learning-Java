//Using hashmap to count the frequency of words in a given text.

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String txt = "hello world hello java world java java";
        String[] words = txt.split(" ");
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for(String word : words){
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        for(String word : frequencyMap.keySet()){
            System.out.println(word + " -> " + frequencyMap.get(word));
        }

//        for(Map.Entry<String, Integer> entry : frequencyMap.entrySet()){
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
    }
}
