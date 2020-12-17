package Tests;

import Driver.Web;
import Pages.Delete;
import Pages.Homepage;
import org.testng.annotations.Test;

public class DeleteTest extends Web {

    @Test(description = "User can delete article")
    public void deleteArticle(){

        Homepage hpage = new Homepage();
        Delete dpage = new Delete();

        hpage.clickOnHomeSignIn();
        hpage.Login("steterbasgit@gmail.com", "Ilyas532?");

        dpage.delete();

    }
}
