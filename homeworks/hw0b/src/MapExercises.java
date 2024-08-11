import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        Map<Character, Integer> mps = new TreeMap<>();
        for(int i = 0; i < 26; i++) {
            mps.put((char)('a' + i), i + 1);
        }
        return mps;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer, Integer> mps = new HashMap<>();
        for(int i = 0; i < nums.size(); i++) {
            mps.put(nums.get(i), nums.get(i) * nums.get(i));
        }
        if(nums.isEmpty()) {
            return new HashMap<>();
        }
        return mps;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String, Integer> mps = new TreeMap<>();
        for(int i = 0; i < words.size(); i++) {
            if(mps.containsKey(words.get(i))) {
                mps.put(words.get(i), mps.get(words.get(i)) + 1);
            } else {
                mps.put(words.get(i), 1);
            }
        }

        if(words.isEmpty()) {
            return new TreeMap<>();
        }

        return mps;
    }
}
