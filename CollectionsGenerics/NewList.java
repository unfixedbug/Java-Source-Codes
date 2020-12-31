
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NewList {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();

        values.add(434);
        values.add(545);
        values.add(248);
        values.add(623);
        values.add(236);
        
        
        Collections.sort(values);       //we can sort the list
        Collections.reverse(values);        // we reverse the sorted list
        Collections.shuffle(values);        //printing at random format
        Collections.max(values);        // same for maximum and minimum
        // Explore more int he collecions class

        // what if want to sort the valus on the basis of their last digit??

        Comparator<Integer> c = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                if(i%10>j%10){
                    return 1;           // 1 stands for swap the elements 
                }
                else{
                    return  -1;         //dont swap the elements
                }

                // return i%10>j%10?1:-1;       ternary operator
            }
        };
        Collections.sort(values,    c);

        
        for(Integer o: values)
        {
            System.out.println(o);
        }
    }
}
