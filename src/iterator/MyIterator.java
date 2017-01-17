package iterator;

import java.util.Iterator;

/**
 * Created by student on 17-Jan-17.
 */
public class MyIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    public boolean filter(Object obj){
        return obj.hashCode();
    }
}
