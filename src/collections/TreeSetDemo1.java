package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String args[]) {
        SortedSet<String> treeSet = new TreeSet<>();

        treeSet.add("Бета");
        treeSet.add("Aльфa");
        treeSet.add("Этa");
        treeSet.add("Гaммa");
        treeSet.add("Эпсилон");
        treeSet.add("Омeгa");

        System.out.println(treeSet);
    }
}
