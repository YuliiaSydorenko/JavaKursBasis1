package lessonssssss.lesson39;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>();
        System.out.println("strings.size():" + strings.size());


        System.out.println("strings.isEmpty():" + strings.isEmpty());

        strings.add("Java");
        strings.add("Python");
        System.out.println(strings.toString());

        Collection<Integer> integers = List.of(0, 1, 2, 3, 4, 5);
        System.out.println("integers:" + integers);
        //integers.add(6);

       // addAll(Collection<? extends  T> col)

        strings.addAll(List.of("JS", "Java", "Banana", "Cat"));
        System.out.println(strings);


        System.out.println("=============================");

        Collection<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(0, 1, 2, 3, 4, 5));

        System.out.println(("numbers :" + numbers));
        numbers.removeAll(List.of(3, 2, 1));
        System.out.println("numbers.removeAll(List.of(3, 2, 1)): "  + numbers);


        System.out.println("+++++++++++++++++++");

        Collection<Integer>colA = new ArrayList<>();
        Collection<Integer>colB = new ArrayList<>();

        colA.addAll(List.of(10, 20, 30 ,20,  40 ,50));
        colB.addAll(List.of( 20, 30 , 40 ));
        System.out.println(colA);
        System.out.println(colB);
        colA.retainAll(colB);
        System.out.println(colA);

        System.out.println(colA.remove(100));
        System.out.println(colA.remove(40));
        System.out.println(colA);

        Collection<String> strings1 = new ArrayList<>(List.of("T1", "T2", "T3", "T4"));
        System.out.println(strings1);
        strings1.add("T5");
        System.out.println(strings1);










    }
}
