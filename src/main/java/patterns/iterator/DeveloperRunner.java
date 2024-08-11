package patterns.iterator;

public class DeveloperRunner {

    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Maven"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Kaisik", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());

        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }

    }

}
