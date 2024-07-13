import com.kaisikk.java.kaisikmtscourse.Student;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {


    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);

        treeSet.remove(2);
        treeSet.remove(100);

        System.out.println(treeSet);


        TreeSet<Student> studentTreeSet = new TreeSet<>();

        studentTreeSet.add(new Student("Kaisik", "Kaisikovich", 5));
        studentTreeSet.add(new Student("Misha", "Kaisikovich", 1));
        studentTreeSet.add(new Student("Igor", "Kaisikovich", 2));
        studentTreeSet.add(new Student("Marina", "Kaisikovich", 3));
        studentTreeSet.add(new Student("Olya", "Kaisikovich", 4));

        System.out.println(studentTreeSet);

        System.out.println(studentTreeSet.first());
        System.out.println(studentTreeSet.last());

        System.out.println(studentTreeSet.headSet(new Student("Oleg", "Kaisikovich", 3)));

    }

}
