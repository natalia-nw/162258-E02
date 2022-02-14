import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class zad2 {
    public static <E extends Iterable<?>> void print(E element){
        Iterator<?> iterator = element.iterator();
        System.out.print("[" + iterator.next() + "]");
        while(iterator.hasNext())
        {
            System.out.print(", [" + iterator.next() + "]");
        }
    }
    public static void main(String[] ars){
        LinkedList<Integer> lista1 = new LinkedList<>();
        lista1.add(1);
        lista1.add(3);
        lista1.add(4);
        lista1.add(6);
        lista1.add(1);
        print(lista1);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(23);
        lista2.add(56);
        lista2.add(78);
        System.out.print("\n");
        print(lista2);
    }
}
