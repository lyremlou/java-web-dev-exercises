package exercises;

import java.util.ArrayList;
public class Sum {
    public static int sumEven (ArrayList<Integer> ints) {
        int sum = 0;
        for (int i : ints) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
