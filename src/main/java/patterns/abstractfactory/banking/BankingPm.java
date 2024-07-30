package patterns.abstractfactory.banking;

import patterns.abstractfactory.ProjectManager;

public class BankingPm implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Manage Project");
    }
}
