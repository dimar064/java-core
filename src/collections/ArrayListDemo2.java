package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();

        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        arrayList1.add("D");
        arrayList1.add("E");
        arrayList1.add("F");
        System.out.println(arrayList1);

        arrayList2.add("1");
        arrayList2.add("2");

        arrayList1.addAll(3, arrayList2);
        System.out.println(arrayList1);

        arrayList1.clear();
        System.out.println(arrayList1);
    }
}
