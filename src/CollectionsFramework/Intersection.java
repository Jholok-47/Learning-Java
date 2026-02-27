package CollectionsFramework;
import java.util.HashMap;
import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        String txt1 = "    hello world! hello java, world java is java.   language  ";
        String txt2 = "    java is a programming language.    ";
        intersect(txt1, txt2);
    }

    public static void intersect(String txt1, String txt2) {
        HashMap<String, Integer> map = new HashMap<>();
        txt1 = txt1.trim().toLowerCase().replaceAll("[^a-z0-9\\s]", "");
        txt2 = txt2.trim().toLowerCase().replaceAll("[^a-z0-9\\s]", "");
        String[] words1 = txt1.split(" ");
        String[] words2 = txt2.split(" ");

        ArrayList<String> list = new ArrayList<>();

        for (String word : words1) {
            map.put(word, 1);
        }
        for (String word : words2) {
            if(map.containsKey(word) && !list.contains(word))
                list.add(word);
        }
        System.out.println(list);
    }
}