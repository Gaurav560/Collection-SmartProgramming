package CursorDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItrDemo {
    public static void main(String[] args) {
        List l1=new ArrayList();
        l1.add(33);
        l1.add(13);
        l1.add(23);
        l1.add(43);

        Iterator itr1=l1.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
