package patterns.proxy;

public class ProjectRunner {

    public static void main(String[] args) {
        Project project = new ProxyProject("TestProject");

        project.run();
    }

}
