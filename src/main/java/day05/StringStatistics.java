package day05;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringStatistics {

    public Map<Character,Integer> numberOfCharactersByCharacter(String word){
        Map<Character, Integer> result = new LinkedHashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (!result.containsKey(word.charAt(i))) {
                result.put(word.charAt(i), 1);
            } else {
                result.put(word.charAt(i), result.get(word.charAt(i)) + 1);
            }
        }
        return result;
    }
}
