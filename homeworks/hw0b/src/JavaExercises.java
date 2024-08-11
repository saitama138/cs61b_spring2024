import java.util.ArrayList;
import java.util.List;

public class JavaExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        int[] dice = new int[6];
        dice[0] = 1;
        dice[1] = 2;
        dice[2] = 3;
        dice[3] = 4;
        dice[4] = 5;
        dice[5] = 6;
        return dice;
    }

    /** Returns the order depending on the customer.
     *  If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     *  If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     *  In any other case, return an empty String[] of size 3. */
    public static String[] takeOrder(String customer) {
        if(customer.equals("Ergun")) {
            return new String[]{"beyti", "pizza", "hamburger", "tea"};
        } else if(customer.equals("Erik")) {
            return new String[]{"sushi", "pasta", "avocado", "coffee"};
        }
        return new String[3];
    }

    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    public static int findMinMax(int[] array) {
        // TODO: Fill in this function.
        int eleMin = 1000000009 + 7;
        int eleMax = -1000000009 + 7;
        for (int k : array) {
            if (k < eleMin) {
                eleMin = k;
            }
        }

        for (int j : array) {
            if (j > eleMax) {
                eleMax = j;
            }
        }
        return Math.abs(eleMax - eleMin);
    }

    /**
      * Uses recursion to compute the hailstone sequence as a list of integers starting from an input number n.
      * Hailstone sequence is described as:
      *    - Pick a positive integer n as the start
      *        - If n is even, divide n by 2
      *        - If n is odd, multiply n by 3 and add 1
      *    - Continue this process until n is 1
      */
    public static List<Integer> hailstone(int n) {
        return hailstoneHelper(n, new ArrayList<>());
    }

    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
        list.add(x);
        if(x == 1) {
            return list;
        } else if(x % 2 == 0) {
            return hailstoneHelper(x / 2, list);
        } else {
            return hailstoneHelper(3 * x + 1, list);
        }
    }

}
