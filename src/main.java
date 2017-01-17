/* HelloWorld.java
 */

import java.util.ArrayList;
import java.util.Iterator;

public class main
{
    public static void main(String[] args) {
        System.out.println("Hello World!");

        BinTree root = new BinTree("A");
        BinTree node1 = new BinTree("B");
       // node1.setRight(root);
        BinTree node2 = new BinTree("C");

        //root.setLeft(node1);
        //root.setRight(node2);
        root.setRight(root);


        System.out.println(BinTree.isValid(root));

        System.out.println(root.getValue());

        ArrayList arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");

        Iterator ai = arr.iterator();

        while (ai.hasNext()){
            System.out.println(ai);
            ai.next();
        }
    }
}