package pushpak25List;
import java.util.Vector;

public class Vectore1 {
    public static void main(String[] args) {
        Vector<Integer> v =new Vector<>();

        v.addElement(34);
        v.add(23);
        System.out.println(v);

        // capacity()
        System.out.println(v.capacity());

        // indexOf
        System.out.println(v.indexOf(30));

        // lastIndexOf()
        System.out.println(v.lastIndexOf(40));

        // elementAt()
        System.out.println(v.elementAt(2));

        // get()
        System.out.println(v.get(4));

        // setElementAt()
        v.setElementAt(80,4);
        System.out.println(v);

        // remove
        v.removeAllElements();
        System.out.println(v);
    }
}
