package ListVsSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        Set s1= new HashSet();
        s1.add(44);
        s1.add(434);
        s1.add(42);
        s1.add(24);
        s1.add(24);
        s1.add(null);
        System.out.println(s1);
Iterator itr2=s1.iterator();

//in case of set interface ,it has only itertator method but not listIterator method
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }



    }
}
