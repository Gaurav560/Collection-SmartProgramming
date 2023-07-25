package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        ArrayList arrayList1=new ArrayList();
        arrayList1.add(55);
        arrayList1.add(55);
        arrayList1.add(null);
        arrayList1.add(null);
        arrayList1.add("gaurav");

        Iterator itr=arrayList1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //constructor having initial capacity as parameter
        ArrayList arrayList2=new ArrayList(5);
        arrayList2.add(44);
        arrayList2.add(44);
        arrayList2.add(44);
        arrayList2.add(44);
        arrayList2.add(44);
        arrayList2.add(44);
        arrayList2.add(44);
        arrayList2.add("gaurav");

        System.out.println(arrayList2.contains(44));
        System.out.println(arrayList2);
        System.out.println(arrayList2.size());
        System.out.println(arrayList2.get(4));
     arrayList2.set(2,555);
        System.out.println(arrayList2.indexOf(555));
        System.out.println(arrayList2);

        //arrraylist constructor taking another collection as parameter
ArrayList arrayList3=new ArrayList(arrayList2);
        System.out.println(arrayList3);
        //removing object in index
        arrayList3.remove(4);
        arrayList3.remove("gaurav");
        System.out.println(arrayList3);
        arrayList3.clear();
        System.out.println(arrayList3);
    }
}
