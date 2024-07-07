import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashAndEquals {

    public static void main(String[] args) {

        Map<TestStudent, Double> map = new HashMap<>();

        TestStudent st1 = new TestStudent("Kaisik", "Kaisikovich", 3);
        TestStudent st2 = new TestStudent("Galina", "Ivanova", 1);
        TestStudent st3 = new TestStudent("Sergey", "Petrov", 4);

        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);

        TestStudent st4 = new TestStudent("Kaisik", "Kaisikovich", 3);

        boolean result = map.containsKey(st4);
        System.out.println(result);
        System.out.println(st1.equals(st4));

    }
}

class TestStudent {
    String name;

    String surName;

    int cource;

    public TestStudent(String name, String surName, int cource) {
        this.name = name;
        this.surName = surName;
        this.cource = cource;
    }

    @Override
    public String toString() {
        return "TestStudent{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", cource=" + cource +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestStudent that = (TestStudent) o;
        return cource == that.cource && Objects.equals(name, that.name) && Objects.equals(surName, that.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, cource);
    }
}
