// package CollectionsGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DemoDemoLissst {
    public static void main(String[] args) {
        Collection values = new ArrayList();
        values.add(4);
        values.add(5);
        values.add(6);

        Iterator it = values.iterator();            // does not support index number, we cannot sepcify location

        // System.out.println(it.next());           '''Printing the value on iterable once'''
        // System.out.println(it.next());
        // System.out.println(it.next());
        System.out.println(values);                //""Printing arraylist values(total)""

        while(it.hasNext()){                    //""Checking that whetheer the element has the next iterable or not""
            System.out.println(it.next());
        }

    }
}
