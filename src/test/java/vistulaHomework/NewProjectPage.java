package vistulaHomework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProjectPage {
    private WebDriver driver;

    @FindBy (css = "input#name") private WebElement title;
    @FindBy (id ="prefix") private WebElement prefix;
    @FindBy(id = "save") private WebElement save;
    @FindBy(className = "activeMenu") private WebElement projects;

    public NewProjectPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    public void addTitle(String randomTitle) {
        title.sendKeys(randomTitle);
    }

    public void addPrefix (String randomTitle) { prefix.sendKeys(randomTitle);
    }

    public void saveNewProject() {
        save.click();
    }

    public void goToSearchProjectsPage() {
        projects.click();
    }
}
