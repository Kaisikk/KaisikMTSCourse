package patterns.abstractfactory.website;

import patterns.abstractfactory.Developer;
import patterns.abstractfactory.ProjectManager;
import patterns.abstractfactory.ProjectTeamFactory;
import patterns.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePm();
    }
}
