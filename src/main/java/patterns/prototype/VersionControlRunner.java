package patterns.prototype;

public class VersionControlRunner {

    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");

        System.out.println(master);



        ProjectFactory factory = new ProjectFactory(master);

        Project masterClone = (Project) factory.cloneProject();

        System.out.println("====================");

        System.out.println(masterClone);



    }

}
