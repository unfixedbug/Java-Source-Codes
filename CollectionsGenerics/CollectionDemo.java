// package CollectionsGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {




    public static void main(String[] args) {
        List values = new ArrayList();
        values.add(5);
        values.add(6);
        values.add(4);
        values.add(2, 2);           //added 2 to index number 2

        Iterator it = values.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
