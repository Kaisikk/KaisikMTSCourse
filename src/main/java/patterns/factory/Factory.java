package patterns.factory;

public class Factory {


    public static void main(String[] args) {

        DeveloperFactory developerFactory = createDeveloperBySpecialty("java");

        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + ": unknown");
        }
    }

}
