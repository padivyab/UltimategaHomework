package utimatega;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTesting {

    public static void main(String[] args) {

        ChromeBrowserTesting c=new ChromeBrowserTesting();
        c.chromeTesting();


    }

    public void chromeTesting()
    {
        String BaseURL = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver d =new ChromeDriver();
        d.get(BaseURL);
        d.manage().window().maximize();
        String title = d.getTitle();
        System.out.println(title);
        d.close();


    }
}
