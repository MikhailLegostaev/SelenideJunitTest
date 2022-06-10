import org.junit.Assert;
import org.junit.Test;

public class AppleTest extends BaseTest{
    private final static String Base_URL = "https://appleinsider.ru/";
    private final static String SEARCH_string = "Чем iPhone 13 отличается от iPhone 12";
    private final static String EXPECTED = "iPhone-13";

    @Test
    public void checkHref(){
        Assert.assertTrue(new MainPage(Base_URL)
                .search(SEARCH_string)
                .getHrefFromFirstArticle()
                .contains(EXPECTED));
    }
}
