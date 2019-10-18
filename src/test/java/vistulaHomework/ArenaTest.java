package vistulaHomework;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;


public class ArenaTest extends ArenaSeleniumTest {

    @Test
    public void shouldAddNewProject (){
        LoginPage loginpage = new LoginPage(driver);
        loginpage.login();
        MainPage mainPage = new MainPage(driver);
        mainPage.selectAdminPage();
        AdminPage adminPage = new AdminPage(driver);
        adminPage.selectAddProject();
        NewProjectPage newProjectPage = new NewProjectPage(driver);
        String randomTitle = RandomStringUtils.randomAlphabetic(10);
        newProjectPage.addTitle(randomTitle);
        newProjectPage.addPrefix(randomTitle);
        newProjectPage.saveNewProject();
        newProjectPage.goToSearchProjectsPage();
        SearchProjectsPage searchProjectsPage = new SearchProjectsPage(driver);
        searchProjectsPage.enterTheProjectTitle(randomTitle);
        searchProjectsPage.searchTheProject();
        searchProjectsPage.waitForResults();
        searchProjectsPage.verifyProjectTitle(randomTitle);
    }
}
