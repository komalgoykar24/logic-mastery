import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodDemo {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(1,2,3,4,5);
        List<Integer>sq=numbers.stream().map(n->n *n).collect(Collectors.toList());
        System.out.println(sq);
    }
}
