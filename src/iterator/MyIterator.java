package iterator;

import java.util.Iterator;

/**
 * Created by student on 17-Jan-17.
 */
public class MyIterator implements Iterator {

    private boolean flag = false;
    private Object last = null;
    private Iterator ie;

    public MyIterator(Iterator ie) {
        this.ie = ie;
    }

    @Override
    public boolean hasNext() {
        boolean found = false;

        while (ie.hasNext() && !found) {
            this.last = ie.next();
            if (filter(this.last)) {
                found = true;
            }
        }

        return found;
    }

    @Override
    public Object next() {
        if (!flag)
            this.hasNext();

        flag = false;

        return last;
    }

    public boolean filter(Object obj) {
        String str = obj.toString();
        boolean condtion = str.length() > 1;
        //boolean condtion = obj == null;

        return condtion;
    }
}
