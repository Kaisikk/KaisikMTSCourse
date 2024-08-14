package patterns.observer;

public class JobSearch {

    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer subscriber = new Subscriber("Kaisik");

        Observer secondSubscriber = new Subscriber("Random Subscriber");

        jobSite.addObserver(subscriber);
        jobSite.addObserver(secondSubscriber);
        jobSite.addVacancy("Third Java position");
    }

}
