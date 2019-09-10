package four_sorted_maximum_unique_values;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsUsing {
    private static String[] strings1 = {"1", "4", "6", "7", "10", "100", "125", "250"};
    private static String[] strings2 = {"1", "4", "8", "9", "10", "123", "125", "213"};
    private static String[] strings3 = {"7", "3", "5", "16", "10", "123", "211", "213"};
    private static String[] strings4 = {"3", "6", "9", "11", "12", "124", "125", "4"};

    //print list of 4 sorted maximum unique integer values from each array to console.
    //Output result: [250,213,211,125]
    //Use only streams. Don't use loops.

    private static List<Integer> getMaximalUniqueIntegers(String[] ... string){
        return  Stream.of(string)
                .flatMap(Arrays::stream)
                .map(Integer::parseInt)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(4)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(getMaximalUniqueIntegers(strings1, strings2, strings3, strings4));
    }
}
