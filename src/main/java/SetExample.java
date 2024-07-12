import java.util.HashSet;
import java.util.Set;

public class SetExample {


    public static void main(String[] args) {


        Set<String> set = new HashSet<>();

        set.add("Kaisik");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");

        set.remove("Kaisik");

        System.out.println(set.size());

        System.out.println(set);

        for (String str: set){
            System.out.println(str);
        }

        System.out.println(set.isEmpty());

        System.out.println(set.contains("Igor"));

        System.out.println(set.contains("Misha"));


    }

}
