import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {
    public static void main(String[] args) {

        Set<Integer> values = new HashSet<>(); // we cannot havae duplicate elements broo <3, iska alag hi order rehta hai
        Set<Integer> values2 = new TreeSet<>();         // store in sorted order

        values2.add(434);
        values2.add(545);
        values2.add(248);
        values2.add(434);
        values2.add(236);
        System.out.println(values.add(434));
        System.out.println(values.add(545));
        System.out.println(values.add(236));
        System.out.println(values.add(248));
        // bro the sequence is changed bro ""due to hashing? yes""

        for (int i : values) {
            System.out.println(i);
        }
        for (int i : values2) {
            System.out.println(i);
        }
    }
}
