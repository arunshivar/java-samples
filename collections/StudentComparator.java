package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentComparator implements Comparator<Student> {
    private List<Comparator<Student>> listComparators;

    // to compare on multiple fields,
    // var arg to send 0 or more comparators
    public StudentComparator(Comparator<Student>... comparators) {
        this.listComparators = Arrays.asList(comparators);
    }

    @Override
    public int compare(Student student1, Student student2) {
        for (Comparator<Student> comparator : listComparators) {
            int result = comparator.compare(student1, student2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }

}
