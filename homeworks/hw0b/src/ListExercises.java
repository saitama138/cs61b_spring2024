import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int sum = 0;
        for(int i : L) {
          sum+= i;
        }
        if(L.isEmpty()) {
            return 0;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> even = new ArrayList<>();
        for(int i : L) {
            if(i % 2 == 0) {
                even.add(i);
            }
        }

        if(even.isEmpty()) {
            return new ArrayList<>();
        }
        return even;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> contains = new ArrayList<>();
        for(int i : L1) {
            if(L2.contains(i)) {
                contains.add(i);
            }
        }

        if(contains.isEmpty()) {
            return new ArrayList<>();
        }
        return contains;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int dem = 0;
        for(String word : words) {
            for(int j = 0; j < word.length(); j++) {
                if(word.charAt(j) == c) {
                    dem++;
                }
            }
        }
        return dem;
    }
}
