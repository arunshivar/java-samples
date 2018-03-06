package collections;

import java.util.Comparator;


// compare on marks
public class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.marks.compareTo(s2.marks);
    }
}
