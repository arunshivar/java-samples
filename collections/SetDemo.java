package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add("Java");
        hashSet.add("Hashset");
        hashSet.add(null);             // Hash set allowing null values
        hashSet.add(1);               // duplicate elements will be replaced
        hashSet.add("rock");
        hashSet.add("Rock");         // duplicate elements will be replaces

        System.out.println(hashSet);

        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Java");
        // treeSet.add(null);  // treeset does not allow null values
        treeSet.add("C");
        treeSet.add("python");
        treeSet.add("Python");
        treeSet.add("python"); // duplicates wiil be replaced

        // sorted order
        System.out.println(treeSet);
    }

}
