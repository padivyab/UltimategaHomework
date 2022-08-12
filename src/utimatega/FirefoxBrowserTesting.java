package utimatega;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTesting {

    public static void main(String[] args) {

        FirefoxBrowserTesting f=new FirefoxBrowserTesting();
        f.firefoxTesting();

    }
    public void firefoxTesting()
    {
        String BaseURL = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver d=new FirefoxDriver();
        d.get(BaseURL);
        d.manage().window().maximize();
        String title = d.getTitle();
        System.out.println(title);
        d.close();

    }
}
