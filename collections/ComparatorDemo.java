package collections;

import java.util.ArrayList;
import java.util.Collections;
/*To compare students based on age first and then marks*/

/* Input                    Ouput
   Name  Age Marks          Name Age Marks
*  Rock  20  95       |     Ali  18  69
*  Ram   20  85       |     Al   18  94
*  Arun  19  93       |     Remo 19  79
*  Ali   18  69       |     Arun 19  93
*  Remo  19  79       |     Rock 20  85
*  Al    18  94       |     Ram  20  95
* */
public class ComparatorDemo {

    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(new Student("Rock", 20, 95));
        arrayList.add(new Student("Ram", 20, 85));
        arrayList.add(new Student("Arun", 19, 93));
        arrayList.add(new Student("Ali", 18, 69));
        arrayList.add(new Student("Remo", 19, 79));
        arrayList.add(new Student("Al", 18, 94));

        // age comparator and marks comparator
        Collections.sort(arrayList, new StudentComparator(
                new AgeComparator(), new MarksComparator()
        ));

        for(Student student: arrayList) {
            System.out.println(student.name+" "+student.age+" "+student.marks);
        }
    }
}
