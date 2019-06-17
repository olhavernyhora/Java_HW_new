package task3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStream {
    List<Integer> listInt;

    public FilterStream() {
        this.listInt = generateListInt();
    }

    @Override
    public String toString() {
        return "FilterStream{" +
                "listInt=" + listInt +
                '}';
    }

    private List<Integer> generateListInt() {
        return Stream.iterate(10, x -> x + 10).limit(10).map(x -> x / 2).collect(Collectors.toList());
    }
}
