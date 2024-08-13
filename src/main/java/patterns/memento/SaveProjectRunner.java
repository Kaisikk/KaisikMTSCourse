package patterns.memento;

public class SaveProjectRunner {

    public static void main(String[] args) {
        Project project = new Project();
        Repo repo = new Repo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersion("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current version");

        repo.setSave(project.save());

        System.out.println("Updating to 1.1");

        project.setVersion("Version 1.1");

        System.out.println(project);

        System.out.println("Rolling back version");

        project.load(repo.getSave());

        System.out.println(project);
    }

}
