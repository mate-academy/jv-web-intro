import java.io.File;
import org.junit.Assert;
import org.junit.Test;

public class StructureTest {
  private static final String SLASH = File.separator;
  private static final String PATH_TO_WEBAPP = "src" + SLASH + "main" + SLASH + "src/main/webapp";
  private static final String PATH_TO_WEB_XML = PATH_TO_WEBAPP + SLASH + "web.xml";
  private static final String PATH_TO_INDEX_JSP = PATH_TO_WEBAPP + SLASH
      + "WEB-INF" + SLASH + "views" + SLASH + "index.jsp";

  @Test
  public void webappInMainFolder() {
    File file = new File(PATH_TO_WEBAPP);
    Assert.assertTrue("webapp folder should be created in src/main folder", file.exists());
  }

  @Test
  public void webXmlInWebappFolder() {
    File file = new File(PATH_TO_WEB_XML);
    Assert.assertTrue("web.xml folder should be created in webapp folder", file.exists());
  }

  @Test
  public void indexJspInViewsFolder() {
    File file = new File(PATH_TO_INDEX_JSP);
    Assert.assertTrue("index.jsp should be created in webapp/WEB-INF/views folder", file.exists());
  }
}
