package ListVsSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {

        List l1=new ArrayList();
        l1.add(544);
        l1.add(524);
        l1.add(544);
        l1.add(544);
        l1.add(null);
        l1.add(null);
        l1.add(null);
        System.out.println(l1);


        //list interface ka ek method hota hai iterator  to iterate over an list and get its element
        //list.iterator return object of iterator interface
     //  Iterator itr= l1.iterator();
       //next method of iterator class return the next object as it starts before  0 th index in list
       // while (itr.hasNext())
       // System.out.println(itr.next());

        ListIterator lI1=l1.listIterator();
        while (lI1.hasNext()){
            System.out.println(lI1.next());
        }

    }
}
