package CursorDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListItrDemo {
    public static void main(String[] args) {
        List l2=new ArrayList();
        l2.add(44);
        l2.add(42);
        l2.add(41);


        ListIterator l12=l2.listIterator();
        while(l12.hasNext()){
            System.out.println(l12.next());
        }
        System.out.println("*****************************");

        while(l12.hasPrevious()){
            System.out.println(l12.previous());
        }
    }


}
