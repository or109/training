package iterator;
/* HelloWorld.java
 */

import java.util.ArrayList;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();
        arr.add("1");
        arr.add("23");
        arr.add("3");
        arr.add("22");
        arr.add("4");


        //Iterator ai = arr.iterator();
        MyIterator my = new MyIterator(arr.iterator());

        while (my.hasNext()) {
            Object obj = my.next();
            System.out.println("item: " + obj);
        }

    }
}