package EnumerationDemo;

import java.util.Enumeration;
import java.util.Vector;

public class Test {

    public static void main(String[] args) {

        Vector vector=new Vector();
        vector.add(65);
        vector.add(65);
        vector.add(65);
        vector.add(545);
        Enumeration enumeration= vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
