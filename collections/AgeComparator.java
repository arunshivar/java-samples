package collections;

import java.util.Comparator;

// compare on age
public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.age.compareTo(s2.age);
    }
}
