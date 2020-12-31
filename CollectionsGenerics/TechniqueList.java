import java.util.ArrayList;
import java.util.List;

public class TechniqueList {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();
        List<Integer> values1 = new ArrayList<Integer>(); // Demo
        values.add(4);
        values.add(5);
        values.add(6);
        // values.add("2"); this gets an errror because we defined the array for
        // Integers only

        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }

        for (Object o : values) {       //or we can say (Integer o: values)
            System.out.println(o);
        }
    }
}
