package patterns.template;

public class WebsiteRunner {
    public static void main(String[] args) {

        WebSiteTemplate welcome = new WelcomePage();

        WebSiteTemplate newsPage = new NewsPage();

        welcome.showPage();

        System.out.println("\n==============================\n");

        newsPage.showPage();
    }

}
