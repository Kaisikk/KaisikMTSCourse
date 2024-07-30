package patterns.abstractfactory.website;

import patterns.abstractfactory.ProjectManager;

public class WebSitePm implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website Project");
    }
}
