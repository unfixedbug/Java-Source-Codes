import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NewListLambda {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(434);
        values.add(545);
        values.add(248);
        values.add(623);
        values.add(236);
        
        Comparator<Integer> c = ( i, j) -> i%10>j%10?1:-1;          //we can use this as well as line 21
        Collections.sort(values, c);

        // OR We can say
        Collections.sort(values, ( i, j) -> i%10>j%10?1:-1);

        for(Integer o : values)
        {
            System.out.println(o);
        }

    }
}
