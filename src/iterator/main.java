package iterator;
/* HelloWorld.java
 */

import java.util.ArrayList;
import java.util.Iterator;

public class main
{
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");

        Iterator ai = arr.iterator();

        while (ai.hasNext()){
            Object obj = ai.next();
            System.out.println(obj);
        }
        ai.next();
    }
}