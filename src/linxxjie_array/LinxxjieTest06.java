package linxxjie_array;

import java.util.ArrayList;
import java.util.List;

public class LinxxjieTest06 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    list.add(1);
                } else if (j == i && j > 0) {
                    list.add(1);
                } else {
                    int m = result.get(i - 1).get(j - 1);
                    int n = result.get(i - 1).get(j);
                    list.add(m + n);
                }
            }
            result.add(list);
        }
        return result;
    }
}
