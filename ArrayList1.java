package pushpak25List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add()
        list.add(12);
        list.add(23);
        list.add(42);
        list.add(24);
        list.add(54);
        list.add(45);
        list.add(12);
        System.out.println(list);


        //traversing list through iterator
        Iterator i = list.iterator();
        while (i.hasNext()){
            System.out.println(i.next());;
        }

        //size()
        System.out.println(list.size());

        //indexof()
        System.out.println(list.indexOf(12));

        //lastIndexof()
        System.out.println(list.lastIndexOf(12));

        //get()
        System.out.println(list.get(3)+"get");

        //set()
        list.set(2,0);
        System.out.println(list);

        //remove()
        list.remove(3);
        System.out.println(list);

        //addAll(Collection)
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(45);
        list2.add(90);
        list.addAll(list2);
        System.out.println(list);

        //toArray()
        Object arr[] = list.toArray();
        for(Object data:arr){
            System.out.println(data +" ");
        }

//        isEmplty()
        System.out.println(list.isEmpty());

        //iterator()
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next() + " ");
        }

        //clear
        list.clear();
        System.out.println(list);






    }
}
