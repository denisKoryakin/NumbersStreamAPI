import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        StreamMain.sortList(intList);
        List<Integer> subList = new ArrayList<>();
        for (Integer integer : intList) {
            if (integer > 0) {
                if (integer % 2 == 0) {
                    subList.add(integer);
                }
            }
        }
        Collections.sort(subList);
        subList.forEach(System.out::println);
    }
}
